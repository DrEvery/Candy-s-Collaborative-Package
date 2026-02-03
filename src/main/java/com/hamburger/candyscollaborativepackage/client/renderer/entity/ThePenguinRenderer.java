package com.hamburger.candyscollaborativepackage.client.renderer.entity;

import com.hamburger.candyscollaborativepackage.CCP;
import com.hamburger.candyscollaborativepackage.level.entity.ThePenguin;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.resources.ResourceLocation;
import net.mudhut.ffpackage.client.FFPModelLayers;
import net.mudhut.ffpackage.client.model.Endo01Model;

public class ThePenguinRenderer extends LivingEntityRenderer<ThePenguin, Endo01Model<ThePenguin>> {
    public ThePenguinRenderer(EntityRendererProvider.Context context) {
        super(context, new Endo01Model<>(context.bakeLayer(FFPModelLayers.ENDO_01)), 1.0F);
    }

    @Override
    public ResourceLocation getTextureLocation(ThePenguin thePenguin) {
        return CCP.resource("textures/entity/placeholder_entity");
    }
}
