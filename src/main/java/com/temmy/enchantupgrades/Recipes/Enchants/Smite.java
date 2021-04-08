package com.temmy.enchantupgrades.Recipes.Enchants;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

public class Smite {

    public Smite(){
        Smite1();
        Smite2();
        Smite3();
        Smite4();
        Smite5();
    }

    private void Smite1(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.DAMAGE_UNDEAD, 1, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getSmite1(), item);
        recipe.shape(" U "," B "," U ");
        recipe.setIngredient('U', Main.getEssences().get(Keys.getUndeadEssence()));
        recipe.setIngredient('B', Main.getEssences().get(Keys.getBaseEnchantedBook()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getSmite1(), item);
    }

    private void Smite2(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.DAMAGE_UNDEAD, 2, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getSmite2(), item);
        recipe.shape(" U "," S ","U U");
        recipe.setIngredient('U', Main.getEssences().get(Keys.getUndeadEssence()));
        recipe.setIngredient('S', Main.getEnchants().get(Keys.getSmite1()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getSmite2(), item);
    }

    private void Smite3(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.DAMAGE_UNDEAD, 3, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getSmite3(), item);
        recipe.shape(" U ","USU"," U ");
        recipe.setIngredient('U', Main.getEssences().get(Keys.getUndeadEssence()));
        recipe.setIngredient('S', Main.getEnchants().get(Keys.getSmite2()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getSmite3(), item);
    }

    private void Smite4(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.DAMAGE_UNDEAD, 4, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getSmite4(), item);
        recipe.shape("UUU"," S ","UUU");
        recipe.setIngredient('U', Main.getEssences().get(Keys.getUndeadEssence()));
        recipe.setIngredient('S', Main.getEnchants().get(Keys.getSmite3()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getSmite4(), item);
    }

    private void Smite5(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.DAMAGE_UNDEAD, 5, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getSmite5(), item);
        recipe.shape("UUU","USU","UUU");
        recipe.setIngredient('U', Main.getEssences().get(Keys.getUndeadEssence()));
        recipe.setIngredient('S', Main.getEnchants().get(Keys.getSmite4()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getSmite5(), item);
    }
}
