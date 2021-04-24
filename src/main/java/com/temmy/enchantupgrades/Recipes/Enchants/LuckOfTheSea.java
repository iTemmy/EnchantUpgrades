package com.temmy.enchantupgrades.Recipes.Enchants;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

public class LuckOfTheSea {

    public LuckOfTheSea(){
        LuckOfTheSea1();
        LuckOfTheSea2();
        LuckOfTheSea3();
        LuckOfTheSea4();
        LuckOfTheSea5();
    }

    private void LuckOfTheSea1(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.LUCK, 1, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getLuckOfTheSea1(), item);
        recipe.shape(" T "," B "," T ");
        recipe.setIngredient('T', Main.getEssences().get(Keys.getTreasureEssence()));
        recipe.setIngredient('B', Main.getEssences().get(Keys.getBaseEnchantedBook()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getLuckOfTheSea1(), item);
    }

    private void LuckOfTheSea2(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.LUCK, 2, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getLuckOfTheSea2(), item);
        recipe.shape(" T "," L ","T T");
        recipe.setIngredient('T', Main.getEssences().get(Keys.getTreasureEssence()));
        recipe.setIngredient('L', Main.getEnchants().get(Keys.getLuckOfTheSea1()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getLuckOfTheSea2(), item);
    }

    private void LuckOfTheSea3(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.LUCK, 3, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getLuckOfTheSea3(), item);
        recipe.shape(" T ","TLT"," T ");
        recipe.setIngredient('T', Main.getEssences().get(Keys.getTreasureEssence()));
        recipe.setIngredient('L', Main.getEnchants().get(Keys.getLuckOfTheSea2()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getLuckOfTheSea3(), item);
    }

    private void LuckOfTheSea4(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.LUCK, 4, true);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getLuckOfTheSea4(), item);
        //TODO: Add recipe for Luck Of the Sea 4
        Main.getEnchants().put(Keys.getLuckOfTheSea4(), item);
    }

    private void LuckOfTheSea5(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.LUCK, 5, true);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getLuckOfTheSea5(), item);
        //TODO: Add recipe for Luck Of the Sea 5
        Main.getEnchants().put(Keys.getLuckOfTheSea5(), item);
    }
}
