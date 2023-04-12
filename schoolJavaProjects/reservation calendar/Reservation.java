//Isaac Bandstra

package past_assignments;

import java.text.SimpleDateFormat;
import java.text.NumberFormat;

import java.util.Date; //

import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


public class Reservation {

    //instance variables
    LocalDate arrivalDate;
    LocalDate departureDate;
    final double NIGHTLY_RATE = 145.00;
    //double totalPrice = NIGHTLY_RATE * getNumberOfNights();
    double totalPrice = NIGHTLY_RATE;

    //contructor
    public Reservation(){
        arrivalDate = LocalDate.now();
        departureDate = LocalDate.now().plusDays(1);
    }

    public Reservation(LocalDate arDate, LocalDate dpDate){
        this.arrivalDate = arDate;
        this.departureDate = dpDate;
    }

    public LocalDate getArrivalDate() {
        return this.arrivalDate;
    }

    public int getNumberOfNights(){
        //calculate difference between arrival and departure
        int nights = (int) ChronoUnit.DAYS.between(arrivalDate,departureDate);
        return nights;
    }

    public String getPricePerNightFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(NIGHTLY_RATE);
    }

    public void /*void is not in assignment*/ setArrivalDate(LocalDate arrivalDate){
        this.arrivalDate = arrivalDate;
    }

    public LocalDate getDepartureDate(){
        return departureDate;
    }

    public void setDepartedDate(LocalDate departureDate){
        this.departureDate = departureDate;
    }

    // https://stackoverflow.com/questions/28177370/how-to-format-localdate-to-string
    public String getArrivalDateFormatted() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String arrivalDateFormatted = arrivalDate.format(formatter);
        return arrivalDateFormatted;
    }
    public String getDepartureDateFormatted(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String departureDateFormatted = departureDate.format(formatter);
        return departureDateFormatted;
    }

    
    public double getTotalPrice(){
        return NIGHTLY_RATE * getNumberOfNights();
    }

    public String getTotalPriceFormatted(){

        String totalPriceFormatted = ("$" + Double.toString(getTotalPrice()));
        return totalPriceFormatted;
    }


}
