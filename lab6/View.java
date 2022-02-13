// view 
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class View extends JPanel{
    	
	JButton[][] button;
	JFrame frame;
	
	//private Toolkit toolkit;
	public View() { 

    	super(new BorderLayout());  
    	frame=new JFrame("Tic Tac Toe");    //setting up the frame and title
    	
    	button = new JButton[3][3];			//3x3 array buttons
    	frame.setLayout(new GridLayout(3, 3));
    	
    	for (int i=0;i<3;i++) {
    		for (int j=0;j<3;j++) {  
    			button[i][j] = new JButton();
    	    	frame.add(button[i][j]);  
    	    	button[i][j].setFont(new Font("MV Boli", Font.PLAIN, 50));//font size is set
    	    	button[i][j].setBackground(new Color(150,150,150));		//background is black initially
    		}
    	}
    	
    	frame.setSize(600, 600);//size of the frame
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); 
    	 
    }
	
	
	
	//updatig the cell 
	public  void cell_update(int rem,int i,int j) {
		if (rem==0) {
			button[i][j].setBackground(Color.YELLOW);//with different color
			button[i][j].setText("O");//text 2
		 }
		else {
			 button[i][j].setBackground(Color.WHITE);
			 button[i][j].setText("X");
		 }
	}
	
	//making the button disable
	public void button_disable(int i,int j) {
		button[i][j].setEnabled(false);
	}


	//window is opened when there is a winner
	public int winner_window(int win) {
		// TODO Auto-generated method stub
		int dialogResult = 0;
		dialogResult = JOptionPane.showConfirmDialog(null,"Player "+win+" Wins The Game!\nDo You Want To Play Again?","Game Over",dialogResult);
		return dialogResult;
	}
	
	//when the game is draw
	public int draw_window(int win) {
		// TODO Auto-generated method stub
		int dialogResult = 0;
		dialogResult = JOptionPane.showConfirmDialog(null,"The Game Is Draw!\nDo You Want To Play Again?","Game Over",dialogResult);
		return dialogResult;
	}

	public void button_color(int a, int b){
		button[a][b].setBackground(Color.GREEN);
	}
		
}