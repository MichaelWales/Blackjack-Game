public class Card {

    private SuitType suit;
    private CardRank rank;

    public Card(SuitType suit, CardRank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public SuitType getSuitType() {
        return suit;
    }

    public CardRank getCardRank() {
        return rank;
    }

    public int getValue() {
        return this.rank.getValue();
    }

    public String cardName() {
        return String.format("%s of %s", this.rank, this.suit);
    }

}
