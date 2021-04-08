package com.temmy.enchantupgrades.Recipes.Enchants;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

public class FireProtection {

    private ItemStack FlameScraps = Main.getEssences().get(Keys.getFlameScraps());

    public FireProtection(){
        FireProtection1();
        FireProtection2();
        FireProtection3();
        FireProtection4();
    }

    private void FireProtection1(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.PROTECTION_FIRE, 1, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getFireProtection1(), item);
        recipe.shape(" F "," B "," F ");
        recipe.setIngredient('F', FlameScraps);
        recipe.setIngredient('B', Main.getEssences().get(Keys.getBaseEnchantedBook()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getFireProtection1(), item);
    }

    private void FireProtection2(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.PROTECTION_FIRE, 2,false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getFireProtection2(), item);
        recipe.shape(" F ","FPF"," F ");
        recipe.setIngredient('F', FlameScraps);
        recipe.setIngredient('P', Main.getEnchants().get(Keys.getFireProtection1()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getFireProtection2(), item);
    }

    private void FireProtection3(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.PROTECTION_FIRE, 3, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getFireProtection3(), item);
        recipe.shape("FFF"," P ","FFF");
        recipe.setIngredient('F', FlameScraps);
        recipe.setIngredient('P', Main.getEnchants().get(Keys.getFireProtection2()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getFireProtection3(), item);
    }

    private void FireProtection4(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.PROTECTION_FIRE, 4, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getFireProtection4(), item);
        recipe.shape("FFF","FPF","FFF");
        recipe.setIngredient('F', FlameScraps);
        recipe.setIngredient('P', Main.getEnchants().get(Keys.getFireProtection3()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getFireProtection4(), item);
    }
}
