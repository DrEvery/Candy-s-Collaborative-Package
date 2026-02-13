package com.hamburger.ccp.registries;

import com.hamburger.ccp.CCP;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.mudhut.ffpackage.registries.FFPRegistries;
import net.mudhut.ffpackage.util.CatalogTab;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CCPCatalogTabs {
    // The registry for catalog tabs
    public static final DeferredRegister<CatalogTab> CATALOG_TABS =
            DeferredRegister.create(FFPRegistries.CATALOG_TABS, CCP.MODID);

    public static final Supplier<CatalogTab> CTC_ENTERTAINMENT = CATALOG_TABS.register("ctc_entertainment", () -> CatalogTab.builder()
            .displayName(Component.literal("CTC Entertainment"))
            .icon(() -> new ItemStack(Items.STICK.asItem()))
            .tabShops(output -> {
                output.accept(CCPCatalogShops.ROWBOATICS_CORP);
            }).build());
}
