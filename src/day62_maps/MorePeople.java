package day62_maps;

import java.util.HashMap;

public class MorePeople {
    public static void main(String[] args) {

        HashMap<Integer, Person> map = new HashMap<>();

        map.put(10, new Person("James"));

        Person person2 = new Person("Elmira");
        person2.age = 21;
        person2.favoriteHobby = "java";

        map.put(11, person2);

        System.out.println(map);

        map.get(10).age = 50;
        map.get(10).favoriteHobby = "Selenium";

        System.out.println(map);
    }
}
