package practice.loops;

public class PrintEven {
    public static void main(String[] args) {

        String evenNumbers = "";
        for ( int n = 80; n >= 20; n--){
            if (n % 2 == 0){

                evenNumbers += n + " ";




            }
        }

        System.out.print(evenNumbers.trim());
    }
}
