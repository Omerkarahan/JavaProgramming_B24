package day12_if_statements;

public class CheckNumberMulti {

    public static void main(String[] args) {
        int first = 20;
        int second = 30;
        int third = 10;

        int biggest = 0;

        if(first > second && first > third){
            biggest = first;
        }

         else if(second > first && second > third){
            biggest = second;
        }
        else if(third > first && third > second){
            biggest = third;
        }

        System.out.println("Our biggest number is: " + biggest);

    }
}
