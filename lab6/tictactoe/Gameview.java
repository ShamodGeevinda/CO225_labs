

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

class Gameview extends JFrame {

	GameModel model = new GameModel();
	  GridLayout grid = new GridLayout(5,5);
	    JButton[] buttons;
	    static boolean checkIfGameEnd;
	
	    

    public Gameview(GameModel model) {
 
        super("CMPS 415 TicTacToe MVC");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        uiComponent(getContentPane());
        pack();
        setVisible(true);
        this.model = model;
        checkIfGameEnd = false;
    }

    public void uiComponent(final Container pane) {
        final JPanel panel = new JPanel();
        panel.setLayout(grid);        
        panel.setPreferredSize(new Dimension(400, 400));

        buttons = new JButton[25];

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            buttons[i].getPreferredSize();
            panel.add(buttons[i]);
        }

        pane.add(panel);
        
    }
    public  boolean testWinner() {
        int x_x1, x_x2, x_x3, x_x4, x_x5,
            x_y1, x_y2, x_y3, x_y4, x_y5,
            x_sumDiagonalLR, x_sumDiagonalRL;

        x_x1 = x_x2 = x_x3 = x_x4 = x_x5
        = x_y1 = x_y2 = x_y3 = x_y4 = x_y5
        = x_sumDiagonalLR = x_sumDiagonalRL = 0;

        int o_x1, o_x2, o_x3, o_x4, o_x5,
            o_y1, o_y2, o_y3, o_y4, o_y5,
            o_sumDiagonalLR, o_sumDiagonalRL;

        o_x1 = o_x2 = o_x3 = o_x4 = o_x5
        = o_y1 = o_y2 = o_y3 = o_y4 = o_y5
        = o_sumDiagonalLR = o_sumDiagonalRL = 0;

        for (int i = 0; i < 5; i++) {
            if (buttons[i].getText() == "X")
                x_x1++;
            if (buttons[i].getText() == "O")
                o_x1++;
        }

        for (int i = 5; i < 10; i++) {
            if (buttons[i].getText() == "X")
                x_x2++;
            if (buttons[i].getText() == "O")
                o_x2++;
        }

        for (int i = 10; i < 15; i++) {
            if (buttons[i].getText() == "X")
                x_x3++;
            if (buttons[i].getText() == "O")
                o_x3++;
        }
        for (int i = 15; i < 20; i++) {
            if (buttons[i].getText() == "X")
                x_x4++;
            if (buttons[i].getText() == "O")
                o_x4++;
        }
        for (int i = 20; i < 25; i++) {
            if (buttons[i].getText() == "X")
                x_x1++;
            if (buttons[i].getText() == "O")
                o_x5++;
        }

        for (int i = 0; i < 25; i += 5) {
            if (buttons[i].getText() == "X")
                x_y1++;
            if (buttons[i].getText() == "O")
                o_y1++;
        }

        for (int i = 1; i < 25; i += 5) {
            if (buttons[i].getText() == "X")
                x_y2++;
            if (buttons[i].getText() == "O")
                o_y2++;
        }

        for (int i = 2; i < 25; i += 5) {
            if (buttons[i].getText() == "X")
                x_y3++;
            if (buttons[i].getText() == "O")
                o_y3++;
        }
        for (int i = 5; i < 25; i += 5) {
            if (buttons[i].getText() == "X")
                x_y4++;
            if (buttons[i].getText() == "O")
            	o_y4++;
        }
        for (int i = 4; i < 25; i += 5) {
            if (buttons[i].getText() == "X")
                x_y5++;
            if (buttons[i].getText() == "O")
                o_y5++;
        }

        for (int i = 0; i < 25; i += 6) {
            if (buttons[i].getText() == "X")
                x_sumDiagonalLR++;
            if (buttons[i].getText() == "O")
                o_sumDiagonalLR++;
        }

        for (int i = 4; i < 21; i += 2) {
            if (buttons[i].getText() == "X")
                x_sumDiagonalRL++;
            if (buttons[i].getText() == "O")
                o_sumDiagonalRL++;
        }

        boolean someoneWon = false;

        if (x_x1 == 5 || x_x2 == 5 || x_x3 == 5 || x_x4 == 5 || x_x5 == 5 ||
            x_y1 == 5 || x_y2 == 5 || x_y3 == 5 || x_y4 == 5 || x_y5 == 5 ||
            x_sumDiagonalLR == 5 || x_sumDiagonalRL == 5 ) {
        	someoneWon = true;
        }
        else if(
            o_x1 == 5 || o_x2 == 5 || o_x3 == 5 || o_x4 == 5 || o_x5 == 5 ||
            o_y1 == 5 || o_y2 == 5 || o_y3 == 5 || o_y4 == 5 || o_y5 == 5 ||
            o_sumDiagonalLR == 5 || o_sumDiagonalRL == 5) {
        	someoneWon = true;
        }

        return someoneWon;
       
    }

 

    public void terminateGameIfNoOneWins() {
        for (int i = 0; i < buttons.length; i++)
            buttons[i].setEnabled(false);
    }
    public void updateGameState() { 
        if (model.NumberOfClick == 25 || testWinner() == true)
            checkIfGameEnd = true;
    }

    
}
