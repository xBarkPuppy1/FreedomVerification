package com.mcplugindev.freedomverify;

import com.mcplugindev.freedomverify.listener.Verify;
import java.util.logging.Level;
import org.bukkit.Server;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class FreedomVerify extends JavaPlugin {

    public static FreedomVerify plugin;
    public static Server server;

    @Override
    public void onLoad() {
        plugin = this;

    }

    @Override
    public void onEnable() {
        final PluginManager pm = plugin.getServer().getPluginManager();
        pm.registerEvents(new Verify(), plugin);
        plugin.getLogger().log(Level.INFO, "FreedomVerify v{0} has been enabled!", plugin.getDescription().getVersion());
        plugin.getLogger().log(Level.INFO, "The current FreedomVerify developers are FoxIshDaBest, DUFCLiam, _JustYellow, and tylerhyperHD.");

    }

    @Override
    public void onDisable() {
        plugin.getLogger().log(Level.INFO, "FreedomVerify v{0} has been disabled!", plugin.getDescription().getVersion());

    }

}
