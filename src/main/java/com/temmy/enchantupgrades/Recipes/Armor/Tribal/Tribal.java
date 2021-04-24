package com.temmy.enchantupgrades.Recipes.Armor.Tribal;

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

public class Tribal {

    public Tribal(){
        Helmet();
        Chestplate();
        Leggings();
        Boots();
    }

    private ItemStack ImbuedSilk = Main.getImbuedEssences().get(Keys.getImbuedSilk());
    private ItemStack ImbuedCushion = Main.getImbuedEssences().get(Keys.getImbuedCushion());
    private ItemStack Zinc = Main.getCustomItems().get(Keys.getZinc());

    private void Helmet(){
        ItemStack item = new ItemStack(Material.CHAINMAIL_HELMET);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.AQUA+""+ChatColor.BOLD+"Tribal Helmet"));
        meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, true);
        meta.addEnchant(Enchantment.DURABILITY, 5, true);
        List<Component> lore = new ArrayList<Component>(Arrays.asList(Component.text(ChatColor.GOLD+"Wearing(1)"),
                Component.text(ChatColor.AQUA+"Haste 1"),
                Component.text(ChatColor.GOLD+"Full Set Bonus:"),
                Component.text(ChatColor.AQUA+"Haste 3"),
                Component.text(ChatColor.AQUA+"Resistance 1"),
                Component.text(ChatColor.AQUA+"Jump Boost 2")));
        meta.lore(lore);
        meta.getPersistentDataContainer().set(Keys.getSingleEffectHaste(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectHaste(), PersistentDataType.INTEGER, 3);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectResistance(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectJumpBoost(), PersistentDataType.INTEGER, 2);
        meta.getPersistentDataContainer().set(Keys.getTribalSet(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getTribalHelmet(), item);
        recipe.shape("CSC","Z Z","   ");
        recipe.setIngredient('C', ImbuedCushion);
        recipe.setIngredient('S', ImbuedSilk);
        recipe.setIngredient('Z', Zinc);
        Bukkit.getServer().addRecipe(recipe);
        Main.getCustomArmor().put(Keys.getTribalHelmet(), item);
    }

    private void Chestplate(){
        ItemStack item = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.AQUA+""+ChatColor.BOLD+"Tribal Chestplate"));
        meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, true);
        meta.addEnchant(Enchantment.DURABILITY, 5, true);
        List<Component> lore = new ArrayList<Component>(Arrays.asList(Component.text(ChatColor.GOLD+"Wearing(1)"),
                Component.text(ChatColor.AQUA+"Haste 1"),
                Component.text(ChatColor.GOLD+"Full Set Bonus:"),
                Component.text(ChatColor.AQUA+"Haste 3"),
                Component.text(ChatColor.AQUA+"Resistance 1"),
                Component.text(ChatColor.AQUA+"Jump Boost 2")));
        meta.lore(lore);
        meta.getPersistentDataContainer().set(Keys.getSingleEffectHaste(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectHaste(), PersistentDataType.INTEGER, 3);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectResistance(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectJumpBoost(), PersistentDataType.INTEGER, 2);
        meta.getPersistentDataContainer().set(Keys.getTribalSet(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getTribalChestplate(), item);
        recipe.shape("Z Z","CSC","CCC");
        recipe.setIngredient('Z', Zinc);
        recipe.setIngredient('C', ImbuedCushion);
        recipe.setIngredient('S', ImbuedCushion);
        Bukkit.getServer().addRecipe(recipe);
        Main.getCustomArmor().put(Keys.getTribalChestplate(), item);
    }

    private void Leggings(){
        ItemStack item = new ItemStack(Material.CHAINMAIL_LEGGINGS);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.AQUA+""+ChatColor.BOLD+"Tribal Leggings"));
        meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, true);
        meta.addEnchant(Enchantment.DURABILITY, 5, true);
        List<Component> lore = new ArrayList<Component>(Arrays.asList(Component.text(ChatColor.GOLD+"Wearing(1)"),
                Component.text(ChatColor.AQUA+"Haste 1"),
                Component.text(ChatColor.GOLD+"Full Set Bonus:"),
                Component.text(ChatColor.AQUA+"Haste 3"),
                Component.text(ChatColor.AQUA+"Resistance 1"),
                Component.text(ChatColor.AQUA+"Jump Boost 2")));
        meta.lore(lore);
        meta.getPersistentDataContainer().set(Keys.getSingleEffectHaste(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectHaste(), PersistentDataType.INTEGER, 3);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectResistance(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectJumpBoost(), PersistentDataType.INTEGER, 2);
        meta.getPersistentDataContainer().set(Keys.getTribalSet(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getTribalLeggings(), item);
        recipe.shape("ZSZ","C C","C C");
        recipe.setIngredient('Z', Zinc);
        recipe.setIngredient('S', ImbuedSilk);
        recipe.setIngredient('C', ImbuedCushion);
        Bukkit.getServer().addRecipe(recipe);
        Main.getCustomArmor().put(Keys.getTribalLeggings(), item);
    }

    private void Boots(){
        ItemStack item = new ItemStack(Material.CHAINMAIL_BOOTS);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.AQUA+""+ChatColor.BOLD+"Tribal Boots"));
        meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, true);
        meta.addEnchant(Enchantment.DURABILITY, 5, true);
        List<Component> lore = new ArrayList<Component>(Arrays.asList(Component.text(ChatColor.GOLD+"Wearing(1)"),
                Component.text(ChatColor.AQUA+"Haste 1"),
                Component.text(ChatColor.GOLD+"Full Set Bonus:"),
                Component.text(ChatColor.AQUA+"Haste 3"),
                Component.text(ChatColor.AQUA+"Resistance 1"),
                Component.text(ChatColor.AQUA+"Jump Boost 2")));
        meta.lore(lore);
        meta.getPersistentDataContainer().set(Keys.getSingleEffectHaste(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectHaste(), PersistentDataType.INTEGER, 3);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectResistance(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectJumpBoost(), PersistentDataType.INTEGER, 2);
        meta.getPersistentDataContainer().set(Keys.getTribalSet(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getTribalBoots(), item);
        recipe.shape("   ","C C","ZSZ");
        recipe.setIngredient('C', ImbuedCushion);
        recipe.setIngredient('Z', Zinc);
        recipe.setIngredient('S', ImbuedSilk);
        Bukkit.getServer().addRecipe(recipe);
        Main.getCustomArmor().put(Keys.getTribalBoots(), item);
    }
}
