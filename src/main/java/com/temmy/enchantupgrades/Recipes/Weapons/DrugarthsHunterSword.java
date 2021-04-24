package com.temmy.enchantupgrades.Recipes.Weapons;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class DrugarthsHunterSword {

    private final ItemStack MobEssence = new ItemStack(Main.getEssences().get(Keys.getMobEssence()));
    private final ItemStack UndeadEssence = new ItemStack(Main.getEssences().get(Keys.getUndeadEssence()));
    private final ItemStack ArachnidEssence = new ItemStack(Main.getEssences().get(Keys.getArachnidEssence()));
    private final ItemStack BlazeEssence = new ItemStack(Main.getEssences().get(Keys.getBlazeEssence()));
    private final ItemStack ImbuedMobEssence = new ItemStack(Main.getImbuedEssences().get(Keys.getImbuedMobEssence()));
    private final ItemStack ImbuedHardening = new ItemStack(Main.getImbuedEssences().get(Keys.getImbuedHardening()));
    private final ItemStack ImbuedUndead = new ItemStack(Main.getImbuedEssences().get(Keys.getImbuedUndead()));
    private final ItemStack ImbuedBlaze = new ItemStack(Main.getImbuedEssences().get(Keys.getImbuedBlaze()));
    private final ItemStack ImbuedArachnid = new ItemStack(Main.getImbuedEssences().get(Keys.getImbuedArachnid()));

    public DrugarthsHunterSword(){
        DrugarthsHunterSword1();
        DrugarthsHunterSword2();
        DrugarthsHunterSword3();
        DrugarthsHunterSword4();
        DrugarthsHunterSword5();
        DrugarthsHunterSword10();
    }

    private void DrugarthsHunterSword1(){
        ItemStack item = new ItemStack(Material.GOLDEN_SWORD);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.WHITE+"Drugarth's Hunter Sword ["+ ChatColor.GREEN+"I"+ChatColor.WHITE+"]"));
        meta.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 1, true);
        meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 1, true);
        meta.addEnchant(Enchantment.DAMAGE_UNDEAD, 1, true);
        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getDrugarthsHunterSword1(), item);
        recipe.shape(" M ","BGA"," U ");
        recipe.setIngredient('M', MobEssence);
        recipe.setIngredient('B', BlazeEssence);
        recipe.setIngredient('A', ArachnidEssence);
        recipe.setIngredient('U', UndeadEssence);
        recipe.setIngredient('G', Material.GOLDEN_SWORD);
        Bukkit.getServer().addRecipe(recipe);
        Main.getCustomItems().put(Keys.getDrugarthsHunterSword1(), item);
    }

    private void DrugarthsHunterSword2(){
        ItemStack item = new ItemStack(Main.getCustomItems().get(Keys.getDrugarthsHunterSword1()));
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.WHITE+"Drugarth's Hunter Sword ["+ ChatColor.GREEN+"II"+ChatColor.WHITE+"]"));
        meta.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 2, true);
        meta.addEnchant(Enchantment.DAMAGE_UNDEAD, 2, true);
        meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 2, true);
        meta.addEnchant(Enchantment.DURABILITY, 2, true);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getDrugarthsHunterSword2(), item);
        recipe.shape(" M ","BGA"," U ");
        recipe.setIngredient('M', MobEssence);
        recipe.setIngredient('B', BlazeEssence);
        recipe.setIngredient('A', ArachnidEssence);
        recipe.setIngredient('U', UndeadEssence);
        recipe.setIngredient( 'G', Main.getCustomItems().get(Keys.getDrugarthsHunterSword1()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getCustomItems().put(Keys.getDrugarthsHunterSword2(), item);
    }

    private void DrugarthsHunterSword3(){
        ItemStack item = new ItemStack(Main.getCustomItems().get(Keys.getDrugarthsHunterSword2()));
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.WHITE+"Drugarth's Hunter Sword ["+ ChatColor.GREEN+"III"+ChatColor.WHITE+"]"));
        meta.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 3, true);
        meta.addEnchant(Enchantment.DAMAGE_UNDEAD, 3, true);
        meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 3, true);
        meta.addEnchant(Enchantment.DURABILITY, 3, true);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getDrugarthsHunterSword3(), item);
        recipe.shape(" M ","BGA"," U ");
        recipe.setIngredient('M', MobEssence);
        recipe.setIngredient('B', BlazeEssence);
        recipe.setIngredient('A', ArachnidEssence);
        recipe.setIngredient('U', UndeadEssence);
        recipe.setIngredient( 'G', Main.getCustomItems().get(Keys.getDrugarthsHunterSword2()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getCustomItems().put(Keys.getDrugarthsHunterSword3(), item);
    }

    private void DrugarthsHunterSword4(){
        ItemStack item = new ItemStack(Main.getCustomItems().get(Keys.getDrugarthsHunterSword3()));
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.WHITE+""+ChatColor.BOLD+"Drugarth's Hunter Sword ["+ ChatColor.GREEN+""+ChatColor.BOLD+"IV"+ChatColor.WHITE+""+ChatColor.BOLD+"]"));
        meta.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 4, true);
        meta.addEnchant(Enchantment.DAMAGE_UNDEAD, 4, true);
        meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 4, true);
        meta.addEnchant(Enchantment.DURABILITY, 4, true);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getDrugarthsHunterSword4(), item);
        recipe.shape(" M ","BGA"," U ");
        recipe.setIngredient('M', MobEssence);
        recipe.setIngredient('B', BlazeEssence);
        recipe.setIngredient('A', ArachnidEssence);
        recipe.setIngredient('U', UndeadEssence);
        recipe.setIngredient( 'G', Main.getCustomItems().get(Keys.getDrugarthsHunterSword3()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getCustomItems().put(Keys.getDrugarthsHunterSword4(), item);
    }

    private void DrugarthsHunterSword5(){
        ItemStack item = new ItemStack(Main.getCustomItems().get(Keys.getDrugarthsHunterSword4()));
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.WHITE+""+ChatColor.BOLD+"Drugarth's Hunter Sword ["+ ChatColor.GREEN+""+ChatColor.BOLD+"V"+ChatColor.WHITE+""+ChatColor.BOLD+"]"));
        meta.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 5, true);
        meta.addEnchant(Enchantment.DAMAGE_UNDEAD, 5, true);
        meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 5, true);
        meta.addEnchant(Enchantment.DURABILITY, 5, true);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getDrugarthsHunterSword5(), item);
        recipe.shape("UMU","BGB","AHA");
        recipe.setIngredient('M', ImbuedMobEssence);
        recipe.setIngredient('B', BlazeEssence);
        recipe.setIngredient('A', ArachnidEssence);
        recipe.setIngredient('U', UndeadEssence);
        recipe.setIngredient('H', ImbuedHardening);
        recipe.setIngredient( 'G', Main.getCustomItems().get(Keys.getDrugarthsHunterSword4()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getCustomItems().put(Keys.getDrugarthsHunterSword5(), item);
    }

    private void DrugarthsHunterSword10(){
        ItemStack item = new ItemStack(Main.getCustomItems().get(Keys.getDrugarthsHunterSword5()));
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.WHITE+""+ChatColor.BOLD+"Drugarth's Hunter Sword ["+ ChatColor.RED+""+ChatColor.BOLD+"X"+ChatColor.WHITE+""+ChatColor.BOLD+"]"));
        meta.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 10, true);
        meta.addEnchant(Enchantment.DAMAGE_UNDEAD, 10, true);
        meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 10, true);
        meta.removeEnchant(Enchantment.DURABILITY);
        meta.setUnbreakable(true);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getDrugarthsHunterSword10(), item);
        recipe.shape("UMU","BGB","AHA");
        recipe.setIngredient('M', ImbuedMobEssence);
        recipe.setIngredient('B', ImbuedBlaze);
        recipe.setIngredient('A', ImbuedArachnid);
        recipe.setIngredient('U', ImbuedUndead);
        recipe.setIngredient('H', ImbuedHardening);
        recipe.setIngredient( 'G', Main.getCustomItems().get(Keys.getDrugarthsHunterSword5()));
        Bukkit.getServer().addRecipe(recipe);
        Main.getCustomItems().put(Keys.getDrugarthsHunterSword10(), item);
    }
}
