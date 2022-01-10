package practice.String;

import java.util.Scanner;

public class GetSandwich {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();


        if (str.contains("bread")){

            int firstIndexOf = str.indexOf("bread");
            int lastIndexOf = str.lastIndexOf("bread");

            if ( firstIndexOf != lastIndexOf){
                System.out.println(str.substring(firstIndexOf + 5, lastIndexOf));
            } else {
                System.out.println("nothing");
            }



        } else{
            System.out.println("nothing");
        }

       }


    }

