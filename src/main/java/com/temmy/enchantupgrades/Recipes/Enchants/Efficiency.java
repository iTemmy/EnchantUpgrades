package com.temmy.enchantupgrades.Recipes.Enchants;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

public class Efficiency {

    public Efficiency(){
        Efficiency1();
        Efficiency2();
        Efficiency3();
        Efficiency4();
        Efficiency5();
    }

    private void Efficiency1(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.DIG_SPEED, 1, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getEfficiency1(), item);
        recipe.shape(" E "," B "," E ");
        recipe.setIngredient('B', Main.getEssences().get(Keys.getBaseEnchantedBook()));
        recipe.setIngredient('E', Main.getEssences().get(Keys.getQuickeningEssence()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getEfficiency1(), item);
    }

    private void Efficiency2(){
        ItemStack item  = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.DIG_SPEED, 2, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getEfficiency2(), item);
        recipe.shape(" Q "," E ","Q Q");
        recipe.setIngredient('Q', Main.getEssences().get(Keys.getQuickeningEssence()));
        recipe.setIngredient('E', Main.getEnchants().get(Keys.getEfficiency1()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getEfficiency2(), item);
    }

    private void Efficiency3(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.DIG_SPEED, 3, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getEfficiency3(), item);
        recipe.shape(" Q ","QEQ"," Q ");
        recipe.setIngredient('Q', Main.getEssences().get(Keys.getQuickeningEssence()));
        recipe.setIngredient('E', Main.getEnchants().get(Keys.getEfficiency2()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getEfficiency3(), item);
    }

    private void Efficiency4(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.DIG_SPEED, 4, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getEfficiency4(), item);
        recipe.shape("QQQ"," E ","QQQ");
        recipe.setIngredient('Q', Main.getEssences().get(Keys.getQuickeningEssence()));
        recipe.setIngredient('E', Main.getEnchants().get(Keys.getEfficiency3()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getEfficiency4(), item);
    }

    private void Efficiency5(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.DIG_SPEED, 5, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getEfficiency5(), item);
        recipe.shape("QQQ","QEQ","QQQ");
        recipe.setIngredient('Q', Main.getEssences().get(Keys.getQuickeningEssence()));
        recipe.setIngredient('E', Main.getEnchants().get(Keys.getEfficiency4()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getEfficiency5(), item);
    }
}
