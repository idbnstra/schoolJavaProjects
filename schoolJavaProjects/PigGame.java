package schoolJavaProjects;

import java.util.Random;
import java.util.Scanner;

//Isaac Bandstra

public class PigGame {

    private static int winningScore = 100;
    private static int humanScore = 0;
    private static int computerScore = 0;
    private static Random random = new Random();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to the Game of Pig.");
        System.out.println("The first player to reach " + winningScore + " points wins!");

        while (true) {
            System.out.println();
            System.out.println("Your turn! Your current score is " + humanScore);
            int turnScore = takeTurn(humanScore, "human");

            if (humanScore >= winningScore) {
                System.out.println("Congratulations, you won!");
                break;
            }

            humanScore += turnScore;

            System.out.println("Your total score is now " + humanScore);

            System.out.println();
            System.out.println("Computer's turn! Its current score is " + computerScore);
            turnScore = takeTurn(computerScore, "computer");

            if (computerScore >= winningScore) {
                System.out.println("The computer wins with a score of " + computerScore);
                break;
            }

            computerScore += turnScore;

            System.out.println("Computer's total score is now " + computerScore);
        }
    }

    private static int takeTurn(int currentScore, String player) {
        int turnScore = 0;

        while (true) {
            int roll = rollDie();
            System.out.println(player + " rolled a " + roll);

            if (roll == 1) {
                System.out.println(player + " lost all its points this turn");
                turnScore = 0;
                break;
            } else {
                turnScore += roll;

                if (currentScore + turnScore >= winningScore) {
                    System.out.println(player + " wins with a score of " + (currentScore + turnScore));
                    break;
                }

                if (player.equals("human")) {
                    System.out.print("Do you want to roll again (r) or hold (h)? ");
                    String input = sc.nextLine().trim().toLowerCase();

                    while (!input.equals("r") && !input.equals("h")) {
                        System.out.println("Invalid input. Please enter r or h.");
                        System.out.print("Do you want to roll again (r) or hold (h)? ");
                        input = sc.nextLine().trim().toLowerCase();
                    }

                    if (input.equals("h")) {
                        break;
                    }
                } else {
                    if (turnScore >= 20) {
                        break;
                    }
                }
            }
        }

        System.out.println(player + " scored " + turnScore + " points this turn.");
        return turnScore;
    }

    private static int rollDie() {
        return random.nextInt(6) + 1;
    }
}
