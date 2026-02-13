package com.hamburger.ccp.level.entity;

import com.hamburger.ccp.client.gui.PenguinConfigMenu;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class ThePenguin extends PathfinderMob {
    private boolean servingState;

    public ThePenguin(EntityType<? extends PathfinderMob> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected InteractionResult mobInteract(Player player, InteractionHand hand) {
        if (!player.level().isClientSide) {
            player.openMenu(new SimpleMenuProvider(PenguinConfigMenu::new, Component.translatable("menu.ccp.penguinconfig")));
        }
        return super.mobInteract(player, hand);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createLivingAttributes().add(Attributes.FOLLOW_RANGE, 30F);
    }

}
