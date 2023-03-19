
package net.topyke.AandA.item;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ProjectileWeaponItem;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.topyke.AandA.entity.IronMalletEntity;

public class IronMalletItem extends Item {
    public IronMalletItem() {
        super(new Properties().stacksTo(5));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        entity.startUsingItem(hand);
        return new InteractionResultHolder(InteractionResult.SUCCESS, entity.getItemInHand(hand));
    }

    @Override
    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.BOW;
    }

    @Override
    public int getUseDuration(ItemStack itemstack) {
        return 72000;
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot slot) {
        if (slot == EquipmentSlot.MAINHAND) {
            ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
            builder.putAll(super.getDefaultAttributeModifiers(slot));
            builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Ranged item modifier", (double) 1, AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Ranged item modifier", -3.1, AttributeModifier.Operation.ADDITION));
            return builder.build();
        }
        return super.getDefaultAttributeModifiers(slot);
    }

    @Override
    public void onUsingTick(ItemStack itemstack, LivingEntity entityLiving, int count) {
        Level world = entityLiving.level;
        if (!world.isClientSide() && entityLiving instanceof ServerPlayer entity) {
            double x = entity.getX();
            double y = entity.getY();
            double z = entity.getZ();
            if (true) {
                ItemStack stack = ProjectileWeaponItem.getHeldProjectile(entity, e -> e.getItem() == ModItems.IRON_MALLET.get());
                if (stack == ItemStack.EMPTY) {
                    for (int i = 0; i < entity.getInventory().items.size(); i++) {
                        ItemStack teststack = entity.getInventory().items.get(i);
                        if (teststack != null && teststack.getItem() == ModItems.IRON_MALLET.get()) {
                            stack = teststack;
                            break;
                        }
                    }
                }
                if (entity.getAbilities().instabuild || stack != ItemStack.EMPTY) {
                    IronMalletEntity entityarrow = IronMalletEntity.shoot(world, entity, world.getRandom(), 0.4f, 4, 1);
                    itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
                    if (entity.getAbilities().instabuild) {
                        entityarrow.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
                    } else {
                        if (new ItemStack(ModItems.IRON_MALLET.get()).isDamageableItem()) {
                            if (stack.hurt(1, world.getRandom(), entity)) {
                                stack.shrink(1);
                                stack.setDamageValue(0);
                                if (stack.isEmpty())
                                    entity.getInventory().removeItem(stack);
                            }
                        } else {
                            stack.shrink(1);
                            if (stack.isEmpty())
                                entity.getInventory().removeItem(stack);
                        }
                    }
                }
                entity.releaseUsingItem();
            }
        }
    }
}
