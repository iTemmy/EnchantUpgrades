package com.temmy.enchantupgrades.Recipes.Enchants;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

public class SoulSpeed {

    public SoulSpeed() {
        SoulSpeed1();
        SoulSpeed2();
        SoulSpeed3();
        SoulSpeed4();
        SoulSpeed5();
    }

    private void SoulSpeed1() {
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.SOUL_SPEED, 1, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getSoulSpeed1(), item);
        recipe.shape(" N ", " B ", " N ");
        recipe.setIngredient('N', Main.getEssences().get(Keys.getNetherShard()));
        recipe.setIngredient('B', Main.getEssences().get(Keys.getBaseEnchantedBook()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getSoulSpeed1(), item);
    }

    private void SoulSpeed2(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.SOUL_SPEED, 2, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getSoulSpeed2(), item);
        recipe.shape(" N "," S ","N N");
        recipe.setIngredient('N', Main.getEssences().get(Keys.getNetherShard()));
        recipe.setIngredient('S', Main.getEnchants().get(Keys.getSoulSpeed1()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getSoulSpeed2(), item);
    }

    private void SoulSpeed3(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.SOUL_SPEED, 3 ,false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getSoulSpeed3(), item);
        recipe.shape("N N"," S ","N N");
        recipe.setIngredient('N', Main.getEssences().get(Keys.getNetherShard()));
        recipe.setIngredient('S', Main.getEnchants().get(Keys.getSoulSpeed2()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getSoulSpeed3(), item);
    }

    private void SoulSpeed4(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.SOUL_SPEED, 4, true);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getSoulSpeed4(), item);
        //TODO: Add recipe for Soul Speed 4
        Main.getEnchants().put(Keys.getSoulSpeed4(), item);
    }

    private void SoulSpeed5(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.SOUL_SPEED, 5, true);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getSoulSpeed5(), item);
        //TODO: Add recipe for Soul Speed 5
        Main.getEnchants().put(Keys.getSoulSpeed5(), item);
    }
}