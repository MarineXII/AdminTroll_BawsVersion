package thebawsgamer.troll;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Potion implements CommandExecutor {


	@Override
	public boolean onCommand(CommandSender sender, Command cmd1, String label, String[] args){
		if(args[0].equalsIgnoreCase("poison")){
			if(args.length==1){
				Player player = (Player) sender;
				player.addPotionEffect(new PotionEffect( PotionEffectType.POISON, 200,2));
				player.sendMessage(ChatColor.GREEN + "You have been poisoned!");
				}else if(args.length == 2){
					Player player = (Player) sender;
					Player targetPlayer = sender.getServer().getPlayer(args[1]);
					if(targetPlayer != null){
						targetPlayer.addPotionEffect(new PotionEffect( PotionEffectType.POISON, 200,2));
						player.sendMessage(ChatColor.GREEN + sender.getName() + " has poisoned you!");
					}else{
						player.sendMessage(ChatColor.RED + args[1] + " is not online!");
					}
				}
		}
			if(args[0].equalsIgnoreCase("blindness")){
				if(args.length==1){
					Player player = (Player) sender;
					player.addPotionEffect(new PotionEffect( PotionEffectType.BLINDNESS, 200,2));
					player.sendMessage(ChatColor.WHITE + "You have been blinded!");
					}else if(args.length == 2){
						Player player = (Player) sender;
						Player targetPlayer = sender.getServer().getPlayer(args[1]);
						if(targetPlayer != null){
							targetPlayer.addPotionEffect(new PotionEffect( PotionEffectType.BLINDNESS, 200,2));
							player.sendMessage(ChatColor.WHITE + sender.getName() + " has blinded you!");
						}else{
							player.sendMessage(ChatColor.RED + args[1] + " is not online!");
						}
					}
			}
			if(args[0].equalsIgnoreCase("nausea")){
				if(args.length==1){
					Player player = (Player) sender;
					player.addPotionEffect(new PotionEffect( PotionEffectType.CONFUSION, 200,2));
					player.sendMessage(ChatColor.YELLOW + "PUKE!");
					}else if(args.length == 2){
						Player player = (Player) sender;
						Player targetPlayer = sender.getServer().getPlayer(args[1]);
						if(targetPlayer != null){
							targetPlayer.addPotionEffect(new PotionEffect( PotionEffectType.CONFUSION, 200,2));
							player.sendMessage(ChatColor.YELLOW + sender.getName() + " has made you sick!");
						}else{
							player.sendMessage(ChatColor.RED + args[1] + " is not online!");
						}
					}
			}
			if(args[0].equalsIgnoreCase("slow")){
				if(args.length==1){
					Player player = (Player) sender;
					player.addPotionEffect(new PotionEffect( PotionEffectType.SLOW, 200,2));
					player.sendMessage(ChatColor.YELLOW + "1.................2.....3....SLOW!");
					}else if(args.length == 2){
						Player player = (Player) sender;
						Player targetPlayer = sender.getServer().getPlayer(args[1]);
						if(targetPlayer != null){
							targetPlayer.addPotionEffect(new PotionEffect( PotionEffectType.SLOW, 200,2));
							player.sendMessage(ChatColor.YELLOW + sender.getName() + " has made you slow!");
						}else{
							player.sendMessage(ChatColor.RED + args[1] + " is not online!");
						}
					}
			}
			if(args[0].equalsIgnoreCase("harm")){
				if(args.length==1){
					Player player = (Player) sender;
					player.addPotionEffect(new PotionEffect( PotionEffectType.HARM, 10,1));
					player.sendMessage(ChatColor.RED + "Stab!");
					}else if(args.length == 2){
						Player player = (Player) sender;
						Player targetPlayer = sender.getServer().getPlayer(args[1]);
						if(targetPlayer != null){
							targetPlayer.addPotionEffect(new PotionEffect( PotionEffectType.HARM, 10,1));
							player.sendMessage(ChatColor.YELLOW + sender.getName() + " has stabbed you!");
						}else{
							player.sendMessage(ChatColor.RED + args[1] + " is not online!");
						}
					}
			}
			if(args[0].equalsIgnoreCase("weak")){
				if(args.length==1){
					Player player = (Player) sender;
					player.addPotionEffect(new PotionEffect( PotionEffectType.WEAKNESS, 200,2));
					player.sendMessage(ChatColor.YELLOW + "You got no muscle hahaha!");
					}else if(args.length == 2){
						Player player = (Player) sender;
						Player targetPlayer = sender.getServer().getPlayer(args[1]);
						if(targetPlayer != null){
							targetPlayer.addPotionEffect(new PotionEffect( PotionEffectType.SLOW, 200,2));
							player.sendMessage(ChatColor.YELLOW + sender.getName() + " has made you weak!");
						}else{
							player.sendMessage(ChatColor.RED + args[1] + " is not online!");
						}
					}
			}
		return false;
	}

}
