package practice;

public class MinNumner {

    public static void main(String[] args) {

        int [] numbers = {20,-5,30,-32,24};

        int min = numbers[0];

        for (int each : numbers){
            if(each < min){
                min = each;
            }

        }
        System.out.println(min);

     }
}
