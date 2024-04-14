import java.awt.datatransfer.FlavorListener;
import java.util.*;

public class Booking {

    private static List<Flight> flightList1 =new ArrayList<>();
    private static List<Flight> flightList2 =new ArrayList<>();
    private static int availableSeatsInFlight1 = 50;
    private static int availableSeatsInFlight2 = 50;
    private static int customerId1 = 1;
    private static int customerId2 = 1;
    static int flight1seatNo = 1;
    private static int flight1price = 5000;
    private static int flight2seatNo = 1;
    private static int flight2price = 5000;

    public static void ticketBooking (int flightNo, int seats, String name) {


        if (flightNo == 1 && flight1seatNo < availableSeatsInFlight1) {
            for (int i=0; i<seats; i++){
                Flight flight = new Flight();
                flight.setName(name);
                flight.setId(customerId1++);
                flight.setFlightNo(flightNo);
                int tempPrice = (flight1seatNo <= 1) ? 5000 : (flight1price + ((flight1seatNo * 200) - 200));
                flight.setPrice(tempPrice);
                flight.setSeatNo(flight1seatNo++);
                availableSeatsInFlight1 = availableSeatsInFlight1 - seats;
                flightList1.add(flight);
                System.out.println("Booked Successfully : " + "Flight no : " + flight.getFlightNo() + ", Seat no : " + flight.getSeatNo() + ", Tickete price: " + flight.getPrice());
            }
        }

        else if (flightNo == 2 && flight2seatNo < availableSeatsInFlight2) {
            for (int i=0; i<seats; i++) {
                Flight flight = new Flight();
                flight.setName(name);
                flight.setId(customerId2++);
                flight.setFlightNo(flightNo);
                flight.setFlightNo(flightNo);
                int tempPrice = (flight2seatNo <= 1) ? 5000 : (flight2price + (flight2seatNo * 200));
                flight.setPrice(tempPrice);
                flight.setSeatNo(flight2seatNo++);
                availableSeatsInFlight1 = availableSeatsInFlight1 - seats;
                flightList2.add(flight);
                System.out.println("Booked Successfully : " + "Flight no : " + flight.getFlightNo() + ", Seat no : " + flight.getSeatNo() + ", Tickete price: " + flight.getPrice());
            }
        }
    }



    public static void display() {
        System.out.println("Flight No.1 details");
        for (Flight f : flightList1) {
            System.out.println(f.toString());
        }
        System.out.println("Flight No.2 details");
        for (Flight f : flightList2) {
            System.out.println(f.toString());
        }
    }

    public static void cancelTickets(int flightNo, int passengerId) {
        if (flightNo == 1) {
            for (Flight f : flightList1) {
                if (f.getId() == passengerId) {
                    flightList1.remove(f);
                    availableSeatsInFlight1++;
                    flight1price -= 200; // Decrease price for each canceled seat
                    flight1seatNo--;
                    break; // Exit loop once ticket is found and canceled
                }
            }
        }
        else if (flightNo == 2) {
            for (Flight f : flightList2) {
                if (f.getId() == passengerId) {
                    flightList2.remove(f);
                    availableSeatsInFlight2++;
                    flight2price -= 200; // Decrease price for each canceled seat
                    flight2seatNo--;
                    break; // Exit loop once ticket is found and canceled
                }
            }
        }
    }
}
