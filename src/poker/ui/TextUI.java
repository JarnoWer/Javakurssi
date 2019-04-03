package poker.ui;

import java.util.Scanner;

import poker.HandBuilder;
import poker.PokerHand;

public class TextUI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which cards do you have? (example: ♥10 ♠1 ♦10 ♦7 ♠10)");
        String input = scanner.nextLine();

        System.out.println(); // Empty line

        PokerHand hand = HandBuilder.createHand(input);

        try {
            String value = resolveHandValue(hand);
            if (value == null) {
                System.out.println("That hand has no value :(");
            } else {
                System.out.println("You have " + value + "!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    private static String resolveHandValue(PokerHand hand) {
        if (hand.isRoyalFlush()) {
            return "a royal flush";
        } else if (hand.isStraightFlush()) {
            return "a straight flush";
        } else if (hand.isStraight()) {
            return "a straight";
        } else if (hand.isFourOfAKind()) {
            return "four-of-a-kind";
        } else if (hand.isFullHouse()) {
            return "a full house";
        } else if (hand.isFlush()) {
            return "a flush";
        } else if (hand.isThreeOfAKind()) {
            return "three-of-a-kind";
        } else if (hand.isTwoPairs()) {
            return "two pairs";
        } else if (hand.isPair()) {
            return "a pair";
        } else {
            // None of the above
            return null;
        }
    }
}
