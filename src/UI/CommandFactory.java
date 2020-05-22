package UI;

import java.util.HashMap;

public class CommandFactory{
	
	   private static HashMap<String, Command> commands;

	private CommandFactory() {
	    	CommandFactory.commands = new HashMap<>();
	    }
	    
	    public void addCommand(String name, Command command)
	    {
	    	CommandFactory.commands.put(name, command);
	    }
	    
	    public void executeCommand(String name)
	    {
	    	if(CommandFactory.commands.containsKey(name))
	    	{
	    		CommandFactory.commands.get(name).execute();
	    	}
	    	else
	    	{
	    		System.out.println("Commande introuvable");
	    	}
	    }
	    
	    public static void showCommands()
	    {
	    	System.out.println("Commandes :");
			commands.keySet().stream().forEach(System.out::println);
	    }
	    
	    public static CommandFactory init()
		{
	    	CommandFactory i = new CommandFactory();
	    	i.addCommand("exit", () -> {System.exit(0);});
	    	i.addCommand("commands", () -> {showCommands();});
			return i;
		}
}
