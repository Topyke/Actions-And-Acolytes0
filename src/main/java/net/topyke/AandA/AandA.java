package net.topyke.AandA;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.topyke.AandA.block.ModBlocks;
import net.topyke.AandA.item.ModCreativeModeTabs;
import net.topyke.AandA.item.ModItems;
import net.topyke.AandA.entity.ModEntities;
import org.slf4j.Logger;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(AandA.MOD_ID)
public class AandA
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "ana";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under the "examplemod" namespace
    public AandA()
    {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);



        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();


        ModEntities.REGISTRY.register(bus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    public static void queueServerWork(int i, Object o) {
    }


    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        if(event.getTab() == ModCreativeModeTabs.ANA_MATERIALS) {
            event.accept(ModItems.COPPER_CROW);
            event.accept(ModItems.SILVER_SHIELD);
            event.accept(ModItems.GOLD_GRIFFON);
            event.accept(ModItems.PLATINUM_DRAGON);
            event.accept(ModItems.RAW_SILVER);
            event.accept(ModItems.SILVER_INGOT);
            event.accept(ModItems.RAW_PLATINUM);
            event.accept(ModItems.PLATINUM_INGOT);
            event.accept(ModItems.RAW_MITHRAL);
            event.accept(ModItems.MITHRAL_INGOT);
            event.accept(ModItems.RAW_ADAMANTINE);
            event.accept(ModItems.ADAMANTINE_INGOT);
        }
        if(event.getTab() == ModCreativeModeTabs.ANA_WAR) {
            event.accept(ModItems.WOODEN_SHORTSWORD);
            event.accept(ModItems.STONE_SHORTSWORD);
            event.accept(ModItems.CLUB);
            event.accept(ModItems.GREATCLUB);
            event.accept(ModItems.QUARTERSTAFF);
            event.accept(ModItems.IRON_DAGGER);
            event.accept(ModItems.IRON_HANDAXE);
            event.accept(ModItems.IRON_JAVELIN);
            event.accept(ModItems.IRON_MALLET);
            event.accept(ModItems.IRON_MACE);
            event.accept(ModItems.IRON_SCYTHE);
            event.accept(ModItems.IRON_SPEAR);
            event.accept(ModItems.IRON_BATTLEAXE);
            event.accept(ModItems.IRON_FLAIL);
            event.accept(ModItems.IRON_GLAIVE);
            event.accept(ModItems.IRON_GREATAXE);
            event.accept(ModItems.IRON_GREATSWORD);
            event.accept(ModItems.IRON_HALBERD);
            event.accept(ModItems.IRON_LANCE);
            event.accept(ModItems.IRON_LONGSWORD);
            event.accept(ModItems.IRON_MAUL);
            event.accept(ModItems.IRON_MORNINGSTAR);
            event.accept(ModItems.IRON_PIKE);
            event.accept(ModItems.IRON_RAPIER);
            event.accept(ModItems.IRON_SCIMITAR);
            event.accept(ModItems.IRON_SHORTSWORD);
            event.accept(ModItems.IRON_TRIDENT);
            event.accept(ModItems.IRON_WARPICK);
            event.accept(ModItems.IRON_WARHAMMER);
            event.accept(ModItems.IRON_WHIP);
            event.accept(ModItems.GOLDEN_SHORTSWORD);
            event.accept(ModItems.SILVER_SHORTSWORD);
            event.accept(ModItems.PLATINUM_SHORTSWORD);
            event.accept(ModItems.MITHRAL_SHORTSWORD);
            event.accept(ModItems.ADAMANTINE_SHORTSWORD);
            event.accept(ModItems.SLING);
            event.accept(ModItems.SHORTBOW);
            event.accept(ModItems.LIGHT_CROSSBOW);

        }

        if(event.getTab() == ModCreativeModeTabs.ANA_TOOLS) {
            event.accept(ModItems.WOODEN_PICKAXE);
            event.accept(ModItems.WOODEN_HATCHET);
            event.accept(ModItems.WOODEN_SHOVEL);
            event.accept(ModItems.WOODEN_HOE);
            event.accept(ModItems.STONE_PICKAXE);
            event.accept(ModItems.STONE_HATCHET);
            event.accept(ModItems.STONE_SHOVEL);
            event.accept(ModItems.STONE_HOE);
            event.accept(ModItems.IRON_PICKAXE);
            event.accept(ModItems.IRON_HATCHET);
            event.accept(ModItems.IRON_SHOVEL);
            event.accept(ModItems.IRON_HOE);
            event.accept(ModItems.GOLDEN_PICKAXE);
            event.accept(ModItems.GOLDEN_HATCHET);
            event.accept(ModItems.GOLDEN_SHOVEL);
            event.accept(ModItems.GOLDEN_HOE);
            event.accept(ModItems.SILVER_PICKAXE);
            event.accept(ModItems.SILVER_HATCHET);
            event.accept(ModItems.SILVER_SHOVEL);
            event.accept(ModItems.SILVER_HOE);
            event.accept(ModItems.PLATINUM_PICKAXE);
            event.accept(ModItems.PLATINUM_HATCHET);
            event.accept(ModItems.PLATINUM_SHOVEL);
            event.accept(ModItems.PLATINUM_HOE);
            event.accept(ModItems.MITHRAL_PICKAXE);
            event.accept(ModItems.MITHRAL_HATCHET);
            event.accept(ModItems.MITHRAL_SHOVEL);
            event.accept(ModItems.MITHRAL_HOE);
            event.accept(ModItems.ADAMANTINE_PICKAXE);
            event.accept(ModItems.ADAMANTINE_HATCHET);
            event.accept(ModItems.ADAMANTINE_SHOVEL);
            event.accept(ModItems.ADAMANTINE_HOE);


        }
        if(event.getTab() == ModCreativeModeTabs.ANA_NATURAL) {
            event.accept(ModItems.PEBBLE);
            event.accept(ModBlocks.FEYWOOD_LOG);
            event.accept(ModBlocks.FEYWOOD_WOOD);
            event.accept(ModBlocks.FEYWOOD_LEAVES);
            event.accept(ModBlocks.STRIPPED_FEYWOOD_LOG);
            event.accept(ModBlocks.STRIPPED_FEYWOOD_WOOD);
            event.accept(ModBlocks.FEYWOOD_SAPLING);
            event.accept(ModBlocks.FEYWOOD_PLANKS);
            event.accept(ModBlocks.SILVER_ORE);
            event.accept(ModBlocks.PLATINUM_ORE);
            event.accept(ModBlocks.MITHRAL_ORE_HIGH);
            event.accept(ModBlocks.MITHRAL_ORE);
            event.accept(ModBlocks.ADAMANTINE_ORE);
        }

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {

    }
    private static final Collection<AbstractMap.SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();
    public static void queueServerWork(int tick, Runnable action) {
        workQueue.add(new AbstractMap.SimpleEntry(action, tick));
    }

    @SubscribeEvent
    public void tick(TickEvent.ServerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            List<AbstractMap.SimpleEntry<Runnable, Integer>> actions = new ArrayList<>();
            workQueue.forEach(work -> {
                work.setValue(work.getValue() - 1);
                if (work.getValue() == 0)
                    actions.add(work);
            });
            actions.forEach(e -> e.getKey().run());
            workQueue.removeAll(actions);
        }
    }
}
