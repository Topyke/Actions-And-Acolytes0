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
            if (itemstack.is(ItemTags.create(new ResourceLocation("ana:trident")))) {
                modifierReach = itemstack.getOrCreateTag().getDouble("modifierReach");
                modifier = new AttributeModifier(UUID.fromString("2b218791-3426-4771-9677-6ac832ed900e"), AandA.MOD_ID + "." + "ReachMod", 0.2, AttributeModifier.Operation.MULTIPLY_BASE);
                _event.addModifier(ForgeMod.ATTACK_RANGE.get(), modifier);
            }
        }
    }
}
