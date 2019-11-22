package com.server.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class OfficeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player)commandSender;

        if(!p.isOp()) {
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4You need to be OP to perform this action."));
            return true;
        }

        Location l = p.getLocation();
        l.setX(179.5);
        l.setY(75);
        l.setZ(118.5);
        l.setWorld(Bukkit.getServer().getWorld("world"));

        p.teleport(l);

        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bTeleported you to the office!"));

        return true;
    }
}
