package com.hamburger.candyscollaborativepackage.events;

import com.hamburger.candyscollaborativepackage.CCP;
import com.hamburger.candyscollaborativepackage.client.renderer.entity.ThePenguinRenderer;
import com.hamburger.candyscollaborativepackage.registries.CCPEntities;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = CCP.MODID)
public class ClientEvents {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        EntityRenderers.register(CCPEntities.THE_PENGUIN.get(), ThePenguinRenderer::new);
    }
}
