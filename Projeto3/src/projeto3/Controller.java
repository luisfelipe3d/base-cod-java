package projeto3;

public class Controller {
    private GameView view;
    private GameModel gameModel;

    public void attachView(GameView view) {
        this.view = view;
        gameModel = new GameModel();
    }

    public void enterPlayer(String name) {
        gameModel.enterPlayer(name);
    }

    public void changeTurn() {
        gameModel.changeTurn();
    }

    public String getTurn() {
        return gameModel.getTurn();
    }

    public void pushGridValues(int row, int column) {
        gameModel.setGrid(row, column);
    }

    public void updateModelGrid(int column) {
        int row = gameModel.updateGrid(column);
        if (row == -1) {
        } else {
            view.paintCircle(row, column);
        }
    }

    public int checkWin(int winCondition) {
        return gameModel.checkWin(winCondition);
    }
}
