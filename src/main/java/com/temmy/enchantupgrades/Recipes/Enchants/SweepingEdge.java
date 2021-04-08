package com.temmy.enchantupgrades.Recipes.Enchants;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

public class SweepingEdge {

    public SweepingEdge(){
        SweepingEdge1();
        SweepingEdge2();
        SweepingEdge3();
    }

    private void SweepingEdge1(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.SWEEPING_EDGE, 1, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getSweepingEdge1(), item);
        recipe.shape("   ","SBS","   ");
        recipe.setIngredient('B', Main.getEssences().get(Keys.getBaseEnchantedBook()));
        recipe.setIngredient('S', Main.getEssences().get(Keys.getSplicingEssence()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getSweepingEdge1(), item);
    }

    private void SweepingEdge2(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.SWEEPING_EDGE, 2, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getSweepingEdge2(), item);
        recipe.shape(" S "," E ","S S");
        recipe.setIngredient('S', Main.getEssences().get(Keys.getSplicingEssence()));
        recipe.setIngredient('E', Main.getEnchants().get(Keys.getSweepingEdge1()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getSweepingEdge2(), item);
    }

    private void SweepingEdge3(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.SWEEPING_EDGE, 3, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getSweepingEdge3(),item);
        recipe.shape(" S ","SES"," S ");
        recipe.setIngredient('S', Main.getEssences().get(Keys.getSplicingEssence()));
        recipe.setIngredient('E', Main.getEnchants().get(Keys.getSweepingEdge2()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getSweepingEdge3(), item);
    }
}
