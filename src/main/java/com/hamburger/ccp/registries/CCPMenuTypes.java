package com.hamburger.ccp.registries;

import com.hamburger.ccp.CCP;
import com.hamburger.ccp.client.gui.PenguinConfigMenu;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CCPMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENU_TYPES = DeferredRegister.create(BuiltInRegistries.MENU, CCP.MODID);

    public static final Supplier<MenuType<PenguinConfigMenu>> PENGUIN_CONFIG = MENU_TYPES.register(
            "penguin_config", () -> new MenuType<>(PenguinConfigMenu::new, FeatureFlags.DEFAULT_FLAGS)
    );
}
