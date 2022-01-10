package Java_Interview_Coding_Task.Java_Task_7;

import java.util.ArrayList;
import java.util.Arrays;

public class Q2_RemoveAhmed {
    /***
     * ArrayList-- Remove "Ahmed"
     * Given a list of people' names: "Ahmed", "John", Eric", "Ahmed"
     * Write a java operation to remove all the names named Ahmed
     */
    public static void main(String[] args) {

        ArrayList<String> people = new ArrayList<>(Arrays.asList("Ahmed", "Jhon", "Eric","Ahmed" +
                ""));
        System.out.println("People = " + people);

        people.removeAll(Arrays.asList("Ahmed"));
        System.out.println("Remove People = " + people);
    }
}