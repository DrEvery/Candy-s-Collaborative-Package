package com.hamburger.ccp.client.gui;

import com.hamburger.ccp.level.entity.ThePenguin;
import com.hamburger.ccp.registries.CCPMenuTypes;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

public class PenguinConfigMenu extends AbstractContainerMenu {
    public int containerId;
    public Container penguinContainer;
    public ThePenguin penguin;

    public PenguinConfigMenu(int containerId, Container penguinContainer, RegistryFriendlyByteBuf extraData) {
        super(CCPMenuTypes.PENGUIN_CONFIG.get(), containerId);
        this.containerId = containerId;
        this.penguinContainer = penguinContainer;
        this.addSlot(new Slot(this.penguinContainer, 0, 640, 480));
    }

    public PenguinConfigMenu(int containerId, Inventory inventory, Player player) {
        super(CCPMenuTypes.PENGUIN_CONFIG.get(), containerId);
    }

    @Override
    public ItemStack quickMoveStack(Player player, int i) {
        return null;
    }

    @Override
    public boolean stillValid(Player player) {
        return true;
    }
}
