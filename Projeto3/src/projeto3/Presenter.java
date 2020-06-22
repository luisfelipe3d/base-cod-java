package projeto3;

public class Presenter {
	Connect4GUI view;
	GameModel mm;

	public void attachView(Connect4GUI view) {
            this.view = view;
            mm = new GameModel();
	}

	public void enterPlayer(String name) {
            mm.enterPlayer(name);
	}

	public void changeTurn() {
            mm.changeTurn();
	}

	public String getTurn() {
            return mm.getTurn();
	}

	public void pushGridValues(int row, int column) {
            mm.setGrid(row, column);
	}

	public void updateModelGrid(int column){
            int row = mm.updateGrid(column);
            if (row == -1){
                // System.out.println("You can't use column anymore");
            }
            else {
                view.paintCircle(row, column);
            }
	}
        
        /**
         * Checks for a winner.
         * @return Player number of winner or 0 for no winner.
        */
        public int checkWin(int winCondition) {
            return mm.checkWin(winCondition);
        }
}
