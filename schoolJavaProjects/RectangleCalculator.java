//Isaac Bandstra

package schoolJavaProjects;

import java.util.Scanner;

public class RectangleCalculator {
    public static void main(String[] args){
        System.out.println("Welcome to RectangleCalculator");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        String choice = "y";

        while(choice.equalsIgnoreCase("y")) {
            System.out.print("Enter length: ");
            String input1 = sc.nextLine();
            int length = Integer.parseInt(input1);

            System.out.print("Enter width: ");
            String input2 = sc.nextLine();
            int width = Integer.parseInt(input2);

            int area = length*width;
            int perimeter = (2*width) + (2*length);

            String message = "Area:      " + area + "\n"
                           + "perimeter: " + perimeter + "\n";
            System.out.println(message);

            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
    }
}
