package com.temmy.enchantupgrades.TabCompletions;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.enchantments.Enchantment;
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
            completions.addAll(Arrays.asList("armor","ore","enchant"));
            return completions;
        }else if (args.length == 3){
            if (args[1].equalsIgnoreCase("armor")){
                final List<String> completions = new ArrayList<>();
                completions.addAll(Arrays.asList("set","helmet","chestplate","leggings","boots"));
                return completions;
            }else if (args[1].equalsIgnoreCase("ore")){
                final List<String> completions = new ArrayList<>();
                completions.addAll(Arrays.asList("ellendyte","corinthium","jolixanine","phosphorus","tungsten","sapphire","zinc","janelite"));
                return completions;
            }else if (args[1].equalsIgnoreCase("enchant")){
                final List<String> completions = new ArrayList<>();
                completions.addAll(Arrays.asList("protection", "fire_protection", "feather_falling","blast_protection",
                        "projectile_protection","respiration","aqua_affinity","thorns","depth_strider","frost_walker",
                        "curse_binding","sharpness","smite","bane_of_arthropods","knockback","fire_aspect","looting",
                        "sweeping_edge","efficiency","silk_touch","unbreaking","fortune","power","punch","flame","infinity",
                        "luck_of_the_sea","lure","loyalty","impaling","riptide","channeling","multishot","quick_charge",
                        "piercing","mending","curse_vanishing","soul_speed"));
                return completions;
            }
        }else if (args.length == 4){
            if (args[2].equalsIgnoreCase("set")){
                return CustomArmors();
            }else if (args[2].equalsIgnoreCase("helmet")){
                return CustomArmors();
            }else if (args[2].equalsIgnoreCase("chestplate")){
                return CustomArmors();
            }else if (args[2].equalsIgnoreCase("leggings")){
                return CustomArmors();
            }else if (args[2].equalsIgnoreCase("boots")){
                return CustomArmors();
            }
        }else if (args.length == 5){
            if (CustomArmors().contains(args[3].toLowerCase()) ||args[3].equalsIgnoreCase("ellendyte") || args[3].equalsIgnoreCase("corinthium")
                    || args[3].equalsIgnoreCase("jolixanine") || args[3].equalsIgnoreCase("phosphorus") ||
                    args[3].equalsIgnoreCase("tungsten") || args[3].equalsIgnoreCase("sapphire") || args[3].equalsIgnoreCase("zinc")
                    || args[3].equalsIgnoreCase("janelite")){
                final List<String> completions = new ArrayList<>();
                completions.addAll(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17"
                        , "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37"
                        , "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "56"
                        , "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76"
                        , "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96"
                        , "97", "98", "99"));
                return completions;
            }
        }
        return null;
    }

    private List<String> CustomArmors(){
        List<String> armors = new ArrayList<>(Arrays.asList("dragonscale","legionnaire","sage","scale","thief","tribal"));
        return armors;
    }
}
