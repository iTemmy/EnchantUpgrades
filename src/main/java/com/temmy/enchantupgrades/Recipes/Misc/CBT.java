package com.temmy.enchantupgrades.Recipes.Misc;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

public class CBT {

    public CBT(){
        CBTRecipe();
    }

    private void CBTRecipe(){
        ItemStack item = new ItemStack(Material.BOOK);
        BookMeta BMeta = (BookMeta) item.getItemMeta();
        BMeta.page(1, Component.text("Cock and ball torture (CBT), penis torture or dick torture is a " +
                "sexual activity involving application of pain or constriction to the penis or testicles. This may " +
                "involve directly painful activities, such as genital piercing, wax play, genital spanking, squeezing, " +
                "ball-busting, genital flogging, urethral play"));
        BMeta.page(2, Component.text(", tickle torture, erotic electrostimulation, kneeing or kicking. " +
                "The recipient of such activities may receive direct physical pleasure via masochism, or emotional " +
                "pleasure through erotic humiliation, or knowledge that the play is"));
        BMeta.page(3, Component.text(" pleasing to a sadistic dominant. Many of these practices carry " +
                "significant health risks."));
        BMeta.setAuthor("Wikipedia");
        BMeta.setGeneration(BookMeta.Generation.ORIGINAL);
        BMeta.setTitle("Cock and Ball (CBT)");
        item.setItemMeta(BMeta);
    }
}
