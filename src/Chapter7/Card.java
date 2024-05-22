package Chapter7;

public class Card {
    private final String face;
    private final String suit;

    // initializing constructor
    public Card (String cardFace, String cardSuit)

    {
        this.face = cardFace;
        this.suit = cardSuit;
    }

        // returning representation of Cards
        public String toString(){
            return face + "of" + suit;
        }
    }
