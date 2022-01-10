package practice.with_eduardo.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExplained {
    public static void main(String[] args) {

       // ArrayList arrayList = new ArrayList();
//        ArrayList<Object> arrayList = new ArrayList<>();   // Object is generic in here, it could be String, Integer
//        arrayList.add(12);
//        arrayList.add("john");
//        arrayList.add(45.6);
//        arrayList.add(true);
//
//        System.out.println(arrayList);

//        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("John", "Make"));
//        System.out.println(stringArrayList);

        ArrayList<Double> doubles = new ArrayList<>(Arrays.asList(20.5,40.2,30.3));
        System.out.println(doubles);
        doubles.add(12.5); // index 0
        doubles.add(43.0); // index 1
        System.out.println(doubles.size()); //  2 elements
        //doubles.add("john");
        doubles.remove(0);
        doubles.remove(12.5);

        doubles.clear(); // delete the arraylist
        doubles.isEmpty(); // returns true or false
        doubles.contains(43.0); // return true or false

        doubles.removeIf(number -> number > 20);


        System.out.println(doubles);
        System.out.println(doubles.size());


    }
}
