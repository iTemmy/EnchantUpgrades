package com.temmy.enchantupgrades.Events;

import com.destroystokyo.paper.event.player.PlayerArmorChangeEvent;
import com.temmy.enchantupgrades.CustomFunctions.Effects;
import com.temmy.enchantupgrades.CustomFunctions.Keys;
import org.bukkit.NamespacedKey;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.persistence.PersistentDataType;

import java.util.Set;

public class onPlayerArmorChangeEvent implements Listener {
    @EventHandler
    public static void PlayerArmorChangeEvent(PlayerArmorChangeEvent e){
        //Will remove effects from old armor that has been taken off
        if (e.getOldItem() != null) {
            if (e.getOldItem().getItemMeta() != null) {
                Set<NamespacedKey> keys = e.getOldItem().getItemMeta().getPersistentDataContainer().getKeys();
                for (NamespacedKey key : keys){
                    if (Keys.getEffectKeys().contains(ConvertKeys(key))) {
                        Effects.removeArmorEffects(ConvertKeys(key), e.getPlayer());
                    } else if (Keys.getAttributeKeys().contains(key)) {
                        Effects.RemoveAttributeEffects(ConvertKeys(key), e.getPlayer(), e.getOldItem().getItemMeta().getPersistentDataContainer().get(key, PersistentDataType.DOUBLE));
                    }else if (Keys.getFullSetEffects().contains(key)) {
                        Effects.removeArmorEffects(onPlayerJoinEvent.convertFullSetKeys(key), e.getPlayer());
                    }else if (key.equals(Keys.getFullSetNoAirLoss())){
                        Effects.RemoveAttributeEffects(ConvertKeys(key), e.getPlayer(), e.getOldItem().getItemMeta().getPersistentDataContainer().get(key, PersistentDataType.BYTE));
                    }else if (Keys.getFullSetAttributes().contains(key)){
                        Effects.RemoveAttributeEffects(onPlayerJoinEvent.convertFullSetKeys(key), e.getPlayer(), e.getOldItem().getItemMeta().getPersistentDataContainer().get(key, PersistentDataType.DOUBLE));
                    }
                }
            }
        }
        onPlayerJoinEvent.CheckArmor(e.getPlayer().getInventory().getArmorContents(), e.getPlayer());
    }

    /**
     * Used to convert between the keys used for when player has single armor piece on, full set on and any amount on
     * @param key NamespacedKey used to identify which status effect to apply to player
     * @return null
     */
    public static NamespacedKey ConvertKeys(NamespacedKey key){
        if (key.equals(Keys.getSingleEffectSpeed()) || key.equals(Keys.getEffectSpeed())){
            return Keys.getEffectSpeed();
        }else if (key.equals(Keys.getSingleEffectSlowness()) || key.equals(Keys.getEffectSlowness())){
            return  Keys.getEffectSlowness();
        }else if (key.equals(Keys.getSingleEffectHaste()) || key.equals(Keys.getEffectHaste())){
            return Keys.getEffectHaste();
        }else if (key.equals(Keys.getSingleEffectMiningFatigue()) || key.equals(Keys.getEffectMiningFatigue())){
            return Keys.getEffectMiningFatigue();
        }else if (key.equals(Keys.getSingleEffectStrength()) || key.equals(Keys.getEffectStrength())){
            return Keys.getEffectStrength();
        }else if (key.equals(Keys.getSingleEffectInstantHealth()) || key.equals(Keys.getEffectInstantHealth())){
            return Keys.getEffectInstantHealth();
        }else if (key.equals(Keys.getSingleEffectInstantDamage()) || key.equals(Keys.getEffectInstantDamage())){
            return Keys.getEffectInstantDamage();
        }else if (key.equals(Keys.getSingleEffectJumpBoost()) || key.equals(Keys.getEffectJumpBoost())){
            return Keys.getEffectJumpBoost();
        }else if (key.equals(Keys.getSingleEffectNausea()) || key.equals(Keys.getEffectNausea())){
            return Keys.getEffectNausea();
        }else if (key.equals(Keys.getSingleEffectRegeneration()) || key.equals(Keys.getEffectRegeneration())){
            return Keys.getEffectRegeneration();
        }else if (key.equals(Keys.getSingleEffectResistance()) || key.equals(Keys.getEffectResistance())){
            return Keys.getEffectResistance();
        }else if (key.equals(Keys.getSingleEffectFireResistance()) || key.equals(Keys.getEffectFireResistance())){
            return Keys.getEffectFireResistance();
        }else if (key.equals(Keys.getSingleEffectWaterBreathing()) || key.equals(Keys.getEffectWaterBreathing())){
            return Keys.getEffectWaterBreathing();
        }else if (key.equals(Keys.getSingleEffectInvisibility()) || key.equals(Keys.getEffectInvisibility())){
            return Keys.getEffectInvisibility();
        }else if (key.equals(Keys.getSingleEffectBlindness()) || key.equals(Keys.getEffectBlindness())){
            return Keys.getEffectBlindness();
        }else if (key.equals(Keys.getSingleEffectNightVision()) || key.equals(Keys.getEffectNightVision())){
            return Keys.getEffectNightVision();
        }else if (key.equals(Keys.getSingleEffectHunger()) || key.equals(Keys.getEffectHunger())){
            return Keys.getEffectHunger();
        }else if (key.equals(Keys.getSingleEffectWeakness()) || key.equals(Keys.getEffectWeakness())){
            return Keys.getEffectWeakness();
        }else if (key.equals(Keys.getSingleEffectPoison()) || key.equals(Keys.getEffectPoison())){
            return Keys.getEffectPoison();
        }else if (key.equals(Keys.getSingleEffectWither()) || key.equals(Keys.getEffectWither())){
            return Keys.getEffectWither();
        }else if (key.equals(Keys.getSingleEffectHealthBoost()) || key.equals(Keys.getEffectHealthBoost())){
            return Keys.getEffectHealthBoost();
        }else if (key.equals(Keys.getSingleEffectAbsorption()) || key.equals(Keys.getEffectAbsorption())){
            return Keys.getEffectAbsorption();
        }else if (key.equals(Keys.getSingleEffectSaturation()) || key.equals(Keys.getEffectSaturation())){
            return Keys.getEffectSaturation();
        }else if (key.equals(Keys.getSingleEffectGlowing())  || key.equals(Keys.getEffectGlowing())){
            return Keys.getEffectGlowing();
        }else if (key.equals(Keys.getSingleEffectLevitation()) || key.equals(Keys.getEffectLevitation())){
            return Keys.getEffectLevitation();
        }else if (key.equals(Keys.getSingleEffectLuck()) || key.equals(Keys.getEffectLuck())){
            return Keys.getEffectLuck();
        }else if (key.equals(Keys.getSingleEffectUnluck()) || key.equals(Keys.getEffectUnluck())){
            return Keys.getEffectUnluck();
        }else if (key.equals(Keys.getSingleEffectSlowFalling()) || key.equals(Keys.getEffectSlowFalling())){
            return Keys.getEffectSlowFalling();
        }else if (key.equals(Keys.getSingleEffectConduitPower()) || key.equals(Keys.getEffectConduitPower())){
            return Keys.getEffectConduitPower();
        }else if (key.equals(Keys.getSingleEffectDolphinsGrace()) || key.equals(Keys.getEffectDolphinsGrace())){
            return Keys.getEffectDolphinsGrace();
        }else if (key.equals(Keys.getSingleEffectBadOmen()) || key.equals(Keys.getEffectBadOmen())){
            return Keys.getEffectBadOmen();
        }else if (key.equals(Keys.getSingleEffectHeroOfTheVillage())  || key.equals(Keys.getEffectHeroOfTheVillage())){
            return Keys.getEffectHeroOfTheVillage();
        }else if (key.equals(Keys.getSingleNoAirLoss()) || key.equals(Keys.getNoAirLoss())){
            return Keys.getNoAirLoss();
        }else if (key.equals(Keys.getSingleChangeSpeed()) || key.equals(Keys.getChangeSpeed())){
            return Keys.getChangeSpeed();
        }else if (key.equals(Keys.getSingleIncreaseHealth()) || key.equals(Keys.getIncreaseHealth())){
            return Keys.getIncreaseHealth();
        }
        return null;
    }
}
