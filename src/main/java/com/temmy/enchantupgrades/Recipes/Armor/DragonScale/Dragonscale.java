package com.temmy.enchantupgrades.Recipes.Armor.DragonScale;

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

public class Dragonscale {

    public Dragonscale(){
        Helmet();
        Chestplate();
        Leggings();
        Boots();
    }

    private ItemStack Ellendyte = Main.getCustomItems().get(Keys.getEllendyte());
    private ItemStack OtherworldlyTrophy = Main.getEssences().get(Keys.getOtherworldlyTrophy());
    private ItemStack ImbuedHardening = Main.getImbuedEssences().get(Keys.getImbuedHardening());

    private void Helmet(){
        ItemStack item = new ItemStack(Material.NETHERITE_HELMET);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.DARK_RED+""+ChatColor.BOLD+"Dragonscale Helmet"));
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 7, true);
        meta.setUnbreakable(true);
        List<Component> lore = new ArrayList<>(Arrays.asList(Component.text(ChatColor.GOLD+"Wearing(1)"),
                Component.text(ChatColor.DARK_RED+"Strength 2"),
                Component.text(ChatColor.GOLD+"Full Set Bonus:"),
                Component.text(ChatColor.DARK_RED+"Resistance 3"),
                Component.text(ChatColor.DARK_RED+"Fire Resistance"),
                Component.text(ChatColor.DARK_RED+"Regeneration 1")));
        meta.lore(lore);
        meta.getPersistentDataContainer().set(Keys.getSingleEffectStrength(), PersistentDataType.INTEGER, 2);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectResistance(), PersistentDataType.INTEGER, 3);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectFireResistance(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectRegeneration(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getDragonScaleSet(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getDragonScaleHelmet(), item);
        recipe.shape("HOH","ESE","   ");
        recipe.setIngredient('H', ImbuedHardening);
        recipe.setIngredient('S', Main.getCustomArmor().get(Keys.getScaleHelmet()));
        recipe.setIngredient('E', Ellendyte);
        recipe.setIngredient('O', OtherworldlyTrophy);
        Bukkit.getServer().addRecipe(recipe);
        Main.getCustomArmor().put(Keys.getDragonScaleHelmet(), item);
    }

    private void Chestplate(){
        ItemStack item = new ItemStack(Material.NETHERITE_CHESTPLATE);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.DARK_RED+""+ChatColor.BOLD+"Dragonscale Chestplate"));
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 7, true);
        meta.setUnbreakable(true);
        List<Component> lore = new ArrayList<>(Arrays.asList(Component.text(ChatColor.GOLD+"Wearing(1)"),
                Component.text(ChatColor.DARK_RED+"Strength 2"),
                Component.text(ChatColor.GOLD+"Full Set Bonus:"),
                Component.text(ChatColor.DARK_RED+"Resistance 3"),
                Component.text(ChatColor.DARK_RED+"Fire Resistance"),
                Component.text(ChatColor.DARK_RED+"Regeneration 1")));
        meta.lore(lore);
        meta.getPersistentDataContainer().set(Keys.getSingleEffectStrength(), PersistentDataType.INTEGER, 2);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectResistance(), PersistentDataType.INTEGER, 3);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectFireResistance(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectRegeneration(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getDragonScaleSet(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getDragonScaleChestplate(), item);
        recipe.shape("E E","HSH","HOH");
        recipe.setIngredient('S', Main.getCustomArmor().get(Keys.getScaleChestplate()));
        recipe.setIngredient('E', Ellendyte);
        recipe.setIngredient('H', ImbuedHardening);
        recipe.setIngredient('O', OtherworldlyTrophy);
        Bukkit.getServer().addRecipe(recipe);
        Main.getCustomArmor().put(Keys.getDragonScaleChestplate(), item);
    }

    private void Leggings(){
        ItemStack item = new ItemStack(Material.NETHERITE_LEGGINGS);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.DARK_RED+""+ChatColor.BOLD+"Dragonscale Leggings"));
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 7, true);
        meta.setUnbreakable(true);
        List<Component> lore = new ArrayList<>(Arrays.asList(Component.text(ChatColor.GOLD+"Wearing(1)"),
                Component.text(ChatColor.DARK_RED+"Strength 2"),
                Component.text(ChatColor.GOLD+"Full Set Bonus:"),
                Component.text(ChatColor.DARK_RED+"Resistance 3"),
                Component.text(ChatColor.DARK_RED+"Fire Resistance"),
                Component.text(ChatColor.DARK_RED+"Regeneration 1")));
        meta.lore(lore);
        meta.getPersistentDataContainer().set(Keys.getSingleEffectStrength(), PersistentDataType.INTEGER, 2);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectResistance(), PersistentDataType.INTEGER, 3);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectFireResistance(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectRegeneration(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getDragonScaleSet(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getDragonScaleLeggings(), item);
        recipe.shape("EOE","HSH","H H");
        recipe.setIngredient('E', Ellendyte);
        recipe.setIngredient('O', OtherworldlyTrophy);
        recipe.setIngredient('S', Main.getCustomArmor().get(Keys.getScaleLeggings()));
        recipe.setIngredient('H', ImbuedHardening);
        Bukkit.getServer().addRecipe(recipe);
        Main.getCustomArmor().put(Keys.getDragonScaleLeggings(), item);
    }

    private void Boots(){
        ItemStack item = new ItemStack(Material.NETHERITE_BOOTS);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.DARK_RED+""+ChatColor.BOLD+"Dragonscale Boots"));
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 7, true);
        meta.setUnbreakable(true);
        List<Component> lore = new ArrayList<>(Arrays.asList(Component.text(ChatColor.GOLD+"Wearing(1)"),
                Component.text(ChatColor.DARK_RED+"Strength 2"),
                Component.text(ChatColor.GOLD+"Full Set Bonus:"),
                Component.text(ChatColor.DARK_RED+"Resistance 3"),
                Component.text(ChatColor.DARK_RED+"Fire Resistance"),
                Component.text(ChatColor.DARK_RED+"Regeneration 1")));
        meta.lore(lore);
        meta.getPersistentDataContainer().set(Keys.getSingleEffectStrength(), PersistentDataType.INTEGER, 2);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectResistance(), PersistentDataType.INTEGER, 3);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectFireResistance(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectRegeneration(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getDragonScaleSet(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe =new ShapedRecipe(Keys.getDragonScaleBoots(), item);
        recipe.shape("   ","HSH","EOE");
        recipe.setIngredient('E', Ellendyte);
        recipe.setIngredient('H', ImbuedHardening);
        recipe.setIngredient('S', Main.getCustomArmor().get(Keys.getScaleBoots()));
        recipe.setIngredient('O', OtherworldlyTrophy);
        Bukkit.getServer().addRecipe(recipe);
        Main.getCustomArmor().put(Keys.getDragonScaleBoots(), item);
    }
}
