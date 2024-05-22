package Chapter7;//package Chapter7;
//
//import java.security.SecureRandom;
//
//public class CardShuffling {
//    private static Card[] deck;
//    private static int currentCard;
//    private static final int NUMBER_OF_CARDS = 52;
//    private static final SecureRandom randomNumbers = new SecureRandom();
//
//    // Constructor fills deck of Cards
//    public CardShuffling() {
//        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight",
//                "Nine", "Ten", "Jack", "Queen", "King"};
//        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
//        deck = new Card[NUMBER_OF_CARDS];
//        currentCard = 0;
//
//        // populate deck with Card objects
//        for (int count = 1; count < deck.length; count++) {
//            deck[count] = new Card(faces[count % 13], suits[count / 13]);
//
//        }
//    }
//
//    // shuffle deck of Cards with one-pass algorithm
//    public void shuffle() {
//        currentCard = 0;
//
//        // for each Card, pick another random Card (0-51) and swap them
//        for (int first = 0; first < deck.length; first++) {
//            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
//
//            // swap current Card with randomly selected Card
//            Card temp = deck[first];
//            deck[first] = deck[second];
//            deck[second] = temp;
//        }
//    }
//
//    public static Card dealCard() {
//        if (currentCard < deck.length) {
//            return deck[currentCard++];
//        } else
//            return null;
//    }
//
//    public boolean aPair(Card[] array) {
//        String temp = " ", temp2 = " ";
//        int count = 0;
//
//        for (int first = 0; first < array.length; first++) {
//
//            temp = array[first].getFace();
//
//            for (int rest = 0; rest < array.length; rest++) {
//
//                temp2 = array[rest].getFace();
//                if (rest == first) {
//                    continue;
//                }
//                if (temp == temp2) {
//                    count++;
//
//                }
//            }
//        }
//        if(count == 2) {
//            return true;
//        }else{
//                return false;
//        }
//    }
//    public boolean twoPair(Card[] array) {
//        String temp, temp2;
//        int count = 0;
//        for (int first = 0; first < array.length; first++) {
//
//            temp = array[first].getFace();
//
//            for (int rest = 0; rest < array.length; rest++) {
//
//                temp2 = array[rest].getFace();
//
//                if (rest == first) {
//                    continue;
//
//                    if (temp == temp2) {
//                        count++;
//                    }
//                }
//            }
//        }
//        if(count == 4) {
//            return true;
//        }else {
//            return false;
//        }
//    }
//    public boolean hasThreeKind(Card[] array) {
//        String temp, temp2, temp3;
//
//        for (int first = 0; first < array.length; first++) {
//
//            temp = array[first].getFace();
//
//            for (int next = 0; next < array.length; next++) {
//
//                temp2 = array[next].getFace();
//
//                for (int last = 0; last < array.length; last++) {
//
//                    temp3 = array[last].getFace();
//
//                    if (first == next || first == last || next == last) {
//                        continue;
//
//                        if (temp == temp2 && temp == temp3) {
//                            return true;
//                        }
//                    }
//                }
//            }
//        }
//        return false;
//    }
//}