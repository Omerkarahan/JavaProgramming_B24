package office_hours.practice_09_16_2021;

import java.util.Arrays;

public class MergeArrays {

    /*

            {1, 2, 3 }
            {10, 20, 30}

            first case:
              output: 1, 2, 3, 10, 20, 30
     */

    public static void main(String[] args) {

        int [] arrOne =  {1, 2, 3, 4};
        int [] arrTwo =  {10, 20, 30};

        int mergedLength = arrOne.length + arrTwo.length;

        int [] merged = Arrays.copyOf(arrOne, mergedLength);

        int index = arrOne.length;

        for(int num : arrTwo){
            merged[index++] = num;
        }

        System.out.println(Arrays.toString(merged));

        merged[3] = 100;
        merged[4] = 200;
    }
}
