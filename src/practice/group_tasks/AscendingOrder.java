package practice.group_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class AscendingOrder {
    /*
    Write a method that can sort the ArrayList in Ascending order without using the sort method.

     */
    public static void main(String[] args) {

        ArrayList<Integer> elements = new ArrayList<>(Arrays.asList(2, 5 ,23, 45, 8, 6, 10, 21));

        for( int i = 0; i < elements.size(); i++){
            for ( int j = i ; j < elements.size(); j++){
                if( elements.get(i) > elements.get(j)){
                    int temp = elements.get(i);
                    elements.set(i, elements.get(j));
                    elements.set(j, temp);
                }
            }
        }
        System.out.println(elements);
    }
}
