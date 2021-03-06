import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();

        for(SuitType suit : SuitType.values()) {
            for(CardRank rank : CardRank.values()) {
                Card card = new Card(suit, rank);
                this.cards.add(card);
            }
        }
        Collections.shuffle(this.cards);
    }

    public int cardCount() {
        return this.cards.size();
    }

    public Card deal() {
       return this.cards.remove(0);
    }

}
