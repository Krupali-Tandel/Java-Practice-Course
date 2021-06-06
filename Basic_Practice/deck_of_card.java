/*
QUESTION :: Make a deck of cards then shuffle them all and show the first 4 cars form the deck.
PRACTICE :: Random , Array , loop
 */
package basic_package;

public class deck_of_card {

    public static void main(String[] args) {

        int deck[] = new int[52];
        String suit[] = {"Spade", "Heart", "Diamond", "Club"};
        String rank[] = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (int i = 0; i < deck.length; i++) // initializing the cards
            deck[i] = i; // 1 to 52

        for (int i = 0; i < deck.length; i++) { // loop for shuffling the cards
            int j = (int) (Math.random() * deck.length); // generating the random index
            //shuffle the card
            int temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }

        // show the first 4 cards
        for (int i = 0; i < 4; i++) {
            String suits = suit[deck[i] / 13]; // 0 , 1 , 2, 3
            String ranks = rank[deck[i] % 13]; // 0 to 12
            System.out.println("Card number " + deck[i] + " :: " + ranks + " of " + suits);
        }
    }
}
