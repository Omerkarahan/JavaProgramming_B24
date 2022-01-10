package practice.homework;

import java.util.*;

public class MinValue {
public static int minValue(Map<String, Integer> map) {
    SortedSet<Integer> sm = new TreeSet<>(map.values());
    return sm.first();
}

    public static void main(String[] args) {
    Map<String ,Integer> map = new HashMap<>();
         map.put("twenty", 20);
        map.put("twelve", 12);
        map.put("three", 3);
        map.put("six", 6);
        System.out.println(map);
        System.out.println("minValue(map) = " + minValue(map));
    }




}
