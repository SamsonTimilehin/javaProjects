package cardGameTest;

import cardGame.Card;
import cardGame.CardDeck;
import cardGame.Player;
import org.junit.jupiter.api.Test;

import static cardGame.Suit.*;
import static org.junit.jupiter.api.Assertions.*;

public class CardTest {
    @Test
    void circlesCardCanBeCreated() {
        Card card = Card.createCircleValue(2);
        assertSame(CIRCLES, card.getSuit());
    }

    @Test
    void trianglesCardsCanBeCreated() {
        Card card = Card.createTriangleValue(4);
        assertSame(TRIANGLES, card.getSuit());
    }

    @Test
    void crossesCardsCanBeCreated() {
        Card card = Card.createCrossesValue(2);
        assertSame(CROSSES, card.getSuit());
    }

    @Test
    void squaresCardsCanBeCreated() {
        Card card = Card.createSquaresValue(6);
        assertSame(SQUARES, card.getSuit());
    }
    @Test
    void starCardsCanBeCreated() {
        Card card = Card.createStarsValue(1);
        assertSame(STARS, card.getSuit());
    }
    @Test
    void whotCardsCanBeCreated() {
        Card card = Card.createWhotValue(7);
        assertSame(WHOT, card.getSuit());
    }

//    @Test
//    void invalidCardExceptionIsThrownWhenValueIsInvalid() {
//        assertThrows(InvalidCardValueException.class, () -> new mywork.Player.Card(CIRCLES, 14));
//        assertThrows(InvalidCardValueException.class, () -> new mywork.Player.Card(CIRCLES, 0));
//    }

//    @Test
//    void cardToStringTest() {
//        mywork.Player.Card card = mywork.Player.Card.createCircleValue(13);
//        String expectedToString = "King of Diamond";
//        assertEquals(expectedToString, card.toString());
//        card = mywork.Player.Card.createCrossesValue(3);
//        expectedToString = "3 of Heart";
//        assertEquals(expectedToString, card.toString());

   // }

    @Test
    void testSameCardValueEquals() {
        Card triangle = Card.createTriangleValue(4);
        Card crosses = Card.createCrossesValue(4);
        assertEquals(crosses, triangle);
        assertEquals(triangle, crosses);


    }

    @Test
    void testSameSuitValueEquals() {
        Card triangle = Card.createTriangleValue(13);
        Card crosses = Card.createCrossesValue(13);

        assertEquals(crosses, triangle);
        assertEquals(triangle, crosses);

       CardDeck cardDeck = new CardDeck(2);
        assertNotEquals(triangle, cardDeck);
    }

}