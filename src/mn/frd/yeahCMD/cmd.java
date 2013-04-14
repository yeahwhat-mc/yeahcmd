package mn.frd.yeahCMD;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public final class cmd extends JavaPlugin {
	@Override
    public void onEnable(){
		PluginDescriptionFile pdfFile = this.getDescription();
		System.out.println("[yeahCMD v" + pdfFile.getVersion() + "] sucessfully enabled!");
    }
 
    @Override
    public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		System.out.println("[yeahCMD v" + pdfFile.getVersion() + "] sucessfully disabled!");
    }
    
 
    
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
    	
		
		if (!(sender instanceof Player))
		{
			return false;
		}
		
		final Player p = (Player) sender;

		// COMMAND /shop
		if (cmd.getName().equalsIgnoreCase("shop"))
		{
			
			p.performCommand("warp traders");
			p.sendMessage(ChatColor.DARK_GREEN + "[" + ChatColor.GREEN + "yeahCMD" + ChatColor.DARK_GREEN + "]" + ChatColor.GRAY + " If u want to go back, simply type " + ChatColor.GOLD + "/back" + ChatColor.GRAY + ".");
			p.performCommand("money");
			return true;
		}
		
		// COMMAND /h1
		if (cmd.getName().equalsIgnoreCase("h1"))
		{	
			p.performCommand("/hpos1");
			return true;
		}
		
		// COMMAND /h2
		if (cmd.getName().equalsIgnoreCase("h2"))
		{	
			p.performCommand("/hpos2");
			return true;
		}
		
		// COMMAND /p1
		if (cmd.getName().equalsIgnoreCase("p1"))
		{	
			p.performCommand("/pos1");
			return true;
		}
		
		// COMMAND /p2
		if (cmd.getName().equalsIgnoreCase("p2"))
		{	
			p.performCommand("/pos2");
			return true;
		}
		
		return false;
	}
}
