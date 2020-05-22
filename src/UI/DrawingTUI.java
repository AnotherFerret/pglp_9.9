package UI;

import java.util.Scanner;


public class DrawingTUI {
	
	Scanner sc = new Scanner(System.in, "UTF-8");
	
	
	public void run(CommandFactory cf)
	{
		while(true)
		{
			cf.executeCommand(sc.nextLine());	
		}
	}

}
