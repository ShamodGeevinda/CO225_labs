import java.math.*; 
import java.util.Random; // for random 
import java.io.*; // for file IO

public class Lab05 {
    public static void main(String[] args) {
    final int LEC_COUNT = 45;
    final int STUDENT_COUNT = 61;
    
    // Student class array to hold data
    Student[] stuArray = new Student[STUDENT_COUNT]; 

    BufferedReader descriptor = null; 
	String line = null; 
	
	try { 
	    descriptor = new BufferedReader(
		new FileReader("co225-classlist.txt"));

	    for(int i=0; i < stuArray.length; i++) 
		stuArray[i] = new Student (descriptor.readLine(), LEC_COUNT); 

	    descriptor.close(); 

	} catch(IOException e) { 
	    // IOException is more generic (FileNotFound is a type of a 
	    // IOException, so catching only that is sufficient 
	    System.out.println("Bad things happen, what do you do!" + e);
	    return; 
	}
   

	

	// we will run only if no exceptions were thrown
    try {
        PrintWriter writer = new PrintWriter("co225-classlist.txt");
        writer.print("");
        writer.close();
        PrintWriter writer2 = new PrintWriter("co225-classlist-ineligible.txt");
        writer2.print("");
        writer2.close();
    } catch (Exception e) {
        //TODO: handle exception
    }
    
	for(int i=0; i < stuArray.length; i++) {
        if(stuArray[i].getAttendancePercent(LEC_COUNT)<80){
            System.out.println(stuArray[i].getName());
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(new File("co225-classlist-ineligible.txt"), true));
                BufferedWriter bw2 = new BufferedWriter(new FileWriter(new File("co225-classlist.txt"), true));
                bw.write(stuArray[i].getName());
                bw2.write(stuArray[i].getName()+"-ineligible");
                bw.newLine();
                bw.close();
                bw2.newLine();
                bw2.close();
		    } 
            catch (Exception e) {
		    }
        }else{
            try {
                BufferedWriter bw2 = new BufferedWriter(new FileWriter(new File("co225-classlist.txt"), true));
                bw2.write(stuArray[i].getName());
                bw2.newLine();
                bw2.close();
            } catch (Exception e) {
                //TODO: handle exception
            }
            

        }
     

    }
   
    }

}







