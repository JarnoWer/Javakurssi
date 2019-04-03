package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import poker.Card;
import poker.Suit;

class CardTest {

    @Test
    public void cardsCanBeCreatedWithTwoConstructors() {
        Card card1 = new Card(Suit.SPADES, 2);
        Card card2 = new Card("♠2");

        assertEquals(card1.getSuit(), card2.getSuit());
        assertEquals(card1.getRank(), card2.getRank());
    }

    @Test
    public void aListOfCardsCanBeSortedByRank() {
        List<Card> cards = Arrays.asList(new Card("♠2"), new Card("♦10"), new Card("♠1"));

        // Changes the order of cards
        Collections.sort(cards);

        assertEquals(1, cards.get(0).getRank());
        assertEquals(2, cards.get(1).getRank());
        assertEquals(10, cards.get(2).getRank());
    }
}
