import java.util.Scanner;
public class Lab01PartC {
    
    public static void main(String args[]) {
      String month = "JANUARY"; // example
      showMonthValue(month);
    }
    
    public static void showMonthValue(String month){
        int monthValue =0;
        
        //Implement C a
		String[] months = {"JANUARY","FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
        for (int i=0; i<12; i++){ // loop to check the value of the month
			if(month==months[i]){
				monthValue = i+1;
			}
		}
        System.out.println(monthValue);
        
		
        //Implement C b
		
		// getting month by user
		Scanner scan = new Scanner(System.in);
		//scan.nextLine();
		String userMonth = scan.nextLine();
		scan.close();
		
		monthValue =0;
		
		for (int i=0; i<12; i++){ // loop to check the value of the month
			if(userMonth.equals(months[i])){
				monthValue = i+1;
			}
		}
		
		monthValue += 1;
		while(monthValue <= 12){ // loop to print upccomming value
			System.out.println(months[monthValue-1]);
			monthValue++;
		}
	}
    
}