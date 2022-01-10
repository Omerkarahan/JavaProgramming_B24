package office_hours.practice_10_21_2021;

public class Store {
    public static void main(String[] args) {


        WaterBottle bottle = new WaterBottle("ice mountain", 16);
       // bottle.brand
        System.out.println(bottle.getBrand());
        System.out.println(bottle.getOunces());

        bottle.setOunces(20);

        System.out.println(bottle.getOunces());

        System.out.println(bottle.getOunces());
        bottle.setBrand(null);  // bottle.brand = null;
        bottle.setBrand("");

        System.out.println(bottle.getBrand());
    }
}
