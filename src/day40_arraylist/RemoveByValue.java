package day40_arraylist;

import java.util.ArrayList;

public class RemoveByValue {

    public static void main(String[] args) {

        ArrayList<String > list = new ArrayList<>();
        list.add("pen");
        list.add("mouse");
        list.add("mouse");
        list.add("marker");

        boolean removed = list.remove("mouse"); // removes the first mouse occurance
        System.out.println(removed);

        System.out.println(list);

        boolean removed2 = list.remove("hat");
        System.out.println(removed2);
        System.out.println(list);
    }
}
