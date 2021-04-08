package com.temmy.enchantupgrades.Recipes.Enchants;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

public class DepthStrider {

    public DepthStrider(){
        DepthStrider1();
        DepthStrider2();
        DepthStrider3();
    }

    private void DepthStrider1(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.DEPTH_STRIDER, 1, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getDepthStrider1(), item);
        recipe.shape(" S ","SBS"," S ");
        recipe.setIngredient('S', Main.getEssences().get(Keys.getStriderEssence()));
        recipe.setIngredient('B', Main.getEssences().get(Keys.getBaseEnchantedBook()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getDepthStrider1(), item);
    }

    private void DepthStrider2(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.DEPTH_STRIDER, 2, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getDepthStrider2(), item);
        recipe.shape("SSS"," B ","SSS");
        recipe.setIngredient('S', Main.getEssences().get(Keys.getStriderEssence()));
        recipe.setIngredient('B', Main.getEnchants().get(Keys.getDepthStrider1()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getDepthStrider2(), item);
    }

    private void DepthStrider3(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.DEPTH_STRIDER, 3, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getDepthStrider3(), item);
        recipe.shape("SSS","SBS","SSS");
        recipe.setIngredient('S', Main.getEssences().get(Keys.getStriderEssence()));
        recipe.setIngredient('B', Main.getEnchants().get(Keys.getDepthStrider2()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getDepthStrider3(), item);
    }
}
