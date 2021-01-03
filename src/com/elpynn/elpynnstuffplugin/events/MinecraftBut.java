package com.elpynn.elpynnstuffplugin.events;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class MinecraftBut implements Listener {

    @EventHandler
    public static void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.sendMessage("§7[§a+§7] §aWelcome to the server!");
        player.setHealth(20);
    }

    @EventHandler
    public void creatureSpawn(CreatureSpawnEvent event) {
        if (event.getEntityType() == EntityType.CREEPER) {
            Creeper creeper = (Creeper) event.getEntity();

            creeper.setPowered(true);
        } else if (event.getEntityType() == EntityType.ZOMBIE) {
            Zombie zombie = (Zombie) event.getEntity();

            zombie.getEquipment().setHelmet(new ItemStack(Material.NETHERITE_HELMET));
            zombie.getEquipment().setChestplate(new ItemStack(Material.NETHERITE_CHESTPLATE));
            zombie.getEquipment().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
            zombie.getEquipment().setBoots(new ItemStack(Material.NETHERITE_BOOTS));

            zombie.getEquipment().setItemInMainHand(new ItemStack(Material.NETHERITE_SWORD));

        } else if (event.getEntityType() == EntityType.SKELETON) {
            Skeleton skeleton = (Skeleton) event.getEntity();

            skeleton.getEquipment().setHelmet(new ItemStack(Material.NETHERITE_HELMET));
            skeleton.getEquipment().setChestplate(new ItemStack(Material.NETHERITE_CHESTPLATE));
            skeleton.getEquipment().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
            skeleton.getEquipment().setBoots(new ItemStack(Material.NETHERITE_BOOTS));

            ItemStack punchBow = new ItemStack(Material.BOW);
            punchBow.addEnchantment(Enchantment.ARROW_KNOCKBACK, 2);

            skeleton.getEquipment().setItemInMainHand(punchBow);
        } else if (event.getEntityType() == EntityType.SPIDER) {
            Spider spider = (Spider) event.getEntity();
            ((spider)).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 2147483647, 4));
        }
    }
}