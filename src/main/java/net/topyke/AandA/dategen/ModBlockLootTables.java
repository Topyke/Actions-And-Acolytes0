package net.topyke.AandA.dategen;

import net.topyke.AandA.block.ModBlocks;
import net.topyke.AandA.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        add(ModBlocks.ADAMANTINE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.ADAMANTINE_ORE.get(), ModItems.RAW_ADAMANTINE.get()));
        add(ModBlocks.MITHRAL_ORE.get(),
                (block) -> createOreDrop(ModBlocks.MITHRAL_ORE.get(), ModItems.RAW_MITHRAL.get()));
        add(ModBlocks.MITHRAL_ORE_HIGH.get(),
                (block) -> createOreDrop(ModBlocks.MITHRAL_ORE_HIGH.get(), ModItems.RAW_MITHRAL.get()));
        add(ModBlocks.PLATINUM_ORE.get(),
                (block) -> createOreDrop(ModBlocks.PLATINUM_ORE.get(), ModItems.RAW_PLATINUM.get()));
        add(ModBlocks.SILVER_ORE.get(),
                (block) -> createOreDrop(ModBlocks.SILVER_ORE.get(), ModItems.RAW_SILVER.get()));

        this.dropSelf(ModBlocks.FEYWOOD_LOG.get());
        this.dropSelf(ModBlocks.FEYWOOD_WOOD.get());
        this.dropSelf(ModBlocks.FEYWOOD_PLANKS.get());
        this.dropSelf(ModBlocks.STRIPPED_FEYWOOD_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_FEYWOOD_LOG.get());
        this.dropSelf(ModBlocks.FEYWOOD_SAPLING.get());

        this.add(ModBlocks.FEYWOOD_LEAVES.get(), (block) ->
                createLeavesDrops(block, ModBlocks.FEYWOOD_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}