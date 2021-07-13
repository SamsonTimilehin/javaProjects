package ticTacToe;

import org.junit.jupiter.api.Test;
import ticTacToaClass.TicTacToe;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {
    @Test
    void ticTacToeGameIsCreate(){
        TicTacToe ticTacGame = new TicTacToe();
        assertNotNull(ticTacGame);
    }
    @Test
    void ticTacToeDisplayEmptySpace(){
        TicTacToe ticTacGame = new TicTacToe();
        String [][] expected = new String[][]{{"empty","empty","empty"},{"empty","empty","empty"},{"empty","empty","empty"}};
       assertArrayEquals(expected, ticTacGame.displayGameBoard());
       System.out.println(Arrays.deepToString(ticTacGame.displayGameBoard()));
    }





}
