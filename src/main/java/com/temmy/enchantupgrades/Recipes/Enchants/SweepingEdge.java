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
        SweepingEdge4();
        SweepingEdge5();
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

    private void SweepingEdge4(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.SWEEPING_EDGE, 4, true);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getSweepingEdge4(), item);
        //TODO: Add recipe for Sweeping Edge 4
        Main.getEnchants().put(Keys.getSweepingEdge4(), item);
    }

    private void SweepingEdge5(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.SWEEPING_EDGE, 5, true);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getSweepingEdge5(), item);
        //TODO: Add recipe for Sweeping Edge 5
        Main.getEnchants().put(Keys.getSweepingEdge5(), item);
    }
}
