public class Lab01PartB {
	
	private static String arguments[];
    
    public static void main(String args[]) {
      int number = 3; // example
	  arguments = args;
      findEvenOrOdd(number);
	  
    }
    
    public static void findEvenOrOdd(int number){
        //Implement B a
		
		/*
		if (number % 2 == 0){
			System.out.println("Even Number");
		}else{
			System.out.println("Odd Number");
		}
        */
        
        //Implement B b
		
		if(arguments.length==1){
			int input = Integer.parseInt(arguments[0]); // getting user argument number as integer
			
			if (input % 2 == 0){ // printing next 5 even numbers
				for(int i =0; i<5;i++)
					System.out.println(input+2*(i+1));
			}else{
				for(int i =0; i<3;i++) // printing next 3 odd numbers
					System.out.println(input+2*(i+1));
			}
		}else{
			System.err.println("program should have only one argumnet (which should an integer)");
			System.exit(1);
		}
		
    }
    
}