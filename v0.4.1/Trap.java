package thebawsgamer.troll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.command.Command;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Trap implements CommandExecutor {
	
	@SuppressWarnings("unused")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd1, String label, String[] args){
		if(args.length < 1) {
			
			Player player = (Player) sender;
			
			try {

				throw new CommandException("Invalid arguments");
				
			} catch (CommandException e) {
				
				player.sendMessage(ChatColor.GOLD + "[" + ChatColor.GREEN + "AdminTroll" + ChatColor.UNDERLINE + ":" + ChatColor.AQUA + "InvalidArguments" + ChatColor.GOLD + "]" + ChatColor.RED + "" + e);
			}
		}
			
		if (args[0].equalsIgnoreCase("glass")) {
			if(args.length == 1) {
				Player player = (Player) sender;
				Location loc = player.getLocation();
				List<BlockState> blocks = new ArrayList<BlockState>();
		        List<BlockState> blocks2 = new ArrayList<BlockState>();
		        Block below = loc.clone().add(0, -1, 0).getBlock();
		        Block front1 = loc.clone().add(1, 1, 0).getBlock();
		        Block front2 = loc.clone().add(1, 0, 0).getBlock();
		        Block side11 = loc.clone().add(0, 1, 1).getBlock();
		        Block side12 = loc.clone().add(0, 0, 1).getBlock();
		        Block side21 = loc.clone().add(0, 1, -1).getBlock();
		        Block side22 = loc.clone().add(0, 0, -1).getBlock();
		        Block back1 = loc.clone().add(-1, 1, 0).getBlock();
		        Block back2 = loc.clone().add(-1, 0, 0).getBlock();
		        Block top = loc.clone().add(0, 2, 0).getBlock();
		        blocks = Arrays.asList(below.getState(), front1.getState(), front2.getState(), side11.getState(), side12.getState(), side21.getState(), side22.getState(), back1.getState(), back2.getState(), top.getState());
		        blocks2 = blocks;
		        for (BlockState bs : blocks) {
		            Block b = bs.getBlock();
		            b.setType(Material.GLASS);
		        }
			} else if (args.length == 2) {
				Player player = (Player) sender;
				Player target =  player.getServer().getPlayer(args[1]);
				Location loc = target.getLocation();
				List<BlockState> blocks = new ArrayList<BlockState>();
		        List<BlockState> blocks2 = new ArrayList<BlockState>();
		        Block below = loc.clone().add(0, -1, 0).getBlock();
		        Block front1 = loc.clone().add(1, 1, 0).getBlock();
		        Block front2 = loc.clone().add(1, 0, 0).getBlock();
		        Block side11 = loc.clone().add(0, 1, 1).getBlock();
		        Block side12 = loc.clone().add(0, 0, 1).getBlock();
		        Block side21 = loc.clone().add(0, 1, -1).getBlock();
		        Block side22 = loc.clone().add(0, 0, -1).getBlock();
		        Block back1 = loc.clone().add(-1, 1, 0).getBlock();
		        Block back2 = loc.clone().add(-1, 0, 0).getBlock();
		        Block top = loc.clone().add(0, 2, 0).getBlock();
		        blocks = Arrays.asList(below.getState(), front1.getState(), front2.getState(), side11.getState(), side12.getState(), side21.getState(), side22.getState(), back1.getState(), back2.getState(), top.getState());
		        blocks2 = blocks;
		        for (BlockState bs : blocks) {
		            Block b = bs.getBlock();
		            b.setType(Material.GLASS);
		        }
			}
		}
		if (args[0].equalsIgnoreCase("stone")) {
			if(args.length == 1) {
				Player player = (Player) sender;
				Location loc = player.getLocation();
				List<BlockState> blocks = new ArrayList<BlockState>();
		        List<BlockState> blocks2 = new ArrayList<BlockState>();
		        Block below = loc.clone().add(0, -1, 0).getBlock();
		        Block front1 = loc.clone().add(1, 1, 0).getBlock();
		        Block front2 = loc.clone().add(1, 0, 0).getBlock();
		        Block side11 = loc.clone().add(0, 1, 1).getBlock();
		        Block side12 = loc.clone().add(0, 0, 1).getBlock();
		        Block side21 = loc.clone().add(0, 1, -1).getBlock();
		        Block side22 = loc.clone().add(0, 0, -1).getBlock();
		        Block back1 = loc.clone().add(-1, 1, 0).getBlock();
		        Block back2 = loc.clone().add(-1, 0, 0).getBlock();
		        Block top = loc.clone().add(0, 2, 0).getBlock();
		        blocks = Arrays.asList(below.getState(), front1.getState(), front2.getState(), side11.getState(), side12.getState(), side21.getState(), side22.getState(), back1.getState(), back2.getState(), top.getState());
		        blocks2 = blocks;
		        for (BlockState bs : blocks) {
		            Block b = bs.getBlock();
		            b.setType(Material.STONE);
		        }
			} else if (args.length == 2) {
				Player player = (Player) sender;
				Player target =  player.getServer().getPlayer(args[1]);
				Location loc = target.getLocation();
				List<BlockState> blocks = new ArrayList<BlockState>();
		        List<BlockState> blocks2 = new ArrayList<BlockState>();
		        Block below = loc.clone().add(0, -1, 0).getBlock();
		        Block front1 = loc.clone().add(1, 1, 0).getBlock();
		        Block front2 = loc.clone().add(1, 0, 0).getBlock();
		        Block side11 = loc.clone().add(0, 1, 1).getBlock();
		        Block side12 = loc.clone().add(0, 0, 1).getBlock();
		        Block side21 = loc.clone().add(0, 1, -1).getBlock();
		        Block side22 = loc.clone().add(0, 0, -1).getBlock();
		        Block back1 = loc.clone().add(-1, 1, 0).getBlock();
		        Block back2 = loc.clone().add(-1, 0, 0).getBlock();
		        Block top = loc.clone().add(0, 2, 0).getBlock();
		        blocks = Arrays.asList(below.getState(), front1.getState(), front2.getState(), side11.getState(), side12.getState(), side21.getState(), side22.getState(), back1.getState(), back2.getState(), top.getState());
		        blocks2 = blocks;
		        for (BlockState bs : blocks) {
		            Block b = bs.getBlock();
		            b.setType(Material.STONE);
		        }
			}
		}
		return false;
	}
}
