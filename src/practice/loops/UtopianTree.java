package practice.loops;

public class UtopianTree {
    public static void main(String[] args) {
        int growth1 = 0;
        int growth2 = 3;
        for (int i = 1 ; i <= 3 ; i++){
            growth1++;
            System.out.println("year " + i + " - growth " + 1  + " cm");
            System.out.println("tree size: " + i + "cm");
        }
        for ( int n = 4; n <= 10 ; n++){
            growth2 += 2;
            System.out.println("year " +n + " - growth " + 2 + " cm");
            System.out.println("tree size: " + growth2 + "cm");

        }

    }
}
