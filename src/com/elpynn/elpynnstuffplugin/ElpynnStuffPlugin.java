package com.elpynn.elpynnstuffplugin;

import com.elpynn.elpynnstuffplugin.commands.FarmingCommand;
import com.elpynn.elpynnstuffplugin.events.MinecraftBut;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class ElpynnStuffPlugin extends JavaPlugin {


    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new MinecraftBut(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[ESP] Plugin is enabled!");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[ESP] Plugin is disabled!");
    }
}
