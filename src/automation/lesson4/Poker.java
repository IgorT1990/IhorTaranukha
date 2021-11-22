package automation.lesson4;

import java.util.Arrays;

public class Poker {
    public static void main(String[] args) {
        int noOfPlayers = 4;
        int noOfCards = 52;
        CardValues cardValues = new CardValues();
        cardValues.cards();
// I can't understand what I should to do further
        int count = 0;
        for (int round = 1; round < 6; round++) {
            System.out.printf("%d round %n", round);
            for (int player = 1; player <= noOfPlayers; player++) {
                System.out.printf("%n Player %d gets %n", player);
            }
            System.out.println("+++++++++++++++++++++++++");
        }
    }
}





