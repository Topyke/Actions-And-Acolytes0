package net.topyke.AandA.dategen;

import net.topyke.AandA.block.ModBlocks;
import net.topyke.AandA.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.topyke.AandA.AandA;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AandA.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        simpleItem(ModItems.RAW_ADAMANTINE);
        simpleItem(ModItems.RAW_MITHRAL);
        simpleItem(ModItems.RAW_PLATINUM);
        simpleItem(ModItems.RAW_SILVER);

        handheldItem(ModItems.WOODEN_HATCHET);
        handheldItem(ModItems.WOODEN_HOE);
        handheldItem(ModItems.WOODEN_PICKAXE);
        handheldItem(ModItems.WOODEN_SHORTSWORD);
        handheldItem(ModItems.WOODEN_SHOVEL);
        handheldItem(ModItems.STONE_HATCHET);
        handheldItem(ModItems.STONE_HOE);
        handheldItem(ModItems.STONE_PICKAXE);
        handheldItem(ModItems.STONE_SHORTSWORD);
        handheldItem(ModItems.STONE_SHOVEL);
        handheldItem(ModItems.IRON_HATCHET);
        handheldItem(ModItems.IRON_HOE);
        handheldItem(ModItems.IRON_PICKAXE);
        handheldItem(ModItems.IRON_SHORTSWORD);
        handheldItem(ModItems.IRON_SHOVEL);
        handheldItem(ModItems.GOLDEN_HATCHET);
        handheldItem(ModItems.GOLDEN_HOE);
        handheldItem(ModItems.GOLDEN_PICKAXE);
        handheldItem(ModItems.GOLDEN_SHORTSWORD);
        handheldItem(ModItems.GOLDEN_SHOVEL);
        handheldItem(ModItems.SILVER_HATCHET);
        handheldItem(ModItems.SILVER_HOE);
        handheldItem(ModItems.SILVER_PICKAXE);
        handheldItem(ModItems.SILVER_SHORTSWORD);
        handheldItem(ModItems.SILVER_SHOVEL);
        handheldItem(ModItems.PLATINUM_HATCHET);
        handheldItem(ModItems.PLATINUM_HOE);
        handheldItem(ModItems.PLATINUM_PICKAXE);
        handheldItem(ModItems.PLATINUM_SHORTSWORD);
        handheldItem(ModItems.PLATINUM_SHOVEL);
        handheldItem(ModItems.MITHRAL_HATCHET);
        handheldItem(ModItems.MITHRAL_HOE);
        handheldItem(ModItems.MITHRAL_PICKAXE);
        handheldItem(ModItems.MITHRAL_SHORTSWORD);
        handheldItem(ModItems.MITHRAL_SHOVEL);
        handheldItem(ModItems.ADAMANTINE_HATCHET);
        handheldItem(ModItems.ADAMANTINE_HOE);
        handheldItem(ModItems.ADAMANTINE_PICKAXE);
        handheldItem(ModItems.ADAMANTINE_SHORTSWORD);
        handheldItem(ModItems.ADAMANTINE_SHOVEL);
    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(AandA.MOD_ID,"block/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(AandA.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(AandA.MOD_ID,"item/" + item.getId().getPath()));
    }
}