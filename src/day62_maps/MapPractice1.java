package day62_maps;

import java.util.HashMap;

public class MapPractice1 {
    public static void main(String[] args) {

        HashMap< Integer , String  > map = new HashMap<>();
        //         < Key , Value >
       // map.add() maps dont have add method, because they don't inherit Collection interface
        map.put(1,"Leo");
        map.put(2, "Syeda");
        map.put(3, "Guney");

        System.out.println(map);

      // how can you read from a map?

        String name = map.get(2);  // this is Not index 2. it is key 2
        System.out.println(name);

        map.put(1 , "Fuat");  // value get updated , original value was "Leo" now it updated to "Fuat"

        System.out.println(map);



    }
}
