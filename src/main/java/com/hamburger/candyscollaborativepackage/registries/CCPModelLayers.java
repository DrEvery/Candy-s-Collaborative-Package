package com.hamburger.candyscollaborativepackage.registries;

import com.hamburger.candyscollaborativepackage.CCP;
import net.minecraft.client.model.geom.ModelLayerLocation;

public class CCPModelLayers {
    //Replace with Rat when you have model :D
    public static final ModelLayerLocation BAG_FREDDY = register("bag_freddy");

    private static ModelLayerLocation register(String pPath) {
        return register(pPath, "main");
    }

    private static ModelLayerLocation register(String pPath, String pModel) {
        return new ModelLayerLocation(CCP.resource(pPath), pModel);
    }
}
