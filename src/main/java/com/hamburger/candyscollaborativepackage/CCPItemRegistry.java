package com.hamburger.candyscollaborativepackage;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.mudhut.ffpackage.util.FFPArmorMaterials;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CCPItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CCP.MODID);

    // Example registries for suit pieces
    public static final DeferredItem<Item> BAG_FREDDY_HEAD = register("bag_freddy_head", () ->
            new BagFreddySuitItem(CCPSuitRegistry.BAG_FREDDY_SUIT, FFPArmorMaterials.CLASSIC_FREDDY_SUIT,
                    ArmorItem.Type.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> BAG_FREDDY_TORSO = register("bag_freddy_torso", () ->
            new BagFreddySuitItem(CCPSuitRegistry.BAG_FREDDY_SUIT, FFPArmorMaterials.CLASSIC_FREDDY_SUIT,
                    ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> BAG_FREDDY_LEGS = register("bag_freddy_legs", () ->
            new BagFreddySuitItem(CCPSuitRegistry.BAG_FREDDY_SUIT, FFPArmorMaterials.CLASSIC_FREDDY_SUIT,
                    ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> BAG_FREDDY_FEET = register("bag_freddy_feet", () ->
            new BagFreddySuitItem(CCPSuitRegistry.BAG_FREDDY_SUIT, FFPArmorMaterials.CLASSIC_FREDDY_SUIT,
                    ArmorItem.Type.BOOTS, new Item.Properties()));

    public static DeferredItem<Item> register(String name, Supplier<Item> item) {
        return ITEMS.register(name, item);
    }
}
