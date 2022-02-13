/*
This is the Controller class implementation in MVC. 
*/


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;


public class Controller implements ActionListener{
	
	private View view;
	private Model model;
	
	public static int val = 0;
	
	//constructor
	Controller (View view,Model model){
		this.view = view;
		this.model = model;
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				this.view.button[i][j].addActionListener((ActionListener) this);
			}
		}
		
	}
	
	public void actionPerformed(ActionEvent e) {
		val++; //when  a button is pressed, value is incremented by 1
		int rem=model.get_remainder(val);//remainder is taken
		
		//according to the button you have pressed
		for (int i =0; i<3; i++){
			for (int j = 0; j<3 ; j++ ){
				if(e.getSource() == view.button[i][j]) { 
					model.array_update(rem,i,j);//array is updated
					view.cell_update(rem,i,j);//cell view is changed
					view.button_disable(i,j);//you can't press that button again
				}

			}
		}

		int win = model.get_winner();//winner is taken if any
	  int[] arr = model.get_winner_arr();
		// int[] arr = model.a.arr;
		if (win != -1) {//if there is a winner
			val = 0;//val is 0
			if(arr[0]!=-1){
			view.button_color(arr[0],arr[1]); // delete this
			view.button_color(arr[2],arr[3]);
			view.button_color(arr[4],arr[5]);
			}
			model.array_reset();//array is reset
			
			
			int dialogResult;
			if (win != 0) {//not draw
				dialogResult =  view.winner_window(win);
				if(dialogResult == JOptionPane.YES_OPTION)//play agian
				{
					view.setVisible(false);//curent windows are closed
					view.frame.dispose();

					Model model = new Model();
				    View view = new View();
				    new Controller(view,model);
				}
				else//don't play again
				{	
					view.dispatchEvent(new WindowEvent(view.frame, WindowEvent.WINDOW_CLOSING));
					System.exit(0);
				}	
			}
			else {//draw
				dialogResult =  view.draw_window(win);
				if(dialogResult == JOptionPane.YES_OPTION)//wants to play again
				{
					view.setVisible(false);
					view.frame.dispose();
					Model model = new Model();
				    View view = new View();
				    new Controller(view,model);
				}
				else//no need to play again
				{	
					view.dispatchEvent(new WindowEvent(view.frame, WindowEvent.WINDOW_CLOSING));
					System.exit(0);
				}	
			}
		}
	}	
}