// matrix class
public class Matrix extends Thread { 

	// a, b input matrices
	// c output matrix
    private static int [][] a; 
    private static int [][] b; 
    private static int [][] c; 

	private static Matrix threads[][];

    /* You might need other variables as well */
	/* i1 : To store i
	   j1 : To store j
	   z : To store z1 */
	private int i1, j1, z;

    public Matrix(int i1, int j1, int z, int[][]a1, int[][]b1) { // need to change this, might need some information 
    	this.i1 = i1;
    	this.j1 = j1;
    	this.z = z;
    	a = a1;
    	b = b1;
	}

	/* Run method will calculate each element of the matrix c */
	public void run() {
    	int  k, s;
    		for(s=0, k=0; k<z; k++) 
    		    s += a[i1][k] * b[k][j1];
    		c[i1][j1] = s;
    	    
    }


    public static int [][] multiply(int [][] a, int [][] b) {

	/* check if multiplication can be done, if not 
	 * return null 
	 * allocate required memory 
	 * return a * b
	 */

	int x = a.length; 
	int y = b[0].length; 

	int z1 = a[0].length; 
	int z2 = b.length; 

	if(z1 != z2) { 
	    System.out.println("Cannot multiply");
	    return null;
	}

	/* Create number of threads equal to the number of elements of the output matrix */
	threads = new Matrix[x][y];
	
	c = new int [x][y];

	/* Start the threads */
	for(int i = 0;i < x;i++) {
		for(int j = 0;j < y;j++) {
			threads[i][j] = new Matrix(i, j, z1, a, b);
			threads[i][j].start(); /* run method is called */
		}
	}
	
	/* Wait for finishing all the threads */
	for(int i = 0;i < x;i++) {
		for(int j = 0;j < y;j++) {
			try {
				threads[i][j].join();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException is occurred");
			}
		}
	}

	return c; 
    }

}