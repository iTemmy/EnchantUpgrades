package com.temmy.enchantupgrades.Recipes;

import com.temmy.enchantupgrades.CustomFunctions.Keys;
import com.temmy.enchantupgrades.Main;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

public class Essences {

    public Essences(){
        BaseEnchant();
        BlazeEssence();
        PricklyEssence();
        CushionEssence();
        StriderEssence();
        OxidisedEssence();
        LureEssence();
        FrostEssence();
        HardeningEssence();
        LuckEssence();
        MobEssence();
        QuickeningCharge();
        SilkyJewel();
        ArachnidEssence();
        UndeadEssence();
        SkeletonEssence();
        CombustibleScraps();
        ProjectileScraps();
        FlameScraps();
        ProtectionScraps();
        OtherworldlyTrophy();
        SplicingEssence();
        TreasureEssence();
        NetherShard();
    }

    private void BaseEnchant(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getBaseEnchantedBook(), item);
        recipe.shape("GGG","GBG","GGG");
        recipe.setIngredient('G', Material.GOLD_NUGGET);
        recipe.setIngredient('B', Material.BOOK);
        Bukkit.getServer().addRecipe(recipe);
        Main.getEssences().put(Keys.getBaseEnchantedBook(), item);
    }

    private void PricklyEssence(){
        ItemStack item = new ItemStack(Material.CACTUS);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.GREEN+""+ChatColor.BOLD+"Prickly Essence"));
        meta.getPersistentDataContainer().set(Keys.getPricklyEssence(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getPricklyEssence(), item);
        recipe.shape("BCB","C C","BCB");
        recipe.setIngredient('B', Material.IRON_BARS);
        recipe.setIngredient('C', Material.CACTUS);
        Bukkit.getServer().addRecipe(recipe);
        Main.getEssences().put(Keys.getPricklyEssence(), item);
    }

    private void CushionEssence(){
        ItemStack item = new ItemStack(Material.FEATHER);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.WHITE+""+ChatColor.BOLD+"Cushion Essence"));
        meta.getPersistentDataContainer().set(Keys.getCushionEssence(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getCushionEssence(), item);
        recipe.shape("FFF","FSF","FFF");
        recipe.setIngredient('F', Material.FEATHER);
        recipe.setIngredient('S', Material.SLIME_BALL);
        Bukkit.getServer().addRecipe(recipe);
        Main.getEssences().put(Keys.getCushionEssence(), item);
    }

    private void StriderEssence(){
        ItemStack item = new ItemStack(Material.SUGAR);
        ItemMeta meta = item.getItemMeta();
        meta.getPersistentDataContainer().set(Keys.getStriderEssence(), PersistentDataType.BYTE, (byte) 1);
        meta.displayName(Component.text(ChatColor.WHITE+""+ChatColor.BOLD+"Strider Essence"));
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getStriderEssence(), item);
        recipe.shape("SSS","SBS","SSS");
        recipe.setIngredient('S', Material.SUGAR);
        recipe.setIngredient('B', Material.WATER_BUCKET);
        Bukkit.getServer().addRecipe(recipe);
        Main.getEssences().put(Keys.getStriderEssence(), item);
    }

    private void OxidisedEssence(){
        ItemStack item = new ItemStack(Material.GREEN_DYE);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.GREEN+""+ChatColor.BOLD+"Oxidised Essence"));
        meta.getPersistentDataContainer().set(Keys.getOxidizedEssence(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getOxidizedEssence() ,item);
        recipe.shape("SSS","SSS","SSS");
        recipe.setIngredient('S',Material.SEAGRASS);
        Bukkit.getServer().addRecipe(recipe);
        Main.getEssences().put(Keys.getOxidizedEssence(), item);
    }

    private void LureEssence(){
        ItemStack item = new ItemStack(Material.ORANGE_DYE);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.GOLD+""+ChatColor.BOLD+"Lure Essence"));
        meta.getPersistentDataContainer().set(Keys.getLureEssence(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getLureEssence(), item);
        recipe.shape("SSS","sGs","sss");
        recipe.setIngredient('S', Material.STRING);
        recipe.setIngredient('s', Material.STICK);
        recipe.setIngredient('G', Material.TROPICAL_FISH);
        Bukkit.getServer().addRecipe(recipe);
        Main.getEssences().put(Keys.getLureEssence(), item);
    }

    private void FrostEssence(){
        ItemStack item = new ItemStack(Material.PACKED_ICE);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.BLUE+""+ChatColor.BOLD+"Frost Essence"));
        meta.getPersistentDataContainer().set(Keys.getFrostEssence(),PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getFrostEssence(), item);
        recipe.shape("III","IRI","III");
        recipe.setIngredient('I', Material.ICE);
        recipe.setIngredient('R', Material.REDSTONE_BLOCK);
        Bukkit.getServer().addRecipe(recipe);
        Main.getEssences().put(Keys.getFrostEssence(), item);
    }

    private void HardeningEssence(){
        ItemStack item = new ItemStack(Material.IRON_BARS);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.WHITE+""+ChatColor.BOLD+"Hardening Essence"));
        meta.getPersistentDataContainer().set(Keys.getHardeningEssence(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getHardeningEssence(), item);
        recipe.shape("BBB","BIB","BBB");
        recipe.setIngredient('B', Material.IRON_BARS);
        recipe.setIngredient('I', Material.IRON_BLOCK);
        Bukkit.getServer().addRecipe(recipe);
        Main.getEssences().put(Keys.getHardeningEssence(), item);
    }

    private void LuckEssence(){
        ItemStack item = new ItemStack(Material.BLUE_DYE);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.DARK_BLUE+""+ChatColor.BOLD+"Luck Essence"));
        meta.getPersistentDataContainer().set(Keys.getLuckEssence(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getLuckEssence(), item);
        recipe.shape("LLL","LGL","LLL");
        recipe.setIngredient('L', Material.LAPIS_LAZULI);
        recipe.setIngredient('G', Material.GOLD_INGOT);
        Bukkit.getServer().addRecipe(recipe);
        Main.getEssences().put(Keys.getLuckEssence(), item);
    }

    private void MobEssence(){
        ItemStack item = new ItemStack(Material.BLACK_DYE);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.BLACK+""+ ChatColor.BOLD+"Mob Essence"));
        meta.getPersistentDataContainer().set(Keys.getMobEssence(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getMobEssence(), item);
        recipe.shape("BRB","RLR","BRB");
        recipe.setIngredient('R', Material.ROTTEN_FLESH);
        recipe.setIngredient('B', Material.BONE);
        recipe.setIngredient('L', Material.LAPIS_LAZULI);
        Bukkit.getServer().addRecipe(recipe);
        Main.getEssences().put(Keys.getMobEssence(), item);
    }

    private void QuickeningCharge(){
        ItemStack item = new ItemStack(Material.REDSTONE);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.RED+""+ ChatColor.BOLD+"Quickening Charge"));
        meta.getPersistentDataContainer().set(Keys.getQuickeningEssence(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getQuickeningEssence(), item);
        recipe.shape("RRR","RGR","RRR");
        recipe.setIngredient('R', Material.REDSTONE);
        recipe.setIngredient('G', Material.GOLD_NUGGET);
        Bukkit.getServer().addRecipe(recipe);
        Main.getEssences().put(Keys.getQuickeningEssence(), item);
    }

    private void SilkyJewel(){
        ItemStack item = new ItemStack(Material.YELLOW_DYE);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.YELLOW+""+ChatColor.BOLD+"Silky Jewel"));
        meta.getPersistentDataContainer().set(Keys.getSilkyJewel(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getSilkyJewel(), item);
        recipe.shape("GSG","SES","GSG");
        recipe.setIngredient('G', Material.GOLD_INGOT);
        recipe.setIngredient('S', Material.STRING);
        recipe.setIngredient('E', Material.EMERALD);
        Bukkit.getServer().addRecipe(recipe);
        Main.getEssences().put(Keys.getSilkyJewel(), item);
    }

    private void BlazeEssence(){
        ItemStack item = new ItemStack(Material.BLAZE_POWDER);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.DARK_RED+""+ChatColor.BOLD+"Blaze Essence"));
        meta.getPersistentDataContainer().set(Keys.getBlazeEssence(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getBlazeEssence(), item);
        recipe.shape("BBB","BIB","BBB");
        recipe.setIngredient('B', Material.BLAZE_POWDER);
        recipe.setIngredient('I', Material.IRON_INGOT);
        Bukkit.getServer().addRecipe(recipe);
        Main.getEssences().put(Keys.getBlazeEssence(), item);
    }

    private void ArachnidEssence(){
        ItemStack item = new ItemStack(Material.SPIDER_EYE);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.BLUE+""+ChatColor.BOLD+"Arachnid Essence"));
        meta.getPersistentDataContainer().set(Keys.getArachnidEssence(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getArachnidEssence(), item);
        recipe.shape("SSS","STS","SSS");
        recipe.setIngredient('T', Material.STRING);
        recipe.setIngredient('S', Material.SPIDER_EYE);
        Bukkit.getServer().addRecipe(recipe);
        Main.getEssences().put(Keys.getArachnidEssence(), item);
    }

    private void UndeadEssence(){
        ItemStack item = new ItemStack(Material.ROTTEN_FLESH);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.GRAY+""+ ChatColor.BOLD+"Undead Essence"));
        meta.getPersistentDataContainer().set(Keys.getUndeadEssence(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getUndeadEssence(), item);
        recipe.shape("RRR","RIR","RRR");
        recipe.setIngredient('R', Material.ROTTEN_FLESH);
        recipe.setIngredient('I', Material.IRON_INGOT);
        Bukkit.getServer().addRecipe(recipe);
        Main.getEssences().put(Keys.getUndeadEssence(), item);
    }

    private void SkeletonEssence(){
        ItemStack item = new ItemStack(Material.BONE);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.WHITE+""+ChatColor.BOLD+"Skeleton Essence"));
        meta.getPersistentDataContainer().set(Keys.getSkeletonEssence(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getSkeletonEssence(), item);
        recipe.shape("BBB","BOB","BBB");
        recipe.setIngredient('B', Material.BONE);
        recipe.setIngredient('O', Material.BOW);
        Bukkit.getServer().addRecipe(recipe);
        Main.getEssences().put(Keys.getSkeletonEssence(), item);
    }

    private void CombustibleScraps(){
        ItemStack item = new ItemStack(Material.GRAY_DYE);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.GRAY+""+ChatColor.BOLD+"Combustible Scraps"));
        meta.getPersistentDataContainer().set(Keys.getCombustibleScraps(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getCombustibleScraps(), item);
        recipe.shape("III","IGI","III");
        recipe.setIngredient('I', Material.IRON_INGOT);
        recipe.setIngredient('G', Material.GUNPOWDER);
        Bukkit.getServer().addRecipe(recipe);
        Main.getEssences().put(Keys.getCombustibleScraps(), item);
    }

    private void ProjectileScraps(){
        ItemStack item = new ItemStack(Material.LIGHT_GRAY_DYE);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.GRAY+""+ChatColor.BOLD+"Projectile Scraps"));
        meta.getPersistentDataContainer().set(Keys.getProjectileScraps(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getProjectileScraps(), item);
        recipe.shape("III","IAI","III");
        recipe.setIngredient('I', Material.IRON_INGOT);
        recipe.setIngredient('A', Material.ARROW);
        Bukkit.getServer().addRecipe(recipe);
        Main.getEssences().put(Keys.getProjectileScraps(), item);
    }

    private void FlameScraps(){
        ItemStack item = new ItemStack(Material.RED_DYE);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.RED+""+ChatColor.BOLD+"Flame Scraps"));
        meta.getPersistentDataContainer().set(Keys.getFlameScraps(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getFlameScraps(), item);
        recipe.shape("III","IBI","III");
        recipe.setIngredient('I', Material.IRON_INGOT);
        recipe.setIngredient('B', Material.BLAZE_POWDER);
        Bukkit.getServer().addRecipe(recipe);
        Main.getEssences().put(Keys.getFlameScraps(), item);
    }

    private void ProtectionScraps(){
        ItemStack item = new ItemStack(Material.BONE_MEAL);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.WHITE+""+ChatColor.BOLD+"Protection Scraps"));
        meta.getPersistentDataContainer().set(Keys.getProtectionScraps(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getProtectionScraps(), item);
        recipe.shape("III","ILI","III");
        recipe.setIngredient('I', Material.IRON_INGOT);
        recipe.setIngredient('L', Material.LAPIS_LAZULI);
        Bukkit.getServer().addRecipe(recipe);
        Main.getEssences().put(Keys.getProtectionScraps(), item);
    }

    private void OtherworldlyTrophy(){
        ItemStack item = new ItemStack(Material.END_CRYSTAL);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.DARK_PURPLE+""+ChatColor.BOLD+"Otherworldly Trophy"));
        meta.getPersistentDataContainer().set(Keys.getOtherworldlyTrophy(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getOtherworldlyTrophy(), item);
        recipe.shape("NSN","GEG","NDN");
        recipe.setIngredient('G', Material.GHAST_TEAR);
        recipe.setIngredient('S', Material.NETHER_STAR);
        recipe.setIngredient('N', Material.NETHERITE_SCRAP);
        recipe.setIngredient('E', Material.ENDER_EYE);
        recipe.setIngredient('D', Material.DRAGON_EGG);
        Bukkit.getServer().addRecipe(recipe);
        Main.getEssences().put(Keys.getOtherworldlyTrophy(), item);
    }

    private void SplicingEssence(){
        ItemStack item = new ItemStack(Material.GRAY_DYE);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.GRAY+""+ChatColor.BOLD+"Splicing Essence"));
        meta.getPersistentDataContainer().set(Keys.getSplicingEssence(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getSplicingEssence(), item);
        recipe.shape("ARA","RER","ARA");
        recipe.setIngredient('A', Material.ARROW);
        recipe.setIngredient('R', Material.REDSTONE);
        recipe.setIngredient('E', Material.ENDER_PEARL);
        Bukkit.getServer().addRecipe(recipe);
        Main.getEssences().put(Keys.getSplicingEssence(), item);
    }

    private void TreasureEssence(){
        ItemStack item = new ItemStack(Material.LIGHT_BLUE_DYE);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(ChatColor.AQUA+""+ChatColor.BOLD+"Treasure Essence"));
        meta.getPersistentDataContainer().set(Keys.getTreasureEssence(), PersistentDataType.BYTE, (byte) 1);
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getTreasureEssence(), item);
        recipe.shape("GLG","LPL","GLG");
        recipe.setIngredient('L', Material.LAPIS_LAZULI);
        recipe.setIngredient('G', Material.GOLD_NUGGET);
        recipe.setIngredient('P', Material.PUFFERFISH);
        Bukkit.getServer().addRecipe(recipe);
        Main.getEssences().put(Keys.getTreasureEssence(), item);
    }

    private void NetherShard(){
        ItemStack item = new ItemStack(Material.MAGMA_CREAM);
        ItemMeta meta = item.getItemMeta();
        meta.getPersistentDataContainer().set(Keys.getNetherShard(), PersistentDataType.BYTE, (byte) 1);
        meta.displayName(Component.text(ChatColor.DARK_RED+""+ChatColor.BOLD+"Nether Shard"));
        item.setItemMeta(meta);
        ShapedRecipe recipe = new ShapedRecipe(Keys.getNetherShard(), item);
        recipe.shape("S S"," M ","BBB");
        recipe.setIngredient('S', Material.SOUL_LANTERN);
        recipe.setIngredient('M', Material.MAGMA_CREAM);
        recipe.setIngredient('B', Material.BLACKSTONE);
        Bukkit.getServer().addRecipe(recipe);
        Main.getEssences().put(Keys.getNetherShard(), item);
    }
}
