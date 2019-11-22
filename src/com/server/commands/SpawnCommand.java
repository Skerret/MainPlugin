package com.server.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Objects;

public class SpawnCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player)sender;

        if(sender instanceof Player) {
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bSending you to spawn!"));

            Location spawn = Objects.requireNonNull(Bukkit.getServer().getWorld("world")).getSpawnLocation();
            spawn.setX(spawn.getX() + 0.5);
            spawn.setZ(spawn.getZ() + 0.5);
            player.teleport(spawn);
        }
        else {
            sender.sendMessage("Hey! You can't use this in the console!");
        }
        return true;
    }
}
