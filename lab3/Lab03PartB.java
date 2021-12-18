import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class Lab03PartB
{
	public static int n; // global variable to save user input
	
    public static void main(String args[])
    {
		System.out.println("Enter an Integer (1<=n<=26)");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();

		if(n<1 || n>26){
			System.err.println("not in range (1<=n<=26)");
			System.exit(1);
		}

		// making object in class and calling methods
		Lab03PartB obj = new Lab03PartB();
		obj.findAdjacentsByArray();
		System.out.println("");
		obj.findAdjacentsByMap();
		System.out.println("");


		
	}
	
	public void findAdjacentsByArray()
	{
		char array[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		//System.out.println(array.length);
		
		// printing thr desired output
		System.out.println("output of findAdjacentsByArray() method");
		if(n==1){
			System.out.println("<Null,Null>,<2,B>");
		}else if(n==26){
			System.out.println("<25,Y>,<Null,Null>");
		}else{
			System.out.println("<"+ Integer.toString(n-1) +","+array[n-2]+">,<"+ Integer.toString(n+1) +","+array[n]+">");
		}

		
	}
	
	public void findAdjacentsByMap()
	{
		Map <Integer, Character> map =  new HashMap<>();
		int j ='A';
		// loop to create map
		for(int i=1;  i<27; i++){
			map.put(i,(char)j);
			j++;
		}
		//System.out.println(map);
		
		// printing the desired output
		System.out.println("output of findAdjacentsByMap() method");
		if(n==1){
			System.out.println("<Null,Null>,<2,B>");
		}else if(n==26){
			System.out.println("<25,Y>,<Null,Null>");
		}else{
			System.out.println("<"+ Integer.toString(n-1) +","+map.get(n-1)+">,<"+ Integer.toString(n+1) +","+map.get(n+1)+">");
		}
		//System.out.println(map.get(15));

	}
	
}
	