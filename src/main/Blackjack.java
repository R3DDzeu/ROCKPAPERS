package main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Blackjack {
    static String pBet;
    static int balance = 100;
    static int pHand = 0;
    static int dHand = 0;
    static int bet = 0;

    //1. Method that checks if the player or the dealer has a blackjack.

    static boolean checkBlackjack(int hand) {
        return hand == 11;
    }

    //2. Method that deals a random card


    // !!!!!!!!!!!!!!!!!! FIX THIS !!!!!!!!!!!!!!!!!!


    static int dealCard() {
        int card = 0;
        Random random = new Random();
        Random random2 = new Random();

        int deck = random2.nextInt(4);
        System.out.println("Draws ");
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
//test

                Deck.ofSpades = Deck.removeCard(Deck.ofSpades, pos);
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


                Deck.ofHearts = Deck.removeCard(Deck.ofHearts, pos);
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


                Deck.ofClubs = Deck.removeCard(Deck.ofClubs, pos);
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


                Deck.ofDiamonds = Deck.removeCard(Deck.ofDiamonds, pos);
            }


        }


        // System.out.println("card= "+ card);


        return card;


    }  //seems to be working?

    //3. Method for insurance
    static boolean insurance(boolean ins) {

        if (dHand == 1) {
            System.out.println("Insurance?    yes/no");
            Scanner insuranceScan = new Scanner(System.in);
            String insurance = insuranceScan.nextLine();
            if (insurance.equalsIgnoreCase("yes")) {
                balance = balance - bet / 2;
                ins = true;
            }
        } else {
            ins = false;
        }
        return ins;
    }


    //4. Method which asks the player if he wants to hit or stand.
    static void playerBet() {

        System.out.println("Hit or Stand?");
        Scanner pBetScan = new Scanner(System.in);
        pBet = pBetScan.nextLine();


        if (pBet.equalsIgnoreCase("Hit")) {
            int card = dealCard();
            pHand = pHand + card;
            System.out.println("You drew a : " + card);
            System.out.println("Your hand : " + pHand);

        } else if (pBet.equalsIgnoreCase("Stand")) {
            System.out.println("Your hand : " + pHand);
        } else {
            System.out.println("Not a valid option, game will close.");
        }

    }


    // add condition if phand = dhand in Main code


    //5. Method which verifies win conditions
//    static boolean isWin(boolean win){
//        if (pHand>21) {win = false;}
//        else if (pHand<21 && dHand>pHand) {win = false;}
//        else if (pHand<21 && pHand>dHand ) {win=true;}
//        else if (pHand==21) {win=true;}
//
//        return win;
//    }

    //6. Method which modifies balance based on win/lose

//    static void updateBalance() {
//        int b;
//        if (isWin(true)){
//            b =bet;
//        } else {
//            b =-bet;}
//
//        balance = balance + b;
//    }

    public static void main(String[] args) {
        while (balance > 0) {
            Scanner betScan = new Scanner(System.in);
            System.out.println("Place your bet !!!\n BET = ");
            bet = betScan.nextInt();
            if (bet > balance) {
                System.out.println("Can't afford bet");
                break;
            }

            Deck.fillDeck(Deck.ofSpades);
            Deck.fillDeck(Deck.ofDiamonds);
            Deck.fillDeck(Deck.ofHearts);
            Deck.fillDeck(Deck.ofClubs);

//
//        System.out.println("Deck of Spades = " + Arrays.toString(Deck.ofSpades));
//        System.out.println("Deck of Diamonds = " + Arrays.toString(Deck.ofDiamonds));
//        System.out.println("Deck of Clubs = " + Arrays.toString(Deck.ofClubs));
//        System.out.println("Deck of Hearts = " + Arrays.toString(Deck.ofHearts));
//
//        int hand = dealCard();
//
//        System.out.println("Deck of Spades = " + Arrays.toString(Deck.ofSpades));
//        System.out.println("Deck of Diamonds = " + Arrays.toString(Deck.ofDiamonds));
//        System.out.println("Deck of Clubs = " + Arrays.toString(Deck.ofClubs));
//        System.out.println("Deck of Hearts = " + Arrays.toString(Deck.ofHearts));
            System.out.println("Your hand is :\n");
            pHand = dealCard() + dealCard();
            System.out.println("\nYou have a " + pHand + "\n\n");

            System.out.println("Dealer has : ");
            dHand = dealCard();
            System.out.println("\n\n");
            boolean win = false;
            while (true) {

                playerBet();

                if (pHand > 21) {
                    System.out.println("Bust !!!");
                    win = false;
                    break;

                    //add balanceupdate
                } else if (pHand == 21) {
                    System.out.println("Blackjack !!!");
                    win = true;
                    break;

                }
                if (/* playerbet.pbet=stand then break */ pBet.equalsIgnoreCase("Stand")) {
                    break;
                }
            }

//        while(dHand<17){
//            dHand = dHand + dealCard();
//            if(dHand>21) {
//                System.out.println("Dealer bust!"); break;
//            }
//        }
//         if (pHand<21 && pHand<dHand && dHand<21) {
//             System.out.println(" You lose !");
//             balance = balance - bet;
//             System.out.println("New Balance : " + balance );
//         } else if (pHand<21 && pHand>dHand && dHand<21) {
//             System.out.println(" You win !");
//             balance = balance + bet;
//             System.out.println("New Balance: " + balance);
//         } else if (pHand<21 && dHand==pHand && dHand<21) {
//             System.out.println("tie");
//         } else if (dHand>21){
//             balance = balance + bet;
//         }
            if (pHand != 21 && pHand < 21) {
                while (dHand < 17) {
                    dHand = dHand + dealCard();
                    System.out.println("Dealer has : " + dHand);
                }
            }


            if (pHand < 21 && pHand < dHand && dHand < 21) {
                win = false;
            } else if (pHand < 21 && pHand > dHand && dHand < 21) {
                win = true;
            }
            if (dHand > 21) {
                System.out.println("Dealer bust !!!");
                win = true;
            }

            if (win) {
                System.out.println("You win !!!");
                balance = balance + bet;
                System.out.println("New balance : " + balance);
            } else {
                System.out.println("You lose !!!");
                balance = balance - bet;
                System.out.println("New balance : " + balance);
            }

            if (balance <= 0) {
                System.out.println("You're bankrupt !!!");
            }
        }


        // in dealCard() method fix if statements by replacing pos for Deck.""[pos]


    }

}
