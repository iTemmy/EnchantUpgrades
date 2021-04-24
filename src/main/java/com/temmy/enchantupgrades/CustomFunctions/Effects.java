package com.temmy.enchantupgrades.CustomFunctions;

import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.logging.Level;

public class Effects {

    /**
     * Used to add status effects to players
     * @param key NamespacedKey to determine which status effect to add
     * @param player player to whom the status effect will be applied
     * @param level level of the status effect to be applied
     */
    public static void AddArmorEffect(NamespacedKey key, Player player, int level){
        level-=1;
        if (key != null && player != null){
            if (key.equals(Keys.getEffectAbsorption())){
                player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, Integer.MAX_VALUE, level, false, false, true));
            }else if (key.equals(Keys.getEffectLuck())){
                player.addPotionEffect(new PotionEffect(PotionEffectType.LUCK, Integer.MAX_VALUE, level, false, false, true));
            }else if (key.equals(Keys.getEffectPoison())){
                player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, Integer.MAX_VALUE, level, false, false, true));
            }else if (key.equals(Keys.getEffectSpeed())){
                player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, level, false, false, true));
            }else if (key.equals(Keys.getEffectResistance())){
                player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, level, false, false, true));
            }else if (key.equals(Keys.getEffectUnluck())){
                player.addPotionEffect(new PotionEffect(PotionEffectType.UNLUCK, Integer.MAX_VALUE, level, false, false, true));
            }else if (key.equals(Keys.getEffectBlindness())){
                player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, Integer.MAX_VALUE, level,false ,false, true));
            }else if (key.equals(Keys.getEffectConduitPower())){
                player.addPotionEffect(new PotionEffect(PotionEffectType.CONDUIT_POWER, Integer.MAX_VALUE, level, false, false, true));
            }else if (key.equals(Keys.getEffectDolphinsGrace())){
                player.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, level, false, false, true));
            }else if (key.equals(Keys.getEffectFireResistance())){
                player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Integer.MAX_VALUE, level, false, false, true));
            }else if (key.equals(Keys.getEffectGlowing())){
                player.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, Integer.MAX_VALUE, level, false, false, true));
            }else if (key.equals(Keys.getEffectHaste())){
                player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, Integer.MAX_VALUE, level, false, false, true));
            }else if (key.equals(Keys.getEffectHealthBoost())){
                player.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, Integer.MAX_VALUE, level, false, false, true));
            }else if (key.equals(Keys.getEffectHeroOfTheVillage())){
                player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, Integer.MAX_VALUE, level, false, false, true));
            }else if (key.equals(Keys.getEffectHunger())){
                player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, Integer.MAX_VALUE, level, false, false, true));
            }else if (key.equals(Keys.getEffectInstantDamage())){
                player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, Integer.MAX_VALUE, level, false, false, true));
            }else if (key.equals(Keys.getEffectInstantHealth())){
                player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, Integer.MAX_VALUE, level, false, false, true));
            }else if (key.equals(Keys.getEffectInvisibility())){
                player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, Integer.MAX_VALUE, level, false, false, true));
            }else if (key.equals(Keys.getEffectJumpBoost())){
                player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, level, false, false, true));
            }else if (key.equals(Keys.getEffectLevitation())){
                player.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, Integer.MAX_VALUE, level, false, false, true));
            }else if (key.equals(Keys.getEffectMiningFatigue())){
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, Integer.MAX_VALUE, level, false, false, true));
            }else if (key.equals(Keys.getEffectNausea())){
                player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, Integer.MAX_VALUE, level, false, false, true));
            }else if (key.equals(Keys.getEffectNightVision())){
                player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, Integer.MAX_VALUE, level, false, false, true));
            }else if (key.equals(Keys.getEffectRegeneration())){
                player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, Integer.MAX_VALUE, level, false, false, true));
            }else if (key.equals(Keys.getEffectSaturation())){
                player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, Integer.MAX_VALUE, level, false, false, true));
            }else if (key.equals(Keys.getEffectSlowFalling())){
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, Integer.MAX_VALUE, level, false, false, true));
            }else if (key.equals(Keys.getEffectSlowness())){
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, level, false, false, true));
            }else if (key.equals(Keys.getEffectStrength())){
                player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, level, false, false, true));
            }else if (key.equals(Keys.getEffectWaterBreathing())){
                player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, Integer.MAX_VALUE, level, false, false, true));
            }else if (key.equals(Keys.getEffectWeakness())){
                player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Integer.MAX_VALUE, level, false, false, true));
            }else if (key.equals(Keys.getEffectWither())){
                player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, Integer.MAX_VALUE, level, false, false, true));
            }else if (key.equals(Keys.getEffectBadOmen())){
                player.addPotionEffect(new PotionEffect(PotionEffectType.BAD_OMEN, Integer.MAX_VALUE, level, false, false, true));
            }else {
                Bukkit.getLogger().log(Level.SEVERE, "[Enchant Upgrades] Error: The specified key on "+player.getName()+"'s armor wasn't found!");
                Bukkit.getLogger().log(Level.SEVERE, "[Enchant Upgrades] Error: The key is: "+key);
            }
        }
    }

    /**
     * Used to remove status effects from players
     * @param key NamespacedKey to determine which status effect to remove
     * @param player player whose status effects will be removed
     */
    public static void removeArmorEffects(NamespacedKey key, Player player){
        if (key != null && player != null){
            if (key.equals(Keys.getEffectSpeed())){
                player.removePotionEffect(PotionEffectType.SPEED);
            }else if (key.equals(Keys.getEffectSlowness())){
                player.removePotionEffect(PotionEffectType.SLOW);
            }else if (key.equals(Keys.getEffectHaste())){
                player.removePotionEffect(PotionEffectType.FAST_DIGGING);
            }else if (key.equals(Keys.getEffectMiningFatigue())){
                player.removePotionEffect(PotionEffectType.SLOW_DIGGING);
            }else if (key.equals(Keys.getEffectStrength())){
                player.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
            }else if (key.equals(Keys.getEffectInstantHealth())){
                player.removePotionEffect(PotionEffectType.HEAL);
            }else if (key.equals(Keys.getEffectInstantDamage())){
                player.removePotionEffect(PotionEffectType.HARM);
            }else if (key.equals(Keys.getEffectJumpBoost())) {
                player.removePotionEffect(PotionEffectType.JUMP);
            }else if (key.equals(Keys.getEffectNausea())){
                player.removePotionEffect(PotionEffectType.CONFUSION);
            }else if (key.equals(Keys.getEffectRegeneration())){
                player.removePotionEffect(PotionEffectType.REGENERATION);
            }else if (key.equals(Keys.getEffectResistance())){
                player.removePotionEffect(PotionEffectType.DAMAGE_RESISTANCE);
            }else if (key.equals(Keys.getEffectFireResistance())){
                player.removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
            }else if (key.equals(Keys.getEffectWaterBreathing())){
                player.removePotionEffect(PotionEffectType.WATER_BREATHING);
            }else if (key.equals(Keys.getEffectInvisibility())){
                player.removePotionEffect(PotionEffectType.INVISIBILITY);
            }else if (key.equals(Keys.getEffectBlindness())){
                player.removePotionEffect(PotionEffectType.BLINDNESS);
            }else if (key.equals(Keys.getEffectNightVision())){
                player.removePotionEffect(PotionEffectType.NIGHT_VISION);
            }else if (key.equals(Keys.getEffectHunger())){
                player.removePotionEffect(PotionEffectType.HUNGER);
            }else if (key.equals(Keys.getEffectWeakness())){
                player.removePotionEffect(PotionEffectType.WEAKNESS);
            }else if (key.equals(Keys.getEffectPoison())){
                player.removePotionEffect(PotionEffectType.POISON);
            }else if (key.equals(Keys.getEffectWither())){
                player.removePotionEffect(PotionEffectType.WITHER);
            }else if (key.equals(Keys.getEffectHealthBoost())){
                player.removePotionEffect(PotionEffectType.HEALTH_BOOST);
            }else if (key.equals(Keys.getEffectAbsorption())){
                player.removePotionEffect(PotionEffectType.ABSORPTION);
            }else if (key.equals(Keys.getEffectSaturation())){
                player.removePotionEffect(PotionEffectType.SATURATION);
            }else if (key.equals(Keys.getEffectGlowing())){
                player.removePotionEffect(PotionEffectType.GLOWING);
            }else if (key.equals(Keys.getEffectLevitation())){
                player.removePotionEffect(PotionEffectType.LEVITATION);
            }else if (key.equals(Keys.getEffectUnluck())){
                player.removePotionEffect(PotionEffectType.UNLUCK);
            }else if (key.equals(Keys.getEffectLuck())){
                player.removePotionEffect(PotionEffectType.LUCK);
            }else if (key.equals(Keys.getEffectSlowFalling())){
                player.removePotionEffect(PotionEffectType.SLOW_FALLING);
            }else if (key.equals(Keys.getEffectConduitPower())){
                player.removePotionEffect(PotionEffectType.CONDUIT_POWER);
            }else if (key.equals(Keys.getEffectDolphinsGrace())){
                player.removePotionEffect(PotionEffectType.DOLPHINS_GRACE);
            }else if (key.equals(Keys.getEffectBadOmen())){
                player.removePotionEffect(PotionEffectType.BAD_OMEN);
            }else if (key.equals(Keys.getEffectHeroOfTheVillage())){
                player.removePotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE);
            }
        }
    }

    /**
     * Used to add Attributes to players (Mainly used for full armor set or single armor piece)
     * @param key NamespacedKey to determine which attribute to modify
     * @param player player whose attribute is going to be modified
     * @param alteration the amount that the attribute should be changed by
     */
    public static void AddAttributeEffects(NamespacedKey key, Player player, double alteration){
        //TODO: Finish adding Attribute Effects that can be used by armor to apply effects or change the player status
        if (key != null && player != null){
            if (key.equals(Keys.getIncreaseHealth())){
                player.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getBaseValue()+alteration);
            }else if (key.equals(Keys.getChangeSpeed())){
                player.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(player.getAttribute(Attribute.GENERIC_ATTACK_SPEED).getBaseValue()+alteration);
            }else if (key.equals(Keys.getNoAirLoss())){
                player.getPersistentDataContainer().set(Keys.getNoAirLoss(), PersistentDataType.BYTE, (byte) 1);
            }
        }
    }

    /**
     * Used to remove Attributes from players (Mainly only used for full armor set or single armor piece)
     * @param key NamespacedKey to determine which attribute to modify
     * @param player Player whose attribute is going to be modified
     * @param alteration the amount that the attribute should be changed by
     */
    public static void RemoveAttributeEffects(NamespacedKey key, Player player, double alteration){
        if (key != null && player != null){
            if (key.equals(Keys.getIncreaseHealth())){
                player.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(20.0);
            }else if (key.equals(Keys.getNoAirLoss())){
                player.getPersistentDataContainer().set(Keys.getNoAirLoss(), PersistentDataType.BYTE, (byte) 0);
            }else if (key.equals(Keys.getChangeSpeed())){
                player.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(0.10000000149011612);
            }
        }
    }
}
