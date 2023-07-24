package main;

import java.util.Arrays;
import java.util.Random;

public class Blackjack {


    //1. Method that checks if the player or the dealer has a blackjack.

    static boolean checkBlackjack(int hand){
        if (hand==11){
            return true;
        } else {return false;}
    }

    //2. Method that deals a random card

    static int dealCard(){
        int card = 0;
        Random random = new Random();
        Random random2 = new Random();

        int deck = random2.nextInt(4);

        switch (deck) {
            case 0 -> {
                int pos = random.nextInt(Deck.ofSpades.length);
                if (pos <= 10 && pos != 0) {
                    card = Deck.ofSpades[pos];
                    System.out.println(card + " of Spades");
                } else if (pos == 0) {
                    card = Deck.ofSpades[pos];
                    System.out.println("Ace of Spades");
                } else {
                    card = 10;
                    switch (pos) {
                        case 10 -> System.out.println("J of Spades");
                        case 11 -> System.out.println("Q of Spades");
                        case 12 -> System.out.println("K of Spades");
                    }
                }


               Deck.ofSpades= Deck.removeCard(Deck.ofSpades, pos);
            }
            case 1 -> {
                int pos = random.nextInt(Deck.ofHearts.length);
                if (pos <= 9 && pos != 0) {
                    card = Deck.ofHearts[pos];
                    System.out.println(card + " of Hearts");
                } else if (pos == 0) {
                    card = Deck.ofHearts[pos];
                    System.out.println("Ace of Hearts");
                } else {
                    card = 10;
                    switch (pos) {
                        case 10 -> System.out.println("J of Hearts");
                        case 11 -> System.out.println("Q of Hearts");
                        case 12 -> System.out.println("K of Hearts");
                    }
                }


                Deck.ofHearts =Deck.removeCard(Deck.ofHearts, pos);
            }
            case 2 -> {
                int pos = random.nextInt(Deck.ofClubs.length);
                if (pos <= 9 && pos != 0) {
                    card = Deck.ofClubs[pos];
                    System.out.println(card + " of Clubs");
                } else if (pos == 0) {
                    card = Deck.ofClubs[pos];
                    System.out.println("Ace of Clubs");
                } else {
                    card = 10;
                    switch (pos) {
                        case 10 -> System.out.println("J of Clubs");
                        case 11 -> System.out.println("Q of Clubs");
                        case 12 -> System.out.println("K of Clubs");
                    }
                }


               Deck.ofClubs= Deck.removeCard(Deck.ofClubs, pos);
            }
            case 3 -> {
                int pos = random.nextInt(Deck.ofDiamonds.length);
                if (pos <= 9 && pos != 0) {
                    card = Deck.ofDiamonds[pos];
                    System.out.println(card + " of Diamonds");
                } else if (pos == 0) {
                    card = Deck.ofDiamonds[pos];
                    System.out.println("Ace of Diamonds");
                } else {
                    card = 10;
                    switch (pos) {
                        case 10 -> System.out.println("J of Diamonds");
                        case 11 -> System.out.println("Q of Diamonds");
                        case 12 -> System.out.println("K of Diamonds");
                    }
                }


               Deck.ofDiamonds= Deck.removeCard(Deck.ofDiamonds, pos);
            }


        }


        // System.out.println("card= "+ card);


        return card;


    }  //seems to be working?



    public static void main(String[] args) {
        Deck.fillDeck(Deck.ofSpades);
        Deck.fillDeck(Deck.ofDiamonds);
        Deck.fillDeck(Deck.ofHearts);
        Deck.fillDeck(Deck.ofClubs);

        System.out.println("Deck of Spades = " + Arrays.toString(Deck.ofSpades));
        System.out.println("Deck of Diamonds = " + Arrays.toString(Deck.ofDiamonds));
        System.out.println("Deck of Clubs = " + Arrays.toString(Deck.ofClubs));
        System.out.println("Deck of Hearts = " + Arrays.toString(Deck.ofHearts));

        int hand = dealCard();

        System.out.println("Deck of Spades = " + Arrays.toString(Deck.ofSpades));
        System.out.println("Deck of Diamonds = " + Arrays.toString(Deck.ofDiamonds));
        System.out.println("Deck of Clubs = " + Arrays.toString(Deck.ofClubs));
        System.out.println("Deck of Hearts = " + Arrays.toString(Deck.ofHearts));



    }

}
