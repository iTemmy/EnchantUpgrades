package com.temmy.enchantupgrades.Recipes.Enchants;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

public class Unbreaking {

    public Unbreaking(){
        Unbreaking1();
        Unbreaking2();
        Unbreaking3();
        Unbreaking4();
        Unbreaking5();
    }

    private void Unbreaking1(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.DURABILITY, 1, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getUnbreaking1(), item);
        recipe.shape(" H "," B "," H ");
        recipe.setIngredient('H', Main.getEssences().get(Keys.getHardeningEssence()));
        recipe.setIngredient('B', Main.getEssences().get(Keys.getBaseEnchantedBook()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getUnbreaking1(), item);
    }

    private void Unbreaking2(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.DURABILITY, 2, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getUnbreaking2(), item);
        recipe.shape(" H "," U ","H H");
        recipe.setIngredient('H', Main.getEssences().get(Keys.getHardeningEssence()));
        recipe.setIngredient('U', Main.getEnchants().get(Keys.getUnbreaking1()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getUnbreaking2(), item);
    }

    private void Unbreaking3(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.DURABILITY, 3, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getUnbreaking3(), item);
        recipe.shape(" H ","HUH"," H ");
        recipe.setIngredient('H', Main.getEssences().get(Keys.getHardeningEssence()));
        recipe.setIngredient('U', Main.getEnchants().get(Keys.getUnbreaking2()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getUnbreaking3(), item);
    }

    private void Unbreaking4(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.DURABILITY, 4, true);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getUnbreaking4(), item);
        //TODO: Add recipe for Unbreaking 4
        Main.getEnchants().put(Keys.getUnbreaking4(), item);
    }

    private void Unbreaking5(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.DURABILITY, 5, true);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getUnbreaking5(), item);
        //TODO: Add recipe for Unbreaking 5
        Main.getEnchants().put(Keys.getUnbreaking5(), item);
    }
}
