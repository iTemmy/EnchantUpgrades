package com.temmy.enchantupgrades.Commands;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Events.onPlayerJoinEvent;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;
import org.jetbrains.annotations.NotNull;

public class test implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            onPlayerJoinEvent.CheckArmor(player.getInventory().getArmorContents(), player);
        }
        return true;
    }
}
