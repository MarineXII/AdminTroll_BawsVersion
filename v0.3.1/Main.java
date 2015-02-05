package thebawsgamer.troll;
 
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
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
	spawn cmd = new spawn(this);
	Potion cmd1 = new Potion();
	Frank cmd2 = new Frank (this);
	getCommand("murder").setExecutor(new Murder());
	getCommand("blowup").setExecutor(new Blowup());
	getCommand("strike").setExecutor(new Smite());
	getCommand("burn").setExecutor(new Burn());
	getCommand("falseop").setExecutor(new Fop());
	getCommand("falsedeop").setExecutor(new Fdeop());
	getCommand("falseleave").setExecutor(new Fleave(this));
	getCommand("nickr").setExecutor(new NickR());
	getCommand("spawn").setExecutor(cmd);
	getCommand("potion").setExecutor(cmd1);
	getCommand("frank").setExecutor(cmd2);
	Bukkit.getServer().getPluginManager().registerEvents(this, this);
	
	 String path = "admintroll.fake.leave";
	 String path2 = "admintroll.fake.leave_color";
	 String HashNodes = "admintroll.fake.rank.ColourCodes";
	 String path3 = "admintroll.fake.rank.moderator.messageTOtarget";
	 String path4 = "admintroll.fake.rank.moderator.displayname";
	 String path5 = "admintroll.fake.rank.admin.displayname";
	 String path6 = "admintroll.fake.rank.admin.messageTOtarget";
	 String frankcownerdn = "admintroll.fake.rank.coowner.displayname";
	 String frankcownermtt = "admintroll.fake.rank.coowner.messageTOtarget";
	 String frankownerdn = "admintroll.fake.rank.owner.displayname";
	 String frankownermtt = "admintroll.fake.rank.owner.messageTOtarget";
	 String frankvipdn = "admintroll.fake.rank.vip.displayname";
	 String frankvipmtt = "admintroll.fake.rank.vip.messageTOtarget";
	 
	 plugin.getConfig().addDefault("admintroll.auto.update", true);
	 plugin.getConfig().addDefault("admintroll.potion.poison", 1000);
	 plugin.getConfig().addDefault(path, " has left the game.");
	 plugin.getConfig().addDefault(path2, "&e");
	 plugin.getConfig().addDefault(path4, "&8[&5Mod&8]");
	 plugin.getConfig().addDefault(path3, "&4You are now a moderator!");
	 plugin.getConfig().addDefault(path5, "&8[&4Admin&8]");
	 plugin.getConfig().addDefault(path6, "&4You are now a administrator!");
	 plugin.getConfig().addDefault(frankcownermtt, "&4You are now a Co-Owner!");
	 plugin.getConfig().addDefault(frankcownerdn, "&7[&3Co&2-&1Owner&7]");
	 plugin.getConfig().addDefault(HashNodes, "!!!! &1= Blue ,&2= Green ,&3= Cyan ,&4= Red ,&5= Purple ,&6= Orange ,&7= Light Gray ,&8= Dark Gray ,&9= Turquoise Blue ,&0= Black ,&m= Strike Through ,&l= Bold ,&n= Underline ,&o= Itallics ,&k= Magic ,&r= Reset . !!!!");
	 plugin.getConfig().addDefault(frankownerdn, "&5[&2&lOwner&2]");
	 plugin.getConfig().addDefault(frankownermtt, "&4You are now the owner!");
	 plugin.getConfig().addDefault(frankvipdn, "&2<&5V.I.P&2>");
	 plugin.getConfig().addDefault(frankvipmtt, "&2You are now a V.I.P!");
	 plugin.getConfig().options().copyDefaults(true);
     plugin.saveConfig();
     
	System.out.println(ChatColor.GRAY + "[AdminTroll]" + ChatColor.RED + "Has been enabled!");
	Updater updater = new Updater(this, 80827, this.getFile(), Updater.UpdateType.NO_DOWNLOAD, true);
	  update = updater.getResult() == Updater.UpdateResult.UPDATE_AVAILABLE; 
	  name = updater.getLatestName();
	  version = updater.getLatestGameVersion();
	  type = updater.getLatestType(); 
	  link = updater.getLatestFileLink();
	 
}

public void onDisable() {
	plugin = null;
				}

@EventHandler
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
