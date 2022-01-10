package practice.statements;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String name = inp.nextLine();
        String result = "";

        switch (name){
            case"Chen":
                result = "teacher";

                break;
            default:
               result = "student";
        }
        System.out.println(result);
    }
}
