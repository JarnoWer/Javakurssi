package tests.hand;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import poker.PokerHand;
import poker.HandBuilder;

public class ManyCardsOfSameRankTest {

    @Test
    public void testPairOfAces() {
        PokerHand hand = HandBuilder.createHand("♥1 ♦1 ♠4 ♣6 ♣8"); // One pair (aces)

        assertTrue(hand.isPair(), hand + " has a pair of aces");

        assertFalse(hand.isTwoPairs());
        assertFalse(hand.isThreeOfAKind());
    }

    @Test
    public void testThreeOfAKind() {
        PokerHand hand = HandBuilder.createHand("♥10 ♠1 ♦10 ♦7 ♠10"); // Three of a kind (10)

        assertTrue(hand.isThreeOfAKind(), hand + " has three tens");

        assertFalse(hand.isFullHouse());
        assertFalse(hand.isTwoPairs());
        assertFalse(hand.isFourOfAKind());
    }

    @Test
    public void testFourOfAKind() {
        PokerHand hand = HandBuilder.createHand("♥10 ♠10 ♦10 ♦7 ♠10"); // Four of a kind (10)

        assertTrue(hand.isFourOfAKind(), hand + " has four tens");

        assertFalse(hand.isFullHouse());
        assertFalse(hand.isTwoPairs());
        assertFalse(hand.isThreeOfAKind());
    }

    @Test
    public void testFullHouse() {
        PokerHand hand = HandBuilder.createHand("♥10 ♠7 ♦10 ♦7 ♣10"); // Full house (2 * 7 + 3 * 10)

        assertTrue(hand.isFullHouse(), hand + " has two sevens and three tens");
        assertTrue(hand.isPair(), hand + " has a pair of sevens");
        assertTrue(hand.isThreeOfAKind(), hand + " has three tens");

        assertFalse(hand.isTwoPairs());
        assertFalse(hand.isFourOfAKind());
    }
}
