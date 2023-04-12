package schoolJavaProjects;

import java.util.InputMismatchException;
import java.util.Scanner;

// Isaac Bandstra

public class AverageNumbers {
    public static void main(String[] args) {
        //variables
        int numValues = 0;
        double avgValue = 0.0;
        int totalSum = 0;
        int value;
        int count = 0;
        boolean error = true;

        //objects
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of numbers you want an average of: ");

        do {
            try {
            numValues = Integer.parseInt(input.nextLine());
            error = false;
            } catch (java.util.InputMismatchException e) {
            System.out.println("please enter only integers");
            error = true;
            } catch (IllegalArgumentException ex) {
            System.out.println("Must enter a positive number");
            error = true;
            }
        } while (error);

        for (int i = 0; i < numValues; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            try {
                value = input.nextInt();
                totalSum += value;  //update sum of numbers
                count++;
            } catch(InputMismatchException ex) {
                System.out.println("value entered must be an integer.");
                i--; //try again
            }
        } //end of for loop

        avgValue = (double) totalSum / count;
        System.out.println("The average of the " + numValues + " numbers is: " + avgValue);

        input.close();

    } //end of main
} //end of AverageNumbers class