//Isaac Bandstra

package schoolJavaProjects;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        String choice = "y";
        String input = "";
        boolean outOFBounds = true;
        Scanner sc = new Scanner(System.in);

        int userGuess = 0;
        
        while(choice.equalsIgnoreCase("y")) {
            //generate random number
            Random rand = new Random();
            int randomNum = rand.nextInt(100) + 1;

            do{
            //get number guess from user, store in userGuess
            System.out.print("Guess a number between 1 and 100:  ");
            input = sc.nextLine();
            userGuess = Integer.parseInt(input);

            if (userGuess < 0 || userGuess > 100){
                outOFBounds = true;
            } else{outOFBounds = false;}

            } while (outOFBounds);

            int numGuesses = 0;


            while(userGuess != randomNum) {
                numGuesses++;
                //check if userGuess is 10 more or less than the random number
                if ((userGuess - randomNum) > 10){
                    System.out.print("Way too high!");
                } else if((randomNum - userGuess) > 10) {
                    System.out.print("Way too low!");
                } else if(userGuess < randomNum) {
                    System.out.print("Close, but too low.");
                } else if (userGuess > randomNum) {
                    System.out.print("Close, but too high.");
                }
                System.out.print(" Try again: ");
                input = sc.nextLine();
                userGuess = Integer.parseInt(input);
            }

            System.out.print("Right on! ");

            if (numGuesses <= 3) {
                System.out.print(" Great work!");
            } else if (numGuesses>3 && numGuesses<7) {
                System.out.print("Not too bad!");
            } else if (numGuesses > 7) {
                System.out.print("What took you so long?");
            }

            System.out.print(" Continue playing? (y/n): ");
            choice = sc.nextLine();
            System.out.println();

        } //end of equalsIgnoreCase while loop
        sc.close();
    } //end of main
} //end of class