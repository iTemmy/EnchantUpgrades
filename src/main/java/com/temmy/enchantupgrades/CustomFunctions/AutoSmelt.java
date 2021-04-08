package com.temmy.enchantupgrades.CustomFunctions;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class AutoSmelt {

    public static void AutoSmelt(Player player, Block mined) {
        Material material = mined.getType();
        ItemStack smelted = new ItemStack(Material.AIR);
        switch (material) {
            case GOLD_ORE:
                smelted.setType(Material.GOLD_INGOT);
                AutoSmelt(smelted, player, mined);
                break;
            case IRON_ORE:
                smelted.setType(Material.IRON_INGOT);
                AutoSmelt(smelted,player,mined);
                break;
            case ANCIENT_DEBRIS:
                smelted.setType(Material.NETHERITE_SCRAP);
                AutoSmelt(smelted,player,mined);
                break;
            case SAND:
            case RED_SAND:
                smelted.setType(Material.GLASS);
                AutoSmelt(smelted,player,mined);
                break;
            case COBBLESTONE:
                smelted.setType(Material.STONE);
                AutoSmelt(smelted,player,mined);
                break;
            case SANDSTONE:
                smelted.setType(Material.SMOOTH_SANDSTONE);
                AutoSmelt(smelted,player,mined);
                break;
            case RED_SANDSTONE:
                smelted.setType(Material.SMOOTH_RED_SANDSTONE);
                AutoSmelt(smelted,player,mined);
                break;
            case STONE:
                smelted.setType(Material.SMOOTH_STONE);
                AutoSmelt(smelted,player,mined);
                break;
            case QUARTZ_BLOCK:
                smelted.setType(Material.SMOOTH_QUARTZ);
                AutoSmelt(smelted,player,mined);
                break;
            case NETHERRACK:
                smelted.setType(Material.NETHER_BRICK);
                AutoSmelt(smelted,player,mined);
                break;
            case NETHER_BRICKS:
                smelted.setType(Material.CRACKED_NETHER_BRICKS);
                AutoSmelt(smelted,player,mined);
                break;
            case CLAY:
                smelted.setType(Material.TERRACOTTA);
                AutoSmelt(smelted,player,mined);
                break;
            case STONE_BRICKS:
                smelted.setType(Material.CRACKED_STONE_BRICKS);
                AutoSmelt(smelted,player,mined);
                break;
            case BLACK_TERRACOTTA:
                smelted.setType(Material.BLACK_GLAZED_TERRACOTTA);
                AutoSmelt(smelted,player,mined);
                break;
            case BLUE_TERRACOTTA:
                smelted.setType(Material.BLUE_GLAZED_TERRACOTTA);
                AutoSmelt(smelted,player,mined);
                break;
            case BROWN_TERRACOTTA:
                smelted.setType(Material.BROWN_GLAZED_TERRACOTTA);
                AutoSmelt(smelted,player,mined);
                break;
            case CYAN_TERRACOTTA:
                smelted.setType(Material.CYAN_GLAZED_TERRACOTTA);
                AutoSmelt(smelted,player,mined);
                break;
            case GRAY_TERRACOTTA:
                smelted.setType(Material.GRAY_GLAZED_TERRACOTTA);
                AutoSmelt(smelted,player,mined);
                break;
            case GREEN_TERRACOTTA:
                smelted.setType(Material.GREEN_GLAZED_TERRACOTTA);
                AutoSmelt(smelted,player,mined);
                break;
            case LIGHT_BLUE_TERRACOTTA:
                smelted.setType(Material.LIGHT_BLUE_GLAZED_TERRACOTTA);
                AutoSmelt(smelted,player,mined);
                break;
            case LIGHT_GRAY_TERRACOTTA:
                smelted.setType(Material.LIGHT_GRAY_GLAZED_TERRACOTTA);
                AutoSmelt(smelted,player,mined);
                break;
            case LIME_TERRACOTTA:
                smelted.setType(Material.LIME_GLAZED_TERRACOTTA);
                AutoSmelt(smelted,player,mined);
                break;
            case MAGENTA_TERRACOTTA:
                smelted.setType(Material.MAGENTA_GLAZED_TERRACOTTA);
                AutoSmelt(smelted,player,mined);
                break;
            case ORANGE_TERRACOTTA:
                smelted.setType(Material.ORANGE_GLAZED_TERRACOTTA);
                AutoSmelt(smelted,player,mined);
                break;
            case PINK_TERRACOTTA:
                smelted.setType(Material.PINK_GLAZED_TERRACOTTA);
                AutoSmelt(smelted,player,mined);
                break;
            case PURPLE_TERRACOTTA:
                smelted.setType(Material.PURPLE_GLAZED_TERRACOTTA);
                AutoSmelt(smelted,player,mined);
                break;
            case RED_TERRACOTTA:
                smelted.setType(Material.RED_GLAZED_TERRACOTTA);
                AutoSmelt(smelted,player,mined);
                break;
            case WHITE_TERRACOTTA:
                smelted.setType(Material.WHITE_GLAZED_TERRACOTTA);
                AutoSmelt(smelted,player,mined);
                break;
            case YELLOW_TERRACOTTA:
                smelted.setType(Material.YELLOW_GLAZED_TERRACOTTA);
                AutoSmelt(smelted,player,mined);
                break;
            case CACTUS:
                smelted.setType(Material.GREEN_DYE);
                AutoSmelt(smelted,player,mined);
                break;
            case ACACIA_LOG:
            case BIRCH_LOG:
            case DARK_OAK_LOG:
            case JUNGLE_LOG:
            case OAK_LOG:
            case SPRUCE_LOG:
            case STRIPPED_ACACIA_LOG:
            case STRIPPED_BIRCH_LOG:
            case STRIPPED_DARK_OAK_LOG:
            case STRIPPED_JUNGLE_LOG:
            case STRIPPED_OAK_LOG:
            case STRIPPED_SPRUCE_LOG:
            case ACACIA_WOOD:
            case BIRCH_WOOD:
            case JUNGLE_WOOD:
            case OAK_WOOD:
            case SPRUCE_WOOD:
            case DARK_OAK_WOOD:
            case STRIPPED_ACACIA_WOOD:
            case STRIPPED_BIRCH_WOOD:
            case STRIPPED_DARK_OAK_WOOD:
            case STRIPPED_JUNGLE_WOOD:
            case STRIPPED_OAK_WOOD:
            case STRIPPED_SPRUCE_WOOD:
                smelted.setType(Material.CHARCOAL);
                AutoSmelt(smelted,player,mined);
                break;
            case WET_SPONGE:
                smelted.setType(Material.SPONGE);
                AutoSmelt(smelted,player,mined);
                break;
            case SEA_PICKLE:
                smelted.setType(Material.LIME_DYE);
                AutoSmelt(smelted,player,mined);
                break;
            case KELP:
            case KELP_PLANT:
                smelted.setType(Material.DRIED_KELP);
                AutoSmelt(smelted,player,mined);
                break;
            default:
                break;
        }
    }

    public static void AutoSmelt(ItemStack smelted, Player player, Block mined){
        if (player.getInventory().firstEmpty() == -1) {
            player.sendMessage("Inventory Full");
            player.getWorld().dropItem(player.getLocation(), smelted);
        } else {
            mined.setType(Material.AIR);
            player.getInventory().addItem(smelted);
        }
    }

}
