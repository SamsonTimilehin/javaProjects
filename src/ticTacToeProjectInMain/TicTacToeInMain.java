package ticTacToeProjectInMain;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeInMain {
    private static BoardStatus [][] board = new BoardStatus[3][3];


    public enum BoardStatus{
        X, O, EMPTY
    }

    public static void main(String[] args) {
        createEmptyGameBoard();
        System.out.println(Arrays.deepToString(createEmptyGameBoard()));
    }
    public static BoardStatus[][] createEmptyGameBoard(){
        for(int row = 0; row < board.length; row++){
            for(int column = 0; column < board[row].length; column++){
                board[row][column] = BoardStatus.EMPTY;
            }

        }
        return board;
    }
    public static BoardStatus[][] fillGameBoard(int playPosition, BoardStatus player1, BoardStatus player2){

        switch(playPosition){
            case 1:
                board[0][0] = BoardStatus.X;
                break;
            case 2:
                board[0][1] = BoardStatus.O;
                break;
            case 3:
                board[0][2] = BoardStatus.X;
                break;
            case 4:
                board[1][0] = BoardStatus.X;
                break;
            case 5:
                board[1][1] = BoardStatus.X;
                break;
            case 6:
                board[1][2] = BoardStatus.X;
                break;
            case 7:
                board[2][0] = BoardStatus.X;
                break;
            case 8:
                board[2][1] = BoardStatus.X;
                break;
            case 9:
                board[2][2] = BoardStatus.X;
                break;
        }
        return board;
    }
}
