package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import poker.PokerHand;
import poker.HandBuilder;

class HandBuilderTest {

    @Test
    public void handBuilderTakesAStringAndReturnsHandWithTheSameCards() {
        PokerHand hand = HandBuilder.createHand("♥1 ♦1 ♠4 ♣6 ♣8");

        assertEquals("♥1 ♦1 ♠4 ♣6 ♣8", hand.toString());
    }
}
