/***
 * Package
 * Import
 * Class
 */
// import java.util.Arrays; java is   a package , util is a subpackage, Arrays is a class

package practice.with_eduardo;

public class Test {
    public static void main(String[] args) {

        Object obj = "something"; // Object top of everything in java. U can creat all datatypes with Object
        Object obj2 = 123;
        Object obj3 = true;

        Object [] strObjects = {"something", "everything"};

        String str = "Hello World";
                    //01234
        System.out.println(str);
        System.out.println(str.length());

        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i));
        }

        System.out.println();
        System.out.println(str.substring(0,5));

        String str2 = "Hello";
        String str3 = "Hello";

        System.out.println(str2.contains(str3));

        String str4 = "      something     ";
        System.out.println(str4);
        System.out.println(str4.length());
        System.out.println(str4.trim().length()); // not assigned
        System.out.println(str4);
        String str5 = str4.trim(); //reassigning str4 with no empty spaces
        System.out.println(str5);

        //Hello
        System.out.println(str.indexOf("l"));
        System.out.println(str.lastIndexOf("l"));
        System.out.println(str.indexOf("World"));
        System.out.println(str.indexOf("W-orld"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        System.out.println(str.contains("Hello"));

        // HELLO WORLD

        System.out.println();
        int i = 1;
        do {
            System.out.println("Iteration " + i + "\t\t" + str);
            i++;
        } while (i < 6);

        System.out.println();
        for(int x = 1; x < 6 ; x++){
            System.out.println("Iteration " + x + "\t\t" + str);
        }
        System.out.println();
        int k = 1;
        while (k < 6 ) {
            System.out.println("Iteration " + k + "\t\t" + str);
            k++;
        }
        System.out.println();
        int [] numbers = {20, 30, 50, 60};
        System.out.println(numbers.length);
        for (int number : numbers){
            System.out.println(number);
        }

        System.out.println();
        for (int a = 0; a < numbers.length; a++){
            if(numbers[a] == 50){
                continue;
            }
            System.out.println(numbers[a]);
        }
        System.out.println();
        for (int a = 0; a < numbers.length; a++){
            if(numbers[a] == 50){
                break;
            }
            System.out.println(numbers[a]);
        }

        System.out.println();

        int intNumber = 32;
        double doubleNumber = 53.8;

        int castDoubleNumber = (int)doubleNumber;
        System.out.println(castDoubleNumber);
    }
}
