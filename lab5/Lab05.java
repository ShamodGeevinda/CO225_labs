import java.math.*; 
import java.util.Random; // for random 
import java.io.*; // for file IO

 
public class Lab05 {
    public static void main(String[] args) {
    final int LEC_COUNT = 45;
    final int STUDENT_COUNT = 61;
    
    Student[] stuArray = new Student[STUDENT_COUNT];

    BufferedReader descriptor = null; 
	String line = null; 
	//String [] names = new String[61]; // 61 names 
	try { 
	    descriptor = new BufferedReader(
			    new FileReader("co225-classlist.txt"));

	    for(int i=0; i < stuArray.length; i++) // assume file has 61 lines 
		stuArray[i] = new Student (descriptor.readLine(), LEC_COUNT); 

	    descriptor.close(); 

	} catch(IOException e) { 
	    // IOException is more generic (FileNotFound is a type of a 
	    // IOException, so catching only that is sufficient 
	    System.out.println("Bad things happen, what do you do!" + e);
	    return; 
	}

	// we will run only if no exceptions were thrown 
	for(int i=0; i < stuArray.length; i++) 
        if(stuArray[i].getAttendancePercent(LEC_COUNT)<80){
            //System.out.println(stuArray[i].getName()+" " +i + " " +stuArray[i].getAttendancePercent(LEC_COUNT)+ " " + stuArray[i].getAttendance());
        }
     

    }


}







