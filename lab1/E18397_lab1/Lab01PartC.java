public class Lab01PartC {
    
	private static String arguments[];
	
    public static void main(String args[]) {
      String month = "JANUARY"; // example
	  arguments = args ;
      showMonthValue(month);
    }
    
    public static void showMonthValue(String month){
        
		int monthValue =0;
		
        //Implement C a
		String[] months = {"JANUARY","FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
        
		
		/*
		for (int i=0; i<12; i++){ // loop to check the value of the month
			if(month==months[i]){
				monthValue = i+1;
			}
		}
        System.out.println(monthValue);
        */
		
		
		
        //Implement C b
		
		if(arguments.length==1){
			
			String userMonth = arguments[0];
		
			monthValue =0;
			
			for (int i=0; i<12; i++){ // loop to check the value of the month
				if(userMonth.equals(months[i])){
					monthValue = i+1;
				}
			}
			if (monthValue==0){ // in case of wrong month name
				System.err.println("Enter correct month name in upper case(wrong input)");
				System.exit(1);
			}
			
			monthValue += 1;
			while(monthValue <= 12){ // loop to print upcomming value
				System.out.println(months[monthValue-1]);
				monthValue++;
			}
		}else{ // in case of no argument or more than one argumnet
			System.err.println("program should have only one argumnet");
			System.exit(1);
			
		}
	}
    
}