package thebawsgamer.troll;

import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.World;
import org.bukkit.Location;
import org.bukkit.ChatColor;


public class Smite implements CommandExecutor{

	public boolean onCommand(CommandSender sender, Command cmd,String commandLabel, String args[]) {
	if (commandLabel.equalsIgnoreCase("strike")) {
		if (args.length == 0) {
			Player player = (Player) sender;
			World world = player.getWorld();
			Block targetBlock = playerTargetBlock (null, 20);
			Location location = targetBlock.getLocation();
			world.strikeLightning(location);
			world.createExplosion(location, 1);
		} else if (args.length == 1) {
			Player player = (Player) sender;
			World world = player.getWorld();
			Player targetPlayer = player.getServer().getPlayer(args[0]);
			if(targetPlayer != null){
			Location location = targetPlayer.getLocation();
			world.strikeLightning(location);
			player.sendMessage(ChatColor.RED+ "Smitting target!");
			
					}else{
						player.sendMessage(ChatColor.RED + args[0] + " is not online!");
					}
				}
			}
	return false;
		}

	private Block playerTargetBlock(Object object, int i) {
		// TODO Auto-generated method stub
		return null;
	}


}
