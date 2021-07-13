package cardGameTest;

import cardGame.Card;
import exceptions.StakeUnderflowException;
import cardGame.CardDeck;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DeckOfCardsTest {
    CardDeck cardDeck;
    @BeforeEach
    void  setUp(){
        cardDeck = new CardDeck(4);
    }

    @Test
    void cardDeckHasFixedSize(){
        assertEquals(4, cardDeck.getSize());
    }
    @Test
    void pushOneElementPushedShouldBeLast(){
        Card card = Card.createCircleValue(3);
        cardDeck.push(card);
        assertSame(card, cardDeck.peek());
    }
    @Test
    void pushTwicePopOncePeekShouldReturnFirstElement(){
        Card firstCard = Card.createTriangleValue(5);
        Card secondCard = Card.createCircleValue(7);
        cardDeck.push(firstCard);
        cardDeck.push(secondCard);
        Card poppedCard = cardDeck.pop();

        assertSame(secondCard,poppedCard);
        assertSame(firstCard,cardDeck.peek());
    }
    @Test
    void popEmptyCardDeckThrowsStakeUnderflowException(){
        assertTrue(cardDeck.isEmpty());
        assertThrows(StakeUnderflowException.class,()->cardDeck.pop());
    }
    @Test
    void pushIntoFullDeckThrowsStakeOverflowException(){
        Card card = Card.createTriangleValue(4);
        for(int i = 0; i<4; i++){
            cardDeck.push(card);
        }
        assertTrue(cardDeck.isFull());
    }

    @Test
    void cardDeckCanBeShuffled(){
        Card firstCard = Card.createCrossesValue(5);
        Card secondCard = Card.createTriangleValue(7);
        Card thirdCard = Card.createCircleValue(5);
        Card fourthCard = Card.createSquaresValue(7);
        cardDeck.push(firstCard);
        cardDeck.push(secondCard);
        cardDeck.push(thirdCard);
        cardDeck.push(fourthCard);
        assertSame(fourthCard,cardDeck.peek());

        cardDeck.shuffleCardDeck();

        assertNotSame(fourthCard,cardDeck.peek());


    }
    @Test
    void cardDeckCanBePopulated(){
        assertNotNull(CardDeck.createFullCardDeck());
    }
    @Test
    void testThatCardDeckIsFull(){
        assertTrue(CardDeck.createFullCardDeck().isFull());
    }
}
