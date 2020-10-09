package org.l2x9.antiillegal;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.l2x9.antiillegal.events.*;

public final class Main extends JavaPlugin {
    private final PluginManager pluginManager = getServer().getPluginManager();
    @Override
    public void onEnable() {
        pluginManager.registerEvents(new BlockPlace(), this);
        pluginManager.registerEvents(new ChunkLoad(), this);
        pluginManager.registerEvents(new HopperTansfer(), this);
        pluginManager.registerEvents(new InventoryClose(), this);
        pluginManager.registerEvents(new InventoryOpen(), this);
        pluginManager.registerEvents(new ItemPickup(), this);
        pluginManager.registerEvents(new PlayerScroll(), this);
        getCommand("airl").setExecutor(new ReloadConfig());
        getLogger().info("5B5T AntiIllegal by 254n_m enabled");
        saveDefaultConfig();


    }
    public static Main getPlugin() {
        return getPlugin(Main.class);
    }
}
