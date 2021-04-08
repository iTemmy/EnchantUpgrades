package com.temmy.enchantupgrades.Recipes.Enchants;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Blaze;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

public class Sharpness {

    private ItemStack BlazeEssence = Main.getEssences().get(Keys.getBlazeEssence());

    public Sharpness(){
        Sharpness1();
        Sharpness2();
        Sharpness3();
        Sharpness4();
        Sharpness5();
    }

    private void Sharpness1(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.DAMAGE_ALL, 1, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getSharpness1(), item);
        recipe.shape(" E "," B "," E ");
        recipe.setIngredient('E', BlazeEssence);
        recipe.setIngredient('B', Main.getEssences().get(Keys.getBaseEnchantedBook()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getSharpness1(), item);
    }

    private void Sharpness2(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.DAMAGE_ALL, 2, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getSharpness2(), item);
        recipe.shape(" E "," S ","E E");
        recipe.setIngredient('E', BlazeEssence);
        recipe.setIngredient('S', Main.getEnchants().get(Keys.getSharpness1()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getSharpness2(), item);
    }

    private void Sharpness3(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.DAMAGE_ALL, 3, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getSharpness3(), item);
        recipe.shape(" E ","ESE"," E ");
        recipe.setIngredient('E', BlazeEssence);
        recipe.setIngredient('S', Main.getEnchants().get(Keys.getSharpness2()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getSharpness3(), item);
    }

    private void Sharpness4(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.DAMAGE_ALL, 4, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getSharpness4(), item);
        recipe.shape("EEE"," S ","EEE");
        recipe.setIngredient('E', BlazeEssence);
        recipe.setIngredient('S', Main.getEnchants().get(Keys.getSharpness3()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getSharpness4(), item);
    }

    private void Sharpness5(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.DAMAGE_ALL, 5,false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getSharpness5(), item);
        recipe.shape("EEE","ESE","EEE");
        recipe.setIngredient('E', BlazeEssence);
        recipe.setIngredient('S', Main.getEnchants().get(Keys.getSharpness4()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getSharpness5(), item);
    }
}
