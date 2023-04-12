//Isaac Bandstra

package schoolJavaProjects;

import java.util.Scanner;

public class SquaresCubes {
    public static void main(String[] args) {
        System.out.println("Welcome to the Squares and Cubes table program");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        String choice = "y";

        
        while(choice.equalsIgnoreCase("y")) {

            //get number of cents from user input
            System.out.println("Enter an integer:  ");
            String input = sc.nextLine();
            int number = Integer.parseInt(input);

            System.out.println("Number  Squared Cubed");
            System.out.println("======  ======= =====");
            for(int i = 0; i < number; i++) {
                System.out.printf("%-6s  %-7s %-5s %n", i, Math.pow(i, 2), Math.pow(i, 3));
            }

            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
            
        }
    }
}
