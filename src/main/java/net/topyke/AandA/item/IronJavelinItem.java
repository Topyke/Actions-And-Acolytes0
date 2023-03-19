
package net.topyke.AandA.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.ProjectileWeaponItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;

import net.topyke.AandA.item.ModItems;
import net.topyke.AandA.entity.IronJavelinEntity;

import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap;

public class IronJavelinItem extends Item {
    public IronJavelinItem() {
        super(new Item.Properties().durability(100));
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
            builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Ranged item modifier", (double) 2, AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Ranged item modifier", -2.7, AttributeModifier.Operation.ADDITION));
            return builder.build();
        }
        return super.getDefaultAttributeModifiers(slot);
    }

    @Override
    public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
        if (!world.isClientSide() && entityLiving instanceof ServerPlayer entity) {
            double x = entity.getX();
            double y = entity.getY();
            double z = entity.getZ();
            if (true) {
                ItemStack stack = ProjectileWeaponItem.getHeldProjectile(entity, e -> e.getItem() == ModItems.IRON_JAVELIN.get());
                if (stack == ItemStack.EMPTY) {
                    for (int i = 0; i < entity.getInventory().items.size(); i++) {
                        ItemStack teststack = entity.getInventory().items.get(i);
                        if (teststack != null && teststack.getItem() == ModItems.IRON_JAVELIN.get()) {
                            stack = teststack;
                            break;
                        }
                    }
                }
                if (entity.getAbilities().instabuild || stack != ItemStack.EMPTY) {
                    IronJavelinEntity entityarrow = IronJavelinEntity.shoot(world, entity, world.getRandom(), 0.6f, 6, 1);
                    itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
                    if (entity.getAbilities().instabuild) {
                        entityarrow.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
                    } else {
                        if (new ItemStack(ModItems.IRON_JAVELIN.get()).isDamageableItem()) {
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
            }
        }
    }
}
