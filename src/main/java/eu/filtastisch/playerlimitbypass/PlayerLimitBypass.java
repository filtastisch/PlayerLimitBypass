package eu.filtastisch.playerlimitbypass;

import eu.filtastisch.playerlimitbypass.listener.LoginListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlayerLimitBypass extends JavaPlugin {

    @Override
    public void onEnable() {
        this.registerListener();
    }

    @Override
    public void onDisable() {}

    private void registerListener(){
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new LoginListener(), this);
    }

}
