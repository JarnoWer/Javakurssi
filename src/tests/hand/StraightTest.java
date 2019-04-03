package tests.hand;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import poker.HandBuilder;
import poker.PokerHand;

public class StraightTest {

    @Test
    public void testSimpleStraight() {
        PokerHand hand = HandBuilder.createHand("♥6 ♦2 ♣3 ♠4 ♠5"); // Straight 2 -> 6

        assertTrue(hand.isStraight());

        assertFalse(hand.isStraightFlush());
    }

    @Test
    public void testStraightFlush() {
        PokerHand hand = HandBuilder.createHand("♥6 ♥2 ♥3 ♥4 ♥5"); // Straight 2 -> 6 and also a flush

        assertTrue(hand.isFlush());
        assertTrue(hand.isStraight());
        assertTrue(hand.isStraightFlush());

        assertFalse(hand.isRoyalFlush());
        assertFalse(hand.isPair());
    }

    @Test
    public void testStraightFromTenToAce() {
        PokerHand hand = HandBuilder.createHand("♥12 ♣10 ♠11 ♠1 ♥13");

        assertTrue(hand.isStraight());

        assertFalse(hand.isFlush());
        assertFalse(hand.isStraightFlush());
        assertFalse(hand.isRoyalFlush());
    }

    @Test
    public void testAlmostStraightButNotQuite() {
        PokerHand hand = HandBuilder.createHand("♥12 ♣1 ♠11 ♠1 ♥13");

        assertFalse(hand.isStraight());
        assertFalse(hand.isRoyalFlush());
    }

    @Test
    public void testRoyalFlush() {
        PokerHand hand = HandBuilder.createHand("♠12 ♠10 ♠11 ♠1 ♠13");

        assertTrue(hand.isFlush());
        assertTrue(hand.isStraight());
        assertTrue(hand.isStraightFlush());
        assertTrue(hand.isRoyalFlush());

        assertFalse(hand.isPair());
    }
}
