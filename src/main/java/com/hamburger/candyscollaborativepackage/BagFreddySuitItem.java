package com.hamburger.candyscollaborativepackage;

import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.core.Holder;
import net.minecraft.world.item.ArmorMaterial;
import net.mudhut.ffpackage.level.item.IPlushSuit;
import net.mudhut.ffpackage.level.item.PlushSuitItem;
import net.mudhut.ffpackage.util.AnimatronicSuit;

import java.util.function.Function;
import java.util.function.Supplier;

public class BagFreddySuitItem extends PlushSuitItem implements IPlushSuit {
    public BagFreddySuitItem(Supplier<AnimatronicSuit> animatronicSuit, Holder<ArmorMaterial> material, Type type, Properties properties) {
        super(animatronicSuit, material, type, properties);
    }

    @Override
    public Function<EntityModelSet, Object> getModel() {
        return set -> new BAGFreddySuitModel<>(set.bakeLayer(CCPModelLayers.BAG_FREDDY));
    }
}
