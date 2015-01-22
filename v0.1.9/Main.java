package thebawsgamer.troll;

import java.io.PrintStream;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.PluginCommand;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.FileConfigurationOptions;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main
  extends JavaPlugin
  implements Listener
{
  public static boolean update = false;
  public static String name = "";
  public static Updater.ReleaseType type = null;
  public static String version = "";
  public static String link = "";
  private static Plugin plugin;
  
  public void onEnable()
  {
    plugin = this;
    spawn cmd = new spawn(this);
    Potion cmd1 = new Potion();
    getCommand("murder").setExecutor(new Murder());
    getCommand("blowup").setExecutor(new Blowup());
    getCommand("strike").setExecutor(new Smite());
    getCommand("burn").setExecutor(new Burn());
    getCommand("falseop").setExecutor(new Fop());
    getCommand("falsedeop").setExecutor(new Fdeop());
    getCommand("falseleave").setExecutor(new Fleave(this));
    getCommand("frmod").setExecutor(new FRmod(this));
    getCommand("fradmin").setExecutor(new FRadmin(this));
    getCommand("nickr").setExecutor(new NickR());
    getCommand("spawn").setExecutor(cmd);
    getCommand("potion").setExecutor(cmd1);
    Bukkit.getServer().getPluginManager().registerEvents(this, this);
    String path = "admintroll.fake.leave";
    String path2 = "admintroll.fake.leave_color";
    String path3 = "admintroll.fake.rank.moderator.messageTOtarget";
    String path4 = "admintroll.fake.rank.moderator.displayname";
    String path5 = "admintroll.fake.rank.admin.displayname";
    String path6 = "admintroll.fake.rank.admin.messageTOtarget";
    String DoNotEdit = "From the developers";
    String NotEnoughArgs = "exceptions.commands.arguments.notenough";
    String TooManyArgs = "exceptions.commands.arguments.toomany";
    plugin.getConfig().addDefault("admintroll.auto.update", Boolean.valueOf(true));
    plugin.getConfig().addDefault("admintroll.potion.poison", Integer.valueOf(1000));
    plugin.getConfig().addDefault(path, " has left the game.");
    plugin.getConfig().addDefault(path2, "&e");
    plugin.getConfig().addDefault(path4, "&8[&5Mod&8]");
    plugin.getConfig().addDefault(path3, "&4You are now a moderator!");
    plugin.getConfig().addDefault(path5, "&8[&4Admin&8]");
    plugin.getConfig().addDefault(path6, "&4You are now a administrator!");
    plugin.getConfig().addDefault(NotEnoughArgs, "&4Not enough arguments! Please use with the correct arguments!");
    plugin.getConfig().addDefault(DoNotEdit, "Dear Server Owner, please do not edit this section unless you know what you are doing. This section deals with error messages such as too long arguments when executing a command or if a target player is offline.");
    plugin.getConfig().addDefault(TooManyArgs, "&4Too many arguments! Please use with correct arguments!");
    plugin.getConfig().options().copyDefaults(true);
    plugin.saveConfig();
    System.out.println(ChatColor.GRAY + "[AdminTroll]" + ChatColor.RED + "Has been enabled!");
    Updater updater = new Updater(this, 80827, getFile(), Updater.UpdateType.NO_DOWNLOAD, true);
    update = updater.getResult() == Updater.UpdateResult.UPDATE_AVAILABLE;
    name = updater.getLatestName();
    version = updater.getLatestGameVersion();
    type = updater.getLatestType();
    link = updater.getLatestFileLink();
  }
  
  public void onDisable()
  {
    plugin = null;
  }
  
  @EventHandler
  public void onPlayerJoin(PlayerJoinEvent event)
  {
    if (plugin.getConfig().getBoolean("admintroll.auto.update"))
    {
      Player player = event.getPlayer();
      player.sendMessage(ChatColor.YELLOW + "An update is available: " + name + ", a " + type + " for " + version + " available at " + link);
      player.sendMessage(ChatColor.GREEN + "Please install the update for a more stable build and MORE FEATURES!");
    }
  }
  
  public static void registerEvents(Plugin plugin, Listener... listeners)
  {
    for (Listener listener : listeners) {
      Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
    }
  }
  
  public static Plugin getPlugin()
  {
    return plugin;
  }//Code written by Sunny Zhang//
}
