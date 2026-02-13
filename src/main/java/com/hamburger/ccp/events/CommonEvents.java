package com.hamburger.ccp.events;

import com.hamburger.ccp.CCP;
import com.hamburger.ccp.client.CCPModelLayers;
import com.hamburger.ccp.client.gui.PenguinConfigMenu;
import com.hamburger.ccp.client.gui.PenguinConfigScreen;
import com.hamburger.ccp.client.model.ThePenguinModel;
import com.hamburger.ccp.level.entity.ThePenguin;
import com.hamburger.ccp.registries.CCPEntities;
import com.hamburger.ccp.registries.CCPMenuTypes;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

@EventBusSubscriber(modid = CCP.MODID)
public class CommonEvents {
    @SubscribeEvent
    public static void registerAttribute(EntityAttributeCreationEvent event) {
        event.put(CCPEntities.THE_PENGUIN.get(), ThePenguin.createAttributes().build());

    }

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(CCPModelLayers.THE_PENGUIN, ThePenguinModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerScreens(RegisterMenuScreensEvent event) {
        event.register(CCPMenuTypes.PENGUIN_CONFIG.get(), PenguinConfigScreen::new);
    }
}
