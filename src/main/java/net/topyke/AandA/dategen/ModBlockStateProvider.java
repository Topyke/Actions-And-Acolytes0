package net.topyke.AandA.dategen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.topyke.AandA.AandA;
import net.topyke.AandA.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, AandA.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.ADAMANTINE_ORE);
        blockWithItem(ModBlocks.MITHRAL_ORE);
        blockWithItem(ModBlocks.MITHRAL_ORE_HIGH);
        blockWithItem(ModBlocks.PLATINUM_ORE);
        blockWithItem(ModBlocks.SILVER_ORE);

        logBlock(((RotatedPillarBlock) ModBlocks.FEYWOOD_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.FEYWOOD_WOOD.get(), blockTexture(ModBlocks.FEYWOOD_LOG.get()), blockTexture(ModBlocks.FEYWOOD_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_FEYWOOD_LOG.get(), new ResourceLocation(AandA.MOD_ID, "block/stripped_feywood_log"),
                new ResourceLocation(AandA.MOD_ID, "block/stripped_feywood_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_FEYWOOD_WOOD.get(), new ResourceLocation(AandA.MOD_ID, "block/stripped_feywood_log"),
                new ResourceLocation(AandA.MOD_ID, "block/stripped_feywood_log"));

        blockWithItem(ModBlocks.FEYWOOD_PLANKS);
        blockWithItem(ModBlocks.FEYWOOD_LEAVES);
        saplingBlock(ModBlocks.FEYWOOD_SAPLING);

        simpleBlockItem(ModBlocks.FEYWOOD_LOG.get(), models().withExistingParent("ana:feywood_log", "minecraft:block/cube_column"));
        simpleBlockItem(ModBlocks.FEYWOOD_WOOD.get(), models().withExistingParent("ana:feywood_wood", "minecraft:block/cube_column"));
        simpleBlockItem(ModBlocks.STRIPPED_FEYWOOD_LOG.get(), models().withExistingParent("ana:stripped_feywood_log", "minecraft:block/cube_column"));
        simpleBlockItem(ModBlocks.STRIPPED_FEYWOOD_WOOD.get(), models().withExistingParent("ana:stripped_feywood_wood", "minecraft:block/cube_column"));

    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));

    }
    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }
}
