package com.hamburger.ccp.client;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.mudhut.ffpackage.FFPackage;

public class CCPModelLayers {
    public static final ModelLayerLocation THE_PENGUIN = register("the_penguin");


    private static ModelLayerLocation register(String pPath) {
        return register(pPath, "main");
    }

    private static ModelLayerLocation register(String pPath, String pModel) {
        return new ModelLayerLocation(FFPackage.resource(pPath), pModel);
    }
}
