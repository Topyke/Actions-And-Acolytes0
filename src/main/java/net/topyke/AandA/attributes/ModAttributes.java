/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.topyke.AandA.attributes;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.EntityAttributeModificationEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.EntityType;

import net.topyke.AandA.AandA;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModAttributes {
    public static final DeferredRegister<Attribute> ATTRIBUTES = DeferredRegister.create(ForgeRegistries.ATTRIBUTES, AandA.MOD_ID);
    public static final RegistryObject<Attribute> DEX = ATTRIBUTES.register("dex", () -> (new RangedAttribute(AandA.MOD_ID + ".attribute" + ".dex", 0, 0, 300)).setSyncable(true));
    public static final RegistryObject<Attribute> STR = ATTRIBUTES.register("str", () -> (new RangedAttribute(AandA.MOD_ID + ".attribute" + ".str", 0, 0, 300)).setSyncable(true));
    public static final RegistryObject<Attribute> CON = ATTRIBUTES.register("con", () -> (new RangedAttribute(AandA.MOD_ID + ".attribute" + ".con", 0, 0, 300)).setSyncable(true));
    public static final RegistryObject<Attribute> INTEL = ATTRIBUTES.register("intel", () -> (new RangedAttribute(AandA.MOD_ID + ".attribute" + ".intel", 0, 0, 300)).setSyncable(true));
    public static final RegistryObject<Attribute> WIS = ATTRIBUTES.register("wis", () -> (new RangedAttribute(AandA.MOD_ID + ".attribute" + ".wis", 0, 0, 300)).setSyncable(true));
    public static final RegistryObject<Attribute> CHA = ATTRIBUTES.register("cha", () -> (new RangedAttribute(AandA.MOD_ID + ".attribute" + ".cha", 0, 0, 300)).setSyncable(true));

    @SubscribeEvent
    public static void register(FMLConstructModEvent event) {
        event.enqueueWork(() -> {
            ATTRIBUTES.register(FMLJavaModLoadingContext.get().getModEventBus());
        });
    }

    @SubscribeEvent
    public static void addAttributes(EntityAttributeModificationEvent event) {
        event.add(EntityType.PLAYER, DEX.get());
        event.add(EntityType.PLAYER, STR.get());
        event.add(EntityType.PLAYER, CON.get());
        event.add(EntityType.PLAYER, INTEL.get());
        event.add(EntityType.PLAYER, WIS.get());
        event.add(EntityType.PLAYER, CHA.get());
    }

    @Mod.EventBusSubscriber
    private class Utils {
        @SubscribeEvent
        public static void persistAttributes(PlayerEvent.Clone event) {
            Player oldP = event.getOriginal();
            Player newP = (Player) event.getEntity();
            newP.getAttribute(DEX.get()).setBaseValue(oldP.getAttribute(DEX.get()).getBaseValue());
            newP.getAttribute(STR.get()).setBaseValue(oldP.getAttribute(STR.get()).getBaseValue());
            newP.getAttribute(CON.get()).setBaseValue(oldP.getAttribute(CON.get()).getBaseValue());
            newP.getAttribute(INTEL.get()).setBaseValue(oldP.getAttribute(INTEL.get()).getBaseValue());
            newP.getAttribute(WIS.get()).setBaseValue(oldP.getAttribute(WIS.get()).getBaseValue());
            newP.getAttribute(CHA.get()).setBaseValue(oldP.getAttribute(CHA.get()).getBaseValue());
        }
    }
}
