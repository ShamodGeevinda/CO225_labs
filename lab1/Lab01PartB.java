import java.util.Scanner;

public class Lab01PartB {
    
    public static void main(String args[]) {
      int number = 3; // example
      findEvenOrOdd(number);
    }
    
    public static void findEvenOrOdd(int number){
        //Implement B a
		if (number % 2 == 0){
			System.out.println("Even Number");
		}else{
			System.out.println("Odd Number");
		}
        
        
        //Implement B b
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		scan.close();
		if (input % 2 == 0){ // printing next 5 even numbers
			for(int i =0; i<5;i++)
				System.out.println(input+2*(i+1));
		}else{
			for(int i =0; i<3;i++) // printing next 3 odd numbers
				System.out.println(input+2*(i+1));
		}
		
    }
    
}