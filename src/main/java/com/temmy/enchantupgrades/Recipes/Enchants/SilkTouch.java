package com.temmy.enchantupgrades.Recipes.Enchants;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

public class SilkTouch {

    public SilkTouch(){
        SilkTouch1();
    }

    private void SilkTouch1(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.SILK_TOUCH, 1, false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getSilkTouch1(), item);
        recipe.shape("JSJ","GBG","JSJ");
        recipe.setIngredient('J', Main.getEssences().get(Keys.getSilkyJewel()));
        recipe.setIngredient('S', Material.STRING);
        recipe.setIngredient('G', Material.GHAST_TEAR);
        recipe.setIngredient('B', Main.getEssences().get(Keys.getBaseEnchantedBook()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getSilkTouch1(), item);
    }
}
