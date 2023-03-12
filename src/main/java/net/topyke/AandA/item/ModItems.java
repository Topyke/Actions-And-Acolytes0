package net.topyke.AandA.item;

import net.mcreator.ana.item.AdamantineShortswordItem;
import net.mcreator.ana.item.GoldenHoeItem;
import net.mcreator.ana.item.GoldenShortswordItem;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.PickaxeItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.topyke.AandA.AandA;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, AandA.MOD_ID);

    public static final RegistryObject<Item> COPPER_CROW = ITEMS.register("copper_crow",
            () -> new CopperCrowItem());
    public static final RegistryObject<Item> SILVER_SHIELD = ITEMS.register("silver_shield",
            () -> new SilverShieldItem());
    public static final RegistryObject<Item> GOLD_GRIFFON = ITEMS.register("gold_griffon",
            () -> new GoldGriffonItem());
    public static final RegistryObject<Item> PLATINUM_DRAGON = ITEMS.register("platinum_dragon",
            () -> new PlatinumDragonItem());
    public static final RegistryObject<Item> CLUB = ITEMS.register("club",
            () -> new ClubItem());
    public static final RegistryObject<Item> GREATCLUB = ITEMS.register("greatclub",
            () -> new GreatclubItem());
    public static final RegistryObject<Item> GOLDEN_SHORTSWORD = ITEMS.register("golden_shortsword",
            () -> new GoldenShortswordItem());
    public static final RegistryObject<Item> GOLDEN_PICKAXE = ITEMS.register("golden_pickaxe",
            () -> new GoldenPickaxeItem());
    public static final RegistryObject<Item> GOLDEN_HATCHET = ITEMS.register("golden_hatchet",
            () -> new GoldenHatchetItem());
    public static final RegistryObject<Item> GOLDEN_SHOVEL = ITEMS.register("golden_shovel",
            () -> new GoldenShovelItem());
    public static final RegistryObject<Item> GOLDEN_HOE = ITEMS.register("golden_hoe",
            () -> new GoldenHoeItem());
    public static final RegistryObject<Item> SILVER_SHORTSWORD = ITEMS.register("silver_shortsword",
            () -> new SilverShortswordItem());
    public static final RegistryObject<Item> ADAMANTINE_INGOT = ITEMS.register("adamantine_ingot",
            () -> new AdamantineIngotItem());
    public static final RegistryObject<Item> RAW_ADAMANTINE = ITEMS.register("raw_adamantine",
            () -> new RawAdamantineItem());
    public static final RegistryObject<Item> ADAMANTINE_SHORTSWORD = ITEMS.register("adamantine_shortsword",
            () -> new AdamantineShortswordItem());
    public static final RegistryObject<Item> ADAMANTINE_PICKAXE = ITEMS.register("adamantine_pickaxe",
            () -> new AdamantinePickaxeItem());
    public static final RegistryObject<Item> ADAMANTINE_HATCHET = ITEMS.register("adamantine_hatchet",
            () -> new AdamantineHatchetItem());
    public static final RegistryObject<Item> ADAMANTINE_SHOVEL = ITEMS.register("adamantine_shovel",
            () -> new AdamantineShovelItem());
    public static final RegistryObject<Item> ADAMANTINE_HOE = ITEMS.register("adamantine_hoe",
            () -> new AdamantineHoeItem());

    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);
    }

}
