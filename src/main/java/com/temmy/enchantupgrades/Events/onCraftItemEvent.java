package com.temmy.enchantupgrades.Events;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;

public class onCraftItemEvent implements Listener {

    @EventHandler
    public static void onCraftItemEvent(CraftItemEvent e){
        for (ItemStack item : e.getInventory().getMatrix()){
            if (item != null) {
                if (item.getItemMeta() != null) {
                    if (item.getItemMeta().getPersistentDataContainer().has(Keys.getCustomOre(), PersistentDataType.BYTE)) {
                        e.setCancelled(true);
                        e.getWhoClicked().sendMessage("You tried to craft and item using a special ore");
                    }
                }
            }
        }
    }
}
