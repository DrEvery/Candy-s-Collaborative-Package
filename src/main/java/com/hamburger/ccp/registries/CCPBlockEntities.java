package com.hamburger.ccp.registries;

import com.hamburger.ccp.CCP;
import com.hamburger.ccp.level.entity.block_entity.ThePenguinBlockEntity;
import com.mojang.datafixers.types.Type;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CCPBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, CCP.MODID);
    //Delete Block Entity Later
    public static final Supplier<BlockEntityType<ThePenguinBlockEntity>> THE_PENGUIN_BLOCK_ENTITY = BLOCK_ENTITIES.register(
            "the_penguin_block_entity", () -> BlockEntityType.Builder.of(
                    ThePenguinBlockEntity::new, (Block) CCPBlocks.THE_PENGUIN_BLOCK.get())
                    .build((Type<?>) null));
}
