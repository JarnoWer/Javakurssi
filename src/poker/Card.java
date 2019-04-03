package poker;

public class Card implements Comparable<Card> {

    // An enumerable card suit, either HEARTS, DIAMONDS, CLUBS or SPADES
    private final Suit suit;

    // The "number" of the card from 1 (ace) to 13 (king).
    private final int rank;

    /**
     * Classes can have multiple constructors. This constructor creates a new Card
     * object with the given Suit (hearts, spades..) and rank (1-13)
     */
    public Card(Suit s, int rank) {
        this.suit = s;
        this.rank = rank;
    }

    /**
     * Classes can have multiple constructors. This second constructor takes a
     * String representation of a card (e.g. "♥10") and parses it to create a Card
     * object with the same suit and rank.
     */
    public Card(String suitAndRank) {
        String symbol = suitAndRank.substring(0, 1); // First character is the suit symbol
        String rankString = suitAndRank.substring(1);

        this.rank = Integer.parseInt(rankString);
        this.suit = Suit.findBySymbol(symbol);
    }

    public Suit getSuit() {
        return this.suit;
    }

    public int getRank() {
        return this.rank;
    }

    /**
     * Compares this card to another by their ranks. The comparison is done by the
     * natural ordering of ranks, meaning the card with a lower rank comes first.
     */
    @Override
    public int compareTo(Card other) {
        return Integer.compare(this.rank, other.rank);
    }

    /**
     * @return a String representation of the card, such as "♠2"
     */
    @Override
    public String toString() {
        return this.suit.getSymbol() + this.getRank();
    }
}
