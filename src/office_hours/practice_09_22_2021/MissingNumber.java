package office_hours.practice_09_22_2021;

import com.sun.jmx.snmp.SnmpUnknownMsgProcModelException;

import java.util.Arrays;

public class MissingNumber {

        /*

        get an array of numbers

        [ 1, 2, 4, 5, 6, 7, 8, 9 ]

        find the missing number

        -> 3
         */

        public static void main(String[] args) {
            System.out.println(findMissingNumber(5, 4, 6, 9, 1, 2, 3, 8)); //System.out.println(findMissingNumber(a));


        }
        public static int findMissingNumber(int ... nums){

            Arrays.sort(nums);
            int checking = 1;

            for (int each : nums){

                if(checking != each){
                    break;
                }
                checking++; // update checking number every iteration
            }
            return checking;
        }

    }

