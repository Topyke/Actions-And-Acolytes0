package net.topyke.AandA.entity;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import net.topyke.AandA.item.IronHandaxeProjectileHitsPlayerProcedure;
import net.topyke.AandA.item.IronHandaxeProjectileHitsBlockProcedure;
import net.topyke.AandA.item.ModItems;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class IronHandaxeEntity extends AbstractArrow implements ItemSupplier {
    public IronHandaxeEntity(PlayMessages.SpawnEntity packet, Level world) {
        super(ModEntities.IRON_HANDAXE.get(), world);
    }

    public IronHandaxeEntity(EntityType<? extends IronHandaxeEntity> type, Level world) {
        super(type, world);
    }



    public IronHandaxeEntity(EntityType<? extends IronHandaxeEntity> type, double x, double y, double z, Level world) {
        super(type, x, y, z, world);
    }

    public IronHandaxeEntity(EntityType<? extends IronHandaxeEntity> type, LivingEntity entity, Level world) {
        super(type, entity, world);
    }

    @Override
    public Packet<ClientGamePacketListener> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public ItemStack getItem() {
        return new ItemStack(ModItems.IRON_HANDAXE.get());
    }

    @Override
    protected ItemStack getPickupItem() {
        return new ItemStack(ModItems.IRON_HANDAXE.get());
    }

    @Override
    protected void doPostHurtEffects(LivingEntity entity) {
        super.doPostHurtEffects(entity);
        entity.setArrowCount(entity.getArrowCount() - 1);
    }

    @Override
    public void playerTouch(Player entity) {
        super.playerTouch(entity);
        IronHandaxeProjectileHitsPlayerProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), entity);
    }

    @Override
    public void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        IronHandaxeProjectileHitsBlockProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
    }

    @Override
    public void onHitBlock(BlockHitResult blockHitResult) {
        super.onHitBlock(blockHitResult);
        IronHandaxeProjectileHitsBlockProcedure.execute(this.level, blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(), blockHitResult.getBlockPos().getZ());
    }

    @Override
    public void tick() {
        super.tick();
        if (this.inGround)
            this.discard();
    }

    public static IronHandaxeEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
        IronHandaxeEntity entityarrow = new IronHandaxeEntity(ModEntities.IRON_HANDAXE.get(), entity, world);
        entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
        entityarrow.setSilent(true);
        entityarrow.setCritArrow(false);
        entityarrow.setBaseDamage(damage);
        entityarrow.setKnockback(knockback);
        world.addFreshEntity(entityarrow);
        world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.snowball.throw")), SoundSource.PLAYERS, 1, 1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
        return entityarrow;
    }

    public static IronHandaxeEntity shoot(LivingEntity entity, LivingEntity target) {
        IronHandaxeEntity entityarrow = new IronHandaxeEntity(ModEntities.IRON_HANDAXE.get(), entity, entity.level);
        double dx = target.getX() - entity.getX();
        double dy = target.getY() + target.getEyeHeight() - 1.1;
        double dz = target.getZ() - entity.getZ();
        entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 0.25f * 2, 12.0F);
        entityarrow.setSilent(true);
        entityarrow.setBaseDamage(10);
        entityarrow.setKnockback(1);
        entityarrow.setCritArrow(false);
        entity.level.addFreshEntity(entityarrow);
        entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.snowball.throw")), SoundSource.PLAYERS, 1, 1f / (RandomSource.create().nextFloat() * 0.5f + 1));
        return entityarrow;

    }
}
