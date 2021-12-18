import java.util.Scanner;
public class Lab03PartA
{
    public static void main(String args[])
    {
		//Implemnt Lab03PartA
    System.out.println("Enter the number of rows");

    // Scanner object to get the numnber of rows from the user
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    // to avoid negative value for rows
    if (n<0){
      System.out.println("Nagative value");
      System.exit(1);
    }
    int num = n*(n+1)/2; // if n = 5 num = 15

    // making multidimensional array
    int[][] grid = new int[n][];
    for(int i=0; i<n; i++){
      grid[i] = new int[i+1];
      
    }

    // adding values to the array
    for(int j=0; j<n; j++){
      for(int i =j; i<n; i++){
        grid[i][j]= num;
        num=num-1;
      }
     
    }

    // printing multi dimensional array
    for(int i=0; i<grid.length; i++){
      for(int j =0; j<grid[i].length; j++){
        System.out.print("  "+grid[i][j]);
      }
      System.out.println("");
      
    }


	}
	
}
	