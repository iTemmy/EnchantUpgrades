package com.temmy.enchantupgrades.Recipes.Enchants;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

public class QuickCharge {

    public QuickCharge(){
        QuickCharge1();
        QuickCharge2();
        QuickCharge3();
        QuickCharge4();
        QuickCharge5();
    }

    private void QuickCharge1(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.QUICK_CHARGE, 1, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getQuickCharge1(), item);
        recipe.shape(" R ","GBG"," R ");
        recipe.setIngredient('R', Main.getEssences().get(Keys.getQuickeningEssence()));
        recipe.setIngredient('G', Material.GOLD_INGOT);
        recipe.setIngredient('B', Main.getEssences().get(Keys.getBaseEnchantedBook()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getQuickCharge1(), item);
    }

    private void QuickCharge2(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.QUICK_CHARGE, 2, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getQuickCharge2(), item);
        recipe.shape("GRG"," Q ","GRG");
        recipe.setIngredient('R', Main.getEssences().get(Keys.getQuickeningEssence()));
        recipe.setIngredient('G', Material.GOLD_INGOT);
        recipe.setIngredient('Q', Main.getEnchants().get(Keys.getQuickCharge1()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getQuickCharge2(), item);
    }

    private void QuickCharge3(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.QUICK_CHARGE, 3, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getQuickCharge3(), item);
        recipe.shape("GRG","GQG","GRG");
        recipe.setIngredient('G', Material.GOLD_INGOT);
        recipe.setIngredient('Q', Main.getEnchants().get(Keys.getQuickCharge2()));
        recipe.setIngredient('R', Main.getEssences().get(Keys.getQuickeningEssence()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getQuickCharge3(), item);
    }

    private void QuickCharge4(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.QUICK_CHARGE, 4, true);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getQuickCharge4(), item);
        //TODO: Add recipe for Quick Charge 4
        Main.getEnchants().put(Keys.getQuickCharge4(), item);
    }

    private void QuickCharge5(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.QUICK_CHARGE, 5, true);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getQuickCharge5(), item);
        //TODO: Add recipe for Quick Charge 5
        Main.getEnchants().put(Keys.getQuickCharge5(), item);
    }
}
