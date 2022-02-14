/*
Model Class of MVC structure is implemented here. 
*/

public class Model {

    
	private static int[][] array = {{0,0,0},{0,0,0},{0,0,0}}; //initialize the array
	
	//method to update the array
	public  void array_update(int rem,int i,int j) {
		if (rem==0) {
			 array[i][j] = 2; // array is updated
		 }
		 else {
			 array[i][j] = 1;
		 }
	}
	
	//returning the array
	public int[][] get_array(){
		return array;
	}
	
	//calculating the remainder of a number
	public int get_remainder(int val) {
		return (val%2);
	}
	
	//this method calculates whether there is a winner
	public int get_winner () {
		int winner = -1;//if there is no winner
		 
		//checking for the winner
		for (int i =0; i<3; i++){ // loop to check columns and rows
				if((array[0][i] == 1)&&(array[1][i] == 1)&&(array[2][i] == 1)) { // checking columns
					winner = 1;
					// a.update(0, i , 1, i, 2,i); // develop from here
					break;
				}
				else if ((array[i][0] == 1)&&(array[i][1] == 1)&&(array[i][2] == 1)) { //checking columns
					winner = 1;
										// a.update(0, i , 1, i, 2,i); // develop from here

					break;
				}
				else if((array[0][i] == 2)&&(array[1][i] == 2)&&(array[2][i] ==2 )) {  // checking rows
					winner = 2;
										// a.update(0, i , 1, i, 2,i); // develop from here

					break;
				}
				else if ((array[i][0] == 2)&&(array[i][1] == 2)&&(array[i][2] == 2)) {  // checking rows
					winner = 2; 
										// a.update(0, i , 1, i, 2,i); // develop from here

					break;
				}		
		}
		
		if(winner==-1){
			if ((array[0][0] == 1)&&(array[1][1] == 1)&&(array[2][2] == 1)) {//checking three ones in left diagonal
				winner = 1;
									// a.update(0, 0 , 1, 1, 2,2); // develop from here

			}
			else if ((array[2][0] == 1)&&(array[1][1] == 1)&&(array[0][2] == 1)) {//checking three ones in right diagonal
				winner = 1;
									// a.update(2, 0 , 1, 1, 0,2); // develop from here

			}
			
			else if ((array[0][0] == 2)&&(array[1][1] == 2)&&(array[2][2] == 2)) {//checking three ones in left diagonal
				winner = 2;
									// a.update(0, 0 , 1, 1, 2,2); // develop from here

			}
			else if ((array[2][0] == 2)&&(array[1][1] == 2)&&(array[0][2] == 2)) {//checking three ones in right diagonal
				winner = 2;
									// a.update(2, 0 , 1, 1, 0,2); // develop from here

			}
			
			else { //checking for draw
				int draw = 1;
				for (int i=0;i<3;i++) {
					for (int j=0;j<3;j++) {
						if (array[i][j]==0) {
							draw = 0;
							i=3;
							break;
						}
					}
				}
			
			if (draw == 1) {
				winner = 0;
			}
		}
	}
		
		return winner;	//no winner -> -1, winner 1 -> 1, winner 2->2, draw->0
	}

	public void array_reset() {	//resetting the array after the game 
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				array[i][j] = 0;
			}
		}
	}

	public int[] get_winner_arr () {
		int winner = -1;//if there is no winner
		int[] arr ={-1,-1,-1,-1,-1,-1};
		//checking for the winner
		for (int i =0; i<3; i++){ // loop to check columns and rows
				if((array[0][i] == array[1][i] )&&(array[2][i] ==  array[1][i]) && (array[1][i]==1 || array[1][i]==2)) { // checking rows
					arr = new int[]{0,i,1,i,2,i};
					break;
				}
				else if ((array[i][0] == array[i][1])&&(array[i][2] == array[i][1])&& (array[i][1]==1 || array[i][1]==2)) { //checking columns
					arr = new int[]{i,0,i,1,i,2};
					break;
				}
						
		}
		
		if(winner==-1){
			if ((array[0][0] == array[1][1] )&&(array[2][2] == array[1][1])) {//checking three ones in left diagonal
					arr = new int[]{0,0,1,1,2,2};
			}
			else if ((array[2][0] == array[1][1] )&&(array[0][2] == array[1][1])) {//checking three ones in right diagonal
					arr = new int[]{2,0,1,1,0,2};
			}
			
			
	}
		
		return arr;	// return array of indexes to change color of boxes
	}


	

	
}

 