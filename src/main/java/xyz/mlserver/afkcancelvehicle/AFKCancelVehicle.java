package xyz.mlserver.afkcancelvehicle;

import net.lapismc.afkplus.api.AFKPlusPlayerAPI;
import org.bukkit.plugin.java.JavaPlugin;

public final class AFKCancelVehicle extends JavaPlugin {

    private static AFKPlusPlayerAPI api;

    public static AFKPlusPlayerAPI getAPI() {
        return api;
    }

    @Override
    public void onEnable() {
        api = new AFKPlusPlayerAPI();

        getServer().getPluginManager().registerEvents(new xyz.mlserver.afkcancelvehicle.listeners.BukkitVehicleMoveListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
