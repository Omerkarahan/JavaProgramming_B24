package office_hours.practice_08_18_2021;

public class OperatorPractice {

    public static void main(String[] args) {

        int numOne = 10; // 10
        int numTwo = numOne++ * 3 + ++numOne + numOne++ % 2;
        //             10     *  3 + 12 + 12  % 2
        //               30 + 12 + 12 % 2
        //                30 + 12 + 0
        //                 42

        int biggest = numOne > numTwo ? numOne : numTwo;
        //            13 > 42

        // biggest numTwo = 42

        System.out.println(numOne);
        System.out.println(numTwo);
        System.out.println(biggest);
    }
}
