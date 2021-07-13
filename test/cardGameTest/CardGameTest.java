package cardGameTest;

import cardGame.CardGame;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CardGameTest {
    @Test
    void cardGameCanBeCreate(){
        CardGame cardGame = new CardGame(2,5);
        assertNotNull(cardGame);
    }
    @Test
    void gameIsInitializedWithNumberOfPlayer(){
        CardGame cardGame = new CardGame(2,5);
        assertEquals(2, cardGame.getNumberOfPlayers());

    }
}
