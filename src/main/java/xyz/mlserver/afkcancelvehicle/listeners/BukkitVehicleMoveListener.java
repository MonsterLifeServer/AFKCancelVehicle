package xyz.mlserver.afkcancelvehicle.listeners;

import net.lapismc.afkplus.playerdata.AFKPlusPlayer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleMoveEvent;
import xyz.mlserver.afkcancelvehicle.AFKCancelVehicle;

public class BukkitVehicleMoveListener implements Listener {

    @EventHandler
    public void on(VehicleMoveEvent e) {
        if (e.getVehicle().getPassengers() == null) return;
        if (e.getVehicle().getPassengers().isEmpty()) return;
        AFKPlusPlayer player = AFKCancelVehicle.getAPI().getPlayer(e.getVehicle().getPassengers().get(0).getUniqueId());
        if (player == null) return;
        player.forceStopAFK();
    }

}
