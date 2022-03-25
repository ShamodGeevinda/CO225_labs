class Main { 
    public static int [][] a = {{1,1,1,1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1,1,1,1}};
    
    public static int [][] b = {{1 },
				{1 },
				{1 },
				{1 },
				{1 },
				{1 },
				{1 },
				{1 },
				{1 },
				{1 },
				{1 },
				{1 }};


    public static void print_matrix(int [][] a) {
	for(int i=0; i < a.length; i++) {
	    for(int j=0; j< a[i].length; j++) 
		System.out.print(a[i][j] + " "); 
	    System.out.println();
	}
    }
    

    public static void main(String [] args) { 

	int [][] x = Matrix.multiply(a, b); 
	print_matrix(x); // see if the multiplication is correct 	

    }
}


/* 1. How to use threads to parallelize the operation?
		We can use one thread to calculate one element in the output matrix c.
		Therefore more than one threads are used to calculate elements in the output matrix c.
		Since all the threads can be run parallel, the  operation of calculating elements of the output matrix c is parallelized.
		
   2. How may threads to use?
		Number of threads to use = Number of elements of the output matrix calculate
		                         = x (Number of rows of first matrix) * y (Number of columns of second matrix)
   3. How to allocate work for each thread (recall it is the run function which all the threads
execute) 
		Each thread is used to calculate each element of the output matrix c.
		Since run method is called when a thread starts, the calculation of each element can be done in run method.
		Therefore the run method calculates one element per thread.
		
   4. How to synchronize?
		Since the calculation of elements is done in the run method and no other methods are used we do not need synchronization.
		Because each thread is allowed to access the run method without restriction, as there is only one thread actually accessing the method.
		But if there were any other methods or objects shared by all the threads that method or object need to be synchronized 
		
		
		
	Extra:-

	1. Is this implementation cache friendly?
			No.

	2. Can you think of a way to make it so?	
			By using thread pools.
			In the case of a thread pool, a group of fixed-size threads is created. A thread from the thread pool is pulled out and assigned
			a job by the service provider. After completion of the job, the thread is contained in the thread pool again.
		
		*/