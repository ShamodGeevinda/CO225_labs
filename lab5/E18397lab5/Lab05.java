import java.math.*; 
import java.util.Random; // for random 
import java.io.*; // for file IO

public class Lab05 {
    public static void main(String[] args) {

    // final integers
    final int LEC_COUNT = 45;
    final int STUDENT_COUNT = 61;
    
    // Student class array to hold data
    Student[] stuArray = new Student[STUDENT_COUNT]; 

    BufferedReader descriptor = null; 
	String line = null; 
	
	try { // try to read data from file
	    descriptor = new BufferedReader(
		new FileReader("co225-classlist.txt"));

        // adding data to an array
	    for(int i=0; i < stuArray.length; i++) 
		stuArray[i] = new Student (descriptor.readLine(), LEC_COUNT); 

	    descriptor.close(); 

	} catch(IOException e) { 
	    // IOException is more generic (FileNotFound is a type of a 
	    // IOException, so catching only that is sufficient 
	    System.out.println("Couldn't read file " + e);
	    return; 
	}
   

	

	
    try { // if there are contents in output files this try block they will be deleted

        // deleting contents in co225-classlist-ineligible.txt
        PrintWriter writer2 = new PrintWriter("co225-classlist-ineligible.txt");
        writer2.print("");
        writer2.close();

        // deleting contents in co225-classlist.txt
        PrintWriter writer = new PrintWriter("co225-classlist.txt");
        writer.print("");
        writer.close();
       
    } catch (Exception e) {
        System.out.println("Couldn't delete contents of files " + e);
    }
    System.out.println("Students with attendance less than 80% :");

    // looping through student array
	for(int i=0; i < stuArray.length; i++) {

        // condition to check for students below 80% attendance
        if(stuArray[i].getAttendancePercent(LEC_COUNT)<80){ 

            // printing surname
            System.out.println(stuArray[i].getName());

            try {

                // writing data into new file which has ineligible student list
                BufferedWriter bw = new BufferedWriter(new FileWriter(new File("co225-classlist-ineligible.txt"), true));
                bw.write(stuArray[i].getName());
                bw.newLine();
                bw.close();

                // overwriting data in original file
                BufferedWriter bw2 = new BufferedWriter(new FileWriter(new File("co225-classlist.txt"), true));
                bw2.write(stuArray[i].getName()+"-ineligible");  
                bw2.newLine();
                bw2.close();

		    } 
            catch (Exception e) {
                System.out.println("Couldn't write contents of files " + e);

		    }

        }else{

            try {
                // overwriting data in original file
                BufferedWriter bw2 = new BufferedWriter(new FileWriter(new File("co225-classlist.txt"), true));
                bw2.write(stuArray[i].getName());
                bw2.newLine();
                bw2.close();

            } catch (Exception e) {
                System.out.println("Couldn't write contents of files " + e);
            }
            

        }
     

    }
    // printing average attendance of the students
    System.out.println("The average attendance of the class is "+Student.getAvgAttendance(LEC_COUNT,STUDENT_COUNT)+ "%");
   
    }

}







