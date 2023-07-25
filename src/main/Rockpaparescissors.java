package main;

import java.util.Random;
import java.util.Scanner;

public class Rockpaparescissors {


    public static void main(String[] args) {
        String ans = "";
        String userInput;
        int balance = 100;
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Random random = new Random();
        while (true) {

            int bet = 0;

            if (bet == 0) {
                System.out.println("Your balance:" + balance + "$");
                System.out.println("How much will you bet?");
            }

            bet = scan.nextInt();


            if (bet > balance) {
                System.out.println("Bet exceeds balance");
                break;
            }

            System.out.println("Place your bet: Rock, Paper, or Scissors?");
            userInput = scan2.nextLine();

//
//       double rand = Math.random()*10/4;
//       int rand2=(int)rand;
            int rand2 = random.nextInt(3);

            //   System.out.println(rand2);


            switch (rand2) {
                default -> System.out.println("error");
                case 0 -> ans = "Rock";
                case 1 -> ans = "Paper";
                case 2 -> ans = "Scissors";
            }
            System.out.println("Computer chose: " + ans);

            if (userInput.equalsIgnoreCase("Rock")) {
                switch (ans) {
                    case "Rock" -> System.out.println("Tie");
                    case "Paper" -> {
                        System.out.println("You lose");
                        balance = balance - bet;
                    }
                    case "Scissors" -> {
                        System.out.println("You win");
                        balance = balance + bet;
                    }
                }
            } else if (userInput.equalsIgnoreCase("Paper")) {
                switch (ans) {
                    case "Rock" -> {
                        System.out.println("You win");
                        balance = balance + bet;
                    }
                    case "Paper" -> System.out.println("Tie");
                    case "Scissors" -> {
                        System.out.println("You lose");
                        balance = balance - bet;
                    }
                }
            } else if (userInput.equalsIgnoreCase("Scissors")) {
                switch (ans) {
                    case "Rock" -> {
                        System.out.println("You win");
                        balance = balance + bet;
                    }
                    case "Paper" -> {
                        System.out.println("You lose");
                        balance = balance - bet;
                    }
                    case "Scissors" -> System.out.println("Tie");
                }
            } else {
                System.out.println("Not a valid bet");
            }
//test


            if (balance <= 0) {
                System.out.println("You're bankrupt !!!");
                break;
            }

        }

    }

}
