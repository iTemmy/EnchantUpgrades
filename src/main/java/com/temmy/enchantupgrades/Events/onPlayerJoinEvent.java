package com.temmy.enchantupgrades.Events;

import com.temmy.enchantupgrades.CustomFunctions.Effects;
import com.temmy.enchantupgrades.CustomFunctions.Keys;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;

import java.util.Set;

public class onPlayerJoinEvent implements Listener {

    @EventHandler
    public static void onPlayerJoinEvent(PlayerJoinEvent e){
        e.getPlayer().discoverRecipes(Keys.RegisterRecipes());
        e.getPlayer().getPersistentDataContainer().set(Keys.getNoAirLoss(), PersistentDataType.BYTE, (byte) 0);
        CheckArmor(e.getPlayer().getInventory().getArmorContents(), e.getPlayer());
    }

    /**
     * used to go through all of the armor a player is wearing to apply status effects or modify attributes
     * @param armors
     * @param player
     */
    public static void CheckArmor(ItemStack[] armors, Player player){
        //TODO: need to make check to see if player has full set on and if so apply full set effect
        int armorSet = 0;
        boolean dragon;
        boolean scale;
        boolean sage;
        boolean thief;
        boolean tribal;
        boolean legion;
        Set<NamespacedKey> helm = null;
        Set<NamespacedKey> Chest = null;
        Set<NamespacedKey> Legs = null;
        Set<NamespacedKey> Boots = null;
        if (armors[3] != null) {
            helm = armors[3].getItemMeta().getPersistentDataContainer().getKeys();
        }
        if (armors[2] != null) {
            Chest = armors[2].getItemMeta().getPersistentDataContainer().getKeys();
        }
        if (armors[1] != null) {
            Legs = armors[1].getItemMeta().getPersistentDataContainer().getKeys();
        }
        if (armors[0] != null) {
            Boots = armors[0].getItemMeta().getPersistentDataContainer().getKeys();
        }
        if (Boots != null && Legs != null && Chest != null && helm !=null) {
            if (Boots.contains(Keys.getDragonScaleSet()) && Legs.contains(Keys.getDragonScaleSet()) &&
                    Chest.contains(Keys.getDragonScaleSet()) && helm.contains(Keys.getDragonScaleSet())) {
                for (NamespacedKey key : helm) {
                    if (Keys.getFullSetEffects().contains(key)) {
                        Effects.AddArmorEffect(convertFullSetKeys(key), player, armors[3].getItemMeta().getPersistentDataContainer().get(key, PersistentDataType.INTEGER));
                    } else if (Keys.getFullSetAttributes().contains(key)) {
                        Effects.AddAttributeEffects(convertFullSetKeys(key), player, armors[3].getItemMeta().getPersistentDataContainer().get(key, PersistentDataType.DOUBLE));
                    }
                }
            } else if (helm.contains(Keys.getLegionnaireSet()) && Chest.contains(Keys.getLegionnaireSet())
                    && Legs.contains(Keys.getLegionnaireSet()) && Boots.contains(Keys.getLegionnaireSet())) {
                for (NamespacedKey key : helm) {
                    if (Keys.getFullSetEffects().contains(key)){
                        Effects.AddArmorEffect(convertFullSetKeys(key), player, armors[3].getItemMeta().getPersistentDataContainer().get(key, PersistentDataType.INTEGER));
                    }else if (Keys.getFullSetAttributes().contains(key)){
                        Effects.AddAttributeEffects(convertFullSetKeys(key), player, armors[3].getItemMeta().getPersistentDataContainer().get(key, PersistentDataType.DOUBLE));
                    }
                }
            } else if (helm.contains(Keys.getSageSet()) && Chest.contains(Keys.getSageSet()) &&
                    Legs.contains(Keys.getSageSet()) && Boots.contains(Keys.getSageSet())) {
                for (NamespacedKey key : helm) {
                    if (Keys.getFullSetEffects().contains(key)) {
                        Effects.AddArmorEffect(convertFullSetKeys(key), player, armors[3].getItemMeta().getPersistentDataContainer().get(key, PersistentDataType.INTEGER));
                    }else if (key.equals(Keys.getFullSetNoAirLoss())){
                        Effects.AddAttributeEffects(convertFullSetKeys(key), player, 0.0);
                    }else if (Keys.getFullSetAttributes().contains(key)){
                        Effects.AddAttributeEffects(convertFullSetKeys(key), player, armors[3].getItemMeta().getPersistentDataContainer().get(key, PersistentDataType.DOUBLE));
                    }
                }
            } else if (helm.contains(Keys.getScaleSet()) && Chest.contains(Keys.getScaleSet())
                    && Legs.contains(Keys.getScaleSet()) && Boots.contains(Keys.getScaleSet())) {
                for (NamespacedKey key : helm) {
                    if (Keys.getFullSetEffects().contains(key)){
                        Effects.AddArmorEffect(convertFullSetKeys(key), player, armors[3].getItemMeta().getPersistentDataContainer().get(key, PersistentDataType.INTEGER));
                    }else if (Keys.getFullSetAttributes().contains(key)){
                        Effects.AddAttributeEffects(convertFullSetKeys(key), player, armors[3].getItemMeta().getPersistentDataContainer().get(key, PersistentDataType.DOUBLE));
                    }
                }
            } else if (helm.contains(Keys.getThiefSet()) && Chest.contains(Keys.getThiefSet())
                    && Legs.contains(Keys.getThiefSet()) && Boots.contains(Keys.getThiefSet())) {
                for (NamespacedKey key : helm) {
                    if (Keys.getFullSetEffects().contains(key)){
                        Effects.AddArmorEffect(convertFullSetKeys(key), player, armors[3].getItemMeta().getPersistentDataContainer().get(key, PersistentDataType.INTEGER));
                    }else if (Keys.getFullSetAttributes().contains(key)){
                        Effects.AddAttributeEffects(convertFullSetKeys(key), player, armors[3].getItemMeta().getPersistentDataContainer().get(key, PersistentDataType.DOUBLE));
                    }
                }
            } else if (helm.contains(Keys.getTribalSet()) && Chest.contains(Keys.getTribalSet())
                    && Legs.contains(Keys.getTribalSet()) && Boots.contains(Keys.getTribalSet())) {
                for (NamespacedKey key : helm) {
                    if (Keys.getFullSetEffects().contains(key)){
                        Effects.AddArmorEffect(convertFullSetKeys(key), player, armors[3].getItemMeta().getPersistentDataContainer().get(key, PersistentDataType.INTEGER));
                    }else if (Keys.getFullSetAttributes().contains(key)){
                        Effects.AddAttributeEffects(convertFullSetKeys(key), player, armors[3].getItemMeta().getPersistentDataContainer().get(key, PersistentDataType.DOUBLE));
                    }
                }
            }
        }
        for (ItemStack armor : armors){
            if (armor != null){
                Set<NamespacedKey> keys = armor.getItemMeta().getPersistentDataContainer().getKeys();
                if (keys != null) {
                    for (NamespacedKey key : keys) {
                        NamespacedKey ConvertedKey = onPlayerArmorChangeEvent.ConvertKeys(key);
                        if (!(Keys.getFullSetEffects().contains(key)) || !(Keys.getAttributeKeys().contains(key))) {
                            if (Keys.getEffectKeys().contains(ConvertedKey)) {
                                if (armor.getItemMeta().getPersistentDataContainer().has(key, PersistentDataType.INTEGER)) {
                                    Effects.AddArmorEffect(ConvertedKey, player, armor.getItemMeta().getPersistentDataContainer().get(key, PersistentDataType.INTEGER));
                                }
                            } else if (Keys.getAttributeKeys().contains(ConvertedKey)) {
                                if (armor.getItemMeta().getPersistentDataContainer().has(key, PersistentDataType.DOUBLE)) {
                                    Effects.AddAttributeEffects(ConvertedKey, player, armor.getItemMeta().getPersistentDataContainer().get(key, PersistentDataType.DOUBLE));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static NamespacedKey convertFullSetKeys(NamespacedKey key){
        if (key.equals(Keys.getFullSetEffectAbsorption())){
            return Keys.getEffectAbsorption();
        }else if (key.equals(Keys.getFullSetEffectSlowness())){
            return Keys.getEffectSlowness();
        }else if (key.equals(Keys.getFullSetEffectHaste())){
            return Keys.getEffectHaste();
        }else if (key.equals(Keys.getFullSetEffectMiningFatigue())){
            return Keys.getEffectMiningFatigue();
        }else if (key.equals(Keys.getFullSetEffectStrength())){
            return Keys.getEffectStrength();
        }else if (key.equals(Keys.getFullSetEffectInstantHealth())){
            return Keys.getEffectInstantHealth();
        }else if (key.equals(Keys.getFullSetEffectInstantDamage())){
            return Keys.getEffectInstantDamage();
        }else if (key.equals(Keys.getFullSetEffectJumpBoost())){
            return Keys.getEffectJumpBoost();
        }else if (key.equals(Keys.getFullSetEffectNausea())){
            return Keys.getEffectNausea();
        }else if (key.equals(Keys.getFullSetEffectRegeneration())){
            return Keys.getEffectRegeneration();
        }else if (key.equals(Keys.getFullSetEffectResistance())){
            return Keys.getEffectResistance();
        }else if (key.equals(Keys.getFullSetEffectFireResistance())){
            return Keys.getEffectFireResistance();
        }else if (key.equals(Keys.getFullSetEffectWaterBreathing())){
            return Keys.getEffectWaterBreathing();
        }else if (key.equals(Keys.getFullSetEffectInvisibility())){
            return Keys.getEffectInvisibility();
        }else if (key.equals(Keys.getFullSetEffectBlindness())){
            return Keys.getEffectBlindness();
        }else if (key.equals(Keys.getFullSetEffectNightVision())){
            return Keys.getEffectNightVision();
        }else if (key.equals(Keys.getFullSetEffectHunger())){
            return Keys.getEffectHunger();
        }else if (key.equals(Keys.getFullSetEffectWeakness())){
            return Keys.getEffectWeakness();
        }else if (key.equals(Keys.getFullSetEffectPoison())){
            return Keys.getEffectPoison();
        }else if (key.equals(Keys.getFullSetEffectWither())){
            return Keys.getEffectWither();
        }else if (key.equals(Keys.getFullSetEffectHealthBoost())){
            return Keys.getEffectHealthBoost();
        }else if (key.equals(Keys.getFullSetEffectSpeed())){
            return Keys.getEffectSpeed();
        }else if (key.equals(Keys.getFullSetEffectSaturation())){
            return Keys.getEffectSaturation();
        }else if (key.equals(Keys.getFullSetEffectGlowing())){
            return Keys.getEffectGlowing();
        }else if (key.equals(Keys.getFullSetEffectLevitation())){
            return Keys.getEffectLevitation();
        }else if (key.equals(Keys.getFullSetEffectLuck())){
            return Keys.getEffectLuck();
        }else if (key.equals(Keys.getFullSetEffectUnluck())){
            return Keys.getEffectUnluck();
        }else if (key.equals(Keys.getFullSetEffectSlowFalling())){
            return Keys.getEffectSlowFalling();
        }else if (key.equals(Keys.getFullSetEffectConduitPower())){
            return Keys.getEffectConduitPower();
        }else if (key.equals(Keys.getFullSetEffectDolphinsGrace())){
            return Keys.getEffectDolphinsGrace();
        }else if (key.equals(Keys.getFullSetEffectBadOmen())){
            return Keys.getEffectBadOmen();
        }else if (key.equals(Keys.getFullSetEffectHeroOfTheVillage())) {
            return Keys.getEffectHeroOfTheVillage();
        }else if (key.equals(Keys.getFullSetChangeSpeed())){
            return Keys.getChangeSpeed();
        }else if (key.equals(Keys.getFullSetIncreaseHealth())){
            return Keys.getIncreaseHealth();
        }else if (key.equals(Keys.getFullSetNoAirLoss())){
            return Keys.getNoAirLoss();
        }else {
            return null;
        }
    }
}
