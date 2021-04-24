package com.temmy.enchantupgrades.Recipes.Enchants;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

public class Punch {

    public Punch(){
        Punch1();
        Punch2();
        Punch3();
    }

    private void Punch1(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.ARROW_KNOCKBACK, 1, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getPunch1(), item);
        recipe.shape("SPS","BEB","SPS");
        recipe.setIngredient('S', Material.STRING);
        recipe.setIngredient('P', Material.PISTON);
        recipe.setIngredient('B', Material.BOW);
        recipe.setIngredient('E', Main.getEssences().get(Keys.getBaseEnchantedBook()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getPunch1(), item);
    }

    private void Punch2(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.ARROW_KNOCKBACK, 2, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getPunch2(), item);
        recipe.shape("SPS","BEB","SPS");
        recipe.setIngredient('S', Material.STRING);
        recipe.setIngredient('P', Material.PISTON);
        recipe.setIngredient('B', Material.BOW);
        recipe.setIngredient('E', Main.getEnchants().get(Keys.getPunch1()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getPunch2(), item);
    }

    private void Punch3(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.ARROW_KNOCKBACK, 3, true);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getPunch3(), item);
        //TODO: Add recipe for Punch 3
        Main.getEnchants().put(Keys.getPunch3(), item);
    }
}
