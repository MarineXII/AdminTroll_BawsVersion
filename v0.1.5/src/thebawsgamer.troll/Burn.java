package thebawsgamer.troll;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class Burn implements CommandExecutor{

	public boolean onCommand(CommandSender sender, Command cmd,String commandLabel, String args[]) {
		if (cmd.getName().equalsIgnoreCase("burn")) {
			if(args.length == 0){
				Player player = (Player) sender;
				player.sendMessage(ChatColor.BLUE + "You are now being burnt into steak!");
				player.setFireTicks(20000);
			}else if (args.length == 1) {
				Player player = (Player) sender;
				Player target = Bukkit.getServer().getPlayer(args[0]);
				if(target != null){
				target.setFireTicks(1000);
				target.sendMessage(ChatColor.RED + "You are being burnt!");
				player.sendMessage(ChatColor.RED + "Burning " + target.getName());
				}else{
					player.sendMessage(ChatColor.RED + args[0] + " is not online!");
				}
	}
		}
		return false;
		
}
}
