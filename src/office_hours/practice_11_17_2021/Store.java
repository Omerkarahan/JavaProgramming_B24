package office_hours.practice_11_17_2021;

import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {

        // All possible references of a TShirt object

        TShirt shirt1 = new TShirt();
        shirt1.wear();

        Clothes shirt2 = new TShirt();
        shirt2.wear();

        Object shirt3 = new TShirt();
        // shirt3.wear(); invalid because object class does not have wear method

        //HasHood shirt4 = new TShirt(); not valid because Tshirt class does not implement the HasHood interface

        buy(shirt1);
        buy(shirt2);

        // All possible reference of jacket objects

        Jacket jacket1 =  new Jacket();
        jacket1.wear();
        jacket1.putOnHood();

        Clothes jacket2 = new Jacket();
        jacket2.wear();

        // lines 32 is the same as 34 + 35
        ((Jacket)jacket2).putOnHood();

        Jacket jacket2_5 = (Jacket)jacket2;
        jacket2_5.putOnHood();

        HasHood jacket3 = new Jacket();
       // jacket3.wear(); HasHood method nothing to do with wear(); method
        ((Jacket)jacket3).wear();
        jacket3.putOnHood();

        buy(jacket1);
        buy(jacket2);
        buy((Jacket)jacket3);

        ArrayList<Clothes> list = new ArrayList<>();
        list.add(shirt1);
        list.add(shirt2);
        //list.add((Jacket)shirt3);
        list.add(jacket1);
        list.add(jacket2);

        for(Clothes each : list){
            each.wear();
        }


//        double d = 4.5;
//        int i =(int)d; // d is the still the same
    }

    public static void buy(Clothes item){

    }
}
