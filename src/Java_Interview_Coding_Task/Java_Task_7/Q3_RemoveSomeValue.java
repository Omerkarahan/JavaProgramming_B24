package Java_Interview_Coding_Task.Java_Task_7;

import java.util.ArrayList;
import java.util.Arrays;

public class Q3_RemoveSomeValue {
    /**
     * ArrayList-- Remove some values
     * - Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(345, 2, 75, 45, 300, 569));
        System.out.println(removeGraderThan(list, 100));

    }

    public static ArrayList<Integer> removeGraderThan(ArrayList<Integer> numbers, int limit) {
        numbers.removeIf(number -> number > limit);
        return numbers;
    }
}
