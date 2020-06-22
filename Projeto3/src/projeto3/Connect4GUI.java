package projeto3;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Connect4GUI extends Application {
    private GridPane grid;
    private Presenter presenter = new Presenter();
    private Label currentPlayer;
    
    public static void main(String [] args) {
        launch(args);
    }

    @Override
    public void start(final Stage stage) throws Exception {
        draw(stage);
    }

    public void draw(Stage stage) throws Exception {
        final int rows = 10; 
        final int columns = 10;
        final int connectWin = 4;
        
        presenter.attachView(this);
        presenter.pushGridValues(rows, columns);
        stage.setTitle("4 in a Row!" );
        BorderPane borderPane = new BorderPane();
        Button reset = new Button("reset");
        presenter.enterPlayer("Yellow");
        presenter.enterPlayer("Red");
        currentPlayer = new Label("Current turn: " + presenter.getTurn());

        ToolBar tb = new ToolBar();
        borderPane.setTop(tb);
        tb.getItems().addAll(reset, currentPlayer);

        grid = new GridPane();
        grid.getStyleClass().add("game-grid");

        for (int i = 0; i < columns; i++) {
            ColumnConstraints column = new ColumnConstraints(10);
            grid.getColumnConstraints().add(column);
        }

        for (int i = 0; i < rows; i++) {
            RowConstraints row = new RowConstraints(10);
            grid.getRowConstraints().add(row);
        }

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                Pane pane = new Pane();
                pane.setMinSize(25, 25);

                pane.setOnMouseReleased(e -> {
                    //pinta o círculo a cada clique
                    presenter.updateModelGrid(GridPane.getColumnIndex(pane));
                    currentPlayer.setText(
                        "Current turn: " + presenter.getTurn());
                    int playerWin = presenter.checkWin(connectWin);
                    if(playerWin != 0) {
                        Alert winAlert = new Alert(AlertType.INFORMATION);
                        winAlert.setTitle("Game Over!");
                        winAlert.setHeaderText(null);
                        winAlert.setContentText(
                                "Player " + playerWin + " wins!");
                        winAlert.showAndWait();
                        try {
                            draw(stage);
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                });

                pane.getStyleClass().add("game-grid-cell");
                if (i == 0) {
                    pane.getStyleClass().add("first-column");
                }
                if (j == 0) {
                    pane.getStyleClass().add("first-row");
                }

                grid.add(pane, i, j);

            }
        }

        reset.setOnAction((ActionEvent event) -> {
            try {
                draw(stage);

            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        borderPane.setCenter(grid);

        int sceneWidth, sceneHeight;
            sceneWidth = 420;
            sceneHeight = 450;
        
        Scene scene = new Scene(borderPane, sceneWidth, sceneHeight);
        scene.getStylesheets().add("projeto3/resources/game.css");
        stage.setScene(scene);
        stage.show();
    }

    private Node getNodeByRowColumnIndex(final int row, final int column, GridPane gridPane) {
        Node result = null;
        ObservableList<Node> childrens = gridPane.getChildren();

        for (Node node : childrens) {
            if (GridPane.getRowIndex(node) == row && GridPane.getColumnIndex(node) == column) {
                result = node;
                break;
            }
        }

        return result;
    }

    public void paintCircle(int row, int column) {
        Circle rect = new Circle(12.5, 12.5, 12.5);
        if (presenter.getTurn().equals("Yellow"))
            rect.setFill(Color.YELLOW);
        else {
            rect.setFill(Color.RED);
        }
        presenter.changeTurn();
        Pane p = (Pane) getNodeByRowColumnIndex(row, column, grid);
        p.getChildren().add(rect);

    }
    
}
