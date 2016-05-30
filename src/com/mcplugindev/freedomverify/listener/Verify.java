package com.mcplugindev.freedomverify.listener;

import com.mcplugindev.freedomverify.TotalFreedom5_Getter;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Verify implements Listener {

    public static final String BOTPREFIX = ChatColor.DARK_GRAY + "[" + ChatColor.DARK_RED + "Freedom" + ChatColor.RED + "Bot" + ChatColor.DARK_GRAY + "]" + ChatColor.RESET + " ";

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        String message = event.getMessage();
        if (!TotalFreedom5_Getter.getInstance().getAdminList().isAdmin(player)) {
            if (TotalFreedom5_Getter.getInstance().getAdminList().isAdminImpostor(player)) {
                if (message.equalsIgnoreCase("!verify")) {
                    event.setCancelled(true);
                    player.sendMessage(BOTPREFIX + "You forgot to type the password!");
                } else if (message.equalsIgnoreCase("!verify ")) {// TODO: Config

                }
            }
        }

    }
}
