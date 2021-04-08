package com.temmy.enchantupgrades.Recipes.Enchants;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

import java.util.GregorianCalendar;

public class Impaling {
    public Impaling(){
        Impaling1();
        Impaling2();
        Impaling3();
        Impaling4();
        Impaling5();
    }

    private void Impaling1(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.IMPALING, 1, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getImpaling1(), item);
        recipe.shape(" O ","ABA"," O ");
        recipe.setIngredient('O', Main.getEssences().get(Keys.getOxidizedEssence()));
        recipe.setIngredient('A', Material.ARROW);
        recipe.setIngredient('B', Main.getEssences().get(Keys.getBaseEnchantedBook()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getImpaling1(), item);
    }

    private void Impaling2(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.IMPALING, 2, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getImpaling2(), item);
        recipe.shape("AOA","OIO","AOA");
        recipe.setIngredient('A', Material.ARROW);
        recipe.setIngredient('O', Main.getEssences().get(Keys.getOxidizedEssence()));
        recipe.setIngredient('I', Main.getEnchants().get(Keys.getImpaling1()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getImpaling2(), item);
    }

    private void Impaling3(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.IMPALING, 3, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getImpaling3(), item);
        recipe.shape("AOA","OIO","AOA");
        recipe.setIngredient('A', Material.ARROW);
        recipe.setIngredient('O', Main.getEssences().get(Keys.getOxidizedEssence()));
        recipe.setIngredient('I', Main.getEnchants().get(Keys.getImpaling2()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getImpaling3(), item);
    }

    private void Impaling4(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.IMPALING, 4, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getImpaling4(), item);
        recipe.shape("OAO","OIO","OAO");
        recipe.setIngredient('A', Material.ARROW);
        recipe.setIngredient('O', Main.getEssences().get(Keys.getOxidizedEssence()));
        recipe.setIngredient('I', Main.getEnchants().get(Keys.getImpaling3()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getImpaling4(), item);
    }

    private void Impaling5(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.IMPALING, 5, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getImpaling5(), item);
        recipe.shape("OOO","OIO","OOO");
        recipe.setIngredient('O', Main.getEssences().get(Keys.getOxidizedEssence()));
        recipe.setIngredient('I', Main.getEnchants().get(Keys.getImpaling4()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getImpaling5(), item);
    }
}
