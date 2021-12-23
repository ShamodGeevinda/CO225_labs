import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Iterator;

class Student{
    String regno;
    String name;
    public Student(String regno, String name) {
        this.regno = regno;
        this.name = name;
    }
}
// hashset implementaation
public class Lab03PartE {
    public static void main(String[] args) throws Exception{ 
        // checking command line arguments
        if(args.length!=1){
            System.err.println("Usage: java Lab03PartE StudentList[Name of the text file]");
            System.exit(1);
        }
        // for the report
        long startTime = System.nanoTime();

        // reading data from file and making map
        
        HashSet<Student> students = new HashSet<Student>();
        String line;
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        int count =0;
        while((line = reader.readLine())!=null){
            
            if(count!=0){
            String[] parts = line.split("\t");                
            Student s1 = new Student(parts[0], parts[1]);
            students.add(s1);
            }
        count+=1;
        }
        
        // for the report
        long endTime   = System.nanoTime();
        long totalTime1 = endTime - startTime;
        // System.out.println("");
        // System.out.println("It took "+totalTime1+" nano seconds to create the set");
        // System.out.println("");
        
        // getting inputs from the user
        System.out.println("Enter Reg no in E/YY/XXX format or starting letter of the surname");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        String[] ary = str.split("");
        
        startTime = System.nanoTime();

        // handeling Reg No as inout
        if(ary.length == 8 && str.contains("E/")){
            boolean state=false;
            for(Student s:students){
                if(str.equals(s.regno)){
                    System.out.println(s.name);
                    state = true;
                    break;
                }
            }
            if(!state){
                System.out.println("No Student with given registration Number :"+str);
            }
        }

        // handeling Letter as input
        else if(ary.length ==1){
            int c=0;
            for (Student s:students) {
                
                String[] name = s.name.split("");
                if(name[0].toLowerCase().equals(ary[0].toLowerCase())){
                    // printing output
                    System.out.println(s.regno + "\t" + s.name);
                    c+=1;
                }  
            }
            if(c==0){
                if(str.matches("[a-zA-Z]+")){ // checking that given character is a letter
                    System.out.println("No Student with name starts with letter :"+str);
                }else{
                    System.out.println(str+" is not a valid letter");

                }
            }
        
        // wrong inputs
        }

        else{
            System.out.println("Wrong Input");
            
        }

        // for the report
        endTime   = System.nanoTime();
        long totalTime2 = endTime - startTime;
        long totalTime=totalTime1+totalTime2;
        // System.out.println("");
        // System.out.println("It took "+totalTime2+" nano seconds for the printing output");
        // System.out.println("It took "+totalTime+" nano secconds for the whole process");
        // System.out.println("");
    
    }
}


       