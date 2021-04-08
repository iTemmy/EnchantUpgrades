package com.temmy.enchantupgrades.Events;

import com.destroystokyo.paper.event.player.PlayerPostRespawnEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class onPlayerPostRespawnEvent implements Listener {

    @EventHandler
    public static void onPlayerPostRespawnEvent(PlayerPostRespawnEvent e){
        onPlayerJoinEvent.CheckArmor(e.getPlayer().getInventory().getArmorContents(), e.getPlayer());
    }
}
