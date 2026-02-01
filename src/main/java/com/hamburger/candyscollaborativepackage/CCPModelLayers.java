package com.hamburger.candyscollaborativepackage;

import net.minecraft.client.model.geom.ModelLayerLocation;

public class CCPModelLayers {
    public static final ModelLayerLocation BAG_FREDDY = register("bag_freddy");

    private static ModelLayerLocation register(String pPath) {
        return register(pPath, "main");
    }

    private static ModelLayerLocation register(String pPath, String pModel) {
        return new ModelLayerLocation(CCP.resource(pPath), pModel);
    }
}
