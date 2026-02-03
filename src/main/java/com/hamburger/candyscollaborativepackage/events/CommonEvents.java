package com.hamburger.candyscollaborativepackage.events;

import com.hamburger.candyscollaborativepackage.CCP;
import com.hamburger.candyscollaborativepackage.client.renderer.entity.ThePenguinRenderer;
import com.hamburger.candyscollaborativepackage.level.entity.ThePenguin;
import com.hamburger.candyscollaborativepackage.registries.CCPEntities;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.mudhut.ffpackage.client.FFPModelLayers;
import net.mudhut.ffpackage.client.model.Endo01Model;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

@EventBusSubscriber(modid = CCP.MODID)
public class CommonEvents {
    @SubscribeEvent
    public static void registerAttribute(EntityAttributeCreationEvent event) {
        event.put(CCPEntities.THE_PENGUIN.get(), ThePenguin.createAttributes().build());

    }

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(FFPModelLayers.ENDO_01, Endo01Model::createBodyLayer);
    }
}
