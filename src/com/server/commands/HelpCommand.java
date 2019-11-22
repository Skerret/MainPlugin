package com.server.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelpCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if(sender instanceof Player) {
            Location l = ((Player) sender).getLocation();
            l.setX(176.46);
            l.setY(65.00);
            l.setZ(82.58);
            l.setPitch(86.63f);
            l.setYaw(366.17f);
            l.setWorld(Bukkit.getWorld("world"));
            ((Player) sender).teleport(l);
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bSent you to the help area."));
        } else {
            sender.sendMessage("No");
        }

        return true;
    }
}
