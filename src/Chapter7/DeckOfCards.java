package Chapter7;
import java.security.SecureRandom;
public class DeckOfCards {
    private Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    private static final  SecureRandom randomNumbers = new SecureRandom();

    // Constructor fills deck of Cards
    public DeckOfCards() {
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;

        // populate deck with Card objects
        for (int count = 1; count < deck.length; count++) {
            deck[count] = new Card(faces[count % 13], suits[count / 13]);

        }
    }

        // shuffle deck of Cards with one-pass algorithm
        public void shuffle(){
            currentCard = 0;

            // for each Card, pick another random Card (0-51) and swap them
            for (int first = 0; first < deck.length; first++){
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            // swap current Card with randomly selected Card
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
            }
        }
        public Card dealCard(){
            if (currentCard < deck.length) {
                return deck[currentCard++];
            }
             else
                    return null;
                }
            }



