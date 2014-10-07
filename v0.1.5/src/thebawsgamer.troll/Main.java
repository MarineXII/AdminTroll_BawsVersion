package thebawsgamer.troll;
 
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import thebawsgamer.troll.Updater.ReleaseType;
 
 
public class Main extends JavaPlugin implements Listener{ 

	public static boolean update = false;
	public static String name = "";
	public static ReleaseType type = null;
	public static String version = "";
	public static String link = "";
	private static Plugin plugin;
public void onEnable() {
	plugin = this;
	spawn cmd = new spawn();
	Potion cmd1 = new Potion();
	getCommand("murder").setExecutor(new Murder());
	getCommand("blowup").setExecutor(new Blowup());
	getCommand("strike").setExecutor(new Smite());
	getCommand("burn").setExecutor(new Burn());
	getCommand("falseop").setExecutor(new Fop());
	getCommand("falsedeop").setExecutor(new Fdeop());
	getCommand("falseleave").setExecutor(new Fleave(this));
	getCommand("spawn").setExecutor(cmd);
	getCommand("potion").setExecutor(cmd1);
	Bukkit.getServer().getPluginManager().registerEvents(this, this);
	 String path = "admintroll.fake.leave";
	 String path2 = "admintroll.fake.leave_color";
	 String path3 = "admintroll.fake.rank.moderator";
	 plugin.getConfig().addDefault("admintroll.auto.update", true);
	 plugin.getConfig().addDefault("admintroll.potion.poison", 1000);
	 plugin.getConfig().addDefault(path, " has left the game.");
	 plugin.getConfig().addDefault(path2, "&e");
	 plugin.getConfig().addDefault(path3, "&8[&5Mod&8]");
     plugin.getConfig().options().copyDefaults(true);
     plugin.saveConfig();
	System.out.println(ChatColor.GRAY + "[AdminTroll]" + ChatColor.RED + "Has been enabled!");
	Updater updater = new Updater(this, 80827, this.getFile(), Updater.UpdateType.NO_DOWNLOAD, false);
	  update = updater.getResult() == Updater.UpdateResult.UPDATE_AVAILABLE; 
	  name = updater.getLatestName();
	  version = updater.getLatestGameVersion();
	  type = updater.getLatestType(); 
	  link = updater.getLatestFileLink();
}

public void onDisable() {
	plugin = null;
				}

@EventHandler (priority = EventPriority.HIGHEST)
public void onPlayerJoin(PlayerJoinEvent event){
	 if(plugin.getConfig().getBoolean("admintroll.auto.update") == true){
			Player player = event.getPlayer();    
	    	player.sendMessage(ChatColor.YELLOW + "An update is available: " + Main.name + ", a " + Main.type + " for " + Main.version + " available at " + Main.link);
	    	player.sendMessage(ChatColor.GREEN + "Please install the update for a more stable build and MORE FEATURES!");
	    	}
}
		
 
public static void registerEvents(org.bukkit.plugin.Plugin plugin, Listener... listeners) {
	for (Listener listener : listeners) {
		Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
	}
}
 
public static Plugin getPlugin() {
	return plugin;
}

}

 
