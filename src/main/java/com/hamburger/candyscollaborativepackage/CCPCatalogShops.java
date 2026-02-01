package com.hamburger.candyscollaborativepackage;

import net.minecraft.network.chat.Component;
import net.mudhut.ffpackage.registries.FFPItems;
import net.mudhut.ffpackage.registries.FFPRegistries;
import net.mudhut.ffpackage.server.purchase.PurchaseSys;
import net.mudhut.ffpackage.util.CatalogTabShop;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class CCPCatalogShops {
    // The registry for catalog shops
    public static final DeferredRegister<CatalogTabShop> CATALOG_SHOPS =
            DeferredRegister.create(FFPRegistries.TAB_SHOPS, CCP.MODID);

    public static final Supplier<CatalogTabShop> EXAMPLE_SHOP = register("example_shop", (builder) -> builder
            .title(Component.literal("Example Shop"))
            // You can add custom tab sprites! Use the base mod tab sprite as a base :)
            //.tabSprite(FFPExample.resource("catalog/catalog_shop_blue_unselected"), FFPExample.resource("catalog/catalog_shop_blue_selected"))
            .shopItems((arr) -> {
                arr.add(PurchaseSys.createItem(CCPItemRegistry.BAG_FREDDY_HEAD, 1, "Example shop item"));
                arr.add(PurchaseSys.createItem(CCPItemRegistry.BAG_FREDDY_TORSO, 2, 4, "Example shop item that gives 4 items"));
                arr.add(PurchaseSys.createItem(CCPItemRegistry.BAG_FREDDY_LEGS, 3, "Example shop item"));
                arr.add(PurchaseSys.createItem(CCPItemRegistry.BAG_FREDDY_FEET, 4, "Example shop item"));
                arr.add(PurchaseSys.createItem(FFPItems.RUBY, 5, "Example existing item"));
            })
            .build());

    // Just to make it easier
    public static Supplier<CatalogTabShop> register(String id, Consumer<CatalogTabShop.Builder> consumer) {
        return CATALOG_SHOPS.register(id, () -> {
            var builder = CatalogTabShop.builder(id);
            consumer.accept(builder);
            return builder.build();
        });
    }
}
