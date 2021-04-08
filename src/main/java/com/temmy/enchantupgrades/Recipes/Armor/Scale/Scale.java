package com.temmy.enchantupgrades.Recipes.Armor.Scale;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Scale {

    public Scale(){
        Helmet();
        Chestplate();
        Leggings();
        Boots();
    }

    private ItemStack Janelite = Main.getCustomItems().get(Keys.getJanelite());
    private ItemStack ImbuedHardening = Main.getImbuedEssences().get(Keys.getImbuedHardening());
    private ItemStack ImbuedProtection = Main.getImbuedEssences().get(Keys.getImbuedProtection());

    private void Helmet(){
        ItemStack item = new ItemStack(Material.DIAMOND_HELMET);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.DARK_PURPLE+""+ChatColor.BOLD+"Scale Helmet"));
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 6, true);
        meta.addEnchant(Enchantment.DURABILITY, 5, true);
        List<Component> lore = new ArrayList<>(Arrays.asList(Component.text(ChatColor.GOLD+"Wearing(1)"),
                Component.text(ChatColor.DARK_PURPLE+"Speed 1"),
                Component.text(ChatColor.GOLD+"Full Set Bonus:"),
                Component.text(ChatColor.DARK_PURPLE+"Resistance 2"),
                Component.text(ChatColor.DARK_PURPLE+"Strength 1")));
        meta.lore(lore);
        meta.getPersistentDataContainer().set(Keys.getSingleEffectSpeed(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectResistance(), PersistentDataType.INTEGER, 2);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectStrength(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getScaleSet(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getScaleHelmet(), item);
        recipe.shape("PHP","J J","   ");
        recipe.setIngredient('H', ImbuedHardening);
        recipe.setIngredient('P', ImbuedProtection);
        recipe.setIngredient('J', Janelite);
        Bukkit.getServer().addRecipe(recipe);
        Main.getCustomArmor().put(Keys.getScaleHelmet(), item);
    }

    private void Chestplate(){
        ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.DARK_PURPLE+""+ChatColor.BOLD+"Scale Chestplate"));
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 6, true);
        meta.addEnchant(Enchantment.DURABILITY, 5, true);
        List<Component> lore = new ArrayList<>(Arrays.asList(Component.text(ChatColor.GOLD+"Wearing(1)"),
                Component.text(ChatColor.DARK_PURPLE+"Speed 1"),
                Component.text(ChatColor.GOLD+"Full Set Bonus:"),
                Component.text(ChatColor.DARK_PURPLE+"Resistance 2"),
                Component.text(ChatColor.DARK_PURPLE+"Strength 1")));
        meta.lore(lore);
        meta.getPersistentDataContainer().set(Keys.getSingleEffectSpeed(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectResistance(), PersistentDataType.INTEGER, 2);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectStrength(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getScaleSet(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getScaleChestplate(), item);
        recipe.shape("J J","PHP","PPP");
        recipe.setIngredient('J', Janelite);
        recipe.setIngredient('H', ImbuedHardening);
        recipe.setIngredient('P', ImbuedProtection);
        Bukkit.getServer().addRecipe(recipe);
        Main.getCustomArmor().put(Keys.getScaleChestplate(), item);
    }

    private void Leggings(){
        ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.DARK_PURPLE+""+ChatColor.BOLD+"Scale Leggings"));
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 6, true);
        meta.addEnchant(Enchantment.DURABILITY, 5, true);
        List<Component> lore = new ArrayList<>(Arrays.asList(Component.text(ChatColor.GOLD+"Wearing(1)"),
                Component.text(ChatColor.DARK_PURPLE+"Speed 1"),
                Component.text(ChatColor.GOLD+"Full Set Bonus:"),
                Component.text(ChatColor.DARK_PURPLE+"Resistance 2"),
                Component.text(ChatColor.DARK_PURPLE+"Strength 1")));
        meta.lore(lore);
        meta.getPersistentDataContainer().set(Keys.getSingleEffectSpeed(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectResistance(), PersistentDataType.INTEGER, 2);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectStrength(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getScaleSet(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getScaleLeggings(), item);
        recipe.shape("JHJ","P P","P P");
        recipe.setIngredient('J', Janelite);
        recipe.setIngredient('H', ImbuedHardening);
        recipe.setIngredient('P', ImbuedProtection);
        Bukkit.getServer().addRecipe(recipe);
        Main.getCustomArmor().put(Keys.getScaleLeggings(), item);
    }

    private void Boots(){
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.DARK_PURPLE+""+ChatColor.BOLD+"Scale Boots"));
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 6, true);
        meta.addEnchant(Enchantment.DURABILITY, 5, true);
        List<Component> lore = new ArrayList<>(Arrays.asList(Component.text(ChatColor.GOLD+"Wearing(1)"),
                Component.text(ChatColor.DARK_PURPLE+"Speed 1"),
                Component.text(ChatColor.GOLD+"Full Set Bonus:"),
                Component.text(ChatColor.DARK_PURPLE+"Resistance 2"),
                Component.text(ChatColor.DARK_PURPLE+"Strength 1")));
        meta.lore(lore);
        meta.getPersistentDataContainer().set(Keys.getSingleEffectSpeed(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectResistance(), PersistentDataType.INTEGER, 2);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectStrength(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getScaleSet(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getScaleBoots(), item);
        recipe.shape("   ","P P","JHJ");
        recipe.setIngredient('P', ImbuedProtection);
        recipe.setIngredient('J', Janelite);
        recipe.setIngredient('H', ImbuedHardening);
        Bukkit.getServer().addRecipe(recipe);
        Main.getCustomArmor().put(Keys.getScaleBoots(), item);
    }
}
