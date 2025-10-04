package net.mudhut.example_addon;

import net.minecraft.resources.ResourceLocation;
import net.refractionapi.refraction.helper.clazz.RModRegistrar;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(FFPExample.MODID)
public class FFPExample {
    public static final String MODID = "ffp_example_addon";
    public static final Logger LOGGER = LogUtils.getLogger();

    public FFPExample(IEventBus modEventBus, ModContainer modContainer) {
        RModRegistrar.registerSelf(MODID);
        ExampleSuitRegistry.SUITS.register(modEventBus);
        ExampleItemRegistry.ITEMS.register(modEventBus);
    }

    public static ResourceLocation resource(String path) {
        return ResourceLocation.tryBuild(MODID, path);
    }
}
