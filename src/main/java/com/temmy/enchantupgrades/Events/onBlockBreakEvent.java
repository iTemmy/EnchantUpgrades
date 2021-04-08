package com.temmy.enchantupgrades.Events;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.CustomFunctions.WeightedRandomness;
import com.temmy.enchantupgrades.Main;
import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.persistence.PersistentDataType;

import java.util.Random;

public class onBlockBreakEvent implements Listener {
    private static final WeightedRandomness DropChance = new WeightedRandomness();

    @EventHandler
    public static void onBlockBreakEvent(BlockBreakEvent e){
        Random rnd = new Random();
        if (e.getBlock() != null) {
            if (e.getBlock().getWorld().getName().equalsIgnoreCase("resource_world") && e.getPlayer().getGameMode() == GameMode.SURVIVAL) {
                if (e.getBlock().getType() != null) {
                    switch (e.getBlock().getType()) {
                        case COAL_ORE:
                            if (rnd.nextInt(1000) == 1) {
                                e.getBlock().getWorld().dropItem(e.getBlock().getLocation(), Main.getCustomItems().get(Keys.getPhosphorus()));
                                e.getPlayer().getPersistentDataContainer().set(Keys.getPhosphorus(), PersistentDataType.INTEGER, 0);
                            }else if (e.getPlayer().getPersistentDataContainer().get(Keys.getPhosphorus(), PersistentDataType.INTEGER) >= 1000){
                                e.getBlock().getWorld().dropItem(e.getBlock().getLocation(), Main.getCustomItems().get(Keys.getPhosphorus()));
                                e.getPlayer().getPersistentDataContainer().set(Keys.getPhosphorus(), PersistentDataType.INTEGER, 0);
                            }else {
                                e.getPlayer().getPersistentDataContainer().set(Keys.getPhosphorus(), PersistentDataType.INTEGER, e.getPlayer().getPersistentDataContainer().get(Keys.getPhosphorus(), PersistentDataType.INTEGER) + 1);
                            }
                            break;
                        case DIAMOND_ORE:
                            if (rnd.nextInt(200) == 1) {
                                e.getBlock().getWorld().dropItem(e.getBlock().getLocation(), Main.getCustomItems().get(Keys.getJanelite()));
                                e.getPlayer().getPersistentDataContainer().set(Keys.getJanelite(), PersistentDataType.INTEGER, 0);
                            }else if (e.getPlayer().getPersistentDataContainer().get(Keys.getJanelite(), PersistentDataType.INTEGER) >= 200){
                                e.getBlock().getWorld().dropItem(e.getBlock().getLocation(), Main.getCustomItems().get(Keys.getJanelite()));
                                e.getPlayer().getPersistentDataContainer().set(Keys.getJanelite(), PersistentDataType.INTEGER, 0);
                            }else {
                                e.getPlayer().getPersistentDataContainer().set(Keys.getJanelite(), PersistentDataType.INTEGER, e.getPlayer().getPersistentDataContainer().get(Keys.getJanelite(), PersistentDataType.INTEGER) + 1);
                            }
                            break;
                        case EMERALD_ORE:
                            if (rnd.nextInt(50) == 1) {
                                e.getBlock().getWorld().dropItem(e.getBlock().getLocation(), Main.getCustomItems().get(Keys.getEllendyte()));
                                e.getPlayer().getPersistentDataContainer().set(Keys.getEllendyte(), PersistentDataType.INTEGER, 0);
                            }else if (e.getPlayer().getPersistentDataContainer().get(Keys.getEllendyte(), PersistentDataType.INTEGER) >= 49){
                                e.getBlock().getWorld().dropItem(e.getBlock().getLocation(), Main.getCustomItems().get(Keys.getEllendyte()));
                                e.getPlayer().getPersistentDataContainer().set(Keys.getEllendyte(), PersistentDataType.INTEGER, 0);
                            }else {
                                e.getPlayer().getPersistentDataContainer().set(Keys.getEllendyte(), PersistentDataType.INTEGER, e.getPlayer().getPersistentDataContainer().get(Keys.getEllendyte(), PersistentDataType.INTEGER) + 1);
                            }
                            break;
                        case LAPIS_ORE:
                            if (rnd.nextInt(400) == 1) {
                                e.getBlock().getWorld().dropItem(e.getBlock().getLocation(), Main.getCustomItems().get(Keys.getSapphire()));
                                e.getPlayer().getPersistentDataContainer().set(Keys.getSapphire(), PersistentDataType.INTEGER, 0);
                            }else if (e.getPlayer().getPersistentDataContainer().get(Keys.getSapphire(), PersistentDataType.INTEGER) >= 499){
                                e.getBlock().getWorld().dropItem(e.getBlock().getLocation(), Main.getCustomItems().get(Keys.getSapphire()));
                                e.getPlayer().getPersistentDataContainer().set(Keys.getSapphire(), PersistentDataType.INTEGER, 0);
                            }else {
                                e.getPlayer().getPersistentDataContainer().set(Keys.getSapphire(), PersistentDataType.INTEGER, e.getPlayer().getPersistentDataContainer().get(Keys.getSapphire(), PersistentDataType.INTEGER) + 1);
                            }
                            break;
                        case REDSTONE_ORE:
                            if (rnd.nextInt(500) == 1) {
                                e.getBlock().getWorld().dropItem(e.getBlock().getLocation(), Main.getCustomItems().get(Keys.getTungsten()));
                                e.getPlayer().getPersistentDataContainer().set(Keys.getTungsten(), PersistentDataType.INTEGER, 0);
                            }else if (e.getPlayer().getPersistentDataContainer().get(Keys.getTungsten(), PersistentDataType.INTEGER) >= 499){
                                e.getBlock().getWorld().dropItem(e.getBlock().getLocation(), Main.getCustomItems().get(Keys.getTungsten()));
                                e.getPlayer().getPersistentDataContainer().set(Keys.getTungsten(), PersistentDataType.INTEGER, 0);
                            }else {
                                e.getPlayer().getPersistentDataContainer().set(Keys.getTungsten(), PersistentDataType.INTEGER, e.getPlayer().getPersistentDataContainer().get(Keys.getTungsten(), PersistentDataType.INTEGER) + 1);
                            }
                        case IRON_ORE:
                            if (rnd.nextInt(200) == 1){
                                e.getBlock().getWorld().dropItem(e.getBlock().getLocation(), Main.getCustomItems().get(Keys.getJolixanine()));
                                e.getPlayer().getPersistentDataContainer().set(Keys.getJolixanine(), PersistentDataType.INTEGER, 0);
                            }else if (e.getPlayer().getPersistentDataContainer().get(Keys.getJolixanine(), PersistentDataType.INTEGER) >= 199){
                                e.getBlock().getWorld().dropItem(e.getBlock().getLocation(), Main.getCustomItems().get(Keys.getJolixanine()));
                                e.getPlayer().getPersistentDataContainer().set(Keys.getJolixanine(), PersistentDataType.INTEGER, 0);
                            }else {
                                e.getPlayer().getPersistentDataContainer().set(Keys.getJolixanine(), PersistentDataType.INTEGER, e.getPlayer().getPersistentDataContainer().get(Keys.getJolixanine(), PersistentDataType.INTEGER) +1);
                            }
                            break;
                        case GOLD_ORE:
                            if (rnd.nextInt(100) == 1){
                                e.getBlock().getWorld().dropItem(e.getBlock().getLocation(), Main.getCustomItems().get(Keys.getCorinthium()));
                                e.getPlayer().getPersistentDataContainer().set(Keys.getCorinthium(), PersistentDataType.INTEGER, 0);
                            }else if (e.getPlayer().getPersistentDataContainer().get(Keys.getCorinthium(), PersistentDataType.INTEGER) >= 99){
                                e.getBlock().getWorld().dropItem(e.getBlock().getLocation(), Main.getCustomItems().get(Keys.getCorinthium()));
                                e.getPlayer().getPersistentDataContainer().set(Keys.getCorinthium(), PersistentDataType.INTEGER, 0);
                            }else {
                                e.getPlayer().getPersistentDataContainer().set(Keys.getCorinthium(), PersistentDataType.INTEGER, e.getPlayer().getPersistentDataContainer().get(Keys.getCorinthium(), PersistentDataType.INTEGER)+1);
                            }
                            break;
                        default:
                            return;
                    }
                }
            } else if (e.getBlock().getWorld().getName().equals("resource_world_nether") && e.getPlayer().getGameMode() == GameMode.SURVIVAL) {
                switch (e.getBlock().getType()) {
                    case NETHER_QUARTZ_ORE:
                        if (rnd.nextInt(250) == 1) {
                            e.getBlock().getWorld().dropItem(e.getBlock().getLocation(), Main.getCustomItems().get(Keys.getZinc()));
                            e.getPlayer().getPersistentDataContainer().set(Keys.getZinc(), PersistentDataType.INTEGER, 0);
                        }else if (e.getPlayer().getPersistentDataContainer().get(Keys.getZinc(), PersistentDataType.INTEGER) >= 399){
                            e.getBlock().getWorld().dropItem(e.getBlock().getLocation(), Main.getCustomItems().get(Keys.getZinc()));
                            e.getPlayer().getPersistentDataContainer().set(Keys.getZinc(), PersistentDataType.INTEGER, 0);
                        }else {
                            e.getPlayer().getPersistentDataContainer().set(Keys.getZinc(), PersistentDataType.INTEGER, e.getPlayer().getPersistentDataContainer().get(Keys.getZinc(), PersistentDataType.INTEGER) + 1);
                        }
                        break;
                    case NETHER_GOLD_ORE:
                        if (rnd.nextInt(100) == 1){
                            e.getBlock().getWorld().dropItem(e.getBlock().getLocation(), Main.getCustomItems().get(Keys.getCorinthium()));
                            e.getPlayer().getPersistentDataContainer().set(Keys.getCorinthium(), PersistentDataType.INTEGER, 0);
                        }else if (e.getPlayer().getPersistentDataContainer().get(Keys.getCorinthium(), PersistentDataType.INTEGER) >= 99){
                            e.getBlock().getWorld().dropItem(e.getBlock().getLocation(), Main.getCustomItems().get(Keys.getCorinthium()));
                            e.getPlayer().getPersistentDataContainer().set(Keys.getCorinthium(), PersistentDataType.INTEGER, 0);
                        }else {
                            e.getPlayer().getPersistentDataContainer().set(Keys.getCorinthium(), PersistentDataType.INTEGER, e.getPlayer().getPersistentDataContainer().get(Keys.getCorinthium(), PersistentDataType.INTEGER)+1);
                        }
                        break;
                    default:
                        return;
                }
            }
        }
        return;
    }

}
