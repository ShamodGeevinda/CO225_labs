public class Less extends GenericCommand { 

 
    public void handleCommand(String [] args) { 
        n=n+1;
        if(!args[0].equals("less")) someThingWrong();
        if(args.length<2){
            System.out.println("Not enough arguments");
            System.out.println("Usage : Less [Source file name]");
            
        }else if(args.length>2){
           
           System.out.println("More arguments were given");
           System.out.println("Usage : Less [Source file name]");
        }else{

        }
    }
}