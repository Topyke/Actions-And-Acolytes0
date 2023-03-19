package net.topyke.AandA.item;

import net.mcreator.ana.item.AdamantineShortswordItem;
import net.mcreator.ana.item.GoldenHoeItem;
import net.mcreator.ana.item.GoldenShortswordItem;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.topyke.AandA.AandA;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.antlr.runtime.tree.CommonErrorNode;

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

    public static final RegistryObject<Item> PEBBLE = ITEMS.register("pebble",
            () -> new PebbleItem());


    public static final RegistryObject<Item> CLUB = ITEMS.register("club",
            () -> new ClubItem());
    public static final RegistryObject<Item> GREATCLUB = ITEMS.register("greatclub",
            () -> new GreatclubItem());
    public static final RegistryObject<Item> QUARTERSTAFF = ITEMS.register("quarterstaff",
            () -> new QuarterstaffItem());
    public static final RegistryObject<Item> WOODEN_SHORTSWORD = ITEMS.register("wooden_shortsword",
            () -> new WoodenShortswordItem());
    public static final RegistryObject<Item> WOODEN_PICKAXE = ITEMS.register("wooden_pickaxe",
            () -> new WoodenPickaxeItem());
    public static final RegistryObject<Item> WOODEN_HATCHET = ITEMS.register("wooden_hatchet",
            () -> new WoodenHatchetItem());
    public static final RegistryObject<Item> WOODEN_SHOVEL = ITEMS.register("wooden_shovel",
            () -> new WoodenShovelItem());
    public static final RegistryObject<Item> WOODEN_HOE = ITEMS.register("wooden_hoe",
            () -> new WoodenHoeItem());


    public static final RegistryObject<Item> STONE_SHORTSWORD = ITEMS.register("stone_shortsword",
            () -> new StoneShortswordItem());
    public static final RegistryObject<Item> STONE_PICKAXE = ITEMS.register("stone_pickaxe",
            () -> new StonePickaxeItem());
    public static final RegistryObject<Item> STONE_HATCHET = ITEMS.register("stone_hatchet",
            () -> new StoneHatchetItem());
    public static final RegistryObject<Item> STONE_SHOVEL = ITEMS.register("stone_shovel",
            () -> new StoneShovelItem());
    public static final RegistryObject<Item> STONE_HOE = ITEMS.register("stone_hoe",
            () -> new StoneHoeItem());

    public static final RegistryObject<Item> IRON_DAGGER = ITEMS.register("iron_dagger",
            () -> new IronDaggerItem());
    public static final RegistryObject<Item> IRON_HANDAXE = ITEMS.register("iron_handaxe",
            () -> new IronHandaxeItem());
    public static final RegistryObject<Item> IRON_JAVELIN = ITEMS.register("iron_javelin",
            () -> new IronJavelinItem());
    public static final RegistryObject<Item> IRON_MALLET = ITEMS.register("iron_mallet",
            () -> new IronMalletItem());
    public static final RegistryObject<Item> IRON_MACE = ITEMS.register("iron_mace",
            () -> new IronMaceItem());
    public static final RegistryObject<Item> IRON_SCYTHE = ITEMS.register("iron_scythe",
            () -> new IronScytheItem());
    public static final RegistryObject<Item> IRON_SPEAR = ITEMS.register("iron_spear",
            () -> new IronSpearItem());
    public static final RegistryObject<Item> IRON_BATTLEAXE = ITEMS.register("iron_battleaxe",
            () -> new IronBattleaxeItem());
    public static final RegistryObject<Item> IRON_FLAIL = ITEMS.register("iron_flail",
            () -> new IronFlailItem());
    public static final RegistryObject<Item> IRON_GLAIVE = ITEMS.register("iron_glaive",
            () -> new IronGlaiveItem());
    public static final RegistryObject<Item> IRON_GREATAXE = ITEMS.register("iron_greataxe",
            () -> new IronGreataxeItem());

    public static final RegistryObject<Item> IRON_GREATSWORD = ITEMS.register("iron_greatsword",
            () -> new IronGreatswordItem());
    public static final RegistryObject<Item> IRON_HALBERD = ITEMS.register("iron_halberd",
            () -> new IronHalberdItem());
    public static final RegistryObject<Item> IRON_LANCE = ITEMS.register("iron_lance",
            () -> new IronLanceItem());
    public static final RegistryObject<Item> IRON_LONGSWORD = ITEMS.register("iron_longsword",
            () -> new IronLongswordItem());
    public static final RegistryObject<Item> IRON_MAUL = ITEMS.register("iron_maul",
            () -> new IronMaulItem());
    public static final RegistryObject<Item> IRON_MORNINGSTAR = ITEMS.register("iron_morningstar",
            () -> new IronMorningstarItem());
    public static final RegistryObject<Item> IRON_PIKE = ITEMS.register("iron_pike",
            () -> new IronPikeItem());
    public static final RegistryObject<Item> IRON_RAPIER = ITEMS.register("iron_rapier",
            () -> new IronRapierItem());
    public static final RegistryObject<Item> IRON_SCIMITAR = ITEMS.register("iron_scimitar",
            () -> new IronScimitarItem());
    public static final RegistryObject<Item> IRON_SHORTSWORD = ITEMS.register("iron_shortsword",
            () -> new IronShortswordItem());
    public static final RegistryObject<Item> IRON_TRIDENT = ITEMS.register("iron_trident",
            () -> new IronTridentItem(new Item.Properties().stacksTo(1).rarity(net.minecraft.world.item.Rarity.COMMON)));
    public static final RegistryObject<Item> IRON_WARPICK = ITEMS.register("iron_warpick",
            () -> new IronWarpickItem());
    public static final RegistryObject<Item> IRON_WARHAMMER = ITEMS.register("iron_warhammer",
            () -> new IronWarhammerItem());
    public static final RegistryObject<Item> IRON_WHIP = ITEMS.register("iron_barbed_whip",
            () -> new IronBarbedWhipItem());
    public static final RegistryObject<Item> IRON_PICKAXE = ITEMS.register("iron_pickaxe",
            () -> new IronPickaxeItem());
    public static final RegistryObject<Item> IRON_HATCHET = ITEMS.register("iron_hatchet",
            () -> new IronHatchetItem());
    public static final RegistryObject<Item> IRON_SHOVEL = ITEMS.register("iron_shovel",
            () -> new IronShovelItem());
    public static final RegistryObject<Item> IRON_HOE = ITEMS.register("iron_hoe",
            () -> new IronHoeItem());

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

    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new SilverIngotItem());
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new RawSilverItem());
    public static final RegistryObject<Item> SILVER_SHORTSWORD = ITEMS.register("silver_shortsword",
            () -> new SilverShortswordItem());
    public static final RegistryObject<Item> SILVER_PICKAXE = ITEMS.register("silver_pickaxe",
            () -> new SilverPickaxeItem());
    public static final RegistryObject<Item> SILVER_HATCHET = ITEMS.register("silver_hatchet",
            () -> new SilverHatchetItem());
    public static final RegistryObject<Item> SILVER_SHOVEL = ITEMS.register("silver_shovel",
            () -> new SilverShovelItem());
    public static final RegistryObject<Item> SILVER_HOE = ITEMS.register("silver_hoe",
            () -> new SilverHoeItem());

    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
            () -> new PlatinumIngotItem());
    public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum",
            () -> new RawPlatinumItem());
    public static final RegistryObject<Item> PLATINUM_SHORTSWORD = ITEMS.register("platinum_shortsword",
            () -> new PlatinumShortswordItem());
    public static final RegistryObject<Item> PLATINUM_PICKAXE = ITEMS.register("platinum_pickaxe",
            () -> new PlatinumPickaxeItem());
    public static final RegistryObject<Item> PLATINUM_HATCHET = ITEMS.register("platinum_hatchet",
            () -> new PlatinumHatchetItem());
    public static final RegistryObject<Item> PLATINUM_SHOVEL = ITEMS.register("platinum_shovel",
            () -> new PlatinumShovelItem());
    public static final RegistryObject<Item> PLATINUM_HOE = ITEMS.register("platinum_hoe",
            () -> new PlatinumHoeItem());

    public static final RegistryObject<Item> MITHRAL_INGOT = ITEMS.register("mithral_ingot",
            () -> new MithralIngotItem());
    public static final RegistryObject<Item> RAW_MITHRAL = ITEMS.register("raw_mithral",
            () -> new RawMithralItem());
    public static final RegistryObject<Item> MITHRAL_SHORTSWORD = ITEMS.register("mithral_shortsword",
            () -> new MithralShortswordItem());
    public static final RegistryObject<Item> MITHRAL_PICKAXE = ITEMS.register("mithral_pickaxe",
            () -> new MithralPickaxeItem());
    public static final RegistryObject<Item> MITHRAL_HATCHET = ITEMS.register("mithral_hatchet",
            () -> new MithralHatchetItem());
    public static final RegistryObject<Item> MITHRAL_SHOVEL = ITEMS.register("mithral_shovel",
            () -> new MithralShovelItem());
    public static final RegistryObject<Item> MITHRAL_HOE = ITEMS.register("mithral_hoe",
            () -> new MithralHoeItem());


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

    public static final RegistryObject<Item> SLING = ITEMS.register("sling",
            () -> new SlingItem());
    public static final RegistryObject<Item> SHORTBOW = ITEMS.register("shortbow",
            () -> new ShorbowItem(new Item.Properties().stacksTo(1).rarity(net.minecraft.world.item.Rarity.COMMON)));
    public static final RegistryObject<Item> LIGHT_CROSSBOW = ITEMS.register("light_crossbow",
            () -> new LightCrossbowItem(new Item.Properties().stacksTo(1).rarity(net.minecraft.world.item.Rarity.COMMON)));

    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);
    }

}
