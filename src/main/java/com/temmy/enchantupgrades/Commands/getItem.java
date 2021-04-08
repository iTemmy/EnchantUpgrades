package com.temmy.enchantupgrades.Commands;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.Locale;

public class getItem implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        boolean p;
        Player player = null;
        Inventory inv = null;
        String dragonscale = "dragonscale";
        String legionnaire = "legionnaire";
        String sage = "sage";
        String scale = "scale";
        String thief = "thief";
        String tribal = "tribal";
        if (sender instanceof Player) {
            player = (Player) sender;
            inv = player.getInventory();
            p = true;
        }
        if (args[0] != null) {
            inv = Bukkit.getPlayer(args[0]).getInventory();
        }
        if (args != null){
            if (args[1].equalsIgnoreCase("armor")){
                if (args[2].equalsIgnoreCase("set")){
                    if (args[3].equalsIgnoreCase(dragonscale)){
                        if (player != null){
                            inv.addItem(Main.getCustomArmor().get(Keys.getDragonScaleHelmet()));
                            inv.addItem(Main.getCustomArmor().get(Keys.getDragonScaleChestplate()));
                            inv.addItem(Main.getCustomArmor().get(Keys.getDragonScaleLeggings()));
                            inv.addItem(Main.getCustomArmor().get(Keys.getDragonScaleBoots()));
                            return true;
                        }
                    }else if (args[3].equalsIgnoreCase(legionnaire)){
                        if (player != null){
                            inv.addItem(Main.getCustomArmor().get(Keys.getLegionnaireHelmet()));
                            inv.addItem(Main.getCustomArmor().get(Keys.getLegionnaireChestplate()));
                            inv.addItem(Main.getCustomArmor().get(Keys.getLegionnaireLeggings()));
                            inv.addItem(Main.getCustomArmor().get(Keys.getLegionnaireBoots()));
                            return true;
                        }
                    }else if (args[3].equalsIgnoreCase(sage)){
                        if (player != null){
                            inv.addItem(Main.getCustomArmor().get(Keys.getSageHelmet()));
                            inv.addItem(Main.getCustomArmor().get(Keys.getSageChestplate()));
                            inv.addItem(Main.getCustomArmor().get(Keys.getSageLeggings()));
                            inv.addItem(Main.getCustomArmor().get(Keys.getSageBoots()));
                            return true;
                        }
                    }else if (args[3].equalsIgnoreCase(scale)){
                        if (player != null){
                            inv.addItem(Main.getCustomArmor().get(Keys.getScaleHelmet()));
                            inv.addItem(Main.getCustomArmor().get(Keys.getScaleChestplate()));
                            inv.addItem(Main.getCustomArmor().get(Keys.getScaleLeggings()));
                            inv.addItem(Main.getCustomArmor().get(Keys.getScaleBoots()));
                            return true;
                        }
                    }else if (args[3].equalsIgnoreCase(thief)){
                        if (player != null){
                            inv.addItem(Main.getCustomArmor().get(Keys.getThiefHelmet()));
                            inv.addItem(Main.getCustomArmor().get(Keys.getThiefChestplate()));
                            inv.addItem(Main.getCustomArmor().get(Keys.getThiefLeggings()));
                            inv.addItem(Main.getCustomArmor().get(Keys.getThiefBoots()));
                            return true;
                        }
                    }else if (args[3].equalsIgnoreCase(tribal)){
                        if (player != null){
                            inv.addItem(Main.getCustomArmor().get(Keys.getTribalHelmet()));
                            inv.addItem(Main.getCustomArmor().get(Keys.getTribalChestplate()));
                            inv.addItem(Main.getCustomArmor().get(Keys.getTribalLeggings()));
                            inv.addItem(Main.getCustomArmor().get(Keys.getTribalBoots()));
                            return true;
                        }
                    }
                }else if (args[2].equalsIgnoreCase("helmet")){
                    if (args.length >=5){
                        armor("helmet", args[3].toLowerCase(), inv, Integer.parseInt(args[4]));
                    }else {
                        armor("helmet", args[3].toLowerCase(), inv, 1);
                    }
                    return true;
                }else if (args[2].equalsIgnoreCase("chestplate")){
                    if (args.length >=5){
                        armor("chestplate", args[3].toLowerCase(), inv, Integer.parseInt(args[4]));
                    }else {
                        armor("chestplate", args[3].toLowerCase(), inv, 1);
                    }
                    return true;
                }else if (args[2].equalsIgnoreCase("leggings")){
                    if (args.length >= 5){
                        armor("leggings", args[3].toLowerCase(), inv, Integer.parseInt(args[4]));
                    }else {
                        armor("leggings", args[3].toLowerCase(), inv, 1);
                    }
                    return true;
                }else if (args[2].equalsIgnoreCase("boots")){
                    if (args.length >= 5){
                        armor("boots", args[3].toLowerCase(), inv, Integer.parseInt(args[4]));
                    }else {
                        armor("boots", args[3].toLowerCase(), inv, 1);
                    }
                    return true;
                }else{
                    sender.sendMessage("[Enchant Upgrades] Error: No armor found by that name.");
                }
            }else if (args[1].equalsIgnoreCase("ore")){
                if (args[2].equalsIgnoreCase("ellendyte")){
                    ItemStack item = Main.getCustomItems().get(Keys.getEllendyte());
                    if (args.length >= 4)
                        item.setAmount(Integer.parseInt(args[3]));
                    inv.addItem(item);
                    return true;
                }else if (args[2].equalsIgnoreCase("corinthium")){
                    ItemStack item = (Main.getCustomItems().get(Keys.getCorinthium()));
                    if (args.length >= 4)
                        item.setAmount(Integer.parseInt(args[3]));
                    inv.addItem(item);
                    return true;
                }else if (args[2].equalsIgnoreCase("jolixanine")){
                    ItemStack item = (Main.getCustomItems().get(Keys.getJolixanine()));
                    if (args.length >= 4)
                        item.setAmount(Integer.parseInt(args[3]));
                    inv.addItem(item);
                    return true;
                }else if (args[2].equalsIgnoreCase("phosphorus")){
                    ItemStack item =(Main.getCustomItems().get(Keys.getPhosphorus()));
                    if (args.length >= 4)
                        item.setAmount(Integer.parseInt(args[3]));
                    inv.addItem(item);
                    return true;
                }else if (args[2].equalsIgnoreCase("tungsten")){
                    ItemStack item =(Main.getCustomItems().get(Keys.getTungsten()));
                    if (args.length >= 4)
                        item.setAmount(Integer.parseInt(args[3]));
                    inv.addItem(item);
                    return true;
                }else if (args[2].equalsIgnoreCase("sapphire")){
                    ItemStack item =(Main.getCustomItems().get(Keys.getSapphire()));
                    if (args.length >= 4)
                        item.setAmount(Integer.parseInt(args[3]));
                    inv.addItem(item);
                    return true;
                }else if (args[2].equalsIgnoreCase("zinc")){
                    ItemStack item =(Main.getCustomItems().get(Keys.getZinc()));
                    if (args.length >= 4)
                        item.setAmount(Integer.parseInt(args[3]));
                    inv.addItem(item);
                    return true;
                }else if (args[2].equalsIgnoreCase("janelite")){
                    ItemStack item =Main.getCustomItems().get(Keys.getJanelite());
                    if (args.length >= 4)
                        item.setAmount(Integer.parseInt(args[3]));
                    inv.addItem(item);
                    return true;
                }else{
                    sender.sendMessage("[Enchant Upgrades] Error: No ore found by that name.");
                }
            } else if (args[1].equalsIgnoreCase("enchant")) {
                if (args[2].equalsIgnoreCase("protection")){

                }else if (args[2].equalsIgnoreCase("fire_protection")){

                }else if (args[2].equalsIgnoreCase("feather_falling")){

                }else if (args[2].equalsIgnoreCase("blast_protection")){

                }
            }
        }else{
            sender.sendMessage("[Enchant Upgrades] Error: No arguments provided!");
        }
        return false;
    }

    private static void armor(String piece, String set, Inventory inv, int amount){
        boolean helm = false;
        boolean chestplate = false;
        boolean leggings = false;
        boolean boots = false;
        boolean dragonscale = false;
        boolean legionnaire = false;
        boolean sage = false;
        boolean scale = false;
        boolean thief = false;
        boolean tribal = false;
        ItemStack item = null;
        switch (piece){
            case "helmet":
                helm = true;
                break;
            case "chestplate":
                chestplate = true;
                break;
            case "leggings":
                leggings = true;
                break;
            case "boots":
                boots = true;
                break;
        }
        switch (set){
            case "dragonscale":
                dragonscale = true;
                break;
            case "legionnaire":
                legionnaire = true;
                break;
            case "sage":
                sage = true;
                break;
            case "scale":
                scale = true;
                break;
            case "thief":
                thief = true;
                break;
            case "tribal":
                tribal = true;
                break;
        }
        if (helm){
            if (dragonscale){
                item = Main.getCustomArmor().get(Keys.getDragonScaleHelmet());
            }else if (legionnaire){
                item = Main.getCustomArmor().get(Keys.getLegionnaireHelmet());
            }else if (sage){
                item = Main.getCustomArmor().get(Keys.getSageHelmet());
            }else if (scale){
                item = Main.getCustomArmor().get(Keys.getScaleHelmet());
            }else if (thief){
                item = Main.getCustomArmor().get(Keys.getThiefHelmet());
            }else if (tribal){
                item = Main.getCustomArmor().get(Keys.getTribalHelmet());
            }
        }else if (chestplate){
            if (dragonscale){
                item = Main.getCustomArmor().get(Keys.getDragonScaleChestplate());
            }else if (legionnaire){
                item = Main.getCustomArmor().get(Keys.getLegionnaireChestplate());
            }else if (sage){
                item = Main.getCustomArmor().get(Keys.getSageChestplate());
            }else if (scale){
                item = Main.getCustomArmor().get(Keys.getScaleChestplate());
            }else if (thief){
                item = Main.getCustomArmor().get(Keys.getThiefChestplate());
            }else if (tribal){
                item = Main.getCustomArmor().get(Keys.getTribalChestplate());
            }
        }else if (leggings){
            if (dragonscale){
                item = Main.getCustomArmor().get(Keys.getDragonScaleLeggings());
            }else if (legionnaire){
                item = Main.getCustomArmor().get(Keys.getLegionnaireLeggings());
            }else if (sage){
                item = Main.getCustomArmor().get(Keys.getSageLeggings());
            }else if (scale){
                item = Main.getCustomArmor().get(Keys.getScaleLeggings());
            }else if (thief){
                item = Main.getCustomArmor().get(Keys.getThiefLeggings());
            }else if (tribal){
                item = Main.getCustomArmor().get(Keys.getTribalLeggings());
            }
        }else if (boots){
            if (dragonscale){
                item = Main.getCustomArmor().get(Keys.getDragonScaleBoots());
            }else if (legionnaire){
                item = Main.getCustomArmor().get(Keys.getLegionnaireBoots());
            }else if (sage){
                item = Main.getCustomArmor().get(Keys.getSageBoots());
            }else if (scale){
                item = Main.getCustomArmor().get(Keys.getScaleBoots());
            }else if (thief){
                item = Main.getCustomArmor().get(Keys.getThiefBoots());
            }else if (tribal){
                item = Main.getCustomArmor().get(Keys.getTribalBoots());
            }
        }
        if (item != null) {
            item.setAmount(amount);
            inv.addItem(item);
        }
    }
}
