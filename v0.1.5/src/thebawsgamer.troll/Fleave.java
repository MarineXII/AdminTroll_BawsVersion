package thebawsgamer.troll;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fleave implements CommandExecutor {
	public Main plugin;
	public Fleave(Main plugin){
		this.plugin = plugin;
		}
	

		public boolean onCommand(CommandSender sender, Command cmd,String commandLabel, String args[]) {
			if (cmd.getName().equalsIgnoreCase("falseleave")) {
				if(args.length == 0){
					Player player = (Player) sender;
					Bukkit.broadcastMessage(plugin.getConfig().getString("admintroll.fake.leave_color").replaceAll("&", "§") + (player.getDisplayName ()) + (plugin.getConfig().getString("admintroll.fake.leave")));
					}else if (args.length == 1){
						Player player = (Player) sender;
						Player target = Bukkit.getServer().getPlayer(args[0]);
						if(target != null){
						Bukkit.broadcastMessage(plugin.getConfig().getString("admintroll.fake.leave_color").replaceAll("&", "§") + (target.getDisplayName()) + (plugin.getConfig().getString("admintroll.fake.leave")));
							}else{
								player.sendMessage(ChatColor.RED + args[0] + " is not online!");
							}
						}
			}
			return false;
		}
}
