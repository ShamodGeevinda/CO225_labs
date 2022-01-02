import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Copy extends GenericCommand { 

 
    public void handleCommand(String [] args) { 
        n=n+1; // incrementing command count
        if(!args[0].equals("copy")) someThingWrong();

        if(args.length<3){ // if less arguments
            System.out.println("Not enough arguments");
            System.out.println("Usage : copy [Source file name] [Destination file]");
            
        }else if(args.length>3){ // handeling more arguments
           System.out.println("More arguments were given");
           System.out.println("Usage : copy [Source file name] [Destination file name]");

        }else{
            // creating two streams
            FileInputStream is = null; // input stream
            FileOutputStream os = null; // output stream
            try {
                // initializing both streams with filenames
                is = new FileInputStream(args[1]);
                os = new FileOutputStream(args[2]);
                byte[] buffer = new byte[1024];
                int length;

                // looping through line of input files and 
                // write down to output file
                while ((length = is.read(buffer)) > 0) {
                    os.write(buffer, 0, length);
                }
                
                // closing the file streams
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