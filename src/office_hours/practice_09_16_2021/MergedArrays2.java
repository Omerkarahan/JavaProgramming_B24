package office_hours.practice_09_16_2021;

import java.util.Arrays;

public class MergedArrays2 {
    /*

            {1, 2, 3 }
            {10, 20, 30}

            second case:
              output: 1, 10, 2, 20, 3, 30
     */

    public static void main(String[] args) {

        int[] arrOne = {1, 2, 3, 4};
        int[] arrTwo = {10, 20, 30};

        int mergedLength = arrOne.length + arrTwo.length;

        int[] merge = new int[mergedLength]; // 1,

        int j = 0;
        for(int i = 0; i < merge.length; i++){ // this loop goes through the merge array

                merge[i] = arrOne[j];

                merge[i] = arrTwo[j];




        }

    }
}