package practice.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListAscending {
    public static void main(String[] args) {

        // arraylist ascending order  { 1, 2, 3, 4}

        ArrayList<Integer> elements = new ArrayList<>(Arrays.asList(5, 23, 8, 40, 10, 7, 3));

        for( int i = 0; i < elements.size(); i++){
            for(int j = i; j< elements.size(); j++){
                if( elements.get(i) > elements.get(j)){
                    int temp = elements.get(i);
                    elements.set(i,elements.get(j));
                    elements.set(j, temp);
                }
            }
        }

        System.out.println(elements);
    }
}