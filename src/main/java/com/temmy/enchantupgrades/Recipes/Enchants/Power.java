package com.temmy.enchantupgrades.Recipes.Enchants;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

public class Power {

    public Power(){
        Power1();
        Power2();
        Power3();
        Power4();
        Power5();
    }

    private void Power1(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.ARROW_DAMAGE, 1, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getPower1(), item);
        recipe.shape(" S "," B "," S ");
        recipe.setIngredient('S', Main.getEssences().get(Keys.getSkeletonEssence()));
        recipe.setIngredient('B', Main.getEssences().get(Keys.getBaseEnchantedBook()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getPower1(), item);
    }

    private void Power2(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.ARROW_DAMAGE, 2, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getPower2(), item);
        recipe.shape(" S "," P ","S S");
        recipe.setIngredient('S', Main.getEssences().get(Keys.getSkeletonEssence()));
        recipe.setIngredient('P', Main.getEnchants().get(Keys.getPower1()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getPower2(), item);
    }

    private void Power3(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.ARROW_DAMAGE, 3, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getPower3(), item);
        recipe.shape(" S ","SPS"," S ");
        recipe.setIngredient('S', Main.getEssences().get(Keys.getSkeletonEssence()));
        recipe.setIngredient('P', Main.getEnchants().get(Keys.getPower2()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getPower3(), item);
    }

    private void Power4(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.ARROW_DAMAGE, 4, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getPower4(), item);
        recipe.shape("SSS"," P ","SSS");
        recipe.setIngredient('S', Main.getEssences().get(Keys.getSkeletonEssence()));
        recipe.setIngredient('P', Main.getEnchants().get(Keys.getPower3()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getPower4(), item);
    }

    private void Power5(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.ARROW_DAMAGE, 5, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getPower5(), item);
        recipe.shape("SSS","SPS","SSS");
        recipe.setIngredient('S', Main.getEssences().get(Keys.getSkeletonEssence()));
        recipe.setIngredient('P', Main.getEnchants().get(Keys.getPower4()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getPower5(), item);
    }
}
