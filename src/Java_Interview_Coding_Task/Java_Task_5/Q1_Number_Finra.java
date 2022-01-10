package Java_Interview_Coding_Task.Java_Task_5;

public class Q1_Number_Finra {
    /**
     * Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
     * print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number.
     * for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
     */

    public static void main(String[] args) {
        checkMultiple();
    }
        public static void checkMultiple(){
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                System.out.print("FIN "+i+ " ");
            }
            if (i % 5 == 0) {
                System.out.print("RA "+i+ " ");
            }
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print("FINRA "+i+ " ");
                }


            }
        }

}






