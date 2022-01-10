package day08_relational_logical_operators;

public class ShorthandOperators {

    public static void main(String[] args) {

        double parkingFee = 7.50;

        System.out.println("You are an early bird so half off");

       // parkingFee = parkingFee / 2; //-> manual way with reassigning
        System.out.println("your fee is: " + parkingFee);
        parkingFee /= 2;
        System.out.println("Your fee is:" + parkingFee);

        int tvs = 30;
        tvs--;
        tvs--;

        tvs -= 2;

        System.out.println(tvs);

        int i = 10;
        i %= 2; // i = i % 2 --> i = 10 % 2 --> i = 0

        System.out.println(i);

    }



}
