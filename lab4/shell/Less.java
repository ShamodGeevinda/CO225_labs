import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
public class Less extends GenericCommand { 

 
    public void handleCommand(String [] args) { 
        n=n+1;
        if(!args[0].equals("less")) someThingWrong();
        if(args.length<2){
            System.out.println("Not enough arguments");
            System.out.println("Usage : less [Source file name]");
            
        }else if(args.length>2){
           
           System.out.println("More arguments were given");
           System.out.println("Usage : less [Source file name]");
        }else{
            try {
                String line;
                BufferedReader reader = new BufferedReader(new  FileReader(args[1]));
                while((line = reader.readLine())!=null){
                    System.out.println(line);

                }
                reader.close();
            } catch (Exception e) {
                System.out.println(args[1]+" is not a valid source file");
                //TODO: handle exception
            }

        }
    }
}