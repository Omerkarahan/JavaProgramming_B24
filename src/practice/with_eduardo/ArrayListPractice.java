package practice.with_eduardo;
import java.util.ArrayList;
import java.util.Arrays;


public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(52, 34, 9, 105, 24));
        System.out.println(numbers); // print the Arraylist numbers
        System.out.println(numbers.get(0));
        System.out.println(numbers.size());

        numbers.add(85);
        System.out.println(numbers.size());
        System.out.println(numbers);

       // numbers.add("String"); it does not work because it just accepts Integer

        System.out.println(numbers.contains(34));
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(7,12));
        System.out.println(numbers.addAll(numbers2));
        System.out.println(numbers);
        System.out.println(numbers.size());

        //System.out.println(numbers.get(2));
        //System.out.println(numbers.remove(2));
        System.out.println(numbers.get(3));
        //System.out.println(numbers.remove());

        String aNumber = "43";
        int number = Integer.parseInt(aNumber);
        System.out.println(number);
        String someNumber = String.valueOf(43); // int converts int to String

        System.out.println(numbers);
        System.out.println(numbers.remove(1));

        System.out.println(numbers);
        int someNum = numbers.remove(0);
        System.out.println(numbers); //[9, 105, 24, 85, 7, 12]
        System.out.println(someNum);
        System.out.println(numbers.set(0,65)); // set replace the number [65, 105, 24, 85, 7, 12]
        System.out.println(numbers);
        numbers.add(0,78);
        System.out.println(numbers); //[78, 65, 105, 24, 85, 7, 12]

        System.out.println(numbers.removeIf(x -> x > 50)); //[24, 7, 12] // lambdas expression
        System.out.println(numbers);




    }
}
