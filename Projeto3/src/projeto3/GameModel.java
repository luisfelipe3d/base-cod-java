package projeto3;

import java.util.ArrayList;

public class GameModel {
    ArrayList<Player> players;
    Player turn;
    int[][] grid;

    GameModel() {
        players = new ArrayList<Player>();
    }

    void enterPlayer(String name) {
        Player p = new Player(name);
        players.add(p);
        turn = players.get(0);
    }

    void changeTurn() {
        if (turn.equals(players.get(0))) {
            turn = players.get(1);
        } else {
            turn = players.get(0);
        }
    }

    void setGrid(int row, int column) {
        grid = new int[row][column];
    }

    String getTurn() {
        if (turn.equals(players.get(0))) {
            return players.get(0).getName();
        } else {
            return players.get(1).getName();
        }
    }

    int updateGrid(int column) {
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
        
    /**
     * Checks to see if a connection has been made.
     * @param winCondition number of consecutive pieces in a row needed to win
     * @return The player number of the winner or 0 if no winner was found.
     */
    int checkWin(int winCondition) {
        int currentPlayer, player, streak;
        // check rows
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
        // check columns
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
        // check \ diagonals, lower half
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
        // check \ diagonals, upper half
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
        
        // check / diagonals, upper half
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
        // check / diagonals, lower half
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
