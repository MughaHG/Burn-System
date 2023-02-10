package de.simplecb.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class Gamemode implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0 || args.length == 1){
            if (sender instanceof ConsoleCommandSender){
                return false;
            }
        }
        if(sender instanceof Player){
            Player p = (Player) sender;
            if(args.length == 1) {
                if (p.hasPermission("gm.use")) {
                    if (args[0].equalsIgnoreCase("0")) {
                        p.setGameMode(GameMode.SURVIVAL);
                        p.sendMessage(ChatColor.GOLD + "Du bist nun wieder im Survival Modus!");
                    }
                    if (args[0].equalsIgnoreCase("1")) {
                        p.setGameMode(GameMode.CREATIVE);
                        p.sendMessage(ChatColor.GOLD + "Du bist nun im Creative Mode!");
                    }
                    if (args[0].equalsIgnoreCase("2")) {
                        p.setGameMode(GameMode.ADVENTURE);
                        p.sendMessage(ChatColor.GOLD + "Du bist nun im ADVENTURE Mode!");
                    }
                    if (args[0].equalsIgnoreCase("3")) {
                        p.setGameMode(GameMode.SPECTATOR);
                        p.sendMessage(ChatColor.GOLD + "Du bist nun im Spectator Mode!");
                    }
                } else {
                    p.sendMessage(ChatColor.RED + "Du hast keine Rechte auf diesen Command!");
                }
            }
        }

        return false;
    }
}
