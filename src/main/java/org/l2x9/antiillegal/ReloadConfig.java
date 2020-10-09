package org.l2x9.antiillegal;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ReloadConfig implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("AntiIllegal.reload")) {
            Main.getPlugin().reloadConfig();
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c[5B5TAntiIllegal]&r&6 Config reloaded."));
        }
        return true;
    }
}
