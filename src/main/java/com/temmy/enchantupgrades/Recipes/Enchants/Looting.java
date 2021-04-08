package com.temmy.enchantupgrades.Recipes.Enchants;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

public class Looting {

    public Looting(){
        Looting1();
        Looting2();
        Looting3();
    }

    private void Looting1(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.LOOT_BONUS_MOBS, 1, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getLooting1(), item);
        recipe.shape(" M "," B "," M ");
        recipe.setIngredient('M', Main.getEssences().get(Keys.getMobEssence()));
        recipe.setIngredient('B', Main.getEssences().get(Keys.getBaseEnchantedBook()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getLooting1(), item);
    }

    private void Looting2(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.LOOT_BONUS_MOBS, 2, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getLooting2(), item);
        recipe.shape(" M ","MLM"," M ");
        recipe.setIngredient('M', Main.getEssences().get(Keys.getMobEssence()));
        recipe.setIngredient('L', Main.getEnchants().get(Keys.getLooting1()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getLooting2(), item);
    }

    private void Looting3(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.LOOT_BONUS_MOBS, 3, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getLooting3(), item);
        recipe.shape("MMM","MLM","MMM");
        recipe.setIngredient('M', Main.getEssences().get(Keys.getMobEssence()));
        recipe.setIngredient('L', Main.getEnchants().get(Keys.getLooting2()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getLooting3(), item);
    }
}
