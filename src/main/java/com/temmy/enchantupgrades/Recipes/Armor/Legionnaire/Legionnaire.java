package com.temmy.enchantupgrades.Recipes.Armor.Legionnaire;

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

public class Legionnaire {

    public Legionnaire(){
        Helmet();
        Chestplate();
        Leggings();
        Boots();
    }

    private ItemStack Phosphorus = Main.getCustomItems().get(Keys.getPhosphorus());
    private ItemStack PricklyEssence = Main.getEssences().get(Keys.getPricklyEssence());
    private ItemStack ImbuedProtection = Main.getImbuedEssences().get(Keys.getImbuedProtection());

    private void Helmet(){
        ItemStack item = new ItemStack(Material.IRON_HELMET);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.WHITE+""+ChatColor.BOLD+"Legionnaire's Helmet"));
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        meta.addEnchant(Enchantment.THORNS, 5, true);
        meta.addEnchant(Enchantment.DURABILITY, 5, true);
        List<Component> lore = new ArrayList<Component>(Arrays.asList(Component.text("Helm of the Legionnaire"),
                Component.text(ChatColor.GOLD+"Full Set Bonus:"),
                Component.text(ChatColor.AQUA+"30 Max HP")));
        meta.lore(lore);
        meta.getPersistentDataContainer().set(Keys.getFullSetIncreaseHealth(), PersistentDataType.DOUBLE, 10d);
        meta.getPersistentDataContainer().set(Keys.getLegionnaireSet(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getLegionnaireHelmet(), item);
        recipe.shape("IPI","C C","   ");
        recipe.setIngredient('P', PricklyEssence);
        recipe.setIngredient('I', ImbuedProtection);
        recipe.setIngredient('C', Phosphorus);
        Bukkit.getServer().addRecipe(recipe);
        Main.getCustomArmor().put(Keys.getLegionnaireHelmet(), item);
    }

    private void Chestplate(){
        ItemStack item = new ItemStack(Material.IRON_CHESTPLATE);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.WHITE+""+ChatColor.BOLD+"Legionnaire's Chestplate"));
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        meta.addEnchant(Enchantment.THORNS, 5, true);
        meta.addEnchant(Enchantment.DURABILITY, 5, true);
        List<Component> lore = new ArrayList<Component>(Arrays.asList(Component.text("Chestplate of the Legionnaire"),
                Component.text(ChatColor.GOLD+"Full Set Bonus:"),
                Component.text(ChatColor.AQUA+"30 Max HP")));
        meta.lore(lore);
        meta.getPersistentDataContainer().set(Keys.getFullSetIncreaseHealth(), PersistentDataType.DOUBLE, 10d);
        meta.getPersistentDataContainer().set(Keys.getLegionnaireSet(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getLegionnaireChestplate(), item);
        recipe.shape("C C","IPI","III");
        recipe.setIngredient('C', Phosphorus);
        recipe.setIngredient('I', ImbuedProtection);
        recipe.setIngredient('P', PricklyEssence);
        Bukkit.getServer().addRecipe(recipe);
        Main.getCustomArmor().put(Keys.getLegionnaireChestplate(), item);
    }

    private void Leggings(){
        ItemStack item = new ItemStack(Material.IRON_LEGGINGS);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.WHITE+""+ChatColor.BOLD+"Legionnaire's Leggings"));
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        meta.addEnchant(Enchantment.THORNS, 5, true);
        meta.addEnchant(Enchantment.DURABILITY, 5, true);
        List<Component> lore = new ArrayList<Component>(Arrays.asList(Component.text("Leggings of the Legionnaire"),
                Component.text(ChatColor.GOLD+"Full Set Bonus:"),
                Component.text(ChatColor.AQUA+"30 Max HP")));
        meta.lore(lore);
        meta.getPersistentDataContainer().set(Keys.getFullSetIncreaseHealth(), PersistentDataType.DOUBLE, 10d);
        meta.getPersistentDataContainer().set(Keys.getLegionnaireSet(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getLegionnaireLeggings(), item);
        recipe.shape("CPC","I I","I I");
        recipe.setIngredient('C', Phosphorus);
        recipe.setIngredient('I', ImbuedProtection);
        recipe.setIngredient('P', PricklyEssence);
        Bukkit.getServer().addRecipe(recipe);
        Main.getCustomArmor().put(Keys.getLegionnaireLeggings(), item);
    }

    private void Boots(){
        ItemStack item = new ItemStack(Material.IRON_BOOTS);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.WHITE+""+ChatColor.BOLD+"Legionnaire's Boots"));
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        meta.addEnchant(Enchantment.THORNS, 5, true);
        meta.addEnchant(Enchantment.DURABILITY, 5, true);
        List<Component> lore = new ArrayList<Component>(Arrays.asList(Component.text("Leggings of the Legionnaire"),
                Component.text(ChatColor.GOLD+"Full Set Bonus:"),
                Component.text(ChatColor.AQUA+"30 Max HP")));
        meta.lore(lore);
        meta.getPersistentDataContainer().set(Keys.getFullSetIncreaseHealth(), PersistentDataType.DOUBLE, 10d);
        meta.getPersistentDataContainer().set(Keys.getLegionnaireSet(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getLegionnaireBoots(), item);
        recipe.shape("   ","I I","CPC");
        recipe.setIngredient('I', ImbuedProtection);
        recipe.setIngredient('C', Phosphorus);
        recipe.setIngredient('P', PricklyEssence);
        Bukkit.getServer().addRecipe(recipe);
        Main.getCustomArmor().put(Keys.getLegionnaireBoots(), item);
    }
}
