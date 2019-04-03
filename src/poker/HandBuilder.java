package poker;

public class HandBuilder {

    /**
     * A helper method for creating a Hand of Card objects by the String
     * representation of the hand.
     * 
     * @param handAsString String representation of a hand: "♥10 ♠1 ♦10 ♦7 ♠10"
     * @return a new Hand object with the given cards
     */
    public static PokerHand createHand(String handAsString) {
        String[] cardsAsString = handAsString.split(" ");
        Card[] cards = new Card[cardsAsString.length];

        for (int i = 0; i < cards.length; i++) {
            cards[i] = new Card(cardsAsString[i]);
        }
        return new PokerHand(cards);
    }
}
