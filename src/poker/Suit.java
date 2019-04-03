package poker;

/**
 * "An enum type is a special data type that enables for a variable to be a set
 * of predefined constants. The variable must be equal to one of the values that
 * have been predefined for it. Common examples include compass directions
 * (values of NORTH, SOUTH, EAST, and WEST) and the days of the week."
 * 
 * -https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
 */
public enum Suit {

    // These objects can be used by accessing them through Suit.HEARTS,
    // Suit.SPADES...
    HEARTS("♥"), DIAMONDS("♦"), CLUBS("♣"), SPADES("♠");

    // Each Suit has a String symbol, either "♥", "♦", "♣" or "♠"
    private final String symbol;

    /**
     * The suit enum values are generated automatically, so you will never create
     * them by ´new Suit(...)´ yourself.
     */
    private Suit(String symbol) {
        this.symbol = symbol;
    }

    /**
     * @return a single-character String: "♥", "♦", "♣" or "♠"
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Takes a String symbol "♥", "♦", "♣" or "♠" and returns the corresponding Suit
     * object.
     * 
     * @param symbol "♥", "♦", "♣" or "♠"
     * @return a Suit object: HEARTS, DIAMONDS, CLUBS or SPADES
     */
    public static Suit findBySymbol(String symbol) {
        for (Suit s : Suit.values()) {
            if (s.getSymbol().equals(symbol)) {
                return s;
            }
        }

        // No matching suit found, so the given symbol was illegal
        throw new IllegalArgumentException("Symbol '" + symbol + "' does not match any card suit.");
    }
}