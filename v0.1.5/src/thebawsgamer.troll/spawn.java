package thebawsgamer.troll;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class spawn implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if(args.length == 0){
			Player player = (Player) sender;
			player.sendMessage(ChatColor.RED + "Please use as follows: /spawn <mobs> <playername>");
		}
		if(args[0].equalsIgnoreCase("creeper")){
			if(args.length == 1){
				Player player = (Player) sender;
				Location location = player.getLocation();
				player.getWorld().spawnEntity(location, EntityType.CREEPER);
				player.sendMessage(ChatColor.GREEN + "Creeper spawned!");
			}else if(args.length == 2){
				Player player = (Player) sender;
				Player targetPlayer = sender.getServer().getPlayer(args[1]);
				if(targetPlayer != null){
					Location location = targetPlayer.getLocation();
					targetPlayer.getWorld().spawnEntity(location, EntityType.CREEPER);
					sender.sendMessage(ChatColor.GREEN + "Creeper spawned!");
			}else{
				player.sendMessage(ChatColor.RED + args[1] + " is not online!");
				}
			}
		}
		if (args[0].equalsIgnoreCase("ghast")){
			if(args.length==1){
				Player player = (Player) sender;
				Location location = player.getLocation();
				player.getWorld().spawnEntity(location, EntityType.GHAST);
				player.sendMessage(ChatColor.GREEN + "Ghast spawned!");
			}else if(args.length == 2){
				Player player = (Player) sender;
				Player targetPlayer = sender.getServer().getPlayer(args[1]);
				if(targetPlayer != null){
					Location location = targetPlayer.getLocation();
					targetPlayer.getWorld().spawnEntity(location, EntityType.GHAST);
					sender.sendMessage(ChatColor.GREEN + "Ghast spawned!");
				}else{
					player.sendMessage(ChatColor.RED + args[1] + " is not online!");
				}
			}
		}
		if (args[0].equalsIgnoreCase("zombie")){
			if(args.length==1){
				Player player = (Player) sender;
				Location location = player.getLocation();
				player.getWorld().spawnEntity(location, EntityType.ZOMBIE);
				player.sendMessage(ChatColor.GREEN + "Zombie spawned!");
			}else if(args.length == 2){	
				Player player = (Player) sender;
				Player targetPlayer = sender.getServer().getPlayer(args[1]);
				if(targetPlayer !=null){
					Location location = targetPlayer.getLocation();
					targetPlayer.getWorld().spawnEntity(location, EntityType.ZOMBIE);	
					sender.sendMessage(ChatColor.GREEN + "Zombie spawned!");
			}else{
				player.sendMessage(ChatColor.RED + args[1] + " is not online");
				}
			}
		}
		if (args[0].equalsIgnoreCase("witch")){
			if(args.length==1){
				Player player = (Player) sender;
				Location location = player.getLocation();
				player.getWorld().spawnEntity(location, EntityType.WITCH);
				player.sendMessage(ChatColor.GREEN + "Witch spawned!");
			}else if(args.length == 2){	
				Player player = (Player) sender;
				Player targetPlayer = sender.getServer().getPlayer(args[1]);
				if(targetPlayer !=null){
					Location location = targetPlayer.getLocation();
					targetPlayer.getWorld().spawnEntity(location, EntityType.WITCH);	
					sender.sendMessage(ChatColor.GREEN + "Witch spawned!");
			}else{
				player.sendMessage(ChatColor.RED + args[1] + " is not online");
				}
			}
		}
		if (args[0].equalsIgnoreCase("endman")){
			if(args.length==1){
				Player player = (Player) sender;
				Location location = player.getLocation();
				player.getWorld().spawnEntity(location, EntityType.ENDERMAN);
				player.sendMessage(ChatColor.GREEN + "EnderMan spawned!");
			}else if(args.length == 2){	
				Player player = (Player) sender;
				Player targetPlayer = sender.getServer().getPlayer(args[1]);
				if(targetPlayer !=null){
					Location location = targetPlayer.getLocation();
					targetPlayer.getWorld().spawnEntity(location, EntityType.ENDERMAN);	
					sender.sendMessage(ChatColor.GREEN + "EnderMan spawned!");
			}else{
				player.sendMessage(ChatColor.RED + args[1] + " is not online");
				}
			}
		}
		if(args[0].equalsIgnoreCase("silverfish")){
			if(args.length == 1){
				Player player = (Player) sender;
				Location location = player.getLocation();
				player.getWorld().spawnEntity(location, EntityType.SILVERFISH);
				player.sendMessage(ChatColor.GRAY + "Silverfish spawned!");
			}else if(args.length == 2) {
 				Player player = (Player) sender;
 				Player targetPlayer = sender.getServer().getPlayer(args[1]);
 				if(targetPlayer !=null){
 					Location location = targetPlayer.getLocation();
 					targetPlayer.getWorld().spawnEntity(location, EntityType.SILVERFISH);
 					sender.sendMessage(ChatColor.GRAY + "Silverfish spawned!");
 			}else{
 				player.sendMessage(ChatColor.RED + args[1] + " is not online");
 				}
 			}
 		}
		if(args[0].equalsIgnoreCase("giant")){
			if(args.length == 1){
				Player player = (Player) sender;
				Location location = player.getLocation();
				player.getWorld().spawnEntity(location, EntityType.GIANT);
				player.sendMessage(ChatColor.GRAY + "Giant spawned!");
			}else if(args.length == 2) {
 				Player player = (Player) sender;
 				Player targetPlayer = sender.getServer().getPlayer(args[1]);
 				if(targetPlayer !=null){
 					Location location = targetPlayer.getLocation();
 					targetPlayer.getWorld().spawnEntity(location, EntityType.GIANT);
 					sender.sendMessage(ChatColor.GRAY + "Giant spawned!");
 			}else{
 				player.sendMessage(ChatColor.RED + args[1] + " is not online");
 				}
 			}
 		}
		if(args[0].equalsIgnoreCase("skeleton")){
			if(args.length == 1){
				Player player = (Player) sender;
				Location location = player.getLocation();
				player.getWorld().spawnEntity(location, EntityType.SKELETON);
				player.sendMessage(ChatColor.GRAY + "Skeleton spawned!");
			}else if(args.length == 2) {
 				Player player = (Player) sender;
 				Player targetPlayer = sender.getServer().getPlayer(args[1]);
 				if(targetPlayer !=null){
 					Location location = targetPlayer.getLocation();
 					targetPlayer.getWorld().spawnEntity(location, EntityType.SKELETON);
 					sender.sendMessage(ChatColor.GRAY + "Skeleton spawned!");
 			}else{
 				player.sendMessage(ChatColor.RED + args[1] + " is not online");
 				}
 			}
 		}
		if(args[0].equalsIgnoreCase("wither")){
			if(args.length == 1){
				Player player = (Player) sender;
				Location location = player.getLocation();
				player.getWorld().spawnEntity(location, EntityType.WITHER);
				player.sendMessage(ChatColor.GRAY + "Wither spawned!");
			}else if(args.length == 2) {
 				Player player = (Player) sender;
 				Player targetPlayer = sender.getServer().getPlayer(args[1]);
 				if(targetPlayer !=null){
 					Location location = targetPlayer.getLocation();
 					targetPlayer.getWorld().spawnEntity(location, EntityType.WITHER);
 					sender.sendMessage(ChatColor.GRAY + "Wither spawned!");
 			}else{
 				player.sendMessage(ChatColor.RED + args[1] + " is not online");
 				}
 			}
 		}
		if(args[0].equalsIgnoreCase("enddrag")){
			if(args.length == 1){
				Player player = (Player) sender;
				Location location = player.getLocation();
				player.getWorld().spawnEntity(location, EntityType.ENDER_DRAGON);
				player.sendMessage(ChatColor.GRAY + "Ende spawned!");
			}else if(args.length == 2) {
 				Player player = (Player) sender;
 				Player targetPlayer = sender.getServer().getPlayer(args[1]);
 				if(targetPlayer !=null){
 					Location location = targetPlayer.getLocation();
 					targetPlayer.getWorld().spawnEntity(location, EntityType.ENDER_DRAGON);
 					sender.sendMessage(ChatColor.GRAY + "Ender Dragon spawned!");
 			}else{
 				player.sendMessage(ChatColor.RED + args[1] + " is not online");
 				}
 			}
 		}
		if(args[0].equalsIgnoreCase("spider")){
			if(args.length == 1){
				Player player = (Player) sender;
				Location location = player.getLocation();
				player.getWorld().spawnEntity(location, EntityType.SPIDER);
				player.sendMessage(ChatColor.GRAY + "Spider spawned!");
			}else if(args.length == 2) {
 				Player player = (Player) sender;
 				Player targetPlayer = sender.getServer().getPlayer(args[1]);
 				if(targetPlayer !=null){
 					Location location = targetPlayer.getLocation();
 					targetPlayer.getWorld().spawnEntity(location, EntityType.SPIDER);
 					sender.sendMessage(ChatColor.GRAY + "Spider spawned!");
 			}else{
 				player.sendMessage(ChatColor.RED + args[1] + " is not online");
 				}
 			}
 		}
		if(args[0].equalsIgnoreCase("cavespider")){
			if(args.length == 1){
				Player player = (Player) sender;
				Location location = player.getLocation();
				player.getWorld().spawnEntity(location, EntityType.CAVE_SPIDER);
				player.sendMessage(ChatColor.GRAY + "Cave spider spawned!");
			}else if(args.length == 2) {
 				Player player = (Player) sender;
 				Player targetPlayer = sender.getServer().getPlayer(args[1]);
 				if(targetPlayer !=null){
 					Location location = targetPlayer.getLocation();
 					targetPlayer.getWorld().spawnEntity(location, EntityType.CAVE_SPIDER);
 					sender.sendMessage(ChatColor.GRAY + "Cave spider spawned!");
 			}else{
 				player.sendMessage(ChatColor.RED + args[1] + " is not online");
 				}
 			}
 		}
		if(args[0].equalsIgnoreCase("list")){
			Player player = (Player) sender;
			player.sendMessage(ChatColor.GRAY + "Spawnable mobs:" + ChatColor.YELLOW + "Enderman, Ghast, Zombie, Skeleton, Witch, Creeper, Silverfish, Wither, EnderDragon, Spider and CaveSpider");
		}
		return false;
	}
}
