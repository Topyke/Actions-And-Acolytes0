package net.topyke.AandA.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.topyke.AandA.AandA;
import net.topyke.AandA.block.custom.ModFlammableRotatedPillarBlock;
import net.topyke.AandA.item.ModItems;
import net.topyke.AandA.worldgen.tree.FeywoodTreeGrower;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, AandA.MOD_ID);

    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore", () -> new SilverOreBlock());
    public static final RegistryObject<Block> PLATINUM_ORE = registerBlock("platinum_ore", () -> new PlatinumOreBlock());
    public static final RegistryObject<Block> MITHRAL_ORE = registerBlock("mithral_ore", () -> new MithralOreBlock());
    public static final RegistryObject<Block> MITHRAL_ORE_HIGH = registerBlock("mithral_ore_high", () -> new MithralOreHighBlock());
    public static final RegistryObject<Block> ADAMANTINE_ORE = registerBlock("adamantine_ore", () -> new AdamantineOreBlock());

    public static final RegistryObject<Block> FEYWOOD_LOG = registerBlock("feywood_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
            .strength(5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> FEYWOOD_WOOD = registerBlock("feywood_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
            .strength(5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> STRIPPED_FEYWOOD_LOG = registerBlock("stripped_feywood_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
            .strength(5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> STRIPPED_FEYWOOD_WOOD = registerBlock("stripped_feywood_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
            .strength(5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> FEYWOOD_PLANKS = registerBlock("feywood_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(5f)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            });
    public static final RegistryObject<Block> FEYWOOD_LEAVES = registerBlock("feywood_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }
            });

    public static final RegistryObject<Block> FEYWOOD_SAPLING = registerBlock("feywood_sapling",
            () -> new SaplingBlock(new FeywoodTreeGrower(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_SAPLING)));



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