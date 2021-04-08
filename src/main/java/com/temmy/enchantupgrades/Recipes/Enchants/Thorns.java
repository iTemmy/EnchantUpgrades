package com.temmy.enchantupgrades.Recipes.Enchants;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

public class Thorns {

    public Thorns(){
        Thorns1();
        Thorns2();
        Thorns3();
    }

    private void Thorns1(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.THORNS, 1, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getThorns1(),item);
        recipe.shape(" S "," B "," S ");
        recipe.setIngredient('S', Main.getEssences().get(Keys.getPricklyEssence()));
        recipe.setIngredient('B', Main.getEssences().get(Keys.getBaseEnchantedBook()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getThorns1(), item);
    }

    private void Thorns2(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.THORNS, 2, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getThorns2(), item);
        recipe.shape(" S "," B ","S S");
        recipe.setIngredient('S', Main.getEssences().get(Keys.getPricklyEssence()));
        recipe.setIngredient('B', Main.getEnchants().get(Keys.getThorns1()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getThorns2(), item);
    }

    private void Thorns3(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.THORNS, 3, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getThorns3(), item);
        recipe.shape(" S ","SBS"," S ");
        recipe.setIngredient('S', Main.getEssences().get(Keys.getPricklyEssence()));
        recipe.setIngredient('B', Main.getEnchants().get(Keys.getThorns2()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getThorns3(), item);
    }
}
