package net.topyke.AandA;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.topyke.AandA.item.ModCreativeModeTabs;
import net.topyke.AandA.item.ModItems;
import org.slf4j.Logger;

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

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
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
            event.accept(ModItems.RAW_ADAMANTINE);
            event.accept(ModItems.ADAMANTINE_INGOT);
        }
        if(event.getTab() == ModCreativeModeTabs.ANA_WAR) {
            event.accept(ModItems.CLUB);
            event.accept(ModItems.GREATCLUB);
            event.accept(ModItems.GOLDEN_SHORTSWORD);
            event.accept(ModItems.GOLDEN_PICKAXE);
            event.accept(ModItems.GOLDEN_HATCHET);
            event.accept(ModItems.GOLDEN_SHOVEL);
            event.accept(ModItems.GOLDEN_HOE);
            event.accept(ModItems.SILVER_SHORTSWORD);
            event.accept(ModItems.ADAMANTINE_SHORTSWORD);
            event.accept(ModItems.ADAMANTINE_PICKAXE);
            event.accept(ModItems.ADAMANTINE_HATCHET);
            event.accept(ModItems.ADAMANTINE_SHOVEL);
            event.accept(ModItems.ADAMANTINE_HOE);

        }

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {

    }
}
