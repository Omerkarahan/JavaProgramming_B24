package day07_unary_operators;

public class TicketPrice {
    public static void main(String[] args) {

        String cityOne = "Chicago";
        String cityTwo = "Virginia";
        double baseTicketPrice = 110.50;
        double milesBetweenCities = 739.8;
        double totalPriceAfterMiles = baseTicketPrice + milesBetweenCities / 10;

        System.out.println("The ticket price from " + cityOne + " to " + cityTwo + " is $ " + totalPriceAfterMiles );

        float f = 40;
        long l = 10;
        float result = f * l;
        long result2 = (long)(f*l); // long result2 = (long) result;
        //long l = 100000000L;
        //number + number -> addition
        //number + string -> concatenation





    }
}
