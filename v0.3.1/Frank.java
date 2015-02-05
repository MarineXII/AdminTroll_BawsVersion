package thebawsgamer.troll;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Frank implements CommandExecutor {

	public Main plugin;
	public Frank(Main plugin){
		this.plugin = plugin;
		}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if(args.length == 0){
			Player player = (Player) sender;
						
			try {

				throw new CommandException("Invalid arguments");
				
			} catch (CommandException e) {
				
				player.sendMessage(ChatColor.GOLD + "[" + ChatColor.GREEN + "AdminTroll" + ChatColor.UNDERLINE + ":" + ChatColor.AQUA + "InvalidArguments" + ChatColor.GOLD + "]" + ChatColor.RED + "" + e);
			}
			
			try {

				throw new ArrayIndexOutOfBoundsException("Invalid arguments");
				
			} catch (ArrayIndexOutOfBoundsException a) {
				
				player.sendMessage(ChatColor.GOLD + "[" + ChatColor.GREEN + "AdminTroll" + ChatColor.UNDERLINE + ":" + ChatColor.AQUA + "InvalidArguments" + ChatColor.GOLD + "]" + ChatColor.RED + "" + a);
			}
			
		}
		
		if(args[0].equalsIgnoreCase("admin")) {
			if(args.length == 1) {
				Player player = (Player) sender;
				player.sendMessage(ChatColor.RED + "You can not add a false rank to yourself!");
			} else if (args.length == 2) {
				Player player = (Player) sender;
				Player targetPlayer = player.getServer().getPlayer(args[1]);
				if(targetPlayer != null) {
					targetPlayer.setDisplayName(plugin.getConfig().getString("admintroll.fake.rank.admin.displayname").replaceAll("&", "§") + targetPlayer.getDisplayName());
					targetPlayer.sendMessage(plugin.getConfig().getString("admintroll.fake.rank.admin.messageTOtarget").replaceAll("&", "§"));
				} else {
					player.sendMessage(ChatColor.RED + "" + targetPlayer + " was not found or does not exist.");
				}
			}
		}
		
		if(args[0].equalsIgnoreCase("moderator")) {
			if(args.length == 1) {
				Player player = (Player) sender;
				player.sendMessage(ChatColor.RED + "You can not add a false rank to yourself!");
			} else if (args.length == 2) {
				Player player = (Player) sender;
				Player targetPlayer = player.getServer().getPlayer(args[1]);
				if(targetPlayer != null) {
					targetPlayer.setDisplayName(plugin.getConfig().getString("admintroll.fake.rank.moderator.displayname").replaceAll("&", "§") + targetPlayer.getDisplayName());
					targetPlayer.sendMessage(plugin.getConfig().getString("admintroll.fake.rank.moderator.messageTOtarget").replaceAll("&", "§"));
				} else {
					player.sendMessage(ChatColor.RED + "" + targetPlayer + " was not found or does not exist.");
				}
			}
		}
		
		if(args[0].equalsIgnoreCase("coowner")) {
			if(args.length == 1) {
				Player player = (Player) sender;
				player.sendMessage(ChatColor.RED + "You can not add a false rank to yourself!");
			} else if (args.length == 2) {
				Player player = (Player) sender;
				Player targetPlayer = player.getServer().getPlayer(args[1]);
				if(targetPlayer != null) {
					targetPlayer.setDisplayName(plugin.getConfig().getString("admintroll.fake.rank.coowner.displayname").replaceAll("&", "§") + targetPlayer.getDisplayName());
					targetPlayer.sendMessage(plugin.getConfig().getString("admintroll.fake.rank.coowner.messageTOtarget").replaceAll("&", "§"));
				} else {
					player.sendMessage(ChatColor.RED + "" + targetPlayer + " was not found or does not exist.");
				}
			}
		}
		
		if(args[0].equalsIgnoreCase("owner")) {
			if(args.length == 1) {
				Player player = (Player) sender;
				player.sendMessage(ChatColor.RED + "You can not add a false rank to yourself!");
			} else if (args.length == 2) {
				Player player = (Player) sender;
				Player targetPlayer = player.getServer().getPlayer(args[1]);
				if(targetPlayer != null) {
					targetPlayer.setDisplayName(plugin.getConfig().getString("admintroll.fake.rank.owner.displayname").replaceAll("&", "§") + targetPlayer.getDisplayName());
					targetPlayer.sendMessage(plugin.getConfig().getString("admintroll.fake.rank.owner.messageTOtarget").replaceAll("&", "§"));
				} else {
					player.sendMessage(ChatColor.RED + "" + targetPlayer + " was not found or does not exist.");
				}
			}
		}
		
		if(args[0].equalsIgnoreCase("vip")) {
			if(args.length == 1) {
				Player player = (Player) sender;
				player.sendMessage(ChatColor.RED + "You can not add a false rank to yourself!");
			} else if (args.length == 2) {
				Player player = (Player) sender;
				Player targetPlayer = player.getServer().getPlayer(args[1]);
				if(targetPlayer != null) {
					targetPlayer.setDisplayName(plugin.getConfig().getString("admintroll.fake.rank.vip.displayname").replaceAll("&", "§") + targetPlayer.getDisplayName());
					targetPlayer.sendMessage(plugin.getConfig().getString("admintroll.fake.rank.vip.messageTOtarget").replaceAll("&", "§"));
				} else {
					player.sendMessage(ChatColor.RED + "" + targetPlayer + " was not found or does not exist.");
				}
			}
		}
		
		return false;
		
	}
	
}
