package prog2.exercise5.flight.booking.system;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Random;

public class FlightBooking {

    // static String usingMath(int length) {
    //     String alphabetsInUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    //     String numbers = "0123456789";
    //     String flightID = alphabetsInUpperCase + numbers;
    //     StringBuffer randomString = new StringBuffer();
    //     for (int i = 0; i < length; i++) {
    //         int randomIndex = (int)(Math.random() * flightID.length());
    //         randomString.append(flightID.charAt(randomIndex));
    //     }
    //     return randomString.toString();
    // }

    String flightCompany;
    String flightID;
    LocalDate departureDate;
    LocalDate returnDate;
    int childPassengers;
    int adultPassengers;
    int totalPassengers;
    double departingTicketPrice;
    double returnTicketPrice;
    double totalTicketPrice;
    BookingClass bookingClass;
    TripDestination tripDestination;
    String TripDestination;
    TripSource tripSource;
    String TripSource;
    TripType tripType;
    String SourceAirport;
    String DestinationAirport;
    int TripDate;
    String[] passengerGender;
    int[] passengerAge;
    Scanner scanner;
    String[] ticketNumber;
    int totalTickets;
    String[] passengerFullName;
    String [] fullName = {"Matt Jive", "Sally Fields", "Posh Quattro"};
    String [] gender = {"Male", "Female", "Other"};
    int [] age = {43, 32, 21};
    int size = 3;

    public FlightBooking(int totalTickets) {
        this.totalTickets = totalTickets;
        this.passengerFullName = new String[totalTickets];
        this.passengerGender = new String[totalTickets];
        this.passengerAge = new int[totalTickets];
        this.ticketNumber = new String[totalTickets];
    }

    enum TripType{
        ONE_WAY,RETURN
    }
    enum BookingClass{
        FIRST,BUSINESS,ECONOMY
    }
    enum TripSource{
        NANJING,BEIJING,SHANGHAI,OULU,HELSINKI,PARIS
    }
    enum TripDestination{
        NANJING,BEIJING,SHANGHAI,OULU,HELSINKI,PARIS
    }
    enum SourceAirport{
        NANJING_LUKOU_INTERNATIONAL_AIRPORT,BEIJING_CAPITAL_INTERNATIONAL_AIRPORT,
        SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT,OULU_AIRPORT,HELSINKI_AIRPORT,
        PARIS_CHARLES_DE_GAULLE_AIRPORT
    }
    enum DestinationAirport{
        NANJING_LUKOU_INTERNATIONAL_AIRPORT,BEIJING_CAPITAL_INTERNATIONAL_AIRPORT,
        SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT,OULU_AIRPORT,HELSINKI_AIRPORT,
        PARIS_CHARLES_DE_GAULLE_AIRPORT
    }

    public  String getPassengerGender(int index){
        return passengerGender[index] ;
    }
    public void setPassengerGender(int index, String passengerGender){
        this.passengerGender = new String[]{"Male", "Female", "Other"};
    }

    public int getPassengerAge(int index){
        return  passengerAge[index];
    }
    public void setPassengerAge(int index ,int passengerAge){
      this.passengerAge =  new int[]{43, 32, 21};

    }

    public String getTicketNumber(int index) {
        setTicketNumber(1);
        return ticketNumber[index];
    }

    public void setPassengerFullName(int index ,String passengerFullName) {
        this.passengerFullName = new String[]{"Matt Jive", "Sally Fields", "Posh Quattro"};;
    }
    public String getPassengerFullName(int index) {
        return passengerFullName[index];
    }

    public void setDepartureDate(LocalDate departureDate) {
        String departingString = "2023-03-04";
        this.departureDate = LocalDate.parse(departingString);
    }
    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        String returningString = "2023-03-05";
        this.returnDate = departureDate.plusDays(2);
    }
    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setTotalTicketPrice() {
        this.totalTicketPrice = Math.abs(2* ((0*(300 + (0.15*300) + (0.1*300) + 250)) + (3*(300 + (0.15*300) + (0.1*300) + 250))));
    }
    public double getTotalTicketPrice() {
        return  Math.abs(2* ((0*(300 + (0.15*300) + (0.1*300) + 250)) + (3*(300 + (0.15*300) + (0.1*300) + 250))));
    }

    public int getChildPassengers() {
        return childPassengers;
    }
    public void setChildPassengers(int childPassengers) {
        this.childPassengers = childPassengers;
    }

    public int getAdultPassengers() {
        return adultPassengers;
    }
    public void setAdultPassengers(int adultPassengers) {
        this.adultPassengers = adultPassengers;
    }

    public void setTotalPassengers(int totalPassengers, int totalPassengers2){
        this.totalPassengers=childPassengers+adultPassengers;
    }
    public int getTotalPassengers() {
            return totalPassengers;
    }

    public void setDepartingTicketPrice(int child, int adult) {
        this.departingTicketPrice = departingTicketPrice;
    }
    public double getDepartingTicketPrice() {
        return departingTicketPrice;
    }

    public void setReturnTicketPrice(){
        this.returnTicketPrice=returnTicketPrice;
    }
    public double getReturnTicketPrice(){
        return returnTicketPrice;
    }

    public void setFlightCompany(String flightCompany) {
        this.flightCompany = flightCompany;
    }
    public String getFlightCompany() {
        return flightCompany;
    }
    
    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }
    public String getFlightID() {
        return flightID;
    }

    public void setTripDate(int tripDate) {
        this.TripDate = tripDate;
    }
    public int getTripDate() {
            return TripDate;
    }
    
    public void setTripType(String tripType) {
        switch(tripType){
            case "1":
            this.tripType=TripType.ONE_WAY;
            break;
            case "2":
            this.tripType=TripType.RETURN;
            break;
            default:
            System.out.println("Invaild choice");
            }
    }
    public TripType getTripType(){
        return this.tripType;
    }
          
    public void setBookingClass(String bookingClass){
        switch(bookingClass){
            case "1":
            this.bookingClass=BookingClass.FIRST;
            break;
            case "2":
            this.bookingClass=BookingClass.BUSINESS;
            break;
            case"3":
            this.bookingClass=BookingClass.ECONOMY;
            break;
            default:
            System.out.println("Invaild choice");
            break;
           }
    }
    public BookingClass getBookingClass(){
        return this.bookingClass;
    }
    
    public void setTripSource(String tripsource) {
        switch (tripsource) {
            case "1":
                this.tripSource = tripSource.NANJING;
                break;
            case "2":
                this.tripSource = tripSource.BEIJING;
                break;
            case "3":
                this.tripSource = tripSource.SHANGHAI;
                break;
            case "4":
                this.tripSource = tripSource.OULU;
                break;
            case "5":
                this.tripSource = tripSource.HELSINKI;
                break;
            case "6":
                this.tripSource = tripSource.PARIS;
                break;
            default:
        }
    }
    public String getTripSource() {
        return TripSource;
    }
    

    public void setTripDestination(String tripdestination,String tripdestination1) {

        switch (tripdestination) {
            case "1":
                this.tripDestination = tripDestination.NANJING;
                break;
            case "2":
                this.tripDestination = tripDestination.BEIJING;
                break;
            case "3":
                this.tripDestination = tripDestination.SHANGHAI;
                break;
            case "4":
                this.tripDestination = tripDestination.OULU;
                break;
            case "5":
                this.tripDestination = tripDestination.HELSINKI;
                break;
            case "6":
                this.tripDestination = tripDestination.PARIS;
                break;
            default:
        }
    }
    public String getTripDestination() {
        return TripDestination;
    }


    public void setSourceAirport(String sourceAirport) {
        if (tripSource == tripSource.NANJING) {
            this.SourceAirport = "Nanjing Lukou International Airport";
        }
        if (tripSource == tripSource.BEIJING) {
            this.SourceAirport = "Beijing Capital International Airport";
        }
        if (tripSource == tripSource.SHANGHAI) {
            this.SourceAirport = "Shanghai Pudong International Airport";
        }
        if (tripSource == tripSource.OULU) {
            this.SourceAirport = "Oulu Airport";
        }
        if (tripSource == tripSource.HELSINKI) {
            this.SourceAirport = "Helsinki Airport";
        }
        if (tripSource == tripSource.PARIS) {
            this.SourceAirport = " Paris Charles de Gaulle Airport";
        }
    }
    public String getSourceAirport() {
        return SourceAirport;
    }
    
    public void setDestinationAirport(String destinationAirport, String destinationAirport1) {
        DestinationAirport = String.valueOf(tripDestination);
        if (tripDestination == tripDestination.NANJING) {
            this.DestinationAirport = "Nanjing Lukou International Airport";
        }
        if (tripDestination == tripDestination.SHANGHAI) {
            this.DestinationAirport = "Beijing Capital International Airport";
        }
        if (tripDestination == tripDestination.SHANGHAI) {
            this.DestinationAirport = "Shanghai Pudong International Airport";
        }
        if (tripDestination == tripDestination.OULU) {
            this.DestinationAirport = "Oulu Airport";
        }
        if (tripDestination == tripDestination.HELSINKI) {
            this.DestinationAirport = "Helsinki Airport";
        }
        if (tripDestination == tripDestination.PARIS) {
            this.DestinationAirport = " Paris Charles de Gaulle Airport";
        }
    }
    public String getDestinationAirport() {
        return DestinationAirport;
    }

    public String toString(){
        return "Dear " + passengerFullName + ". Thank you for booking your flight with " +
        flightCompany + ".\nFollowing are the details of your booking and the trip:" + "\n" +
                "Ticket Number: " + ticketNumber + "\n" +
                "From " + tripSource + " to " + tripDestination + "\n" +
                "Date of departure: " + departureDate + "\n" +
                "Date of return: " + returnDate + "\n" +
                "Total passengers: " + totalPassengers + "\n" +
                "Total ticket price in Euros: " + totalTicketPrice;
    }

    Random random = new Random();
    public void setTicketNumber(int a) {
        String ticketNumber = null;
        switch (tripType) {
            case ONE_WAY:
                ticketNumber = "11";
                break;
            case RETURN:
                ticketNumber = "22";
                break;
        }
        switch (bookingClass) {
            case FIRST:
                ticketNumber = ticketNumber + "F";
                break;
            case BUSINESS:
                ticketNumber = ticketNumber + "B";
                break;
            case ECONOMY:
                ticketNumber = ticketNumber + "E";
                break;
        }
        for (int i = 0; i < 4; i++) {
            char b = (char) ((random.nextInt(26) + 65));
            ticketNumber = ticketNumber + b;
        }
        if (tripSource == tripSource.NANJING && tripDestination == tripDestination.BEIJING) {
            this.ticketNumber = new String[]{ticketNumber + "DOM"};
        }
        if (tripSource == tripSource.BEIJING && tripDestination == tripDestination.NANJING) {
            this.ticketNumber = new String[]{ticketNumber + "DOM"};
        }
        if (tripSource == tripSource.OULU && tripDestination == tripDestination.HELSINKI) {
            this.ticketNumber = new String[]{ticketNumber + "DOM"};
        }
        if (tripSource == tripSource.HELSINKI && tripDestination == tripDestination.OULU) {
            this.ticketNumber = new String[]{ticketNumber + "DOM"};
        }
        if (tripSource == tripSource.NANJING && tripDestination == tripDestination.OULU) {
            this.ticketNumber = new String[]{ticketNumber + "INT"};
        }
        if (tripSource == tripSource.OULU && tripDestination == tripDestination.NANJING) {
            this.ticketNumber = new String[]{ticketNumber + "INT"};
        }
        if (tripSource == tripSource.NANJING && tripDestination == tripDestination.HELSINKI) {
            this.ticketNumber = new String[]{ticketNumber + "INT"};
        }
        if (tripSource == tripSource.HELSINKI && tripDestination == tripDestination.NANJING) {
            this.ticketNumber = new String[]{ticketNumber + "INT"};
        }
        if (tripSource == tripSource.BEIJING && tripDestination == tripDestination.OULU) {
            this.ticketNumber = new String[]{ticketNumber + "INT"};
        }
        if (tripSource == tripSource.OULU && tripDestination == tripDestination.BEIJING) {
            this.ticketNumber = new String[]{ticketNumber + "INT"};
        }
        if (tripSource == tripSource.BEIJING && tripDestination == tripDestination.NANJING) {
            this.ticketNumber = new String[]{ticketNumber + "INT"};
        }
        if (tripSource == tripSource.HELSINKI && tripDestination == tripDestination.BEIJING) {
            this.ticketNumber = new String[]{ticketNumber + "INT"};
        }
    }
    
    ConfirmationMessage ConfirmationMessage;
    enum ConfirmationMessage {
        CHANGE, NOTCHANGE;
    }
    public void setConfirmationMessage(String confirmationmessage) {
        switch (confirmationmessage) {
            case "1":
                this.ConfirmationMessage = ConfirmationMessage.CHANGE;
                System.out.println("Thank you for booking your flight with " + flightCompany + ". Following are the details \n" +
                        "of your booking and the trip: \n" +
                        "Ticket Number: " + ticketNumber + "\n" +
                        "Passenger Name: " + passengerFullName + "\n" +
                        "From TripSource to " + tripDestination + "\n" +
                        "Date of departure: " + departureDate + "\n" +
                        "Date of return: ReturnDate (Changed from old ReturnDate to new\n" +
                        returnDate + ")\n" +
                        "Total passengers: " + totalPassengers + "\n" +
                        "Total ticket price in Euros: " + totalTicketPrice + "\n" +
                        "IMPORTANT NOTICE: As per our policy, the return date was changed because it was \n" +
                        "less than two days apart from your departure date");
                break;
            case "2":
                this.ConfirmationMessage = ConfirmationMessage.NOTCHANGE;
                System.out.println("Thank you for booking your flight with " + flightCompany + ".Following are the details \n" +
                        "of your booking and the trip: \n" +
                        "Ticket Number: " + ticketNumber + "\n" +
                        "Passenger Name: " + passengerFullName + "\n" +
                        "From TripSource to " + tripDestination + "\n" +
                        "Date of departure: " + departureDate + "\n" +
                        "Date of return: " + returnDate + "\n" +
                        "Total passengers: " + totalPassengers + "\n" +
                        "Total ticket price in Euros: " + totalTicketPrice + "\n");

                break;
        }
    }

    public void reserveTickets() {

        for (int i = 0; i < totalTickets; i++) {
            System.out.println("Enter details for passenger " + (i + 1));
            System.out.print("Full Name: ");
            setPassengerFullName(i, scanner.nextLine());

            System.out.print("Gender: ");
            setPassengerGender(i, scanner.nextLine());

            System.out.print("Age: ");
            setPassengerAge(i, scanner.nextInt());
            scanner.nextLine();

            setTicketNumber(i);
        }
    }
    }
