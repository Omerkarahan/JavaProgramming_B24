package practice.loops;

import java.util.Scanner;

public class CatsAndDogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();




            for (int n = 0; n < word.length() -2; n++){
                if (word.substring(n,n+3).equalsIgnoreCase("cat")){
                    countOfCats++;
                }  else if (word.substring(n,n+3).equalsIgnoreCase("dog")){
                    countOfDogs++;
                }
            }


        System.out.println(countOfCats == countOfDogs);



    }
}
