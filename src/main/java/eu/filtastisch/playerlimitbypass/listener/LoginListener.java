package eu.filtastisch.playerlimitbypass.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class LoginListener implements Listener {

    @EventHandler
    public void onPlayerLogin(PlayerLoginEvent event){
        if (!event.getResult().equals(PlayerLoginEvent.Result.KICK_FULL))
            return;
        if (!event.getPlayer().hasPermission("playerlimit.bypass"))
            return;
        event.setResult(PlayerLoginEvent.Result.ALLOWED);
    }

}
