package net.topyke.AandA.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.topyke.AandA.item.ModItems;

public class ModTiers {
    public static final ForgeTier ADAMANTINE = new ForgeTier(3, 2031, 13f,
            0f, 15, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.ADAMANTINE_INGOT.get()));
}
