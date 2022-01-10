package practice.homework;

import java.util.*;

public class MapSorted {

    public static void main(String[] args) {
      Map<String , Integer > unSortedMap = new HashMap<>();
        unSortedMap.put("Twenty", 20);
        unSortedMap.put("Eight", 8);
        unSortedMap.put("Forty", 40);
        unSortedMap.put("TwentyFive", 25);
        unSortedMap.put("SixtyTwo", 62);
        unSortedMap.put("FortyFive", 45);

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        unSortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).
                forEachOrdered(x-> sortedMap.put(x.getKey(),x.getValue()));
        System.out.println(sortedMap);



       // System.out.println(unSortedMap);



//        Set<Map.Entry<String, Integer>> entrySet = unSortedMap.entrySet();
//        List<Map.Entry<String, Integer>> sortOrder = new ArrayList<>(entrySet);
//        Collections.sort(sortOrder,(Comparator.comparing(Map.Entry::getValue)));
//        sortOrder.forEach(s-> System.out.println(s.getKey()+"\t"+s.getValue()));
    }
}


