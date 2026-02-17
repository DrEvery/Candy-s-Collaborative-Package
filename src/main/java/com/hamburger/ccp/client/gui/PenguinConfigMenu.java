package com.hamburger.ccp.client.gui;

import com.hamburger.ccp.registries.CCPMenuTypes;
import com.hamburger.ccp.world.inventory.CPUContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.mudhut.ffpackage.level.item.CPUItem;

public class PenguinConfigMenu extends AbstractContainerMenu {
    public int containerId;
    public CPUContainer CPUContainer;
    public Inventory playerInventory;

    //Client Constructor
    public PenguinConfigMenu(int containerId, Inventory inventory, Player player) {
        super(CCPMenuTypes.PENGUIN_CONFIG.get(), containerId);

    }

    //Server Constructor
    public PenguinConfigMenu(int containerId, Inventory playerInventory) {
        super(CCPMenuTypes.PENGUIN_CONFIG.get(), containerId);
        this.containerId = containerId;
        this.playerInventory = playerInventory;
        this.CPUContainer = new CPUContainer();

        this.addSlot(new Slot(CPUContainer, 0, 80, -29){
            @Override
            public boolean mayPlace(ItemStack stack) {
                return stack.getItem() instanceof CPUItem && !this.hasItem();
            }
        });

        for(int i = 0; i < 3; ++i) {
            for(int l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 84 + i * 18));
            }
        }

        for(int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
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
