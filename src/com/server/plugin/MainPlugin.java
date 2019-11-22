package com.server.plugin;

import com.server.commands.*;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public class MainPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("MainPlugin started!");

        //COMMANDS
        this.getCommand("spawn").setExecutor(new SpawnCommand());
        this.getCommand("lobby").setExecutor(new SpawnCommand());
        this.getCommand("points").setExecutor(new PointsCommand());
        this.getCommand("help").setExecutor(new HelpCommand());
        this.getCommand("play").setExecutor(new PlayCommand());
        this.getCommand("office").setExecutor(new OfficeCommand());
    }
}
