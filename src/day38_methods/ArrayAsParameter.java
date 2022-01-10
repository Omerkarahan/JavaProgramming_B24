package day38_methods;

public class ArrayAsParameter {

    public static void main(String[] args) {
        int [] a = {1, 4, 5, 1, 4};
        printArray(a);
        System.out.println();
        printArray(1, 2, 3, 4, 6, 7, 9);
        System.out.println();

        String [] str = {"word", "word2", "etc"};
        printArray(str);

        printArray("james", "bond", "007");
    }

    public static void printArray(int ... arr){
        for(int each : arr){
            System.out.println(each);
        }

    }
    public static void printArray(String ... arr){
        for(String each : arr){
            System.out.println(each);
        }
    }





}
