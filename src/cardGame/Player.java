package cardGame;

import java.util.ArrayList;
import java.util.List;



public class Player {
    private String playerName;
    private final List<Card> cards = new ArrayList<>();

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public String getName() {
        return playerName;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public int getNumberOfCards() {
        return cards.size();
    }


}
