package schoolJavaProjects;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

// Isaac Bandstra

public class ArrivalTime {

    public static void main(String[] args){
        int milesInt = 0;
        int mphInt = 0;
        String dateString = "";
        String timeString = "";
        boolean error = true;
        LocalDateTime departureDateTime = LocalDateTime.now();

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Departure date (YYYY-MM-DD): ");
            dateString = sc.nextLine();
            System.out.print("Departure time (HH:MM): ");
            timeString = sc.nextLine();
    
            String dateTimeString = dateString + "T" + timeString;

            try{
                departureDateTime = LocalDateTime.parse(dateTimeString);
                error = false;
            } catch (DateTimeParseException timeParse) {
                System.out.println("Your date and/or time input is formatted incorrectly. Let's try this again.");
                error = true;
            }
        } while (error);

        do {
            System.out.print("Input your expected average speed in miles per hour during the trip: ");
            String mphString = sc.nextLine();

            try {
                mphInt = Integer.parseInt(mphString);
                error = false;
            } catch (NumberFormatException mphint) {
                System.out.println("Invalid input: " + mphString + " is not an integer.");
                error = true;
            }
        } while (error);

        do{
            //get miles
            System.out.println("Length of trip in miles: ");
            String mileString = sc.nextLine();

            try {
                milesInt = Integer.parseInt(mileString);
                error = false;
            } catch (NumberFormatException milesint) {
                System.out.println("Invalid input: " + mileString + " is not an integer");
                error = true;
            }
        }while(error);

        //calculate
        int hours = milesInt / mphInt;
        int minutes = milesInt % mphInt;
        LocalDateTime arrivalDateTime = departureDateTime.plusHours(hours).plusMinutes(minutes);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedArrivalDateTime = arrivalDateTime.format(formatter);

        String displayArrival =
            "Your trip will take " + hours + " hours and " + minutes +
            " minutes.\nBased on your given departure time and date, you will arrive at this date and time: " + formattedArrivalDateTime;

        System.out.println(displayArrival);

        sc.close();
    }
}
