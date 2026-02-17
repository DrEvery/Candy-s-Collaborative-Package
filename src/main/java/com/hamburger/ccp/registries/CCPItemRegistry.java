package com.hamburger.ccp.registries;

import com.hamburger.ccp.level.item.suit.BagFreddySuitItem;
import com.hamburger.ccp.CCP;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.mudhut.ffpackage.level.item.CPUItem;
import net.mudhut.ffpackage.util.FFPArmorMaterials;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CCPItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CCP.MODID);

    //Replace with Rat when you have model and textures :D
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

    public static final DeferredItem<Item> SERVICE_CPU = register("service_cpu", () ->
            new CPUItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> WAITER_CPU = register("waiter_cpu", () ->
            new CPUItem(new Item.Properties().stacksTo(1)));

    public static DeferredItem<Item> register(String name, Supplier<Item> item) {
        return ITEMS.register(name, item);
    }
}
