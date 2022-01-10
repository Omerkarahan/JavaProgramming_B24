package day60_collections;

import java.util.HashSet;
import java.util.Set;

public class SetObjects {
    public static void main(String[] args) {

        Set<String> obj = new HashSet<>();
        obj.add(null);
        obj.add("hello");
        obj.add("$4.0");
        obj.add("100");
        obj.add("hello");
        obj.add("%");

        Set<String> obj2 = new HashSet<>();
        obj2.add(null);
        obj2.add("hello");
        obj2.add("$4.0");
        obj2.add("100");
        obj2.add("hello");
        obj2.add("%");

        Set<String> obj3 = new HashSet<>();
      //  obj3.add(null);
        obj3.add("hello");
        obj3.add("$4.0");
        obj3.add("100");
        obj3.add("hello");
        obj3.add("%");
        obj3.add("World");

        System.out.println("HashSet: " + obj);
        System.out.println("LinkedHashSet: " + obj2);
        System.out.println("TreeSet: " + obj3);
        // obj2.get();
    }
}
