
public class MainClass {

	public static void main(String[] args) {
        GameModel model = new GameModel();
        Gameview view = new Gameview(model);
        Gamecontroller controller = new Gamecontroller(model, view);

        boolean run = true;
        while (run) {
            view.updateGameState();
            if (view.checkIfGameEnd  == true) {
                view.terminateGameIfNoOneWins();
                run = false;
            }
            try {
                Thread.sleep(500);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }

}
