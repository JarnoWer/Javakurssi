package poker; // remove this line when submitting to Viope

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * A poker hand consists of a set of five unique cards. Each hand may have a
 * specific value specified in the game's rules.
 */
public class PokerHand {

    // The cards that belong to this hand
    private List<Card> cards = new ArrayList<>();
    private TreeSet<Integer> sameSet = new TreeSet<Integer>();
    /**
     * The ... syntax is called varargs and it provides an easy way to implement a
     * method or constructor that accepts any number of arguments of the same type.
     * Inside the constructor the arguments are accessible through an array by the
     * name "cards".
     */
    public PokerHand(Card... cards) {
        for (Card c : cards) {
            this.cards.add(c);
        }
    }

    /**
     * Any five cards of the same suit?
     */
    public boolean isFlush() {
        Set<Suit> vari = new TreeSet<Suit>();
        for (Card c : cards) {
        	vari.add(c.getSuit());
        }
        return(vari.size() == 1);
    }
    /**
     * Two cards of the same rank?
     */
    public boolean isPair() {
    	
        return (rankSet().size() ==4);
    }

    /**
     * Three cards of the same rank?
     * @return 
     */

	public boolean isThreeOfAKind() {
		return this.sameSet.size() == 1;
	}

    /**
     * Two different pairs?
     */
    public boolean isTwoPairs() {
        // TODO: complete this method
    	return this.sameSet.size() ==2 && rankSet().size() == 3;
    }

    /**
     * Four cards of the same rank?
     */
    public boolean isFourOfAKind() {
        
    	return rankSet().size() ==2 && sameSet.size() == 1;
    }

    /**
     * Three of a kind with a pair?
     */
    public boolean isFullHouse() {
        // TODO: complete this method. Hint: could you call the pair and three-of-a-kind
        // methods here?
    	return rankSet().size() ==2 && sameSet.size() == 2;
    }

    /**
     * Five cards in a sequence? Note that an ace can be either 1 or 14!
     * @param c 
     */
   
    
    public TreeSet<Integer> rankSet() {
        TreeSet<Integer> rankSet = new TreeSet<Integer>();
        for (Card c : cards) {
        	int org = rankSet.size();
        	rankSet.add(c.getRank());
        	if (org == rankSet.size()) {
            	this.sameSet.add(c.getRank());
            }
        } 
        return rankSet;
    }
    
    public boolean isStraight() {
    	
        if 	(rankSet().size() < 5) {
        	return false;
        }
        if ((rankSet().containsAll(Arrays.asList(1,10,11,12,13)) || rankSet().last() - rankSet().first() == 4 )){
        	return true;
        }
        return false;
    }

    /**
     * Similar to a straight, but all cards in the same suit.
     */
    public boolean isStraightFlush() {
        
        return (isFlush() && isStraight());
    }

    /**
     * A, K, Q, J, 10, all the same suit.
     */
    public boolean isRoyalFlush() {
       return (rankSet().containsAll(Arrays.asList(1,10,11,12,13)) && isFlush()); 
    }

    /**
     * Returns a String representation of the cards, such as "♠12 ♠10 ♠11 ♠1 ♠13"
     */
    @Override
    public String toString() {
        // The stream, map and collect methods belong to the Java Streams API which
        // is not covered on this course. For more information, search Google for "java
        // streams api"
        List<String> cardStrings = this.cards.stream().map(Card::toString).collect(Collectors.toList());
        return String.join(" ", cardStrings);
    }
}
