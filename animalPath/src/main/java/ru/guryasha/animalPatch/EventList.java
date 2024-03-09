package ru.guryasha.animalPatch;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

public class EventList implements Listener {
    @EventHandler
    private void spawnZombieHorseEveryNight(EntitySpawnEvent e) {
        if (e.getEntityType() != EntityType.ZOMBIE){
            return;
        }
        if (Math.random() < 0.05){
            e.setCancelled(true);
            e.getEntity().getWorld().spawnEntity(e.getLocation(), EntityType.ZOMBIE_HORSE);
        }
    }
    @EventHandler
    private void spawnSkeletHorseEverynight(EntitySpawnEvent e) {
        if (e.getEntityType() != EntityType.SKELETON){
            return;
        }
        if (Math.random() < 0.05){
            e.setCancelled(true);
            e.getEntity().getWorld().spawnEntity(e.getLocation(), EntityType.SKELETON_HORSE);
        }
    }

}
