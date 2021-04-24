package com.temmy.enchantupgrades.Commands;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class getItem implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender.hasPermission("enchantupgrades.getitem")) {
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
            if (args != null) {
                if (args[1].equalsIgnoreCase("armor")) {
                    if (args[2].equalsIgnoreCase("set")) {
                        if (args[3].equalsIgnoreCase(dragonscale)) {
                            if (player != null) {
                                armor("helmet", "dragonscale", inv, Integer.parseInt(args[4]));
                                armor("chestplate", "dragonscale", inv, Integer.parseInt(args[4]));
                                armor("leggings", "dragonscale", inv, Integer.parseInt(args[4]));
                                armor("boots", "dragonscale", inv, Integer.parseInt(args[4]));
                                return true;
                            }
                        } else if (args[3].equalsIgnoreCase(legionnaire)) {
                            if (player != null) {
                                armor("helmet", "legionnaire", inv, Integer.parseInt(args[4]));
                                armor("chestplate", "legionnaire", inv, Integer.parseInt(args[4]));
                                armor("leggings", "legionnaire", inv, Integer.parseInt(args[4]));
                                armor("boots", "legionnaire", inv, Integer.parseInt(args[4]));
                                return true;
                            }
                        } else if (args[3].equalsIgnoreCase(sage)) {
                            if (player != null) {
                                armor("helmet", "sage", inv, Integer.parseInt(args[4]));
                                armor("chestplate", "sage", inv, Integer.parseInt(args[4]));
                                armor("leggings", "sage", inv, Integer.parseInt(args[4]));
                                armor("boots", "sage", inv, Integer.parseInt(args[4]));
                                return true;
                            }
                        } else if (args[3].equalsIgnoreCase(scale)) {
                            if (player != null) {
                                armor("helmet", "scale", inv, Integer.parseInt(args[4]));
                                armor("chestplate", "scale", inv, Integer.parseInt(args[4]));
                                armor("leggings", "scale", inv, Integer.parseInt(args[4]));
                                armor("boots", "scale", inv, Integer.parseInt(args[4]));
                                return true;
                            }
                        } else if (args[3].equalsIgnoreCase(thief)) {
                            if (player != null) {
                                armor("helmet", "thief", inv, Integer.parseInt(args[4]));
                                armor("chestplate", "thief", inv, Integer.parseInt(args[4]));
                                armor("leggings", "thief", inv, Integer.parseInt(args[4]));
                                armor("boot", "thief", inv, Integer.parseInt(args[4]));
                                return true;
                            }
                        } else if (args[3].equalsIgnoreCase(tribal)) {
                            if (player != null) {
                                armor("helmet", "tribal", inv, Integer.parseInt(args[4]));
                                armor("chestplate", "tribal", inv, Integer.parseInt(args[4]));
                                armor("leggings", "tribal", inv, Integer.parseInt(args[4]));
                                armor("boots", "tribal", inv, Integer.parseInt(args[4]));
                                return true;
                            }
                        }
                    } else if (args[2].equalsIgnoreCase("helmet")) {
                        if (args.length >= 5) {
                            armor("helmet", args[3].toLowerCase(), inv, Integer.parseInt(args[4]));
                        } else {
                            armor("helmet", args[3].toLowerCase(), inv, 1);
                        }
                        return true;
                    } else if (args[2].equalsIgnoreCase("chestplate")) {
                        if (args.length >= 5) {
                            armor("chestplate", args[3].toLowerCase(), inv, Integer.parseInt(args[4]));
                        } else {
                            armor("chestplate", args[3].toLowerCase(), inv, 1);
                        }
                        return true;
                    } else if (args[2].equalsIgnoreCase("leggings")) {
                        if (args.length >= 5) {
                            armor("leggings", args[3].toLowerCase(), inv, Integer.parseInt(args[4]));
                        } else {
                            armor("leggings", args[3].toLowerCase(), inv, 1);
                        }
                        return true;
                    } else if (args[2].equalsIgnoreCase("boots")) {
                        if (args.length >= 5) {
                            armor("boots", args[3].toLowerCase(), inv, Integer.parseInt(args[4]));
                        } else {
                            armor("boots", args[3].toLowerCase(), inv, 1);
                        }
                        return true;
                    } else {
                        sender.sendMessage("[Enchant Upgrades] Error: No armor found by that name.");
                    }
                } else if (args[1].equalsIgnoreCase("ore")) {
                    if (args[2].equalsIgnoreCase("ellendyte")) {
                        ItemStack item = Main.getCustomItems().get(Keys.getEllendyte());
                        if (args.length >= 4)
                            item.setAmount(Integer.parseInt(args[3]));
                        inv.addItem(item);
                        return true;
                    } else if (args[2].equalsIgnoreCase("corinthium")) {
                        ItemStack item = (Main.getCustomItems().get(Keys.getCorinthium()));
                        if (args.length >= 4)
                            item.setAmount(Integer.parseInt(args[3]));
                        inv.addItem(item);
                        return true;
                    } else if (args[2].equalsIgnoreCase("jolixanine")) {
                        ItemStack item = (Main.getCustomItems().get(Keys.getJolixanine()));
                        if (args.length >= 4)
                            item.setAmount(Integer.parseInt(args[3]));
                        inv.addItem(item);
                        return true;
                    } else if (args[2].equalsIgnoreCase("phosphorus")) {
                        ItemStack item = (Main.getCustomItems().get(Keys.getPhosphorus()));
                        if (args.length >= 4)
                            item.setAmount(Integer.parseInt(args[3]));
                        inv.addItem(item);
                        return true;
                    } else if (args[2].equalsIgnoreCase("tungsten")) {
                        ItemStack item = (Main.getCustomItems().get(Keys.getTungsten()));
                        if (args.length >= 4)
                            item.setAmount(Integer.parseInt(args[3]));
                        inv.addItem(item);
                        return true;
                    } else if (args[2].equalsIgnoreCase("sapphire")) {
                        ItemStack item = (Main.getCustomItems().get(Keys.getSapphire()));
                        if (args.length >= 4)
                            item.setAmount(Integer.parseInt(args[3]));
                        inv.addItem(item);
                        return true;
                    } else if (args[2].equalsIgnoreCase("zinc")) {
                        ItemStack item = (Main.getCustomItems().get(Keys.getZinc()));
                        if (args.length >= 4)
                            item.setAmount(Integer.parseInt(args[3]));
                        inv.addItem(item);
                        return true;
                    } else if (args[2].equalsIgnoreCase("janelite")) {
                        ItemStack item = Main.getCustomItems().get(Keys.getJanelite());
                        if (args.length >= 4)
                            item.setAmount(Integer.parseInt(args[3]));
                        inv.addItem(item);
                        return true;
                    } else {
                        sender.sendMessage("[Enchant Upgrades] Error: No ore found by that name.");
                    }
                } else if (args[1].equalsIgnoreCase("enchant")) {
                    if (args[2] != null) {
                        String enchantName = args[2];
                        int level = 1;
                        if (args[3] != null) {
                            level = Integer.parseInt(args[3]);
                        }
                        if (enchantName.equalsIgnoreCase("protection")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("protection", level)));
                        } else if (enchantName.equalsIgnoreCase("fire_protection")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("fire_protection", level)));
                        } else if (enchantName.equalsIgnoreCase("feather_falling")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("feather_falling", level)));
                        } else if (enchantName.equalsIgnoreCase("blast_protection")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("blast_protection", level)));
                        } else if (enchantName.equalsIgnoreCase("projectile_protection")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("projectile_protection", level)));
                        } else if (enchantName.equalsIgnoreCase("respiration")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("respiration", level)));
                        } else if (enchantName.equalsIgnoreCase("aqua_affinity")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("aqua_affinity", level)));
                        } else if (enchantName.equalsIgnoreCase("thorns")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("thorns", level)));
                        } else if (enchantName.equalsIgnoreCase("depth_strider")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("depth_strider", level)));
                        } else if (enchantName.equalsIgnoreCase("frost_walker")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("frost_walker", level)));
                        } else if (enchantName.equalsIgnoreCase("curse_binding")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("curse_binding", level)));
                        } else if (enchantName.equalsIgnoreCase("sharpness")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("sharpness", level)));
                        } else if (enchantName.equalsIgnoreCase("smite")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("smite", level)));
                        } else if (enchantName.equalsIgnoreCase("bane_of_arthropods")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("bane_of_arthropods", level)));
                        } else if (enchantName.equalsIgnoreCase("knockback")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("knockback", level)));
                        } else if (enchantName.equalsIgnoreCase("fire_aspect")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("fire_aspect", level)));
                        } else if (enchantName.equalsIgnoreCase("looting")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("looting", level)));
                        } else if (enchantName.equalsIgnoreCase("sweeping_edge")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("sweeping_edge", level)));
                        } else if (enchantName.equalsIgnoreCase("efficiency")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("efficiency", level)));
                        } else if (enchantName.equalsIgnoreCase("silk_touch")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("silk_touch", level)));
                        } else if (enchantName.equalsIgnoreCase("unbreaking")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("unbreaking", level)));
                        } else if (enchantName.equalsIgnoreCase("fortune")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("fortune", level)));
                        } else if (enchantName.equalsIgnoreCase("power")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("power", level)));
                        } else if (enchantName.equalsIgnoreCase("punch")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("punch", level)));
                        } else if (enchantName.equalsIgnoreCase("flame")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("flame", level)));
                        } else if (enchantName.equalsIgnoreCase("infinity")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("infinity", level)));
                        } else if (enchantName.equalsIgnoreCase("luck_of_the_sea")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("luck_of_the_sea", level)));
                        } else if (enchantName.equalsIgnoreCase("lure")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("lure", level)));
                        } else if (enchantName.equalsIgnoreCase("loyalty")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("loyalty", level)));
                        } else if (enchantName.equalsIgnoreCase("impaling")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("impaling", level)));
                        } else if (enchantName.equalsIgnoreCase("riptide")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("riptide", level)));
                        } else if (enchantName.equalsIgnoreCase("channeling")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("channeling", level)));
                        } else if (enchantName.equalsIgnoreCase("multishot")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("multishot", level)));
                        } else if (enchantName.equalsIgnoreCase("quick_charge")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("quick_charge", level)));
                        } else if (enchantName.equalsIgnoreCase("piercing")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("piercing", level)));
                        } else if (enchantName.equalsIgnoreCase("mending")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("mending", level)));
                        } else if (enchantName.equalsIgnoreCase("curse_vanishing")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("curse_vanish", level)));
                        } else if (enchantName.equalsIgnoreCase("soul_speed")) {
                            inv.addItem(Main.getEnchants().get(EnchantLevelKeys("soul_speed", level)));
                        }
                    }
                }
            } else {
                sender.sendMessage("[Enchant Upgrades] Error: No arguments provided!");
            }
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

    private static NamespacedKey EnchantLevelKeys(String enchantName, int enchantLevel){
        if ((enchantName != null) && enchantLevel > 0) {
            if (enchantName.equalsIgnoreCase("protection")) {
                switch (enchantLevel) {
                    case 1:
                        return Keys.getProtection1();
                    case 2:
                        return Keys.getProtection2();
                    case 3:
                        return Keys.getProtection3();
                    case 4:
                        return Keys.getProtection4();
                    case 5:
                        return Keys.getProtection5();
                    case 6:
                        return Keys.getProtection6();
                    case 7:
                        return Keys.getProtection7();
                }
            } else if (enchantName.equalsIgnoreCase("fire_protection")) {
                switch (enchantLevel) {
                    case 1:
                        return Keys.getFireProtection1();
                    case 2:
                        return Keys.getFireProtection2();
                    case 3:
                        return Keys.getFireProtection3();
                    case 4:
                        return Keys.getFireProtection4();
                    case 5:
                        return Keys.getFireProtection5();
                    case 6:
                        return Keys.getFireProtection6();
                    case 7:
                        return Keys.getFireProtection7();
                }
            } else if (enchantName.equalsIgnoreCase("feather_falling")) {
                switch (enchantLevel) {
                    case 1:
                        return Keys.getFeatherFalling1();
                    case 2:
                        return Keys.getFeatherFalling2();
                    case 3:
                        return Keys.getFeatherFalling3();
                    case 4:
                        return Keys.getFeatherFalling4();
                    case 5:
                        return Keys.getFeatherFalling5();
                    case 6:
                        return Keys.getFeatherFalling6();
                    case 7:
                        return Keys.getFeatherFalling7();
                }
            } else if (enchantName.equalsIgnoreCase("blast_protection")) {
                switch (enchantLevel) {
                    case 1:
                        return Keys.getBlastProtection1();
                    case 2:
                        return Keys.getBlastProtection2();
                    case 3:
                        return Keys.getBlastProtection3();
                    case 4:
                        return Keys.getBlastProtection4();
                    case 5:
                        return Keys.getBlastProtection5();
                    case 6:
                        return Keys.getBlastProtection6();
                    case 7:
                        return Keys.getBlastProtection7();
                }
            } else if (enchantName.equalsIgnoreCase("projectile_protection")) {
                switch (enchantLevel) {
                    case 1:
                        return Keys.getProjectileProtection1();
                    case 2:
                        return Keys.getProjectileProtection2();
                    case 3:
                        return Keys.getProjectileProtection3();
                    case 4:
                        return Keys.getProjectileProtection4();
                    case 5:
                        return Keys.getProjectileProtection5();
                    case 6:
                        return Keys.getProjectileProtection6();
                    case 7:
                        return Keys.getProjectileProtection7();
                }
            } else if (enchantName.equalsIgnoreCase("respiration")) {
                switch (enchantLevel) {
                    case 1:
                        return Keys.getRespiration1();
                    case 2:
                        return Keys.getRespiration2();
                    case 3:
                        return Keys.getRespiration3();
                    case 4:
                        return Keys.getRespiration4();
                    case 5:
                        return Keys.getRespiration5();
                }
            } else if (enchantName.equalsIgnoreCase("aqua_affinity")) {
                return Keys.getAquaAffinity1();
            } else if (enchantName.equalsIgnoreCase("thorns")) {
                switch (enchantLevel) {
                    case 1:
                        return Keys.getThorns1();
                    case 2:
                        return Keys.getThorns2();
                    case 3:
                        return Keys.getThorns3();
                    case 4:
                        return Keys.getThorns4();
                    case 5:
                        return Keys.getThorns5();
                }
            } else if (enchantName.equalsIgnoreCase("depth_strider")) {
                switch (enchantLevel) {
                    case 1:
                        return Keys.getDepthStrider1();
                    case 2:
                        return Keys.getDepthStrider2();
                    case 3:
                        return Keys.getDepthStrider3();
                    case 4:
                        return Keys.getDepthStrider4();
                    case 5:
                        return Keys.getDepthStrider5();
                }
            } else if (enchantName.equalsIgnoreCase("frost_walker")) {
                switch (enchantLevel) {
                    case 1:
                        return Keys.getFrostWalker1();
                    case 2:
                        return Keys.getFrostWalker2();
                    case 3:
                        return Keys.getFrostWalker3();
                }
            } else if (enchantName.equalsIgnoreCase("curse_binding")) {
                return Keys.getCurseOfBinding();
            } else if (enchantName.equalsIgnoreCase("sharpness")) {
                switch (enchantLevel) {
                    case 1:
                        return Keys.getSharpness1();
                    case 2:
                        return Keys.getSharpness2();
                    case 3:
                        return Keys.getSharpness3();
                    case 4:
                        return Keys.getSharpness4();
                    case 5:
                        return Keys.getSharpness5();
                    case 6:
                        return Keys.getSharpness6();
                    case 7:
                        return Keys.getSharpness7();
                    case 8:
                        return Keys.getSharpness8();
                }
            } else if (enchantName.equalsIgnoreCase("smite")) {
                switch (enchantLevel) {
                    case 1:
                        return Keys.getSmite1();
                    case 2:
                        return Keys.getSmite2();
                    case 3:
                        return Keys.getSmite3();
                    case 4:
                        return Keys.getSmite4();
                    case 5:
                        return Keys.getSmite5();
                    case 6:
                        return Keys.getSmite6();
                    case 7:
                        return Keys.getSmite7();
                    case 8:
                        return Keys.getSmite8();
                }
            } else if (enchantName.equalsIgnoreCase("bane_of_arthropods")) {
                switch (enchantLevel) {
                    case 1:
                        return Keys.getBaneOfArthropods1();
                    case 2:
                        return Keys.getBaneOfArthropods2();
                    case 3:
                        return Keys.getBaneOfArthropods3();
                    case 4:
                        return Keys.getBaneOfArthropods4();
                    case 5:
                        return Keys.getBaneOfArthropods5();
                    case 6:
                        return Keys.getBaneOfArthropods6();
                    case 7:
                        return Keys.getBaneOfArthropods7();
                    case 8:
                        return Keys.getBaneOfArthropods8();
                }
            } else if (enchantName.equalsIgnoreCase("knockback")) {
                switch (enchantLevel) {
                    case 1:
                        return Keys.getKnockback1();
                    case 2:
                        return Keys.getKnockback2();
                    case 3:
                        return Keys.getKnockback3();
                }
            } else if (enchantName.equalsIgnoreCase("fire_aspect")) {
                switch (enchantLevel) {
                    case 1:
                        return Keys.getFireAspect1();
                    case 2:
                        return Keys.getFireAspect2();
                    case 3:
                        return Keys.getFireAspect3();
                }
            } else if (enchantName.equalsIgnoreCase("looting")) {
                switch (enchantLevel) {
                    case 1:
                        return Keys.getLooting1();
                    case 2:
                        return Keys.getLooting2();
                    case 3:
                        return Keys.getLooting3();
                    case 4:
                        return Keys.getLooting4();
                    case 5:
                        return Keys.getLooting5();
                }
            } else if (enchantName.equalsIgnoreCase("sweeping_edge")) {
                switch (enchantLevel) {
                    case 1:
                        return Keys.getSweepingEdge1();
                    case 2:
                        return Keys.getSweepingEdge2();
                    case 3:
                        return Keys.getSweepingEdge3();
                    case 4:
                        return Keys.getSweepingEdge4();
                    case 5:
                        return Keys.getSweepingEdge5();
                }
            } else if (enchantName.equalsIgnoreCase("efficiency")) {
                switch (enchantLevel) {
                    case 1:
                        return Keys.getEfficiency1();
                    case 2:
                        return Keys.getEfficiency2();
                    case 3:
                        return Keys.getEfficiency3();
                    case 4:
                        return Keys.getEfficiency4();
                    case 5:
                        return Keys.getEfficiency5();
                    case 6:
                        return Keys.getEfficiency6();
                    case 7:
                        return Keys.getEfficiency7();
                    case 8:
                        return Keys.getEfficiency8();
                }
            } else if (enchantName.equalsIgnoreCase("silk_touch")) {
                return Keys.getSilkTouch1();
            } else if (enchantName.equalsIgnoreCase("unbreaking")) {
                switch (enchantLevel) {
                    case 1:
                        return Keys.getUnbreaking1();
                    case 2:
                        return Keys.getUnbreaking2();
                    case 3:
                        return Keys.getUnbreaking3();
                    case 4:
                        return Keys.getUnbreaking4();
                    case 5:
                        return Keys.getUnbreaking5();
                }
            } else if (enchantName.equalsIgnoreCase("fortune")) {
                switch (enchantLevel) {
                    case 1:
                        return Keys.getFortune1();
                    case 2:
                        return Keys.getFortune2();
                    case 3:
                        return Keys.getFortune3();
                    case 4:
                        return Keys.getFortune4();
                    case 5:
                        return Keys.getFortune5();
                }
            } else if (enchantName.equalsIgnoreCase("power")) {
                switch (enchantLevel) {
                    case 1:
                        return Keys.getPower1();
                    case 2:
                        return Keys.getPower2();
                    case 3:
                        return Keys.getPower3();
                    case 4:
                        return Keys.getPower4();
                    case 5:
                        return Keys.getPower5();
                    case 6:
                        return Keys.getPower6();
                    case 7:
                        return Keys.getPower7();
                    case 8:
                        return Keys.getPower8();
                }
            } else if (enchantName.equalsIgnoreCase("punch")) {
                switch (enchantLevel) {
                    case 1:
                        return Keys.getPunch1();
                    case 2:
                        return Keys.getPunch2();
                    case 3:
                        return Keys.getPunch3();
                }
            } else if (enchantName.equalsIgnoreCase("flame")) {
                return Keys.getFlame1();
            } else if (enchantName.equalsIgnoreCase("infinity")) {
                return Keys.getInfinity1();
            } else if (enchantName.equalsIgnoreCase("luck_of_the_sea")) {
                switch (enchantLevel) {
                    case 1:
                        return Keys.getLuckOfTheSea1();
                    case 2:
                        return Keys.getLuckOfTheSea2();
                    case 3:
                        return Keys.getLuckOfTheSea3();
                    case 4:
                        return Keys.getLuckOfTheSea4();
                    case 5:
                        return Keys.getLuckOfTheSea5();
                }
            } else if (enchantName.equalsIgnoreCase("lure")) {
                switch (enchantLevel) {
                    case 1:
                        return Keys.getLure1();
                    case 2:
                        return Keys.getLure2();
                    case 3:
                        return Keys.getLure3();
                    case 4:
                        return Keys.getLure4();
                    case 5:
                        return Keys.getLure5();
                }
            } else if (enchantName.equalsIgnoreCase("loyalty")) {
                switch (enchantLevel) {
                    case 1:
                        return Keys.getLoyalty1();
                    case 2:
                        return Keys.getLoyalty2();
                    case 3:
                        return Keys.getLoyalty3();
                    case 4:
                        return Keys.getLoyalty4();
                    case 5:
                        return Keys.getLoyalty5();
                }
            } else if (enchantName.equalsIgnoreCase("impaling")) {
                switch (enchantLevel) {
                    case 1:
                        return Keys.getImpaling1();
                    case 2:
                        return Keys.getImpaling2();
                    case 3:
                        return Keys.getImpaling3();
                    case 4:
                        return Keys.getImpaling4();
                    case 5:
                        return Keys.getImpaling5();
                    case 6:
                        return Keys.getImpaling6();
                    case 7:
                        return Keys.getImpaling7();
                    case 8:
                        return Keys.getImpaling8();
                }
            } else if (enchantName.equalsIgnoreCase("riptide")) {
                switch (enchantLevel) {
                    case 1:
                        return Keys.getRiptide1();
                    case 2:
                        return Keys.getRiptide2();
                    case 3:
                        return Keys.getRiptide3();
                    case 4:
                        return Keys.getRiptide4();
                    case 5:
                        return Keys.getRiptide5();
                }
            } else if (enchantName.equalsIgnoreCase("channeling")) {
                return Keys.getChanneling1();
            } else if (enchantName.equalsIgnoreCase("multishot")) {
                return Keys.getMultishot1();
            } else if (enchantName.equalsIgnoreCase("quick_charge")) {
                switch (enchantLevel) {
                    case 1:
                        return Keys.getQuickCharge1();
                    case 2:
                        return Keys.getQuickCharge2();
                    case 3:
                        return Keys.getQuickCharge3();
                    case 4:
                        return Keys.getQuickCharge4();
                    case 5:
                        return Keys.getQuickCharge5();
                }
            } else if (enchantName.equalsIgnoreCase("piercing")) {
                switch (enchantLevel) {
                    case 1:
                        return Keys.getPiercing1();
                    case 2:
                        return Keys.getPiercing2();
                    case 3:
                        return Keys.getPiercing3();
                    case 4:
                        return Keys.getPiercing4();
                    case 5:
                        return Keys.getPiercing5();
                    case 6:
                        return Keys.getPiercing6();
                    case 7:
                        return Keys.getPiercing7();
                }
            } else if (enchantName.equalsIgnoreCase("mending")) {
                return Keys.getMending1();
            } else if (enchantName.equalsIgnoreCase("curse_vanishing")) {
                return Keys.getCurseOfVanishing();
            } else if (enchantName.equalsIgnoreCase("soul_speed")) {
                switch (enchantLevel) {
                    case 1:
                        return Keys.getSoulSpeed1();
                    case 2:
                        return Keys.getSoulSpeed2();
                    case 3:
                        return Keys.getSoulSpeed3();
                    case 4:
                        return Keys.getSoulSpeed4();
                    case 5:
                        return Keys.getSoulSpeed5();
                }
            } else {
                return null;
            }
        }
        return null;
    }
}
