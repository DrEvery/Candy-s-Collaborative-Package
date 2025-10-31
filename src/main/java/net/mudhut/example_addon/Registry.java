package net.mudhut.example_addon;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@EventBusSubscriber(modid = FFPExample.MODID, value = Dist.CLIENT)
public class Registry {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ExampleModelLayers.BAG_FREDDY, BAGFreddySuitModel::createBodyLayer);
    }
}
