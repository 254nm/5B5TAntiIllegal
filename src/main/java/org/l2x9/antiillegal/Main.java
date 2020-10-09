package org.l2x9.antiillegal;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public static Main getPlugin() {
        return getPlugin(Main.class);
    }
}
