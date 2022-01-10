package Java_Interview_Coding_Task.Java_Task_9;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_SortValue {
    /**
     * 1. Map -- Sort the map by values
     * Write a method that can sort the Map by values
     */
    public static void main(String[] args) {


            Map<String , Integer > unSortedMap = new HashMap<>();
            unSortedMap.put("Twenty", 20);
            unSortedMap.put("Eight", 8);
            unSortedMap.put("Forty", 40);
            unSortedMap.put("TwentyFive", 25);
            unSortedMap.put("SixtyTwo", 62);
            unSortedMap.put("FortyFive", 45);

            Map<String, Integer> sortedMap = new LinkedHashMap<>();
            unSortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(x-> sortedMap.put(x.getKey(),x.getValue()));
            System.out.println(sortedMap);

    }
}
