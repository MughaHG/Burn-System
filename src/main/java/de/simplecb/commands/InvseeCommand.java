package de.simplecb.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class InvseeCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Du bist nicht in Minecraft 5Head");
            return false;
        }
        Player p = (Player)sender;
        if (args.length == 1) {
            Player target = Bukkit.getPlayer(args[0]);
            if (target == null || !target.isOnline()) {
                p.sendMessage(ChatColor.GREEN + "Der gewünschte Spieler ist im moment nicht Online!");
                return false;
            }
            p.openInventory((Inventory)target.getInventory());
        } else {
            p.sendMessage(ChatColor.AQUA + "/Invsee [Spieler]");
        }
        return false;
    }
}
