package com.server.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

import java.util.Objects;

public class PointsCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player)sender;

        if(!player.isOp()) {
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4You need to be OP to perform this action."));
            return true;
        }

        ScoreboardManager manager = Bukkit.getScoreboardManager();
        assert manager != null;
        Scoreboard scoreboard = manager.getNewScoreboard();
        Objective objective = scoreboard.getObjective("points");

        assert objective != null;
        Score score = objective.getScore(player);
        score.setScore(score.getScore() + 10);

        return true;
    }
}
