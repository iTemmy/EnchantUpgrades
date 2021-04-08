package com.temmy.enchantupgrades.Recipes.Enchants;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

public class AquaAffinity {

    public AquaAffinity(){
        AquaAffinity1();
    }

    private void AquaAffinity1(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EMeta = (EnchantmentStorageMeta) item.getItemMeta();
        EMeta.addStoredEnchant(Enchantment.WATER_WORKER, 1 , false);
        item.setItemMeta(EMeta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getAquaAffinity1(), item);
        recipe.shape("GGG","SBS","KWK");
        recipe.setIngredient('G', Material.SEAGRASS);
        recipe.setIngredient('S', Material.SCUTE);
        recipe.setIngredient('W', Material.WATER_BUCKET);
        recipe.setIngredient('B', Main.getEssences().get(Keys.getBaseEnchantedBook()));
        recipe.setIngredient('K', Material.KELP);
        Bukkit.getServer().addRecipe(recipe);
        Main.getEnchants().put(Keys.getAquaAffinity1(), item);
    }
}
