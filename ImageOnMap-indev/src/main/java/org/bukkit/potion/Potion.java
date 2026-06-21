package org.bukkit.potion;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@Deprecated
public class Potion {
    public Potion() {
    }

    public ItemStack toItemStack(int amount) {
        return new ItemStack(Material.POTION, amount);
    }

    public static Potion fromItemStack(ItemStack item) {
        return new Potion();
    }
}