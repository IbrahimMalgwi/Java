package dietel.Chapter6;

import java.security.SecureRandom;

class DeckOfCards {
    private Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARD = 52;
    private static final SecureRandom randomNumbera = new SecureRandom();

    public DeckOfCards() {
        String [] face = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String [] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        deck = new Card[NUMBER_OF_CARD];
        currentCard = 0;

        for (int count = 0; count < deck.length; count++)
            deck[count] = new Card(face[count % 13], suits[count % 13]);
    }
    public void shuffle (){
        currentCard = 0;

        for (int first = 0; first < deck.length; first++){
            int second = randomNumbera.nextInt(NUMBER_OF_CARD);

            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }
    public Card dealCard() {
        if (currentCard < deck.length)
            return deck[currentCard++];
        else
            return null;
    }

}