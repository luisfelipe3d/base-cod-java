package projeto3;

import java.util.ArrayList;

public class GameModel {
    private ArrayList<Player> players;
    private Player turn;
    private int[][] grid;

    public GameModel() {
        players = new ArrayList<Player>();
    }

    public void enterPlayer(String name) {
        Player p = new Player(name);
        players.add(p);
        turn = players.get(0);
    }

    public void changeTurn() {
        if (turn.equals(players.get(0))) {
            turn = players.get(1);
        } else {
            turn = players.get(0);
        }
    }

    public void setGrid(int row, int column) {
        grid = new int[row][column];
    }

    public String getTurn() {
        if (turn.equals(players.get(0))) {
            return players.get(0).getName();
        } else {
            return players.get(1).getName();
        }
    }

    public int updateGrid(int column) {
        int row;
        boolean lastGrid = false;
        if (lastGrid){
            return -1;
        }
        for ( row = grid.length-1; row >= 0; row--) {

            if (turn.equals(players.get(0))) {
                if (grid[row][column] == 0) {
                    grid[row][column] = 1;
                    break;
                }
            } 
            else if (grid[row][column] == 0 ) {
                grid[row][column] = 2;
                break;
            }
        }

        if ( row == 0){
            lastGrid = true;
            return row;
        }
        return row;
    }
        
    public int checkWin(int winCondition) {
        int currentPlayer, player, streak;
        
        // checa linhas
        for(int i = 0; i < grid.length; i++) {
            player = streak = 0;
            for(int j = 0; j < grid[i].length; j++) {
                currentPlayer = grid[i][j];
                if(currentPlayer != 0 && player == currentPlayer) {
                    if(++streak == winCondition - 1)
                        return player;
                } else {
                    player = currentPlayer;
                    streak = 0;
                }
            }
        }
        // checa colunas
        for(int i = 0; i < grid.length; i++) {
            player = streak = 0;
            for(int j = 0; j < grid[i].length; j++) {
                currentPlayer = grid[j][i];
                if(currentPlayer != 0 && player == currentPlayer) {
                    if(++streak == winCondition - 1)
                        return player;
                } else {
                    player = currentPlayer;
                    streak = 0;
                }
            }
        }
        // checa \ diagonais, metade inferior
        for(int i = 0; i < grid.length; i++) {
            player = streak = 0;
            int index = i;
            for(int j = 0; j < grid[i].length; j++) {
                if(index >= grid.length)
                    break;
                currentPlayer = grid[index][j];
                if(currentPlayer != 0 && player == currentPlayer) {
                    if(++streak == winCondition - 1)
                        return player;
                } else {
                    player = currentPlayer;
                    streak = 0;
                }
                index++;
            }
        }
        // checa \ diagonais, metade superior
        for(int i = 0; i < grid.length; i++) {
            player = streak = 0;
            int index = i;
            for(int j = 0; j < grid[i].length; j++) {
                if(index >= grid.length)
                    break;
                currentPlayer = grid[j][index];
                if(currentPlayer != 0 && player == currentPlayer) {
                    if(++streak == winCondition - 1)
                        return player;
                } else {
                    player = currentPlayer;
                    streak = 0;
                }
                index++;
            }
        }
        
        // checa / diagonais, metade inferior
        for(int i = grid.length - 1; i >= 0; i--) {
            player = streak = 0;
            int index = i;
            for(int j = 0; j <= i; j++) {
                currentPlayer = grid[index][j];
                if(currentPlayer != 0 && player == currentPlayer) {
                    if(++streak == winCondition - 1)
                        return player;
                } else {
                    player = currentPlayer;
                    streak = 0;
                }
                index--;
            }
        }
        // checa / diagonais, metade superior
        for(int i = grid.length - 1; i >= 0; i--) {
            player = streak = 0;
            int index = i;
            int jndex = grid.length - 1;
            for(int j = index; j <= grid.length; j--) {
                if(index >= grid.length)
                    break;
                currentPlayer = grid[jndex][index];
                if(currentPlayer != 0 && player == currentPlayer) {
                    if(++streak == winCondition - 1)
                        return player;
                } else {
                    player = currentPlayer;
                    streak = 0;
                }
                index++;
                jndex--;
            }
        }
        return 0;
    }

}
