package com.hamburger.ccp.client.gui;

import com.hamburger.ccp.CCP;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class PenguinConfigScreen extends AbstractContainerScreen<PenguinConfigMenu> {
    public static final ResourceLocation PENGUIN_INNARDS = CCP.resource("textures/gui/penguin_config_menu.png");

    public PenguinConfigScreen(PenguinConfigMenu menu, Inventory playerInventory, Component component) {
        super(menu, playerInventory, component);
    }

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float partialTick, int mouseX, int mouseY) {
        guiGraphics.blit(PENGUIN_INNARDS, this.width / 2 - 95, this.height / 2 - 138, 0, 0, 192, 221);
    }

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTick) {
        super.render(guiGraphics, mouseX, mouseY, partialTick);
    }
}
