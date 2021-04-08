package com.temmy.enchantupgrades.Recipes.Enchants;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

public class Fortune {

    public Fortune(){
        Fortune1();
        Fortune2();
        Fortune3();
    }

    private void Fortune1(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.LOOT_BONUS_BLOCKS, 1, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getFortune1(), item);
        recipe.shape(" L "," B "," L ");
        recipe.setIngredient('L', Main.getEssences().get(Keys.getLuckEssence()));
        recipe.setIngredient('B', Main.getEssences().get(Keys.getBaseEnchantedBook()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getFortune1(), item);
    }

    private void Fortune2(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.LOOT_BONUS_BLOCKS, 2, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getFortune2(), item);
        recipe.shape(" L "," E ","L L");
        recipe.setIngredient('L', Main.getEssences().get(Keys.getLuckEssence()));
        recipe.setIngredient('E', Main.getEnchants().get(Keys.getFortune1()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getFortune2(), item);
    }

    private void Fortune3(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getFortune3(), item);
        recipe.shape(" L ","LEL"," L ");
        recipe.setIngredient('L', Main.getEssences().get(Keys.getLuckEssence()));
        recipe.setIngredient('E', Main.getEnchants().get(Keys.getFortune2()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getFortune3(), item);
    }
}
