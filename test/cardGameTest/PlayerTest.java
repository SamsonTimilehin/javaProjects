package cardGameTest;

import cardGame.Card;
import cardGame.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    @Test
    void playerHasAnId(){
       Player player = new Player("Kabiru Michael");
       assertEquals("Kabiru Michael", player.getName());
    }
    @Test
    void playerHasCard(){
        Player player = new Player("Kabiru Michael");
        player.addCard(Card.createCircleValue(4));
        player.addCard(Card.createTriangleValue(2));
        player.addCard(Card.createCrossesValue(3));
        assertEquals(3,player.getNumberOfCards());
    }
}
