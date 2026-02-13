package com.hamburger.ccp;

import com.hamburger.ccp.registries.*;
import net.minecraft.resources.ResourceLocation;
import net.refractionapi.refraction.helper.clazz.RModRegistrar;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(CCP.MODID)
public class CCP {
    public static final String MODID = "ccp";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CCP(IEventBus modEventBus, ModContainer modContainer) {
        RModRegistrar.registerSelf(MODID);
        modEventBus.register(Registry.class);
        CCPSuitRegistry.SUITS.register(modEventBus);
        CCPItemRegistry.ITEMS.register(modEventBus);
        CCPCatalogTabs.CATALOG_TABS.register(modEventBus);
        CCPCatalogShops.CATALOG_SHOPS.register(modEventBus);
        CCPMenuTypes.MENU_TYPES.register(modEventBus);
        CCPEntities.ENTITIES.register(modEventBus);
        CCPBlocks.BLOCKS.register(modEventBus);
        CCPBlockEntities.BLOCK_ENTITIES.register(modEventBus);
    }

    public static ResourceLocation resource(String path) {
        return ResourceLocation.tryBuild(MODID, path);
    }
}
