package prog2.exercise5.flight.booking.system;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

import prog2.exercise5.flight.booking.system.FlightBooking.TripSource;
/**
 * Hello world!
 *
 */
public class Main{
  
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        String passengerFullName = input.next();
        input.close();
        System.out.println("Please enter your fullname");
        String departingString = "2022-03-17";
        LocalDate depart = LocalDate.parse(departingString);
        String returningString = "2022-03-19";
        LocalDate returnDate = LocalDate.parse(returningString);
        Random random = new Random();
        int flightID = random.nextInt(9999 - 1000) + 1000;
        String flightNumber = "FOF" + flightID;
        int size = 3;
        FlightBooking fb = new FlightBooking(size);
        String [] fullName = {"Matt Jive", "Sally Fields", "Posh Quattro"};
        String [] gender = {"Male", "Female", "Other"};
        int [] age = {43, 32, 21};
        for(int i=0; i<size; ++i){
            fb.setPassengerFullName(i, fullName[i]);
            fb.setPassengerGender(i, gender[i]);
            fb.setPassengerAge(i, age[i]);
        }
        fb.setTotalPassengers(2,3);
        fb.setTotalTicketPrice();

        System.out.println("Dear " + passengerFullName + ". Thank you for booking your flight with " +
        fb.getFlightCompany() + ".\nFollowing are the details of your booking and the trip:" + "\n" +
                "Ticket Number: " + fb.getTicketNumber(1) + "\n" +
                "From " + fb.getTripSource() + " to " + fb.getTripDestination() + "\n" +
                "Date of departure: " + fb.getDepartureDate() + "\n" +
                "Date of return: " + fb.getReturnDate() + "\n" +
                "Total passengers: " + fb.getTotalPassengers() + "\n" +
                "Total ticket price in Euros: " + fb.getTotalTicketPrice()); 
    }
 }  
