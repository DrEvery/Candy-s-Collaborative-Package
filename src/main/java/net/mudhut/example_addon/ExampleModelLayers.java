package net.mudhut.example_addon;

import net.minecraft.client.model.geom.ModelLayerLocation;

public class ExampleModelLayers {
    public static final ModelLayerLocation BAG_FREDDY = register("bag_freddy");

    private static ModelLayerLocation register(String pPath) {
        return register(pPath, "main");
    }

    private static ModelLayerLocation register(String pPath, String pModel) {
        return new ModelLayerLocation(FFPExample.resource(pPath), pModel);
    }
}
