public class Q2 extends Thread {
    private int [][] m1; 
    private int [][] m2;
    public static boolean result = true; 
    private static int row;

    public Q2(int [][] m1, int [][] m2, int row) {
        this.m1 = m1;
        this.m2 = m2;
        this.row = row;
    }

    @Override
    public void run(){
        for(int j =0; j<m1[0].length; j++){
            if(m1[row][j] != m2[row][j]){
                result = false;
                break;
            }
        }
    }
}