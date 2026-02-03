package com.hamburger.candyscollaborativepackage.registries;

import com.hamburger.candyscollaborativepackage.CCP;
import com.hamburger.candyscollaborativepackage.level.entity.ThePenguin;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CCPEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, CCP.MODID);

    public static final DeferredHolder<EntityType<?>, EntityType<ThePenguin>> THE_PENGUIN = ENTITIES.register(
            "the_penguin", () -> EntityType.Builder.of(ThePenguin::new, MobCategory.MISC).build("the_penguin"));

}
