package net.topyke.AandA.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.topyke.AandA.AandA;

@Mod.EventBusSubscriber(modid = AandA.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab ANA_MATERIALS;
    public static CreativeModeTab ANA_WAR;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        ANA_MATERIALS = event.registerCreativeModeTab(new ResourceLocation(AandA.MOD_ID, "ana_materials"),
                builder -> builder.icon(() -> new ItemStack(ModItems.ADAMANTINE_INGOT.get()))
                        .title(Component.translatable("creativemodetab.ana_materials")));
        ANA_WAR = event.registerCreativeModeTab(new ResourceLocation(AandA.MOD_ID, "ana_war"),
                builder -> builder.icon(() -> new ItemStack(ModItems.ADAMANTINE_SHORTSWORD.get()))
                        .title(Component.translatable("creativemodetab.ana_war")));
    }
}