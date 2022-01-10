package day12_if_statements;

public class GreaterNumber {

    public static void main(String[] args) {

        int first = 20;
        int second = 8;
        int third = 10;

        int biggest = 0;

        if(first > second && first > third){
            biggest = first;
        }

        if(second > first && second > third){
             biggest = second;
        }
        if(third > first && third > second){
            biggest = third;
        }

        System.out.println("Our biggest number is: " + biggest);
    }
}
