package com.temmy.enchantupgrades.Recipes.Enchants;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

public class Riptide {

    public Riptide(){
        RipTide1();
        Riptide2();
        Riptide3();
    }

    private void RipTide1(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta Emeta = (EnchantmentStorageMeta) item.getItemMeta();
        Emeta.addStoredEnchant(Enchantment.RIPTIDE, 1, false);
        item.setItemMeta(Emeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getRiptide1(), item);
        recipe.shape("OOO","RBR","RSR");
        recipe.setIngredient('O', Main.getEssences().get(Keys.getOxidizedEssence()));
        recipe.setIngredient('B', Main.getEssences().get(Keys.getBaseEnchantedBook()));
        recipe.setIngredient('R', Material.REDSTONE);
        recipe.setIngredient('S', Material.SCUTE);
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getRiptide1(), item);
    }

    private void Riptide2(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.RIPTIDE, 2, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getRiptide2(), item);
        recipe.shape("OOO","RBR","RSR");
        recipe.setIngredient('O', Main.getEssences().get(Keys.getOxidizedEssence()));
        recipe.setIngredient('R', Material.REDSTONE);
        recipe.setIngredient('B', Main.getEnchants().get(Keys.getRiptide1()));
        recipe.setIngredient('S', Material.SCUTE);
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getRiptide2(), item);
    }

    private void Riptide3(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.RIPTIDE, 3, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getRiptide3(), item);
        recipe.shape("OOO","RBR","RSR");
        recipe.setIngredient('O', Main.getEssences().get(Keys.getOxidizedEssence()));
        recipe.setIngredient('S', Material.SCUTE);
        recipe.setIngredient('B', Main.getEnchants().get(Keys.getRiptide2()));
        recipe.setIngredient('R', Material.REDSTONE);
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getRiptide3(), item);
    }
}
