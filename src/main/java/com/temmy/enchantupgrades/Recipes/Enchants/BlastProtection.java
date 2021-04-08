package com.temmy.enchantupgrades.Recipes.Enchants;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

public class BlastProtection {

    private ItemStack CombustibleScraps = Main.getEssences().get(Keys.getCombustibleScraps());

    public BlastProtection(){
        BlastProtection1();
        BlastProtection2();
        BlastProtection3();
    }

    private void BlastProtection1(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.PROTECTION_EXPLOSIONS, 1, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getBlastProtection1(), item);
        recipe.shape(" C "," B "," C ");
        recipe.setIngredient('C', CombustibleScraps);
        recipe.setIngredient('B', Main.getEssences().get(Keys.getBaseEnchantedBook()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getBlastProtection1(), item);
    }

    private void BlastProtection2(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.PROTECTION_EXPLOSIONS, 2, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getBlastProtection2(), item);
        recipe.shape(" C ","CBC"," C ");
        recipe.setIngredient('C', CombustibleScraps);
        recipe.setIngredient('B', Main.getEnchants().get(Keys.getBlastProtection1()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getBlastProtection2(), item);
    }

    private void BlastProtection3(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.PROTECTION_EXPLOSIONS, 3, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getBlastProtection3(), item);
        recipe.shape("CCC"," B ","CCC");
        recipe.setIngredient('B', Main.getEnchants().get(Keys.getBlastProtection2()));
        recipe.setIngredient('C', CombustibleScraps);
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getBlastProtection3(), item);
    }

    private void BlastProtection4(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4,false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getBlastProtection4(), item);
        recipe.shape("CCC","CBC","CCC");
        recipe.setIngredient('C', CombustibleScraps);
        recipe.setIngredient('B', Main.getEnchants().get(Keys.getBlastProtection3()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getBlastProtection4(), item);
    }
}
