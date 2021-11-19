public class Lab01PartA {
    
    public static void main(String args[]) {
      int marks = 100; // example
      showGrade(marks);
    }
    
    public static void showGrade(int marks){
        
		int mark = marks; // storinhg original marks value
		switch(marks/10) {
			
			// 100 - 80
			case 10:
			case 9:
			case 8:
			System.out.println("A");
			break;
			
			// 79 - 70
			case 7:
			System.out.println("B");
			break;
			
			case 6:
			if (mark>=65){
				System.out.println("B"); // 69 - 65
			}else{
				System.out.println("C"); // 64 - 60
			}
			break;
			
			case 5:
			if (mark>=55){
				System.out.println("C"); // 59 - 55 
			}else{
				System.out.println("D"); // 54 - 50
			}
			break;
			
			// 49 - 0
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
			System.out.println("F");
			break;
				
		}
	}
    
}