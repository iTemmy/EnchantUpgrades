package com.temmy.enchantupgrades.Recipes.Armor.Theif;

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

public class Thief {

    public Thief(){
        Helmet();
        Chestplate();
        Leggings();
        Boots();
    }

    private ItemStack ImbuedProjectile = Main.getImbuedEssences().get(Keys.getImbuedProjectile());
    private ItemStack ImbuedQuickening = Main.getImbuedEssences().get(Keys.getImbuedQuickening());
    private ItemStack Tungsten = Main.getCustomItems().get(Keys.getTungsten());

    private void Helmet(){
        ItemStack item = new ItemStack(Material.LEATHER_HELMET);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.GREEN+""+ChatColor.BOLD+"Thief's Helmet"));
        meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 4, true);
        meta.addEnchant(Enchantment.DURABILITY, 5,true);
        List<Component> lore = new ArrayList<Component>(Arrays.asList(Component.text(ChatColor.GOLD+"Wearing (1)"),
                Component.text(ChatColor.GREEN+"Speed 1"),
                Component.text(ChatColor.GOLD+"Full Set Bonus:"),
                Component.text(ChatColor.GREEN+"Speed 3"),
                Component.text(ChatColor.GREEN+"Resistance 1"),
                Component.text(ChatColor.GREEN+"Strength 2")));
        meta.lore(lore);
        meta.getPersistentDataContainer().set(Keys.getSingleEffectSpeed(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectSpeed(), PersistentDataType.INTEGER, 3);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectResistance(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectStrength(), PersistentDataType.INTEGER, 2);
        meta.getPersistentDataContainer().set(Keys.getThiefSet(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getThiefHelmet(), item);
        recipe.shape("PQP","T T","   ");
        recipe.setIngredient('P', ImbuedProjectile);
        recipe.setIngredient('Q', ImbuedQuickening);
        recipe.setIngredient('T', Tungsten);
        Bukkit.getServer().addRecipe(recipe);
        Main.getCustomArmor().put(Keys.getThiefHelmet(), item);
    }

    private void Chestplate(){
        ItemStack item = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.GREEN+""+ChatColor.BOLD+"Thief's Chestplate"));
        meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 4, true);
        meta.addEnchant(Enchantment.DURABILITY, 5,true);
        List<Component> lore = new ArrayList<Component>(Arrays.asList(Component.text(ChatColor.GOLD+"Wearing (1)"),
                Component.text(ChatColor.GREEN+"Speed 1"),
                Component.text(ChatColor.GOLD+"Full Set Bonus:"),
                Component.text(ChatColor.GREEN+"Speed 3"),
                Component.text(ChatColor.GREEN+"Resistance 1"),
                Component.text(ChatColor.GREEN+"Strength 2")));
        meta.lore(lore);
        meta.getPersistentDataContainer().set(Keys.getSingleEffectSpeed(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectSpeed(), PersistentDataType.INTEGER, 3);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectResistance(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectStrength(), PersistentDataType.INTEGER, 2);
        meta.getPersistentDataContainer().set(Keys.getThiefSet(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getThiefChestplate(), item);
        recipe.shape("T T","PQP","PPP");
        recipe.setIngredient('T', Tungsten);
        recipe.setIngredient('Q', ImbuedQuickening);
        recipe.setIngredient('P', ImbuedProjectile);
        Bukkit.getServer().addRecipe(recipe);
        Main.getCustomArmor().put(Keys.getThiefChestplate(), item);
    }

    private void Leggings(){
        ItemStack item = new ItemStack(Material.LEATHER_LEGGINGS);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.GREEN+""+ChatColor.BOLD+"Thief's Leggings"));
        meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 4, true);
        meta.addEnchant(Enchantment.DURABILITY, 5,true);
        List<Component> lore = new ArrayList<Component>(Arrays.asList(Component.text(ChatColor.GOLD+"Wearing (1)"),
                Component.text(ChatColor.GREEN+"Speed 1"),
                Component.text(ChatColor.GOLD+"Full Set Bonus:"),
                Component.text(ChatColor.GREEN+"Speed 3"),
                Component.text(ChatColor.GREEN+"Resistance 1"),
                Component.text(ChatColor.GREEN+"Strength 2")));
        meta.lore(lore);
        meta.getPersistentDataContainer().set(Keys.getSingleEffectSpeed(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectSpeed(), PersistentDataType.INTEGER, 3);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectResistance(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectStrength(), PersistentDataType.INTEGER, 2);
        meta.getPersistentDataContainer().set(Keys.getThiefSet(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getThiefLeggings(), item);
        recipe.shape("TQT","P P","P P");
        recipe.setIngredient('T', Tungsten);
        recipe.setIngredient('Q', ImbuedQuickening);
        recipe.setIngredient('P', ImbuedProjectile);
        Bukkit.getServer().addRecipe(recipe);
        Main.getCustomArmor().put(Keys.getThiefLeggings(), item);
    }

    private void Boots(){
        ItemStack item = new ItemStack(Material.LEATHER_BOOTS);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.GREEN+""+ChatColor.BOLD+"Thief's Boots"));
        meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 4, true);
        meta.addEnchant(Enchantment.DURABILITY, 5,true);
        List<Component> lore = new ArrayList<Component>(Arrays.asList(Component.text(ChatColor.GOLD+"Wearing (1)"),
                Component.text(ChatColor.GREEN+"Speed 1"),
                Component.text(ChatColor.GOLD+"Full Set Bonus:"),
                Component.text(ChatColor.GREEN+"Speed 3"),
                Component.text(ChatColor.GREEN+"Resistance 1"),
                Component.text(ChatColor.GREEN+"Strength 2")));
        meta.lore(lore);
        meta.getPersistentDataContainer().set(Keys.getSingleEffectSpeed(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectSpeed(), PersistentDataType.INTEGER, 3);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectResistance(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectStrength(), PersistentDataType.INTEGER, 2);
        meta.getPersistentDataContainer().set(Keys.getThiefSet(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getThiefBoots(), item);
        recipe.shape("   ","P P","TQT");
        recipe.setIngredient('P', ImbuedProjectile);
        recipe.setIngredient('Q', ImbuedQuickening);
        recipe.setIngredient('T', Tungsten);
        Bukkit.getServer().addRecipe(recipe);
        Main.getCustomArmor().put(Keys.getThiefBoots(), item);
    }
}
