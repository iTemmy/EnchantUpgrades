package com.temmy.enchantupgrades.Recipes.Armor.Sage;

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

public class Sage {

    public Sage(){
        Helmet();
        Chestplate();
        Leggings();
        Boots();
    }

    private ItemStack OceanicEssence = Main.getImbuedEssences().get(Keys.getOceanicEssence());
    private ItemStack ImbuedFlame = Main.getImbuedEssences().get(Keys.getImbuedFlame());
    private ItemStack OxidizedSerum = Main.getImbuedEssences().get(Keys.getOxidizedSerum());
    private ItemStack Sapphire = Main.getCustomItems().get(Keys.getSapphire());

    private void Helmet(){
        ItemStack item = new ItemStack(Material.GOLDEN_HELMET);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.RED+""+ChatColor.BOLD+"Sage Helmet"));
        meta.addEnchant(Enchantment.PROTECTION_FIRE, 4, true);
        meta.addEnchant(Enchantment.DURABILITY, 5, true);
        List<Component> lore = new ArrayList<>(Arrays.asList(Component.text(ChatColor.GOLD+"Wearing(1)"),
                Component.text(ChatColor.RED+"Dolphin's grace"),
                Component.text(ChatColor.GOLD+"Full Set Bonus:"),
                Component.text(ChatColor.RED+"Fire Resistance"),
                Component.text(ChatColor.RED+"Water Breathing"),
                Component.text(ChatColor.RED+"Resistance 2")));
        meta.lore(lore);
        meta.getPersistentDataContainer().set(Keys.getSingleEffectDolphinsGrace(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectFireResistance(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectWaterBreathing(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectResistance(), PersistentDataType.INTEGER, 2);
        meta.getPersistentDataContainer().set(Keys.getSageSet(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getSageHelmet(), item);
        recipe.shape("O0O","FSF","   ");
        recipe.setIngredient('O', OxidizedSerum);
        recipe.setIngredient('0', OceanicEssence);
        recipe.setIngredient('F', ImbuedFlame);
        recipe.setIngredient('S', Sapphire);
        Bukkit.getServer().addRecipe(recipe);
        Main.getCustomArmor().put(Keys.getSageHelmet(), item);
    }

    private void Chestplate(){
        ItemStack item = new ItemStack(Material.GOLDEN_CHESTPLATE);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.RED+""+ChatColor.BOLD+"Sage Chestplate"));
        meta.addEnchant(Enchantment.PROTECTION_FIRE, 4, true);
        meta.addEnchant(Enchantment.DURABILITY, 5, true);
        List<Component> lore = new ArrayList<>(Arrays.asList(Component.text(ChatColor.GOLD+"Wearing(1)"),
                Component.text(ChatColor.RED+"Dolphin's grace"),
                Component.text(ChatColor.GOLD+"FUll Set Bonus:"),
                Component.text(ChatColor.RED+"Fire Resistance"),
                Component.text(ChatColor.RED+"No Oxygen Loss"),
                Component.text(ChatColor.RED+"Resistance 2")));
        meta.lore(lore);
        meta.getPersistentDataContainer().set(Keys.getSingleEffectDolphinsGrace(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectFireResistance(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetNoAirLoss(), PersistentDataType.BYTE, (byte) 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectResistance(), PersistentDataType.INTEGER, 2);
        meta.getPersistentDataContainer().set(Keys.getSageSet(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getSageChestplate(), item);
        recipe.shape("O O","0S0","FFF");
        recipe.setIngredient('O', OxidizedSerum);
        recipe.setIngredient('0', OceanicEssence);
        recipe.setIngredient('F', ImbuedFlame);
        recipe.setIngredient('S', Sapphire);
        Bukkit.getServer().addRecipe(recipe);
        Main.getCustomArmor().put(Keys.getSageChestplate(), item);
    }

    private void Leggings(){
        ItemStack item = new ItemStack(Material.GOLDEN_LEGGINGS);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.RED+""+ChatColor.BOLD+"Sage Leggings"));
        meta.addEnchant(Enchantment.PROTECTION_FIRE, 4, true);
        meta.addEnchant(Enchantment.DURABILITY, 5, true);
        List<Component> lore = new ArrayList<>(Arrays.asList(Component.text(ChatColor.GOLD+"Wearing(1)"),
                Component.text(ChatColor.RED+"Dolphin's grace"),
                Component.text(ChatColor.GOLD+"FUll Set Bonus:"),
                Component.text(ChatColor.RED+"Fire Resistance"),
                Component.text(ChatColor.RED+"No Oxygen Loss"),
                Component.text(ChatColor.RED+"Resistance 2")));
        meta.lore(lore);
        meta.getPersistentDataContainer().set(Keys.getSingleEffectDolphinsGrace(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectFireResistance(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetNoAirLoss(), PersistentDataType.BYTE, (byte) 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectResistance(), PersistentDataType.INTEGER, 2);
        meta.getPersistentDataContainer().set(Keys.getSageSet(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getSageLeggings(), item);
        recipe.shape("0O0","FSF","F F");
        recipe.setIngredient('O', OxidizedSerum);
        recipe.setIngredient('0', OceanicEssence);
        recipe.setIngredient('F', ImbuedFlame);
        recipe.setIngredient('S', Sapphire);
        Bukkit.getServer().addRecipe(recipe);
        Main.getCustomArmor().put(Keys.getSageLeggings(), item);
    }

    private void Boots(){
        ItemStack item = new ItemStack(Material.GOLDEN_BOOTS);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.RED+""+ChatColor.BOLD+"Sage Boots"));
        meta.addEnchant(Enchantment.PROTECTION_FIRE, 4, true);
        meta.addEnchant(Enchantment.DURABILITY, 5, true);
        List<Component> lore = new ArrayList<>(Arrays.asList(Component.text(ChatColor.GOLD+"Wearing(1)"),
                Component.text(ChatColor.RED+"Dolphin's grace"),
                Component.text(ChatColor.GOLD+"FUll Set Bonus:"),
                Component.text(ChatColor.RED+"Fire Resistance"),
                Component.text(ChatColor.RED+"No Oxygen Loss"),
                Component.text(ChatColor.RED+"Resistance 2")));
        meta.lore(lore);
        meta.getPersistentDataContainer().set(Keys.getSingleEffectDolphinsGrace(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectFireResistance(), PersistentDataType.INTEGER, 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetNoAirLoss(), PersistentDataType.BYTE, (byte) 1);
        meta.getPersistentDataContainer().set(Keys.getFullSetEffectResistance(), PersistentDataType.INTEGER, 2);
        meta.getPersistentDataContainer().set(Keys.getSageSet(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getSageBoots(), item);
        recipe.shape("   ","FSF","0O0");
        recipe.setIngredient('F', ImbuedFlame);
        recipe.setIngredient('S', Sapphire);
        recipe.setIngredient('O', OxidizedSerum);
        recipe.setIngredient('0', OceanicEssence);
        Bukkit.getServer().addRecipe(recipe);
        Main.getCustomArmor().put(Keys.getSageBoots(), item);
    }
}
