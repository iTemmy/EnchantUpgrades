package com.temmy.enchantupgrades.TabCompletions;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class getItemTabCompleter implements @Nullable TabCompleter {
    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String alias, @NotNull String[] args) {
        if (args.length == 1 ){
            final List<String> completions = new ArrayList<>();
            for (Player player : Bukkit.getOnlinePlayers()){
                completions.add(player.getName());
            }
            return completions;
        }else if (args.length == 2){
            final List<String> completions = new ArrayList<>();
            completions.addAll(Arrays.asList("armor","ore","enchant","essence","imbued","item","weapon"));
            return completions;
        }else if (args.length == 3){
            if (args[1].equalsIgnoreCase("armor")){
                final List<String> completions = new ArrayList<>();
                completions.addAll(Arrays.asList("set","helmet","chestplate","leggings","boots"));
                return completions;
            }else if (args[1].equalsIgnoreCase("ore")){
                return ores();
            }else if (args[1].equalsIgnoreCase("enchant")){
                return Enchants();
            }else if (args[1].equalsIgnoreCase("essence")){
                return essences();
            }else if (args[1].equalsIgnoreCase("imbued")){
                return imbued();
            }else if (args[1].equalsIgnoreCase("item")){
                return items();
            }else if (args[1].equalsIgnoreCase("weapon")){
                return weapons();
            }
        }else if (args.length == 4) {
            if (args[2].equalsIgnoreCase("set")) {
                return CustomArmors();
            } else if (args[2].equalsIgnoreCase("helmet")) {
                return CustomArmors();
            } else if (args[2].equalsIgnoreCase("chestplate")) {
                return CustomArmors();
            } else if (args[2].equalsIgnoreCase("leggings")) {
                return CustomArmors();
            } else if (args[2].equalsIgnoreCase("boots")) {
                return CustomArmors();
            } else if (args[2].equalsIgnoreCase("drugarths")){
                return Arrays.asList("1","2","3","4","5","10");
            }else if (ores().contains(args[2])){
                return Numbers(64);
            }else if (Enchants().contains(args[2])){
                String enchant = args[2];
                if (enchant.equalsIgnoreCase("protection")){
                    return Numbers(7);
                }else if (enchant.equalsIgnoreCase("fire_protection")){
                    return Numbers(7);
                }else if (enchant.equalsIgnoreCase("feather_falling")){
                    return Numbers(7);
                }else if (enchant.equalsIgnoreCase("blast_protection")){
                    return Numbers(7);
                }else if (enchant.equalsIgnoreCase("projectile_protection")){
                    return Numbers(7);
                }else if (enchant.equalsIgnoreCase("respiration")){
                    return Numbers(5);
                }else if (enchant.equalsIgnoreCase("aqua_affinity")){
                    return Numbers(1);
                }else if (enchant.equalsIgnoreCase("thorns")){
                    return Numbers(5);
                }else if (enchant.equalsIgnoreCase("depth_strider")){
                    return Numbers(5);
                }else if (enchant.equalsIgnoreCase("frost_walker")){
                    return Numbers(3);
                }else if (enchant.equalsIgnoreCase("curse_binding")) {
                    return Numbers(1);
                } else if (enchant.equalsIgnoreCase("sharpness")) {
                    return Numbers(8);
                } else if (enchant.equalsIgnoreCase("smite")) {
                    return Numbers(8);
                } else if (enchant.equalsIgnoreCase("bane_of_arthropods")) {
                    return Numbers(8);
                } else if (enchant.equalsIgnoreCase("knockback")) {
                    return Numbers(3);
                } else if (enchant.equalsIgnoreCase("fire_aspect")) {
                    return Numbers(3);
                } else if (enchant.equalsIgnoreCase("looting")) {
                    return Numbers(5);
                } else if (enchant.equalsIgnoreCase("sweeping_edge")) {
                    return Numbers(5);
                } else if (enchant.equalsIgnoreCase("efficiency")) {
                    return Numbers(8);
                } else if (enchant.equalsIgnoreCase("silk_touch")) {
                    return Numbers(1);
                } else if (enchant.equalsIgnoreCase("unbreaking")) {
                    return Numbers(5);
                } else if (enchant.equalsIgnoreCase("fortune")) {
                    return Numbers(5);
                } else if (enchant.equalsIgnoreCase("power")) {
                    return Numbers(8);
                } else if (enchant.equalsIgnoreCase("punch")) {
                    return Numbers(3);
                } else if (enchant.equalsIgnoreCase("flame")) {
                    return Numbers(1);
                } else if (enchant.equalsIgnoreCase("infinity")) {
                    return Numbers(1);
                } else if (enchant.equalsIgnoreCase("luck_of_the_sea")) {
                    return Numbers(5);
                } else if (enchant.equalsIgnoreCase("lure")) {
                    return Numbers(5);
                } else if (enchant.equalsIgnoreCase("loyalty")) {
                    return Numbers(5);
                } else if (enchant.equalsIgnoreCase("impaling")) {
                    return Numbers(8);
                } else if (enchant.equalsIgnoreCase("riptide")) {
                    return Numbers(5);
                } else if (enchant.equalsIgnoreCase("channeling")) {
                    return Numbers(1);
                } else if (enchant.equalsIgnoreCase("multishot")) {
                    return Numbers(1);
                } else if (enchant.equalsIgnoreCase("quick_charge")) {
                    return Numbers(5);
                } else if (enchant.equalsIgnoreCase("piercing")) {
                    return Numbers(7);
                } else if (enchant.equalsIgnoreCase("mending")) {
                    return Numbers(1);
                } else if (enchant.equalsIgnoreCase("curse_vanishing")) {
                    return Numbers(1);
                } else if (enchant.equalsIgnoreCase("soul_speed")) {
                    return Numbers(5);
                }
            }
        }else if (args.length == 5){
            if (CustomArmors().contains(args[3].toLowerCase())){
                return Numbers(64);
            }
        }
        return null;
    }

    private List<String> ores(){
        return new ArrayList<>(Arrays.asList("ellendyte","corinthium","jolixanine","phosphorus","tungsten","sapphire","zinc","janelite"));
    }

    private List<String> Numbers(int num){
        List<String> numbers = new ArrayList<>();
        for (int i = 1;i <= num; i++){
            numbers.add(String.valueOf(i));
        }
        return numbers;
    }

    private List<String> Enchants(){
        return new ArrayList<>(Arrays.asList("protection", "fire_protection", "feather_falling","blast_protection",
                "projectile_protection","respiration","aqua_affinity","thorns","depth_strider","frost_walker",
                "curse_binding","sharpness","smite","bane_of_arthropods","knockback","fire_aspect","looting",
                "sweeping_edge","efficiency","silk_touch","unbreaking","fortune","power","punch","flame","infinity",
                "luck_of_the_sea","lure","loyalty","impaling","riptide","channeling","multishot","quick_charge",
                "piercing","mending","curse_vanishing","soul_speed"));
    }

    private List<String> CustomArmors(){
        return new ArrayList<>(Arrays.asList("dragonscale","legionnaire","sage","scale","thief","tribal"));
    }

    private List<String> essences(){
        return new ArrayList<>(Arrays.asList("base","blaze","prickly","cushion","strider","oxidized","lure","frost","hardening",
                "luck","mob","quickening","silk","arachnid","undead","skeleton","combustible","projectile","flame",
                "protection","splicing","treasure","nether"));
    }

    private List<String> imbued(){
        return new ArrayList<>(Arrays.asList("blast","cushion","flame","projectile","protection","quickening","silk",
                "oxidized","oceanic","hardening","prickly","mob","arachnid","blaze"));
    }

    private List<String> items(){
        return new ArrayList<>(Arrays.asList("otherworldly","shatteredob"));
    }

    private List<String> weapons(){
        return new ArrayList<>(Arrays.asList("drugarths"));
    }
}
