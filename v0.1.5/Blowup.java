package thebawsgamer.troll;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Blowup implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd,String commandLabel, String args[]) {
	if(commandLabel.equalsIgnoreCase("blowup")){
		if (args.length == 0) {
			Player player = (Player) sender;
			Location loc = player.getLocation();
			loc.getWorld().createExplosion(loc, 8.0F);
			player.sendMessage(ChatColor.LIGHT_PURPLE + "Going for a ride?");
		} else if (args.length == 1) {
			Player player = (Player) sender;
			if (player.getServer().getPlayer(args[0]) != null) {
				Player targetPlayer = player.getServer().getPlayer(args[0]);
				Location location = targetPlayer.getLocation();
				location.getWorld().createExplosion(location, 8.0F);
				player.sendMessage(ChatColor.RED+ "Blowing up target!");
			} else {
				player.sendMessage(ChatColor.RED + args[0] + " is not online!");
			}
		}
	}
	return false;
}


}
