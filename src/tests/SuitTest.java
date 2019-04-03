package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import poker.Suit;

class SuitTest {

    @Test
    public void suitCanBeFoundBySymbol() {
        Suit found = Suit.findBySymbol("♦");
        assertEquals(Suit.DIAMONDS, found);
    }

    @Test
    public void findBySymbolThrowsExceptionForIllegalSymbols() {
        /*
         * Advanced example: JUnit can be used to verify that a specific block of code
         * throws a given exception
         */
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Suit.findBySymbol("€");
        });
    }
}
