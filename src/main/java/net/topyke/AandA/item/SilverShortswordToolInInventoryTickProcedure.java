package net.topyke.AandA.item;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.ItemAttributeModifierEvent;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.topyke.AandA.AandA;

import javax.annotation.Nullable;

import java.util.UUID;


@Mod.EventBusSubscriber
public class SilverShortswordToolInInventoryTickProcedure {
    @SubscribeEvent
    public static void addAttributeModifier(ItemAttributeModifierEvent event) {
        execute(event, event.getItemStack());
    }

    public static void execute(ItemStack itemstack) {
        execute(null, itemstack);
    }

    private static void execute(@Nullable Event event, ItemStack itemstack) {
        double modifierReach = 0;
        AttributeModifier modifier = null;
        if (event instanceof ItemAttributeModifierEvent _event && _event.getSlotType() == EquipmentSlot.MAINHAND) {
            if (itemstack.is(ItemTags.create(new ResourceLocation("ana:dagger")))) {
                modifierReach = itemstack.getOrCreateTag().getDouble("modifierReach");
                modifier = new AttributeModifier(UUID.fromString("2b218791-3426-4771-9677-6ac832ed900e"), AandA.MOD_ID + "." + "ReachMod", (-0.25), AttributeModifier.Operation.MULTIPLY_BASE);
                _event.addModifier(ForgeMod.ATTACK_RANGE.get(), modifier);
            }
            if (itemstack.is(ItemTags.create(new ResourceLocation("ana:greatclub")))) {
                modifierReach = itemstack.getOrCreateTag().getDouble("modifierReach");
                modifier = new AttributeModifier(UUID.fromString("2b218791-3426-4771-9677-6ac832ed900e"), AandA.MOD_ID + "." + "ReachMod", 0.2, AttributeModifier.Operation.MULTIPLY_BASE);
                _event.addModifier(ForgeMod.ATTACK_RANGE.get(), modifier);
            }
            if (itemstack.is(ItemTags.create(new ResourceLocation("ana:handaxe")))) {
                modifierReach = itemstack.getOrCreateTag().getDouble("modifierReach");
                modifier = new AttributeModifier(UUID.fromString("2b218791-3426-4771-9677-6ac832ed900e"), AandA.MOD_ID + "." + "ReachMod", -0.25, AttributeModifier.Operation.MULTIPLY_BASE);
                _event.addModifier(ForgeMod.ATTACK_RANGE.get(), modifier);
            }
            if (itemstack.is(ItemTags.create(new ResourceLocation("ana:light_hammer")))) {
                modifierReach = itemstack.getOrCreateTag().getDouble("modifierReach");
                modifier = new AttributeModifier(UUID.fromString("2b218791-3426-4771-9677-6ac832ed900e"), AandA.MOD_ID + "." + "ReachMod", -0.25, AttributeModifier.Operation.MULTIPLY_BASE);
                _event.addModifier(ForgeMod.ATTACK_RANGE.get(), modifier);
            }
            if (itemstack.is(ItemTags.create(new ResourceLocation("ana:quarterstaff")))) {
                modifierReach = itemstack.getOrCreateTag().getDouble("modifierReach");
                modifier = new AttributeModifier(UUID.fromString("2b218791-3426-4771-9677-6ac832ed900e"), AandA.MOD_ID + "." + "ReachMod", 0.11, AttributeModifier.Operation.MULTIPLY_BASE);
                _event.addModifier(ForgeMod.ATTACK_RANGE.get(), modifier);
            }
            if (itemstack.is(ItemTags.create(new ResourceLocation("ana:scythe")))) {
                modifierReach = itemstack.getOrCreateTag().getDouble("modifierReach");
                modifier = new AttributeModifier(UUID.fromString("2b218791-3426-4771-9677-6ac832ed900e"), AandA.MOD_ID + "." + "ReachMod", -0.2, AttributeModifier.Operation.MULTIPLY_BASE);
                _event.addModifier(ForgeMod.ATTACK_RANGE.get(), modifier);

            }
            if (itemstack.is(ItemTags.create(new ResourceLocation("ana:spear")))) {
                modifierReach = itemstack.getOrCreateTag().getDouble("modifierReach");
                modifier = new AttributeModifier(UUID.fromString("2b218791-3426-4771-9677-6ac832ed900e"), AandA.MOD_ID + "." + "ReachMod", 0.25, AttributeModifier.Operation.MULTIPLY_BASE);
                _event.addModifier(ForgeMod.ATTACK_RANGE.get(), modifier);
            }
            if (itemstack.is(ItemTags.create(new ResourceLocation("ana:glaive")))) {
                modifierReach = itemstack.getOrCreateTag().getDouble("modifierReach");
                modifier = new AttributeModifier(UUID.fromString("2b218791-3426-4771-9677-6ac832ed900e"), AandA.MOD_ID + "." + "ReachMod", 0.33, AttributeModifier.Operation.MULTIPLY_BASE);
                _event.addModifier(ForgeMod.ATTACK_RANGE.get(), modifier);
            }
            if (itemstack.is(ItemTags.create(new ResourceLocation("ana:greatsword")))) {
                modifierReach = itemstack.getOrCreateTag().getDouble("modifierReach");
                modifier = new AttributeModifier(UUID.fromString("2b218791-3426-4771-9677-6ac832ed900e"), AandA.MOD_ID + "." + "ReachMod", 0.2, AttributeModifier.Operation.MULTIPLY_BASE);
                _event.addModifier(ForgeMod.ATTACK_RANGE.get(), modifier);
            }
            if (itemstack.is(ItemTags.create(new ResourceLocation("ana:halberd")))) {
                modifierReach = itemstack.getOrCreateTag().getDouble("modifierReach");
                modifier = new AttributeModifier(UUID.fromString("2b218791-3426-4771-9677-6ac832ed900e"), AandA.MOD_ID + "." + "ReachMod", 0.5, AttributeModifier.Operation.MULTIPLY_BASE);
                _event.addModifier(ForgeMod.ATTACK_RANGE.get(), modifier);
            }
            if (itemstack.is(ItemTags.create(new ResourceLocation("ana:lance")))) {
                modifierReach = itemstack.getOrCreateTag().getDouble("modifierReach");
                modifier = new AttributeModifier(UUID.fromString("2b218791-3426-4771-9677-6ac832ed900e"), AandA.MOD_ID + "." + "ReachMod", 1, AttributeModifier.Operation.MULTIPLY_BASE);
                _event.addModifier(ForgeMod.ATTACK_RANGE.get(), modifier);
            }
            if (itemstack.is(ItemTags.create(new ResourceLocation("ana:longsword")))) {
                modifierReach = itemstack.getOrCreateTag().getDouble("modifierReach");
                modifier = new AttributeModifier(UUID.fromString("2b218791-3426-4771-9677-6ac832ed900e"), AandA.MOD_ID + "." + "ReachMod", 0.1, AttributeModifier.Operation.MULTIPLY_BASE);
                _event.addModifier(ForgeMod.ATTACK_RANGE.get(), modifier);
            }
            if (itemstack.is(ItemTags.create(new ResourceLocation("ana:pike")))) {
                modifierReach = itemstack.getOrCreateTag().getDouble("modifierReach");
                modifier = new AttributeModifier(UUID.fromString("2b218791-3426-4771-9677-6ac832ed900e"), AandA.MOD_ID + "." + "ReachMod", 1, AttributeModifier.Operation.MULTIPLY_BASE);
                _event.addModifier(ForgeMod.ATTACK_RANGE.get(), modifier);
            }
            if (itemstack.is(ItemTags.create(new ResourceLocation("ana:rapier")))) {
                modifierReach = itemstack.getOrCreateTag().getDouble("modifierReach");
                modifier = new AttributeModifier(UUID.fromString("2b218791-3426-4771-9677-6ac832ed900e"), AandA.MOD_ID + "." + "ReachMod", -0.15, AttributeModifier.Operation.MULTIPLY_BASE);
                _event.addModifier(ForgeMod.ATTACK_RANGE.get(), modifier);
            }
            if (itemstack.is(ItemTags.create(new ResourceLocation("ana:whip")))) {
                modifierReach = itemstack.getOrCreateTag().getDouble("modifierReach");
                modifier = new AttributeModifier(UUID.fromString("2b218791-3426-4771-9677-6ac832ed900e"), AandA.MOD_ID + "." + "ReachMod", 0.44, AttributeModifier.Operation.MULTIPLY_BASE);
                _event.addModifier(ForgeMod.ATTACK_RANGE.get(), modifier);
            }

        }
    }
}
