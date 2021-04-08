package com.temmy.enchantupgrades.Recipes.Enchants;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

public class Lure {

    public Lure(){
        Lure1();
        Lure2();
        Lure3();
    }

    private void Lure1(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.LURE, 1, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getLure1(), item);
        recipe.shape(" L "," B "," L ");
        recipe.setIngredient('B', Main.getEssences().get(Keys.getBaseEnchantedBook()));
        recipe.setIngredient('L', Main.getEssences().get(Keys.getLureEssence()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getLure1(), item);
    }

    private void Lure2(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.LURE, 2, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getLure2(), item);
        recipe.shape(" L "," B ","L L");
        recipe.setIngredient('L', Main.getEssences().get(Keys.getLureEssence()));
        recipe.setIngredient('B', Main.getEnchants().get(Keys.getLure1()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getLure2(), item);
    }

    private void Lure3(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.LURE, 3, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getLure3(), item);
        recipe.shape(" L ","LBL"," L ");
        recipe.setIngredient('L', Main.getEssences().get(Keys.getLureEssence()));
        recipe.setIngredient('B', Main.getEnchants().get(Keys.getLure2()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getLure3(), item);
    }
}
