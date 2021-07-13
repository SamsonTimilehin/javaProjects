package cardGame;

import static cardGame.Suit.*;
import static cardGame.Suit.WHOT;

public class Card {

        private final int value;
        private final Suit suit;

        private Card(Suit suit, int value) {

            this.suit = suit;
            this.value = value;
        }

        public static Card createTriangleValue(int value){
            return new Card(TRIANGLES, value);
        }
        public static Card createCircleValue(int value){
            return new Card(CIRCLES, value);
        }
        public static Card createCrossesValue(int value){
            return new Card(CROSSES, value);
        }
        public static Card createSquaresValue(int value){
            return new Card(SQUARES, value);
        }
        public static Card createStarsValue(int value){
            return new Card(STARS, value);
        }
        public static Card createWhotValue(int value){
            return new Card(WHOT, value);
        }

        public Suit getSuit() {
            return suit;
        }

        @Override
        public boolean equals(Object obj) {
            if(!this.getClass().equals(obj.getClass())){
                return false;
            }
            Card cardToCompare = (Card) obj;
            return this.value == cardToCompare.value || this.suit == cardToCompare.suit;

        }
}
