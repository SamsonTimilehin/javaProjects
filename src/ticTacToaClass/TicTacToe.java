package ticTacToaClass;

public class TicTacToe {

    private final String[][] board = new String[3][3];

    public String[][] displayGameBoard() {

        for (int row = 0; row < board.length; row++) {

            for (int column = 0; column < board.length; column++) {
                board[row][column] = "empty";

            }
            System.out.println();
        }
        return board;
   }
   public String toString(){
        return String.format("%s", board);
   }
}
