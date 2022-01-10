package day08_relational_logical_operators;

public class IsEvenOrOdd {

    public static void main(String[] args) {

        int number = 58;
        boolean isEven = number % 2 == 0;
        boolean isOdd = number % 2 != 0;

        System.out.println(number + " is even " + isEven);
        System.out.println(number + " iss odd: " + isOdd);


    }
}
