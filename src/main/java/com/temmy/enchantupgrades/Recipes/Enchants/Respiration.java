package com.temmy.enchantupgrades.Recipes.Enchants;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

public class Respiration {

    public Respiration(){
        Respiration1();
        Respiration2();
        Respiration3();
    }

    private void Respiration1(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.OXYGEN, 1, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getRespiration1(), item);
        recipe.shape(" O "," B "," O ");
        recipe.setIngredient('O', Main.getEssences().get(Keys.getOxidizedEssence()));
        recipe.setIngredient('B', Main.getEssences().get(Keys.getBaseEnchantedBook()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getRespiration1(), item);
    }

    private void Respiration2(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.OXYGEN, 2, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getRespiration2(), item);
        recipe.shape(" O "," R ","O O");
        recipe.setIngredient('O', Main.getEssences().get(Keys.getOxidizedEssence()));
        recipe.setIngredient('R', Main.getEnchants().get(Keys.getRespiration1()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getRespiration2(), item);
    }

    private void Respiration3(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.OXYGEN, 3, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getRespiration3(), item);
        recipe.shape(" O ","ORO"," O ");
        recipe.setIngredient('O', Main.getEssences().get(Keys.getOxidizedEssence()));
        recipe.setIngredient('R', Main.getEnchants().get(Keys.getRespiration2()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getRespiration3(), item);
    }

}
