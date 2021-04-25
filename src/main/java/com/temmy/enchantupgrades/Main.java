package com.temmy.enchantupgrades;

import com.temmy.enchantupgrades.Commands.getItem;
import com.temmy.enchantupgrades.Events.onBlockBreakEvent;
import com.temmy.enchantupgrades.Events.onCraftItemEvent;
import com.temmy.enchantupgrades.Events.onPlayerArmorChangeEvent;
import com.temmy.enchantupgrades.Events.onPlayerJoinEvent;
import com.temmy.enchantupgrades.Recipes.Armor.DragonScale.Dragonscale;
import com.temmy.enchantupgrades.Recipes.Armor.Legionnaire.Legionnaire;
import com.temmy.enchantupgrades.Recipes.Armor.Sage.Sage;
import com.temmy.enchantupgrades.Recipes.Armor.Scale.Scale;
import com.temmy.enchantupgrades.Recipes.Armor.Theif.Thief;
import com.temmy.enchantupgrades.Recipes.Armor.Tribal.Tribal;
import com.temmy.enchantupgrades.Recipes.CustomOres;
import com.temmy.enchantupgrades.Recipes.Enchants.*;
import com.temmy.enchantupgrades.Recipes.Essences;
import com.temmy.enchantupgrades.Recipes.ImbuedEssences;
import com.temmy.enchantupgrades.Recipes.ObsidianMacuahuitl;
import com.temmy.enchantupgrades.Recipes.Weapons.DrugarthsHunterSword;
import com.temmy.enchantupgrades.TabCompletions.getItemTabCompleter;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.Map;

public final class Main extends JavaPlugin {

    private static Main _instance = null;
    private static Map<NamespacedKey, ItemStack> Essences = new HashMap<NamespacedKey, ItemStack>();
    private static Map<NamespacedKey, ItemStack> ImbuedEssences = new HashMap<NamespacedKey, ItemStack>();
    private static Map<NamespacedKey, ItemStack> Enchants = new HashMap<NamespacedKey, ItemStack>();
    private static Map<NamespacedKey, ItemStack> CustomItems = new HashMap<NamespacedKey, ItemStack>();
    private static Map<NamespacedKey, ItemStack> CustomArmor = new HashMap<NamespacedKey, ItemStack>();

    public static Map<NamespacedKey, ItemStack> getEssences(){
        return Essences;
    }
    public static Map<NamespacedKey, ItemStack> getImbuedEssences(){
        return ImbuedEssences;
    }
    public static Map<NamespacedKey, ItemStack> getEnchants(){
        return Enchants;
    }
    public static Map<NamespacedKey, ItemStack> getCustomItems(){
        return CustomItems;
    }
    public static Map<NamespacedKey, ItemStack> getCustomArmor() {
        return CustomArmor;
    }


    @Override
    public void onEnable() {
        // Plugin startup logic
        _instance = this;
        LoadCustomRecipes();
        getCommand("getitem").setExecutor(new getItem());
        getCommand("getitem").setTabCompleter(new getItemTabCompleter());
        getServer().getPluginManager().registerEvents(new onCraftItemEvent(), this);
        getServer().getPluginManager().registerEvents(new onBlockBreakEvent(), this);
        getServer().getPluginManager().registerEvents(new onPlayerJoinEvent(), this);
        getServer().getPluginManager().registerEvents(new onPlayerArmorChangeEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static Main getInstance(){
        return _instance;
    }

    private static void LoadCustomRecipes(){
        new CustomOres();
        new Essences();
        new ImbuedEssences();
        new Thorns();
        new FeatherFalling();
        new DepthStrider();
        new FrostWalker();
        new Lure();
        new Respiration();
        new Punch();
        new Knockback();
        new AquaAffinity();
        new Looting();
        new Infinity();
        new Flame();
        new Fortune();
        new Mending();
        new Unbreaking();
        new SilkTouch();
        new Efficiency();
        new Power();
        new Smite();
        new BaneOfArthropods();
        new Sharpness();
        new BlastProtection();
        new ProjectileProtection();
        new FireProtection();
        new Protection();
        new Channeling();
        new CurseOfVanishing();
        new FireAspect();
        new Multishot();
        new CurseOfBinding();
        new SweepingEdge();
        new Piercing();
        new QuickCharge();
        new Riptide();
        new Loyalty();
        new Impaling();
        new LuckOfTheSea();
        new SoulSpeed();
        new Legionnaire();
        new Thief();
        new Tribal();
        new Sage();
        new Scale();
        new Dragonscale();
        new ObsidianMacuahuitl();
        new DrugarthsHunterSword();
    }
}
