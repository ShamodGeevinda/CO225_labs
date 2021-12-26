import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Copy extends GenericCommand { 

 
    public void handleCommand(String [] args) { 
        n=n+1; // incrementing command calling count
        if(!args[0].equals("copy")) someThingWrong();
        if(args.length<3){
            System.out.println("Not enough arguments");
            System.out.println("Usage : copy [Source file name] [Destination file]");
            
        }else if(args.length>3){
           
           System.out.println("More arguments were given");
           System.out.println("Usage : copy [Source file name] [Destination file]");
        }else{
            FileInputStream is = null;
            FileOutputStream os = null;
            try {
                is = new FileInputStream(args[1]);
                os = new FileOutputStream(args[2]);
                byte[] buffer = new byte[1024];
                int length;
                while ((length = is.read(buffer)) > 0) {
                    os.write(buffer, 0, length);
                }
            
                is.close();
                os.close();
                System.out.println("File copy was successfully executed");
            }catch(IOException e) {
                System.out.println(args[1]+" is not a valid source file");
                return;
            }  
        }

    }
}