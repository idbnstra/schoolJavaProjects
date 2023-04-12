//Isaac Bandstra

package schoolJavaProjects;

import java.util.Scanner;

public class GradeConverter {
    public static void main(String[] args) {
        System.out.println("Welcome to the GradeConverter");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        String choice = "y";

        
        while(choice.equalsIgnoreCase("y")) {

            //get number of cents from user input
            System.out.print("Enter numerical grade (1-100):  ");
            String input = sc.nextLine();
            double numGrade = Double.parseDouble(input);
            String letterGrade = "G";

            if (numGrade >= 88) {
                letterGrade = "A";
            } else if (numGrade >= 80) {
                letterGrade = "B";
            } else if (numGrade >= 67) {
                letterGrade = "C";
            } else if (numGrade >= 60) {
                letterGrade = "D";
            } else if (numGrade < 60) {
                letterGrade = "F";
            }

            

            String message = "Letter grade: " + letterGrade + "\n";
            System.out.println(message);
            
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        } //end while
    }//end main
}
