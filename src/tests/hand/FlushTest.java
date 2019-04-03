package tests.hand;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import poker.PokerHand;
import poker.HandBuilder;

public class FlushTest {

    @Test
    public void allCardsAreHearts() {
        PokerHand hand = HandBuilder.createHand("♥10 ♥8 ♥7 ♥1 ♥12"); // Only hearts

        assertTrue(hand.isFlush());
    }

    @Test
    public void allCardsAreSpades() {
        PokerHand hand = HandBuilder.createHand("♠10 ♠8 ♠7 ♠1 ♠12"); // Only spades

        assertTrue(hand.isFlush());
    }

    @Test
    public void handIsNotAFlushWhenOneCardFromDifferentSuit() {
        PokerHand hand = HandBuilder.createHand("♥10 ♥8 ♦10 ♥1 ♥12"); // Diamonds in the middle - no flush

        assertFalse(hand.isFlush());
    }
}
