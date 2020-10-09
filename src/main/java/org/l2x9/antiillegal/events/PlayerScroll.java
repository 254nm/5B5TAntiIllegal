package org.l2x9.antiillegal.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.l2x9.antiillegal.Main;
import org.l2x9.antiillegal.util.ItemUtils;

public class PlayerScroll implements Listener {
    ItemUtils itemUtils = new ItemUtils();

    @EventHandler
    public void onItemMove(PlayerItemHeldEvent event) {
        if (Main.getPlugin().getConfig().getBoolean("AntiIllegal.PlayerHotbarMove-Enabled")) {
            Player player = event.getPlayer();
            itemUtils.deleteIllegals(player.getInventory());
        }
    }
}
