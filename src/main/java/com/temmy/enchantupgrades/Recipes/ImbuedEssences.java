package com.temmy.enchantupgrades.Recipes;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

public class ImbuedEssences {

    public ImbuedEssences(){
        ImbuedBlasts();
        ImbuedCushion();
        ImbuedFlame();
        ImbuedProjectile();
        ImbuedProtection();
        ImbuedQuickening();
        ImbuedSilk();
        OxidizedSerum();
        OceanicEssence();
        ImbuedHardening();
        PricklyGel();
        ImbuedMobEssence();
        ImbuedArachnidEssence();
        ImbuedBlaze();
        ImbuedUndead();
    }

    private void ImbuedCushion(){
        ItemStack item = new ItemStack(Material.WHITE_WOOL);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.WHITE+""+ChatColor.BOLD+"Imbued Cushion"));
        meta.getPersistentDataContainer().set(Keys.getImbuedCushion(), PersistentDataType.BYTE, (byte)1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getImbuedCushion(), item);
        recipe.shape("FFF","FFF","FFF");
        recipe.setIngredient('F', Main.getEssences().get(Keys.getCushionEssence()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getImbuedEssences().put(Keys.getImbuedCushion(), item);
    }

    private void ImbuedBlasts(){
        ItemStack item = new ItemStack(Material.CRYING_OBSIDIAN);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.DARK_PURPLE+""+ChatColor.BOLD+"Imbued Blasts"));
        meta.getPersistentDataContainer().set(Keys.getImbuedBlasts(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getImbuedBlasts(), item);
        recipe.shape("DDD","DDD","DDD");
        recipe.setIngredient('D', Main.getEssences().get(Keys.getCombustibleScraps()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getImbuedEssences().put(Keys.getImbuedBlasts(), item);
    }

    private void ImbuedProjectile(){
        ItemStack item = new ItemStack(Material.SPECTRAL_ARROW);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.GRAY+""+ChatColor.BOLD+"Imbued Projectile"));
        meta.getPersistentDataContainer().set(Keys.getImbuedProjectile(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getImbuedProjectile(), item);
        recipe.shape("GGG","GGG","GGG");
        recipe.setIngredient('G', Main.getEssences().get(Keys.getProjectileScraps()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getImbuedEssences().put(Keys.getImbuedProjectile(), item);
    }

    private void ImbuedFlame(){
        ItemStack item = new ItemStack(Material.MAGMA_BLOCK);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.DARK_RED+""+ChatColor.BOLD+"Imbued Flame"));
        meta.getPersistentDataContainer().set(Keys.getImbuedFlame(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getImbuedFlame(), item);
        recipe.shape("RRR","RRR","RRR");
        recipe.setIngredient('R', Main.getEssences().get(Keys.getFlameScraps()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getImbuedEssences().put(Keys.getImbuedFlame(), item);
    }

    private void ImbuedProtection(){
        ItemStack item = new ItemStack(Material.IRON_BLOCK);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.WHITE+""+ChatColor.BOLD+"Imbued Protection"));
        meta.getPersistentDataContainer().set(Keys.getImbuedProtection(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getImbuedProtection(), item);
        recipe.shape("BBB","BBB","BBB");
        recipe.setIngredient('B', Main.getEssences().get(Keys.getProtectionScraps()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getImbuedEssences().put(Keys.getImbuedProtection(), item);
    }

    private void ImbuedQuickening(){
        ItemStack item = new ItemStack(Material.REDSTONE_BLOCK);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.RED+""+ChatColor.BOLD+"Imbued Quickening"));
        meta.getPersistentDataContainer().set(Keys.getImbuedQuickening(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getImbuedQuickening(), item);
        recipe.shape("QQQ","QQQ","QQQ");
        recipe.setIngredient('Q', Main.getEssences().get(Keys.getQuickeningEssence()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getImbuedEssences().put(Keys.getImbuedQuickening(), item);
    }

    private void ImbuedSilk(){
        ItemStack item = new ItemStack(Material.YELLOW_WOOL);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.YELLOW+""+ChatColor.BOLD+"Imbued Silk"));
        meta.getPersistentDataContainer().set(Keys.getImbuedSilk(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getImbuedSilk(), item);
        recipe.shape("YYY","YYY","YYY");
        recipe.setIngredient('Y', Main.getEssences().get(Keys.getSilkyJewel()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getImbuedEssences().put(Keys.getImbuedSilk(), item);
    }

    private void OxidizedSerum(){
        ItemStack item = new ItemStack(Material.GREEN_WOOL);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.GREEN+""+ChatColor.BOLD+"Oxidized Serum"));
        meta.getPersistentDataContainer().set(Keys.getOxidizedSerum(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getOxidizedSerum(), item);
        recipe.shape("GGG","GGG","GGG");
        recipe.setIngredient('G', Main.getEssences().get(Keys.getOxidizedEssence()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getImbuedEssences().put(Keys.getOxidizedSerum(), item);
    }

    private void OceanicEssence(){
        ItemStack item = new ItemStack(Material.WHITE_CONCRETE);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.WHITE+""+ChatColor.BOLD+"Oceanic Essence"));
        meta.getPersistentDataContainer().set(Keys.getOceanicEssence(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getOceanicEssence(), item);
        recipe.shape("SSS","SSS","SSS");
        recipe.setIngredient('S', Main.getEssences().get(Keys.getStriderEssence()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getImbuedEssences().put(Keys.getOceanicEssence(), item);
    }

    private void ImbuedHardening(){
        ItemStack item = new ItemStack(Material.OBSIDIAN);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.WHITE+""+ChatColor.BOLD+"Imbued Hardening"));
        meta.getPersistentDataContainer().set(Keys.getImbuedHardening(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getImbuedHardening(), item);
        recipe.shape("III","III","III");
        recipe.setIngredient('I', Main.getEssences().get(Keys.getHardeningEssence()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getImbuedEssences().put(Keys.getImbuedHardening(), item);
    }

    private void PricklyGel(){
        ItemStack item = new ItemStack(Material.GREEN_DYE);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.GREEN+""+ChatColor.BOLD+"Prickly Gel"));
        meta.getPersistentDataContainer().set(Keys.getPricklyGel(),PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getPricklyGel(), item);
        recipe.shape("CCC","CCC","CCC");
        recipe.setIngredient('C', Main.getEssences().get(Keys.getPricklyEssence()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getImbuedEssences().put(Keys.getPricklyGel(), item);
    }

    private void ImbuedMobEssence(){
        ItemStack item = new ItemStack(Material.INK_SAC);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.BLACK+""+ChatColor.BOLD+"Imbued Mob Essence"));
        meta.getPersistentDataContainer().set(Keys.getImbuedMobEssence(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getImbuedMobEssence(), item);
        recipe.shape("BBB","BBB","BBB");
        recipe.setIngredient('B', Main.getEssences().get(Keys.getMobEssence()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getImbuedEssences().put(Keys.getImbuedMobEssence(), item);
    }

    private void ImbuedArachnidEssence(){
        ItemStack item = new ItemStack(Material.FERMENTED_SPIDER_EYE);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.BLUE+""+ChatColor.BOLD+"Imbued Arachnid Essence"));
        meta.getPersistentDataContainer().set(Keys.getImbuedMobEssence(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getImbuedMobEssence(), item);
        recipe.shape("EEE","EEE","EEE");
        recipe.setIngredient('E', Main.getEssences().get(Keys.getArachnidEssence()));
        Main.getImbuedEssences().put(Keys.getImbuedArachnid(), item);
    }

    private void ImbuedBlaze(){
        ItemStack item = new ItemStack(Material.BLAZE_ROD);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.RED+""+ChatColor.BOLD+"Imbued Blaze"));
        meta.getPersistentDataContainer().set(Keys.getImbuedBlaze(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getImbuedBlaze(), item);
        recipe.shape("BBB","BBB","BBB");
        recipe.setIngredient('B', Main.getEssences().get(Keys.getBlazeEssence()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getImbuedEssences().put(Keys.getImbuedBlaze(), item);
    }

    private void ImbuedUndead(){
        ItemStack item = new ItemStack(Material.LEATHER);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.GRAY+""+ChatColor.BOLD+"Imbued Undead"));
        meta.getPersistentDataContainer().set(Keys.getImbuedUndead(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getImbuedUndead(), item);
        recipe.shape("RRR","RRR","RRR");
        recipe.setIngredient('R', Main.getEssences().get(Keys.getUndeadEssence()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getImbuedEssences().put(Keys.getImbuedUndead(), item);
    }
}
