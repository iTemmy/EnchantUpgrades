package com.temmy.enchantupgrades.Recipes;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import net.kyori.adventure.text.Component;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

public class CustomOres {

    public CustomOres(){
        Phosphorus();
        Janelite();
        ShatteredObsidian();
        Ellendyte();
        Sapphire();
        Tungsten();
        Zinc();
        Corinthium();
        Jolixanine();
    }

    private void ShatteredObsidian(){
        ItemStack item = new ItemStack(Material.CRYING_OBSIDIAN);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.DARK_PURPLE+""+ChatColor.BOLD+"Shattered Obsidian"));
        meta.getPersistentDataContainer().set(Keys.getCustomOre(), PersistentDataType.BYTE, (byte) 0);
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        Main.getCustomItems().put(Keys.getShatteredObsidian(), item);
    }

    private void Phosphorus(){
        ItemStack item = new ItemStack(Material.COAL);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.GRAY+""+ChatColor.BOLD+"Phosphorus"));
        meta.getPersistentDataContainer().set(Keys.getCustomOre(), PersistentDataType.BYTE, (byte) 0);
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setCustomModelData(1);
        item.setItemMeta(meta);
        Main.getCustomItems().put(Keys.getPhosphorus(), item);
    }

    private void Janelite(){
        ItemStack item = new ItemStack(Material.DIAMOND);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.BLUE+""+ChatColor.BOLD+"Janelite"));
        meta.getPersistentDataContainer().set(Keys.getCustomOre(), PersistentDataType.BYTE, (byte) 0);
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setCustomModelData(1);
        item.setItemMeta(meta);
        Main.getCustomItems().put(Keys.getJanelite(), item);
    }

    private void Ellendyte(){
        ItemStack item = new ItemStack(Material.EMERALD);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.GREEN + "" + ChatColor.BOLD + "Ellendyte"));
        meta.getPersistentDataContainer().set(Keys.getCustomOre(), PersistentDataType.BYTE, (byte) 0);
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setCustomModelData(1);
        item.setItemMeta(meta);
        Main.getCustomItems().put(Keys.getEllendyte(), item);
    }

    private void Sapphire(){
        ItemStack item = new ItemStack(Material.LAPIS_LAZULI);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.DARK_BLUE + "" + ChatColor.BOLD + "Sapphire"));
        meta.getPersistentDataContainer().set(Keys.getCustomOre(), PersistentDataType.BYTE, (byte) 0);
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setCustomModelData(1);
        item.setItemMeta(meta);
        Main.getCustomItems().put(Keys.getSapphire(), item);
    }

    private void Tungsten(){
        ItemStack item = new ItemStack(Material.REDSTONE);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.DARK_RED + "" + ChatColor.BOLD + "Tungsten"));
        meta.getPersistentDataContainer().set(Keys.getCustomOre(), PersistentDataType.BYTE, (byte) 0);
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setCustomModelData(1);
        item.setItemMeta(meta);
        Main.getCustomItems().put(Keys.getTungsten(), item);
    }

    private void Zinc(){
        ItemStack item = new ItemStack(Material.QUARTZ);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.WHITE + "" + ChatColor.BOLD + "Zinc"));
        meta.getPersistentDataContainer().set(Keys.getCustomOre(), PersistentDataType.BYTE, (byte) 0);
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setCustomModelData(1);
        item.setItemMeta(meta);
        Main.getCustomItems().put(Keys.getZinc(), item);
    }

    private void Corinthium(){
        ItemStack item = new ItemStack(Material.GOLD_INGOT);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.GOLD+""+ChatColor.BOLD+"Corinthium"));
        meta.getPersistentDataContainer().set(Keys.getCustomOre(), PersistentDataType.BYTE, (byte) 0);
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setCustomModelData(1);
        item.setItemMeta(meta);
        Main.getCustomItems().put(Keys.getCorinthium(), item);
    }

    private void Jolixanine(){
        ItemStack item = new ItemStack(Material.IRON_INGOT);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.WHITE+""+ChatColor.BOLD+"Jolixanine"));
        meta.getPersistentDataContainer().set(Keys.getCustomOre(), PersistentDataType.BYTE, (byte) 0);
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setCustomModelData(1);
        item.setItemMeta(meta);
        Main.getCustomItems().put(Keys.getJolixanine(), item);
    }
}
