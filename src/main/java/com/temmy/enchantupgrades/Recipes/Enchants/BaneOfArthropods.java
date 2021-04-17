package com.temmy.enchantupgrades.Recipes.Enchants;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

public class BaneOfArthropods {

    public BaneOfArthropods(){
        BaneOfArthropods1();
        BaneOfArthropods2();
        BaneOfArthropods3();
        BaneOfArthropods4();
        BaneOfArthropods5();
        BaneOfArthropods6();
        BaneOfArthropods7();
        BaneOfArthropods8();
    }

    private void BaneOfArthropods1(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.DAMAGE_ARTHROPODS, 1, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getBaneOfArthropods1(), item);
        recipe.shape(" A "," B "," A ");
        recipe.setIngredient('A', Main.getEssences().get(Keys.getArachnidEssence()));
        recipe.setIngredient('B', Main.getEssences().get(Keys.getBaseEnchantedBook()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getBaneOfArthropods1(), item);
    }

    private void BaneOfArthropods2(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.DAMAGE_ARTHROPODS, 2, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getBaneOfArthropods2(), item);
        recipe.shape(" A "," B ","A A");
        recipe.setIngredient('A', Main.getEssences().get(Keys.getArachnidEssence()));
        recipe.setIngredient('B', Main.getEnchants().get(Keys.getBaneOfArthropods1()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getBaneOfArthropods2(), item);
    }

    private void BaneOfArthropods3(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.DAMAGE_ARTHROPODS, 3, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getBaneOfArthropods3(), item);
        recipe.shape(" A ","ABA"," A ");
        recipe.setIngredient('A', Main.getEssences().get(Keys.getArachnidEssence()));
        recipe.setIngredient('B', Main.getEnchants().get(Keys.getBaneOfArthropods2()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getBaneOfArthropods3(), item);
    }

    private void BaneOfArthropods4(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.DAMAGE_ARTHROPODS, 4, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getBaneOfArthropods4(), item);
        recipe.shape("AAA"," B ","AAA");
        recipe.setIngredient('A', Main.getEssences().get(Keys.getArachnidEssence()));
        recipe.setIngredient('B', Main.getEnchants().get(Keys.getBaneOfArthropods3()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getBaneOfArthropods4(), item);
    }

    private void BaneOfArthropods5(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.DAMAGE_ARTHROPODS, 5, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getBaneOfArthropods5(), item);
        recipe.shape("AAA","ABA","AAA");
        recipe.setIngredient('A', Main.getEssences().get(Keys.getArachnidEssence()));
        recipe.setIngredient('B', Main.getEnchants().get(Keys.getBaneOfArthropods4()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getBaneOfArthropods5(), item);
    }
    private void BaneOfArthropods6(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.DAMAGE_ARTHROPODS, 6, true);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getBaneOfArthropods6(), item);
        //TODO: Add recipe for BaneOfArthropods 6
        Main.getEnchants().put(Keys.getBaneOfArthropods6(), item);
    }

    private void BaneOfArthropods7(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.DAMAGE_ARTHROPODS, 7, true);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getBaneOfArthropods7(), item);
        //TODO: Add recipe for BaneOfArthropods 7
        Main.getEnchants().put(Keys.getBaneOfArthropods7(), item);
    }

    private void BaneOfArthropods8(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.DAMAGE_ARTHROPODS, 8, true);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getBaneOfArthropods8(), item);
        //TODO: Add recipe for BaneOfArthropods 8
        Main.getEnchants().put(Keys.getBaneOfArthropods8(), item);
    }
}
