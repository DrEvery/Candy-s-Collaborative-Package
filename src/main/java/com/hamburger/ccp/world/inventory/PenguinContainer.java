package com.hamburger.ccp.world.inventory;

import net.minecraft.core.NonNullList;
import net.minecraft.world.Container;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class PenguinContainer implements Container {
    public NonNullList<ItemStack> itemStack;

    public PenguinContainer() {
        this.itemStack = NonNullList.withSize(1, ItemStack.EMPTY);
    }


    @Override
    public int getContainerSize() {
        return 1;
    }

    @Override
    public boolean isEmpty() {
        return this.itemStack.stream().allMatch(ItemStack::isEmpty);
    }

    @Override
    public ItemStack getItem(int i) {
        return this.itemStack.get(i);
    }

    @Override
    public ItemStack removeItem(int i, int i1) {
        ItemStack stack = ContainerHelper.removeItem(itemStack, i, i1);
        this.setChanged();
        return stack;

    }

    @Override
    public ItemStack removeItemNoUpdate(int i) {
        ItemStack stack = ContainerHelper.takeItem(itemStack, i);
        this.setChanged();
        return stack;
    }

    @Override
    public void setItem(int i, ItemStack itemStack) {

        itemStack.limitSize(1);
        this.itemStack.set(i, itemStack);
        this.setChanged();
    }

    @Override
    public void setChanged() {

    }

    @Override
    public boolean stillValid(Player player) {
        return true;
    }

    @Override
    public void clearContent() {
        itemStack.clear();
        this.setChanged();
    }
}
