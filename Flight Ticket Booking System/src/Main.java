import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        while (true) {
            System.out.println("Welcome to Flight booking system");
            System.out.println("(1) Book a Ticket");
            System.out.println("(2) Cancel a Ticket");
            System.out.println("(3) Display details");
            System.out.println("(4) Exit");

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            switch (n) {
                case 1 : {
                    System.out.println("Available Flights are (1, 2 ) \nChoose Flight No.");
                    int flightNo = sc.nextInt();
                    System.out.println("Tickets Required?");
                    int seats = sc.nextInt();
                    System.out.println("Enter names");
                    String name = null;
                    for (int i = 0; i < seats; i++) {
                        name = sc.next();
                    }
                    Booking.ticketBooking(flightNo, seats, name);
                    break;
                }

                case 2 : {
                    System.out.println("Enter Flight Id");
                    int FlightNo = sc.nextInt();
                    System.out.println("Enter passenger Ids to cancel");
                    int passengerId = sc.nextInt();
                    System.out.println("Tickets cancelled successfully");
                    Booking.cancelTickets(FlightNo, passengerId);
                    break;
                }

                case 3 : {
                    Booking.display();
                    break;
                }

                case 4 : {
                    System.out.println("Thank you for using our application");
                    break;
                }
            }
        }
    }
}