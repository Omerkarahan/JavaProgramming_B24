package day07_unary_operators;

public class Store {

    public static void main(String[] args) {


        String storeName = "Target";
        int numberOfTVs = 100;

        System.out.println("Person came into the store and bough a tv");
        System.out.println("Number of tvs now: " + --numberOfTVs);

        System.out.println("Person came into the store and bough a tv");
        System.out.println("Number of tvs now: " + --numberOfTVs);

        System.out.println(" Person came into the store and put a tv into the cart");
        System.out.println("Number of tvs in the store is still: " + numberOfTVs--);
        System.out.println("They buy everything and leave " + numberOfTVs);

        System.out.println("Shipment of tvs comes");
     //   numberOfTVs++;
     //   numberOfTVs++;
      //  numberOfTVs++;
          // 47 more lines

        numberOfTVs = numberOfTVs + 53; // reassigned;

        System.out.println("someone with big bucks comes in and buys 5 tvs");
        numberOfTVs = numberOfTVs - 5;





    }
}
