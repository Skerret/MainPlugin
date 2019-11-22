package com.server.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PlayCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player)commandSender;
        Location l = player.getLocation();
        l.setX(320.5);
        l.setY(67);
        l.setZ(214.5);
        l.setWorld(Bukkit.getServer().getWorld("world"));

        player.teleport(l);
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bTeleported you to the play area!"));

        return true;
    }
}
