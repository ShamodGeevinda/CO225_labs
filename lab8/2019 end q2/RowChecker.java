import java.util.ArrayList;
import java.util.List;

public class RowChecker{
    //  private int [][] m1; 
    // private int [][] m2;

    //  public RowChecker(int [][] m1, int [][] m2) {
    //     this.m1 = m1;
    //     this.m2 = m2;
       
    // }
    public static boolean finalresult = true; 

    public void isSame(int [][] m1, int [][] m2 ){
        List <Thread> threads = new ArrayList<>();
        int rows = m1.length;

        for (int i=0; i<rows; i++){
            Q2 task = new Q2(m1, m2, rows);

            Thread thread = new Thread(task);
            thread.start();
            threads.add(thread);
            finalresult = Q2.result;
            if(threads.size() % 8 ==0 || i == (rows-1)){
                waitForThreads(threads);
            }
        }
        
    }


    public static void waitForThreads(List <Thread> threads){
        for(Thread thread : threads){
            try{
                thread.join();

            }catch (InterruptedException e){
               // e.printStackTrace();
            }
        }
        threads.clear();    
    }
}