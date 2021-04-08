package com.temmy.enchantupgrades.Recipes.Enchants;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

public class FrostWalker {

    public FrostWalker(){
        FrostWalker1();
        FrostWalker2();
    }

    private void FrostWalker1(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.FROST_WALKER, 1, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getFrostWalker1(), item);
        recipe.shape(" I ","IBI"," I ");
        recipe.setIngredient('I', Main.getEssences().get(Keys.getFrostEssence()));
        recipe.setIngredient('B', Main.getEssences().get(Keys.getBaseEnchantedBook()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getFrostWalker1(), item);
    }

    public void FrostWalker2(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.FROST_WALKER, 2, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getFrostWalker2(), item);
        recipe.shape("III"," B ","III");
        recipe.setIngredient('I', Main.getEssences().get(Keys.getFrostEssence()));
        recipe.setIngredient('B', Main.getEnchants().get(Keys.getFrostWalker1()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getFrostWalker2(), item);
    }
}
