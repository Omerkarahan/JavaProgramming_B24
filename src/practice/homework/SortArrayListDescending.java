package practice.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArrayListDescending {

    public static void main(String[] args) {

        ArrayList<Integer> arraylist = new ArrayList<>(Arrays.asList(112, 5, 2, 6, 23, 75, 11));

        //int [] arr = {112, 5, 2, 6, 23, 75, 11};

        //System.out.println(Arrays.toString(sortDescending(arr)));

    }

    public static ArrayList<Integer> sortDescending(ArrayList<Integer> arraylist){

        for (int i = 0; i < arraylist.size(); i++) {

            for (int j = i; j < arraylist.size(); j++) {
                if (arraylist.get(i) < arraylist.get(j)) {
                    int temp = arraylist.get(i);
                    arraylist.set(i, arraylist.get(j));
                    arraylist.set(j, temp);
                }
            }
        }
        return arraylist;
    }


    // sort Array
//    public static int [] sortDescending(int [] arr){
//
//        for (int i = 0; i < arr.length; i++) {
//
//            for (int j = i; j < arr.length; j++) {
//                if (arr[i] < arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        return arr;
//    }

}

/**
 * 29.  ArrayList -- sorting in descending order:  Write a method that can sort the ArrayList in descending order without using the sort method
 */
