package com.hamburger.ccp.registries;

import com.hamburger.ccp.CCP;
import com.hamburger.ccp.level.block.ThePenguinBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CCPBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(CCP.MODID);
    //Delete Block Later
    public static final DeferredBlock<ThePenguinBlock> THE_PENGUIN_BLOCK = BLOCKS.register(
            "the_penguin_block", () -> new ThePenguinBlock(
                    BlockBehaviour.Properties.of()
            )
    );
}
