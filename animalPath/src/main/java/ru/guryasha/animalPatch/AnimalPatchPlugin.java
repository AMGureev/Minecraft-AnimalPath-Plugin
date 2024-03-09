package ru.guryasha.animalPatch;

import org.bukkit.plugin.java.JavaPlugin;

public class AnimalPatchPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EventList(), this);
    }
}