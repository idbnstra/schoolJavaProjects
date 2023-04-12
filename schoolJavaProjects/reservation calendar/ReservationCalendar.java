//Isaac Bandstra

package past_assignments;

import java.time.LocalDate;
import java.util.Scanner;

public class ReservationCalendar {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        Reservation grandparents = new Reservation();

        System.out.print("Set your arrival date (YYYY-MM-DD): ");
        grandparents.setArrivalDate(LocalDate.parse(sc.nextLine()));

        System.out.print("Set your departure date (YYYY-MM-DD): ");
        grandparents.setDepartedDate(LocalDate.parse(sc.nextLine()));

        //display reservation
        String s = 
            "Arrival Date " + grandparents.getArrivalDateFormatted() + "\n" +
            "Departure Date " + grandparents.getDepartureDateFormatted() + "\n\n" +
            "Total Price of the stay: " + grandparents.getTotalPriceFormatted() + "\n";

        System.out.print(s);

    }
}
