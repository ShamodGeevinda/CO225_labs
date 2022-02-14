

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

class Gamecontroller implements ActionListener {

    Gameview view;
    GameModel model;

    public Gamecontroller(GameModel model, Gameview view) {
        this.model = model;
        this.view = view;
        addActionListeners();
    }

    private void addActionListeners() {
        for (int i = 0; i < view.buttons.length; i++)
            view.buttons[i].addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (view.checkIfGameEnd == false) {
            model.setChoice();
            ((JButton) e.getSource()).setText(model.userSymbol);
            model.ClickEvent();
        }
    }

}