package prog2.exercise5.flight.booking.system;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.Random;

public class FlightBooking 
{
     String flightCompany;
     String   flightID;
     FlightBooking.TripSource tripSource;
     String SourceAirport;
     FlightBooking.TripDestination   tripDestination;
     String DestinationAirport;
     LocalDate  departureDate;
     LocalDate  returnDate;
     int  childPassengers;
     int adultPassengers;
     int   totalPassengers;
     double   departingTicketPrice;
     double returnTicketPrice;
     double  totalTicketPrice;
     BookingClass bookingClass;
     TripType tripType;
     


    enum DestinationAirport
    {
    
     NanjingLukouInternationalAirport, BeijingCapitalInternationalAirport, ShanghaiPudongInternationalAirport, OuluAirport, HelsinkiAirport, 
     ParisCharlesdeGaulleAirport

    }



     enum SourceAirport
     {
        NanjingLukouInternationalAirport, BeijingCapitalInternationalAirport, ShanghaiPudongInternationalAirport, OuluAirport, HelsinkiAirport, 
        ParisCharlesdeGaulleAirport
     }


     enum TripSource
    {
         NANJING,BEIJING, SHANGHAI, OULU, HELSINKI, PARIS
    }


    enum BookingClass
    {
    FIRST , BUSINESS , ECONOMY
    }


    enum TripType
    {
        ONE_WAY,RETURN   
    }


    enum TripDestination
    {
        NANJING, BEIJING, SHANGHAI,OULU, HELSINKI, PARIS
    }


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




    public FlightBooking(int totalTickets) 
    {
        this.totalTickets = totalTickets;
        this.passengerFullName = new String[totalTickets];
        this.passengerGender = new String[totalTickets];
        this.passengerAge = new int[totalTickets];
        this.ticketNumber = new String[totalTickets];
    }



    public BookingClass getBookingClass()
    {
        return this.bookingClass;
    }
    public void setBookingClass(String bookingClass)
    {
        switch(bookingClass)
        {
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


    public TripType getTripType()
    {
        return this.tripType;
    }
      public void setTripType(String tripType) 
    {
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




      public  String getPassengerGender(int index)
    {
        return passengerGender[index] ;
    }
    public void setPassengerGender(int index, String passengerGender)
    {
        this.passengerGender = new String[]{"Male", "Female", "Other"};
    }




    public int getPassengerAge(int index)
    {
        return  passengerAge[index];
    }
    public void setPassengerAge(int index ,int passengerAge)
    {
      this.passengerAge =  new int[]{43, 32, 21};
    }




    public String getTicketNumber(int index) 
    {
        setTicketNumber(1);
        return ticketNumber[index];
    }
  
    
 
    

    public String getFlightCompany()
    {
        return flightCompany;
    }
    public void setFlightCompany(String flightCompany )
    {
        this.flightCompany=flightCompany;
    }


    public String getflightID()
    {
        return flightID;
    }
    public void setID(String flightID )
    {
        this.flightID=flightID;
    }





    public void setPassengerFullName(int index ,String passengerFullName)
    {
        this.passengerFullName = new String[]{"Matt Jive", "Sally Fields", "Posh Quattro"};;
    }
    public String getPassengerFullName(int index) 
    {
        return passengerFullName[index];
    }




    public FlightBooking.TripSource getTripSource()
    {
        return tripSource;
    }
    public void setTripSource(String num )
    {
        switch(num)
        {
            case "1":this.tripSource=FlightBooking.TripSource.values()[0];break;
            case "2":this.tripSource=FlightBooking.TripSource.values()[1];break;
            case "3":this.tripSource=FlightBooking.TripSource.values()[2];break;
            case "4":this.tripSource=FlightBooking.TripSource.values()[3];break;
            case "5":this.tripSource=FlightBooking.TripSource.values()[4];break;
            case "6":this.tripSource=FlightBooking.TripSource.values()[5];break;
        }
    }


    public String getSourceAirport() 
    {
        return SourceAirport;
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
    public FlightBooking.TripDestination getTripDestination()
    {
        return tripDestination;
    }
    public void setTripDestination(String a,String b )
    {
        switch(b)
        {
            case "1":this.tripDestination=FlightBooking.TripDestination.values()[0];
            case "2":this.tripDestination=FlightBooking.TripDestination.values()[1];
            case "3":this.tripDestination=FlightBooking.TripDestination.values()[2];
            case "4":this.tripDestination=FlightBooking.TripDestination.values()[3];
            case "5":this.tripDestination=FlightBooking.TripDestination.values()[4];
            case "6":this.tripDestination=FlightBooking.TripDestination.values()[5];
        }
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



    public LocalDate getDepartureDate()
    {
        return departureDate;
    }
    public void setDepartureDate(LocalDate departureDate )
    {
        this.departureDate=departureDate;
    }


    public LocalDate getReturnDate()
    {
        return returnDate;
    }
    public void setReturnDate(LocalDate returnDate )
    {
        this.returnDate=returnDate.plusDays(2);
    }


    public int getChildPassengers()
    {
        return childPassengers;
    }
    public void setChildPassengers(int childPassengers )
    {
        this.childPassengers=childPassengers;
    }


    
    public int getAdultPassengers()
    {
        return adultPassengers;
    }
    public void setAdultPassengers(int adultPassengers )
    {
        this.adultPassengers=adultPassengers;
    }


    public int getTotalPassengers()
    {
        return totalPassengers;
    }
    public void setTotalPassengers(int ChildPassengers, int AdultPassengers )
    {
        this.totalPassengers = ChildPassengers+AdultPassengers;
    }


    public double  getDepartingTicketPrice()
    {
        return departingTicketPrice;
    }
    public void setDepartingTicketPrice(int child,int adults )
    {
        this.departingTicketPrice=departingTicketPrice;
    }


    public double  getReturnTicketPrice()
    {
        return returnTicketPrice;
    }
    public void setReturnTicketPrice()
    {
        this.returnTicketPrice=returnTicketPrice;
    }




    public double getTotalTicketPrice() 
    {
        return  Math.abs(2* ((0*(300 + (0.15*300) + (0.1*300) + 250)) + (3*(300 + (0.15*300) + (0.1*300) + 250))));
    }
    public void setTotalTicketPrice() 
    {
        this.totalTicketPrice = Math.abs(2* ((0*(300 + (0.15*300) + (0.1*300) + 250)) + (3*(300 + (0.15*300) + (0.1*300) + 250))));
    }


    public String toString()
    {return ("Dear " + passengerFullName + ". Thank you for booking your flight with " + flightCompany + "." + "\n" +
       "Following are the details of your booking and the trip:" + "\n" + 
        "Ticket Number: " + ticketNumber + "\n" + 
        "From " + tripSource + " to " + tripDestination + "\n" +
        "Date of departure: " + departureDate + "\n" +
        "Date of return: " +  returnDate + "\n" +
       "Total passengers: " + totalPassengers + "\n" +
       "Total ticket price in Euros: " + totalTicketPrice);
}



     Random random = new Random();
     public void setTicketNumber(int a) 
   {
        String ticketNumber = null;
        switch (tripType) 
        {
          case ONE_WAY:
            ticketNumber = "11";
            break;
          case RETURN:
            ticketNumber = "22";
            break;
        }
    switch (bookingClass) 
        {
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
    for (int i = 0; i < 4; i++) 
    {
        char b = (char) ((random.nextInt(26) + 65));
        ticketNumber = ticketNumber + b;
    }
    if (tripSource == tripSource.NANJING && tripDestination == tripDestination.BEIJING) 
    {
        this.ticketNumber = new String[]{ticketNumber + "DOM"};
    }
    if (tripSource == tripSource.BEIJING && tripDestination == tripDestination.NANJING) 
    {
        this.ticketNumber = new String[]{ticketNumber + "DOM"};
    }
    if (tripSource == tripSource.OULU && tripDestination == tripDestination.HELSINKI)
    {
        this.ticketNumber = new String[]{ticketNumber + "DOM"};
    }
    if (tripSource == tripSource.HELSINKI && tripDestination == tripDestination.OULU) 
    {
        this.ticketNumber = new String[]{ticketNumber + "DOM"};
    }
    if (tripSource == tripSource.NANJING && tripDestination == tripDestination.OULU) 
    {
        this.ticketNumber = new String[]{ticketNumber + "INT"};
    }
    if (tripSource == tripSource.OULU && tripDestination == tripDestination.NANJING) 
    {
        this.ticketNumber = new String[]{ticketNumber + "INT"};
    }
    if (tripSource == tripSource.NANJING && tripDestination == tripDestination.HELSINKI) 
    {
        this.ticketNumber = new String[]{ticketNumber + "INT"};
    }
    if (tripSource == tripSource.HELSINKI && tripDestination == tripDestination.NANJING) 
    {
        this.ticketNumber = new String[]{ticketNumber + "INT"};
    }
    if (tripSource == tripSource.BEIJING && tripDestination == tripDestination.OULU) 
    {
        this.ticketNumber = new String[]{ticketNumber + "INT"};
    }
    if (tripSource == tripSource.OULU && tripDestination == tripDestination.BEIJING) 
    {
        this.ticketNumber = new String[]{ticketNumber + "INT"};
    }
    if (tripSource == tripSource.BEIJING && tripDestination == tripDestination.NANJING) 
    {
        this.ticketNumber = new String[]{ticketNumber + "INT"};
    }
    if (tripSource == tripSource.HELSINKI && tripDestination == tripDestination.BEIJING) 
    {
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

   public void reserveTickets() 
   {

    for (int i = 0; i < totalTickets; i++) 
        {
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


