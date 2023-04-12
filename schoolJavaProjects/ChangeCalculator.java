//Isaac Bandstra

package schoolJavaProjects;

import java.util.Scanner;

public class ChangeCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to ChangeCalculator");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        String choice = "y";

        
        while(choice.equalsIgnoreCase("y")) {

            //get number of cents from user input
            System.out.print("Enter number of cents (0-99):  ");
            String input = sc.nextLine();
            double cents = Double.parseDouble(input);

            int quarters = 0;
            int dimes = 0;
            int nickels = 0;
            int pennies = 0;

            //calculate amount of each coin
            while (cents > 0) {

            if (cents >= 25) {
                quarters += (cents/25);
                cents = cents%25;
            } else if (cents >= 10) {
                dimes += (cents/10);
                cents = cents%10;
            } else if (cents >= 5) {
                nickels += (cents/5);
                cents = cents%5;
            } else if (cents <= 4) {
                pennies += cents;
                cents = 0;
            }

            } //end of coin calculation

            //display coins
            String message = "Quarters: " + quarters + "\n" 
                           + "Dimes:    " + dimes + "\n" 
                           + "Nickels:  " + nickels + "\n" 
                           + "Pennies:  " + pennies + "\n";
            System.out.println(message);
            
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        } //end while
    }//end main
}//end class
