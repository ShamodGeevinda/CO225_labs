import java.util.Calendar;
public class Lab01PartD {
    
    public static void main(String args[]) {
        
      //int countryCode = 1; // example
      //String birthDate = "1999/09/19"; // example
	  
      
      // Implement D - Calculate age in years
      int age = 0; 
	  String birthYearString = args[0].substring(0, 4);
	  int birthYear = Integer.parseInt(birthYearString); 
	  
	  // getting current year  
      int currentYear = Calendar.getInstance().get(Calendar.YEAR); 

	  // calculating age
	  age = currentYear - birthYear;
	  int countryCode = Integer.parseInt(args[1]);
      showTicketPrice(countryCode , age);
	  
    }
    
    public static void showTicketPrice(int CountryCode , int age){
        int price =200;
		if(age<5){
			price =0;
		}
		else if (age>=65){
			price -=  price * 0.5;
		}
		else{
			if(CountryCode>=1 && CountryCode<=6){
				price += price * 0.35;
			}else if(CountryCode==8){
				price += price * 0.65;
			}
		}
		System.out.println(price);
		
		
        //implement D - Calculate ticket price and show ticket price 
		
    }
    
}