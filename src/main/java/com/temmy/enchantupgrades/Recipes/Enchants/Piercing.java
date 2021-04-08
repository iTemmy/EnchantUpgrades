package com.temmy.enchantupgrades.Recipes.Enchants;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

public class Piercing {

    public Piercing(){
        Piercing1();
        Piercing2();
        Piercing3();
        Piercing4();
    }

    private void Piercing1(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.PIERCING, 1, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getPiercing1(), item);
        recipe.shape(" S "," B "," S ");
        recipe.setIngredient('S', Main.getEssences().get(Keys.getSplicingEssence()));
        recipe.setIngredient('B', Main.getEssences().get(Keys.getBaseEnchantedBook()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getPiercing1(), item);
    }

    private void Piercing2(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.PIERCING, 2, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getPiercing2(), item);
        recipe.shape(" S "," P ","S S");
        recipe.setIngredient('P', Main.getEnchants().get(Keys.getPiercing1()));
        recipe.setIngredient('S', Main.getEssences().get(Keys.getSplicingEssence()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getPiercing2(), item);
    }

    private void Piercing3(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.PIERCING, 3, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getPiercing3(), item);
        recipe.shape(" S ","SPS"," S ");
        recipe.setIngredient('S', Main.getEssences().get(Keys.getSplicingEssence()));
        recipe.setIngredient('P', Main.getEnchants().get(Keys.getPiercing2()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getPiercing3(), item);
    }

    private void Piercing4(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.PIERCING, 4, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getPiercing4(), item);
        recipe.shape("SSS"," P ","SSS");
        recipe.setIngredient('S', Main.getEssences().get(Keys.getSplicingEssence()));
        recipe.setIngredient('P', Main.getEnchants().get(Keys.getPiercing3()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getPiercing4(), item);
    }
}
