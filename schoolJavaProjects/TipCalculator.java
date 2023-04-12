//Isaac Bandstra

package schoolJavaProjects;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to TipCalculator");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        String choice = "y";

        while(choice.equalsIgnoreCase("y")) {
            //prompt user for cost of meal
            System.out.print("Enter cost of meal:  ");
            String input = sc.nextLine();
            double mealCost = Double.parseDouble(input);

            //prompt for tipping choice
            System.out.print("Enter tip percentage (15, 20, or 25)(no percent sign):  ");
            input = sc.nextLine();
            double tipChoice = Double.parseDouble(input);

            //calculate tip percentage based on tip choice
            double tipPercent = tipChoice * (.01);

            //cost of meal * tip percentage = tip in dollars
            double tipCost = mealCost * tipPercent;

            //tip + meal = total cost
            double totalCost = tipCost + mealCost;

            //format cost

            String message = "Tip percent: " + tipChoice + "%\n" 
                           + "Tip amount:  $" + tipCost + "\n";
            System.out.println(message);
           
            System.out.printf("the total cost of your meal is $%.2f%n", totalCost);
            //prompt to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();            
        }

    }
}
