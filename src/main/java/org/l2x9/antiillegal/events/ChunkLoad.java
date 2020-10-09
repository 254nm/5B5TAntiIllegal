package org.l2x9.antiillegal.events;

import org.bukkit.block.BlockState;
import org.bukkit.block.Container;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.ChunkLoadEvent;
import org.l2x9.antiillegal.Main;
import org.l2x9.antiillegal.util.ItemUtils;

public class ChunkLoad implements Listener {
    ItemUtils itemUtils = new ItemUtils();

    @EventHandler
    @AntiIllegal(EventName = "ChunkLoadEvent")
    public void onLoad(ChunkLoadEvent event) {
        if (Main.getPlugin().getConfig().getBoolean("AntiIllegal.ChunkLoad-Enabled")) {
            for (BlockState state : event.getChunk().getTileEntities()) {
                if (state instanceof Container) {
                    Container container = (Container) state;
                    itemUtils.deleteIllegals(container.getInventory());

                }
            }
        }
    }
}