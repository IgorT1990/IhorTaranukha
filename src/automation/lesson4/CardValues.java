package automation.lesson4;
import java.util.Arrays;

public class CardValues extends CardSuits {

    @Override
    public void cards() {
        int noOfCards = 52;
        String[] values = {"Hearts", "Clubs", "Diamonds", "Spades"};
        String[] suites = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[noOfCards];

        int count = 0;
        for (String suite : suites) {
            for (String value : values) {
                deck[count++] = value + "Of" + suite;
            }

        }

        System.out.println(Arrays.toString(deck));
    }

}