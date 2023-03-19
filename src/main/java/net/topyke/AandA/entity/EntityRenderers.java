/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.topyke.AandA.entity;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EntityRenderers {
    @SubscribeEvent
    public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntities.IRON_HANDAXE.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer(ModEntities.IRON_JAVELIN.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer(ModEntities.IRON_MALLET.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer(ModEntities.SLING.get(), ThrownItemRenderer::new);

    }
}
