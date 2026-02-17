package com.hamburger.ccp.registries;

import com.hamburger.ccp.CCP;
import net.minecraft.network.chat.Component;
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

    public static final Supplier<CatalogTabShop> ROWBOATICS_CORP = register("rowboatics_corp", (builder) -> builder
            .title(Component.literal("Rowboatics Corp"))
            .shopItems((arr) -> {
                arr.add(PurchaseSys.createItem(CCPItemRegistry.SERVICE_CPU, 5, "A CPU designed by Rowboatics Corp. to allow streamlined order taking from" +
                        " our robotic Penguin models."));
                arr.add(PurchaseSys.createItem(CCPItemRegistry.WAITER_CPU, 5, "A CPU designed by Rowboatics Corp. to allow streamlined service from" +
                        " our robotic penguin models."));
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
