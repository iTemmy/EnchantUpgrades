package com.temmy.enchantupgrades.Recipes.Enchants;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

public class FeatherFalling {

    public FeatherFalling(){
        FeatherFalling1();
        FeatherFalling2();
        FeatherFalling3();
        FeatherFalling4();
    }

    private void FeatherFalling1(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.PROTECTION_FALL, 1, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getFeatherFalling1(), item);
        recipe.shape(" F "," B "," F ");
        recipe.setIngredient('B', Main.getEssences().get(Keys.getBaseEnchantedBook()));
        recipe.setIngredient('F', Main.getEssences().get(Keys.getCushionEssence()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getFeatherFalling1(), item);
    }

    private void FeatherFalling2(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.PROTECTION_FALL, 2, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getFeatherFalling2(), item);
        recipe.shape(" F ","FBF"," F ");
        recipe.setIngredient('F', Main.getEssences().get(Keys.getCushionEssence()));
        recipe.setIngredient('B', Main.getEnchants().get(Keys.getFeatherFalling1()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getFeatherFalling2(), item);
    }

    private void FeatherFalling3(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.PROTECTION_FALL, 3, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getFeatherFalling3(), item);
        recipe.shape("FFF"," B ","FFF");
        recipe.setIngredient('F', Main.getEssences().get(Keys.getCushionEssence()));
        recipe.setIngredient('B', Main.getEnchants().get(Keys.getFeatherFalling2()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getFeatherFalling3(), item);
    }

    private void FeatherFalling4(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.PROTECTION_FALL, 4, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getFeatherFalling4(), item);
        recipe.shape("FFF","FBF","FFF");
        recipe.setIngredient('F', Main.getEssences().get(Keys.getCushionEssence()));
        recipe.setIngredient('B', Main.getEnchants().get(Keys.getFeatherFalling3()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getFeatherFalling4(), item);
    }
}
