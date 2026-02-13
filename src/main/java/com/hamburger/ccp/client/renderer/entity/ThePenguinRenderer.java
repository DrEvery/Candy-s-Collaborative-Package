package com.hamburger.ccp.client.renderer.entity;

import com.hamburger.ccp.CCP;
import com.hamburger.ccp.client.CCPModelLayers;
import com.hamburger.ccp.client.model.ThePenguinModel;
import com.hamburger.ccp.level.entity.ThePenguin;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.resources.ResourceLocation;

public class ThePenguinRenderer extends LivingEntityRenderer<ThePenguin, ThePenguinModel<ThePenguin>> {
    public ThePenguinRenderer(EntityRendererProvider.Context context) {
        super(context, new ThePenguinModel<>(context.bakeLayer(CCPModelLayers.THE_PENGUIN)), 1.0F);
    }

    @Override
    public ResourceLocation getTextureLocation(ThePenguin thePenguin) {
        return CCP.resource("textures/entity/the_penguin.png");
    }
}
