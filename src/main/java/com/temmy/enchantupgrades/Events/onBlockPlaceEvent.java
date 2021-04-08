package com.temmy.enchantupgrades.Events;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.persistence.PersistentDataType;

public class onBlockPlaceEvent implements Listener {

    @EventHandler
    public static void onBlockPlaceEvent(BlockPlaceEvent e){
        if (e.getItemInHand().getItemMeta().getPersistentDataContainer().has(Keys.getCustomOre(), PersistentDataType.BYTE)){
            e.setCancelled(true);
        }
    }
}
