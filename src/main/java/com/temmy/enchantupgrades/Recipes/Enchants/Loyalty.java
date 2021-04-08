package com.temmy.enchantupgrades.Recipes.Enchants;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

public class Loyalty {

    public Loyalty(){
        Loyalty1();
        Loyalty2();
        Loyalty3();
    }

    private void Loyalty1(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.LOYALTY, 1, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getLoyalty1(), item);
        recipe.shape("GGG","OBO","GGG");
        recipe.setIngredient('G', Material.GOLD_INGOT);
        recipe.setIngredient('O', Main.getEssences().get(Keys.getOxidizedEssence()));
        recipe.setIngredient('B', Main.getEssences().get(Keys.getBaseEnchantedBook()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getLoyalty1(), item);
    }

    private void Loyalty2(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.LOYALTY, 2, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getLoyalty2(), item);
        recipe.shape("GGG","OLO","GGG");
        recipe.setIngredient('G', Material.GOLD_INGOT);
        recipe.setIngredient('O', Main.getEssences().get(Keys.getOxidizedEssence()));
        recipe.setIngredient('L', Main.getEnchants().get(Keys.getLoyalty1()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getLoyalty2(), item);
    }

    private void Loyalty3(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.LOYALTY, 3, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getLoyalty3(), item);
        recipe.shape("GGG","OLO","GGG");
        recipe.setIngredient('G', Material.GOLD_INGOT);
        recipe.setIngredient('O', Main.getEssences().get(Keys.getOxidizedEssence()));
        recipe.setIngredient('L', Main.getEnchants().get(Keys.getLoyalty2()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getLoyalty3(), item);
    }
}
