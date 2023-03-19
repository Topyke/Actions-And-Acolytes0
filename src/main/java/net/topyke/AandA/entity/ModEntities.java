
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.topyke.AandA.entity;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.topyke.AandA.AandA;
import net.topyke.AandA.entity.IronHandaxeEntity;
import net.topyke.AandA.item.IronMalletItem;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntities {
    public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AandA.MOD_ID);
    public static final RegistryObject<EntityType<IronHandaxeEntity>> IRON_HANDAXE = register("projectile_iron_handaxe",
            EntityType.Builder.<IronHandaxeEntity>of(IronHandaxeEntity::new, MobCategory.MISC).setCustomClientFactory(IronHandaxeEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
    public static final RegistryObject<EntityType<IronJavelinEntity>> IRON_JAVELIN = register("projectile_iron_javelin",
            EntityType.Builder.<IronJavelinEntity>of(IronJavelinEntity::new, MobCategory.MISC).setCustomClientFactory(IronJavelinEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

    public static final RegistryObject<EntityType<IronMalletEntity>> IRON_MALLET = register("projectile_iron_mallet",
            EntityType.Builder.<IronMalletEntity>of(IronMalletEntity::new, MobCategory.MISC).setCustomClientFactory(IronMalletEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
    public static final RegistryObject<EntityType<SlingEntity>> SLING = register("projectile_sling",
            EntityType.Builder.<SlingEntity>of(SlingEntity::new, MobCategory.MISC).setCustomClientFactory(SlingEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));


    private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
        return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
    }

    @SubscribeEvent
    public static void init(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
        });
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
    }



}
