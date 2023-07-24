package main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Deck {

    //adauga arrays fill in main sau cv
    static int[] ofSpades = new int[13];
    static int[] ofHearts = new int[13];
    static int[] ofDiamonds = new int[13];
    static int[] ofClubs = new int[13];
    static int balance = 100;
    boolean win;

    public static int[] removeCard(int[] arr, int index) {
        return IntStream.range(0, arr.length)
                .filter(i -> i != index)
                .map(i -> arr[i])
                .toArray();
    }

    public static void fillDeck(int[] array) {

        int number = 1;
        for (int i = 0; i < array.length; i++) {


            array[i] = number;
            number++;
        }

    }
//    public static int takeACard() {
//        System.out.println(Arrays.toString(ofClubs));
//        int card = 0;
//        Random random = new Random();
//        Random random2 = new Random();
//
//        int deck = random2.nextInt(4);
//
//        switch (deck) {
//            case 0 -> {
//                int pos = random.nextInt(ofSpades.length);
//                if (pos <= 10 && pos != 0) {
//                    card = ofSpades[pos];
//                    System.out.println(card + " of Spades");
//                } else if (pos == 0) {
//                    card = ofSpades[pos];
//                    System.out.println("Ace of Spades");
//                } else {
//                    card = 10;
//                    switch (pos) {
//                        case 10 -> System.out.println("J of Spades");
//                        case 11 -> System.out.println("Q of Spades");
//                        case 12 -> System.out.println("K of Spades");
//                    }
//                }
//
//
//                removeCard(ofSpades, pos);
//            }
//            case 1 -> {
//                int pos = random.nextInt(ofHearts.length);
//                if (pos <= 9 && pos != 0) {
//                    card = ofHearts[pos];
//                    System.out.println(card + " of Hearts");
//                } else if (pos == 0) {
//                    card = ofHearts[pos];
//                    System.out.println("Ace of Hearts");
//                } else {
//                    card = 10;
//                    switch (pos) {
//                        case 10 -> System.out.println("J of Hearts");
//                        case 11 -> System.out.println("Q of Hearts");
//                        case 12 -> System.out.println("K of Hearts");
//                    }
//                }
//
//
//                removeCard(ofHearts, pos);
//            }
//            case 2 -> {
//                int pos = random.nextInt(ofClubs.length);
//                if (pos <= 9 && pos != 0) {
//                    card = ofClubs[pos];
//                    System.out.println(card + " of Clubs");
//                } else if (pos == 0) {
//                    card = ofSpades[pos];
//                    System.out.println("Ace of Clubs");
//                } else {
//                    card = 10;
//                    switch (pos) {
//                        case 10 -> System.out.println("J of Clubs");
//                        case 11 -> System.out.println("Q of Clubs");
//                        case 12 -> System.out.println("K of Clubs");
//                    }
//                }
//
//
//                removeCard(ofClubs, pos);
//            }
//            case 3 -> {
//                int pos = random.nextInt(ofDiamonds.length);
//                if (pos <= 9 && pos != 0) {
//                    card = ofDiamonds[pos];
//                    System.out.println(card + " of Diamonds");
//                } else if (pos == 0) {
//                    card = ofDiamonds[pos];
//                    System.out.println("Ace of Diamonds");
//                } else {
//                    card = 10;
//                    switch (pos) {
//                        case 10 -> System.out.println("J of Diamonds");
//                        case 11 -> System.out.println("Q of Diamonds");
//                        case 12 -> System.out.println("K of Diamonds");
//                    }
//                }
//
//
//                removeCard(ofClubs, pos);
//            }
//
//
//        }
//
//
//        // System.out.println("card= "+ card);
//
//
//        return card;
//
//    }

    /*  static void imparteCarti() {
        int pariu = 0;
        String hit = "";
        int dHand = takeACard();
        int pHand = takeACard() + takeACard();

        System.out.println("phand =" + pHand);
        System.out.println("dhand =" + dHand);

        System.out.println("Balance " + balance + "$");
        System.out.println("Place your bet: ");
        Scanner scanner2 = new Scanner(System.in);
        pariu = scanner2.nextInt();
        if (pHand == 11) {
            System.out.println("Blackjack!");
            balance = balance + pariu;
        } else if (pHand != 11) {
            while (true) {

                System.out.println("Hit or stand?");
                Scanner scanner = new Scanner(System.in);
                hit = scanner.nextLine();
                if (hit.equalsIgnoreCase("hit")) {
                    pHand = pHand + takeACard();
                    System.out.println("phand =" + pHand);
                    System.out.println("dhand =" + dHand);

                    if (pHand == 11) {
                        System.out.println("Blackjack!");
                        balance = balance + pariu;
                    } else if (pHand > 21) {
                        System.out.println(pHand);
                        System.out.println("Bust!!!");
                        balance = balance - pariu;

                        break;
                    }


                } else {
                    break;
                }
            }

        }

        if (pHand < 21) {
            System.out.println("Your hand : " + pHand);
            dHand = dHand + takeACard();
            while (dHand < 17) {
                dHand = dHand + takeACard();
                System.out.println("dHand =" + dHand);
            }

            if (dHand >= 17 || dHand <= 21) {
                if (dHand > pHand) {
                    System.out.println("You lose!");
                    balance = balance - pariu;
                } else if (dHand == pHand) {
                    System.out.println("Tie");

                } else {
                    System.out.println("You win!");
                    balance = balance + pariu;
                }
            }

        } else if (dHand > 21) {
            System.out.println("Dealer bust! You win ! ");
            balance = balance + pariu;
        }


    } */

    public static void main(String[] args) {
        fillDeck(ofClubs);
        fillDeck(ofSpades);
        fillDeck(ofDiamonds);
        fillDeck(ofHearts);
      //  imparteCarti();
    }
}
