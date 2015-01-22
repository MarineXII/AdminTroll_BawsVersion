package thebawsgamer.troll;

import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class NickR
  implements CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
  {
    if (commandLabel.equalsIgnoreCase("nickr")) {
      if (args.length == 0)
      {
        Player player = (Player)sender;
        player.setDisplayName(player.getCustomName());
      }
      else if (args.length == 1)
      {
        Player player = (Player)sender;
        Player targetPlayer = player.getServer().getPlayer(args[0]);
        if (targetPlayer != null) {
          targetPlayer.setDisplayName(targetPlayer.getCustomName());
        } else {
          player.sendMessage(ChatColor.RED + "Target Player not online or does not exist.");
        }
      }
      else if (args.length > 1)
      {
        Player player = (Player)sender;
        try
        {
          throw new CommandException("Invalid arguments");
        }
        catch (CommandException e)
        {
          player.sendMessage(ChatColor.GOLD + "[" + ChatColor.GREEN + "AdminTroll" + ChatColor.UNDERLINE + ":" + ChatColor.AQUA + "InvalidArguments" + ChatColor.GOLD + "]" + ChatColor.RED + e);
          try
          {
            throw new ArrayIndexOutOfBoundsException("Invalid arguments");
          }
          catch (ArrayIndexOutOfBoundsException a)
          {
            player.sendMessage(ChatColor.GOLD + "[" + ChatColor.GREEN + "AdminTroll" + ChatColor.UNDERLINE + ":" + ChatColor.AQUA + "InvalidArguments" + ChatColor.GOLD + "]" + ChatColor.RED + a);
          }
          //Code written by Sunny Zhang//
        }
      }
    }
    return false;
  }
}
