package practice.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistDescending {
    public static void main(String[] args) {

        ArrayList<Integer> descendingOrder = new ArrayList<>(Arrays.asList(23,5,46,92,9,11,83));

        for(int i = 0; i < descendingOrder.size(); i++){
            for(int j = i +1; j < descendingOrder.size(); j++){
                if (descendingOrder.get(i) < descendingOrder.get(j)){
                    Integer temp = descendingOrder.get(i);
                    descendingOrder.set(i,descendingOrder.get(j));
                    descendingOrder.set(j, temp);
                }
            }
        }
        System.out.println(Arrays.asList(descendingOrder));
    }
}
