package Java_Interview_Coding_Task.Java_Task_4;

public class Q2_EvenOrOdd {
    /**
     * Numbers -- odd & even:
     * Write a method which can identifies given number is even or odd.
     * identify(6) ==> "even" true or false
     * identify(5) ==> "odd"
     */

    public static void main(String[] args) {
        System.out.println(identify(6));
        System.out.println(identify(5));
    }

    public static String identify(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }

        // return (number % 2 == 0) ? "even" : "odd";
    }

}