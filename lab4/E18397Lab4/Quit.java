public class Quit extends GenericCommand { 

    /* Quit command 
     * Only quit should be there. 
     * no arguments, 
     */ 
	
    public void handleCommand(String [] args) { 
	
	if(!args[0].equals("quit")) someThingWrong(); 

	if(args.length != 1) { 
	    System.out.println("Usage: quit");
	    return;
	}

	/***
	 * ###### You need to print the number of commands 
	 * that was executed before exiting
	 */
	n = n+1; // increasing command count
	System.out.println("Executed "+n+" command(s) since starting");
	/* OK, so just die */ 
	System.exit(0); 
    }

}