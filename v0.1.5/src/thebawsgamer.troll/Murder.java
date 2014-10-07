package thebawsgamer.troll;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class Murder implements CommandExecutor {

	@SuppressWarnings("unused")
	private static final CommandSender player = null;

	public boolean onCommand(CommandSender sender, Command cmd,String commandLabel, String args[]) {
	if (commandLabel.equalsIgnoreCase("murder")) {
		if (args.length == 0) {
			Player player = (Player) sender;
			player.sendMessage(ChatColor.RED + "Dude you hate life?");
			player.setHealth(0F);
		} else if (args.length == 1) {
			Player player = (Player) sender;
			Player targetPlayer = player.getServer().getPlayer(args[0]);
			if (targetPlayer != null) {
				player.sendMessage(ChatColor.BLUE+ "Kill em bro KILL EM!");
				targetPlayer.setHealth(0F);
			} else {
				player.sendMessage(ChatColor.RED + args[0]+ " is not online!");
			}
		}
	}
	return false;
	}
	
}
