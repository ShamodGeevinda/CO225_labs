import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Iterator;

//import java.util.Array;

public class Lab03PartC {
        public static void main(String[] args) throws Exception{ 
            
            // reading data from file and making map
            Map <String, String> map = new HashMap<>();
            String line;
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            int count =0;
            while((line = reader.readLine())!=null){
                
                if(count!=0){
                String[] parts = line.split("\t");                
                String key = parts[0];
                String value = parts[1];
                map.put(key,value);
               
                }
            count+=1;
            }
        //System.out.println(map);
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        String[] ary = str.split("");
        //System.out.println(ary[0]);
        
        //System.out.println(map.get(str));
        for (var entry : map.entrySet()) {
            
            String[] name = entry.getValue().split("");
           // System.out.println(name[0]);
            if(name[0].equals(ary[0])){
                System.out.println(entry.getKey() + "\t" + entry.getValue());
            }
            
        }
    
            }
}
       