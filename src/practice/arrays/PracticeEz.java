package practice.arrays;

import java.util.Arrays;

public class PracticeEz {
    public static void main(String[] args) {
        String[] carBrands = {"Honda", "Mazda", "BMW", "Honda", "Mercedes"};

        System.out.println(Arrays.toString(carBrands));
        System.out.println(carBrands.length);       // length of a array
        System.out.println(carBrands[0].length());  // length of a string

        System.out.println(carBrands[0].equals(carBrands[2]));  // false
        boolean comparing = carBrands[0].equals(carBrands[3]);  // true
        System.out.println(comparing);

        System.out.println(carBrands[0].substring(1));
        System.out.println(carBrands[0].substring(1, 3));

        System.out.println(carBrands[0].substring(1, 3).toUpperCase());
        System.out.println(carBrands[4].substring(1, 5).startsWith("e"));
        System.out.println(carBrands[4].substring(1, 5).startsWith("c",2));

        System.out.println();
        System.out.println(carBrands[4].contains("d"));
        System.out.println(carBrands[4].contains("erc"));

        // String[] carBrands = {"Honda", "Mazda", "BMW", "Honda", "Mercedes"};
        String[] strings = carBrands[1].split("");
        char[] characters = carBrands[1].toCharArray();

        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(characters));

        System.out.println(carBrands[1].replace('a', 'b'));
        System.out.println(carBrands[1]);       // doesn't reassign by default
        char[] something = {'d', 'z', 'e', 'a'};
        Arrays.sort(something);
        System.out.println(Arrays.toString(something));

        String[] someArray = new String[] {"something", "anything", "sometimes"};

        System.out.println(someArray.length);
        System.out.println(Arrays.toString(someArray));

        int[] numbers = new int[5];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        System.out.println(Arrays.toString(numbers));


        String str = "something";
        String str1 = str;
        String str2 = new String("anything");

        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);

        System.out.println();
        str = "whatever";
        System.out.println(str);        // something        // whatever
        System.out.println(str1);       // something        // something
        System.out.println(str2);       // anything         // anything

        str = str2;
        System.out.println(str);
    }

}
