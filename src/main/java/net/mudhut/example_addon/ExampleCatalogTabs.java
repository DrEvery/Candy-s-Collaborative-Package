package net.mudhut.example_addon;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.mudhut.ffpackage.registries.FFPCatalogShops;
import net.mudhut.ffpackage.registries.FFPRegistries;
import net.mudhut.ffpackage.util.CatalogTab;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ExampleCatalogTabs {
    // The registry for catalog tabs
    public static final DeferredRegister<CatalogTab> CATALOG_TABS =
            DeferredRegister.create(FFPRegistries.CATALOG_TABS, FFPExample.MODID);

    public static final Supplier<CatalogTab> EXAMPLE_TAB = CATALOG_TABS.register("example_tab", () -> CatalogTab.builder()
            .displayName(Component.literal("Example Tab"))
            .icon(() -> new ItemStack(ExampleItemRegistry.BAG_FREDDY_HEAD.asItem()))
            .tabShops(output -> {
                output.accept(FFPCatalogShops.BUDGET_TECH); // Base mod shops can be added to custom tabs too
                output.accept(ExampleCatalogShops.EXAMPLE_SHOP);
            }).build());
}
