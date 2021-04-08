package com.temmy.enchantupgrades.Recipes;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.UUID;

public class ObsidianMacuahuitl {

    public ObsidianMacuahuitl(){
        ItemStack item = new ItemStack(Material.NETHERITE_AXE);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.BLACK+""+ChatColor.MAGIC+"F"+ChatColor.DARK_PURPLE+""+
                ChatColor.BOLD+"Macuahuitl"+ChatColor.BLACK+""+ChatColor.MAGIC+"F"));
        meta.setCustomModelData(1);
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(),
                "generic.attack.damage", 15, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND));
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getObsidianMacuahuitl(), item);
        recipe.shape("OSO","OSO"," S ");
        recipe.setIngredient('O', Main.getCustomItems().get(Keys.getShatteredObsidian()));
        recipe.setIngredient('S', Material.STICK);
        Bukkit.getServer().addRecipe(recipe);
    }
}
