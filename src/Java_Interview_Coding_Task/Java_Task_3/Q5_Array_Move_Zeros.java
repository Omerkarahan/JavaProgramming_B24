package Java_Interview_Coding_Task.Java_Task_3;

import java.util.ArrayList;
import java.util.Arrays;

public class Q5_Array_Move_Zeros {
    /**
     * -- Move zeros to the end
     * - Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
     */
    public static void main(String[] args) {
        int[]  arr={0,5,5,0,0,5};
        System.out.println(Arrays.toString(moveZeros(arr)));
    }

    public static int[] moveZeros( int[]  arr ) {

        ArrayList<Integer> list = new ArrayList<>();

        int countZero = 0;

        for(int each: arr) {

            list.add(each);

            countZero+= (each==0)?1:0;

        }



        list.removeAll(Arrays.asList(0));

        arr = new int[arr.length];

        for(int i=0; i <arr.length-countZero; i++ ) {

            arr[i] = list.get(i);

        }

        return arr;

    }


}
