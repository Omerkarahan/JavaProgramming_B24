package day50_inheritance;

public class Airport {
    public static void main(String[] args) {

        FlightTicket ticket = new FlightTicket("first", "new york", "florida");
        /*
        ticket.type;
        ticket.getDepartureLocation;
        ticket.getArrivalLocation;
        */

        System.out.println(ticket.getType());
        System.out.println(ticket.getDepartureLocation());
        System.out.println(ticket.getArrivalLocation());
    }
}
