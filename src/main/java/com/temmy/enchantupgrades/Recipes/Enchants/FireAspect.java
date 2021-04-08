package com.temmy.enchantupgrades.Recipes.Enchants;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

public class FireAspect {

    public FireAspect(){
        FireAspect1();
        FireAspect2();
    }

    private void FireAspect1(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.FIRE_ASPECT, 1, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getFireAspect1(), item);
        recipe.shape("  B"," E ","B  ");
        recipe.setIngredient('B', Main.getImbuedEssences().get(Keys.getImbuedBlaze()));
        recipe.setIngredient('E', Main.getEssences().get(Keys.getBaseEnchantedBook()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getFireAspect1(), item);
    }

    private void FireAspect2(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.FIRE_ASPECT, 2, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getFireAspect2(), item);
        recipe.shape("  B"," F ","B  ");
        recipe.setIngredient('F', Main.getEnchants().get(Keys.getFireAspect1()));
        recipe.setIngredient('B', Main.getImbuedEssences().get(Keys.getImbuedBlaze()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getFireAspect2(), item);
    }
}
