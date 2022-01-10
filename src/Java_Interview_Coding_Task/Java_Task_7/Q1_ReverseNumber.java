package Java_Interview_Coding_Task.Java_Task_7;

public class Q1_ReverseNumber {
    /**
     * Number-- Reverse negative number
     */

    public static void main(String[] args) {
        int testedNumber =-123;
        System.out.println("testedNumber = " + testedNumber);

        if(testedNumber<0){
            System.out.println(reverseNegative(testedNumber));
        }else{
            System.out.println("Number must be negative");
        }
    }

    public static int reverseNegative (int number){

        String reversedNumber ="";
        String numberToString =String.valueOf(number);//?
        for(int i=numberToString.length()-1;i>0;i--){
            reversedNumber+=numberToString.charAt(i);

        }
        return -Integer.parseInt(reversedNumber);




    }


    }


