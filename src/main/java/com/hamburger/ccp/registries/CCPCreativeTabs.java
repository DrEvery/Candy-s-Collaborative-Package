package com.hamburger.ccp.registries;

import com.hamburger.ccp.CCP;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CCPCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(BuiltInRegistries.CREATIVE_MODE_TAB, CCP.MODID);

    public static final Supplier<CreativeModeTab> CCP_TAB = CREATIVE_TABS.register(
            "ccp_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + CCP.MODID + ".ccp_tab"))
                    .icon(() -> new ItemStack(CCPItemRegistry.SERVICE_CPU.get()))
                    .displayItems((enabledFeatures, output) -> {
                                for (DeferredHolder<Item, ? extends Item> key : CCPItemRegistry.ITEMS.getEntries()) {
                                    output.accept((ItemLike) key);
                                }
                                for (DeferredHolder<Block, ? extends Block> key : CCPBlocks.BLOCKS.getEntries()) {
                                    output.accept((ItemLike) key);
                                }
                            }
                    )
                    .build()
    );
}
