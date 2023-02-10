package de.simplecb;

import de.simplecb.commands.Gamemode;
import de.simplecb.commands.InvseeCommand;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("gm").setExecutor(new Gamemode());
        getCommand("invsee").setExecutor(new InvseeCommand());
        Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "System Startet...");
    }
}

