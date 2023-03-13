package net.topyke.AandA.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.topyke.AandA.AandA;
import net.topyke.AandA.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, AandA.MOD_ID);

    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore", () -> new SilverOreBlock());
    public static final RegistryObject<Block> PLATINUM_ORE = registerBlock("platinum_ore", () -> new PlatinumOreBlock());
    public static final RegistryObject<Block> MITHRAL_ORE = registerBlock("mithral_ore", () -> new MithralOreBlock());
    public static final RegistryObject<Block> MITHRAL_ORE_HIGH = registerBlock("mithral_ore_high", () -> new MithralOreHighBlock());
    public static final RegistryObject<Block> ADAMANTINE_ORE = registerBlock("adamantine_ore", () -> new AdamantineOreBlock());




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}