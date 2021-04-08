package com.temmy.enchantupgrades.Recipes.Enchants;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

public class Protection {

    private ItemStack ProtectionScraps = Main.getEssences().get(Keys.getProtectionScraps());

    public Protection(){
        Protection1();
        Protection2();
        Protection3();
        Protection4();
    }

    private void Protection1(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getProtection1(), item);
        recipe.shape(" P "," B "," P ");
        recipe.setIngredient('P', ProtectionScraps);
        recipe.setIngredient('B', Main.getEssences().get(Keys.getBaseEnchantedBook()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getProtection1(), item);
    }

    private void Protection2(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2 ,false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getProtection2(), item);
        recipe.shape(" P ","PBP"," P ");
        recipe.setIngredient('P', ProtectionScraps);
        recipe.setIngredient('B', Main.getEnchants().get(Keys.getProtection1()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getProtection2(), item);
    }

    private void Protection3(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3 ,false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getProtection3(), item);
        recipe.shape("PPP"," B ","PPP");
        recipe.setIngredient('P', ProtectionScraps);
        recipe.setIngredient('B', Main.getEnchants().get(Keys.getProtection2()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getProtection3(), item);
    }

    private void Protection4(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getProtection4(), item);
        recipe.shape("PPP","PBP","PPP");
        recipe.setIngredient('P', ProtectionScraps);
        recipe.setIngredient('B', Main.getEnchants().get(Keys.getProtection3()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getProtection4(), item);
    }
}
