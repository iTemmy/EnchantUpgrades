package com.temmy.enchantupgrades.Recipes.Enchants;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

public class ProjectileProtection {

    private ItemStack ProjectileScraps = Main.getEssences().get(Keys.getProjectileScraps());

    public ProjectileProtection(){
        ProjectileProtection1();
        ProjectileProtection2();
        ProjectileProtection3();
        ProjectileProtection4();
    }

    private void ProjectileProtection1(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.PROTECTION_PROJECTILE, 1, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getProjectileProtection1(), item);
        recipe.shape(" P "," B "," P ");
        recipe.setIngredient('P', ProjectileScraps);
        recipe.setIngredient('B', Main.getEssences().get(Keys.getBaseEnchantedBook()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getProjectileProtection1(), item);
    }

    private void ProjectileProtection2(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.PROTECTION_PROJECTILE, 2, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getProjectileProtection2(), item);
        recipe.shape(" P ","PBP"," P ");
        recipe.setIngredient('P', ProjectileScraps);
        recipe.setIngredient('B', Main.getEnchants().get(Keys.getProjectileProtection1()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getProjectileProtection2(), item);
    }

    private void ProjectileProtection3(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.PROTECTION_PROJECTILE, 3, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getProjectileProtection3(), item);
        recipe.shape("PPP"," B ","PPP");
        recipe.setIngredient('P', ProjectileScraps);
        recipe.setIngredient('B', Main.getEnchants().get(Keys.getProjectileProtection2()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getProjectileProtection3(), item);
    }

    private void ProjectileProtection4(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.PROTECTION_PROJECTILE, 4, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getProjectileProtection4(), item);
        recipe.shape("PPP","PBP","PPP");
        recipe.setIngredient('P', ProjectileScraps);
        recipe.setIngredient('B', Main.getEnchants().get(Keys.getProjectileProtection3()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getProjectileProtection4(), item);
    }
}
