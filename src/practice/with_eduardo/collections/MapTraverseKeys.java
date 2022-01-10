package practice.with_eduardo.collections;

import java.util.*;

public class MapTraverseKeys {

    /** Set<K> keySet() fetches all KEYS from the map, creates an empty Set<K> and stores all the keys */
    /** Collection<V> values() fetches all VALUES creates an empty Collection<V> and stores all the values */

    public static void main(String[] args) {

        Map<Integer, String> languages = new HashMap<>();
        languages.put(2000, "C#");
        languages.put(2003, "Scala");
        languages.put(1995, "Java");
        languages.put(1983, "C++");
        languages.put(1972, "SQL");
        languages.put(1991, "Python");

        /** NOTE: TRAVERSE ONLY KEY or VALUES, NOT BOTH */
        System.out.println("\nUsing Iterator and a loop");
        /* Traverse using: Iterator and a loop */
        Iterator<Integer> iteratorKey = languages.keySet().iterator();
        while(iteratorKey.hasNext()){
            System.out.println(iteratorKey.next());
        }

        System.out.println();
        Iterator<String> iteratorValues = languages.values().iterator();
        while(iteratorValues.hasNext()) {
            System.out.println(iteratorValues.next());
        }

        System.out.println("\nUsing Enhanced for loop");
        /* Traverse using: Enhanced for loop */
        // Set<Integer> setOfKeys = languages.keySet();
        for(Integer eachKey : languages.keySet())
            System.out.println(eachKey);

        System.out.println();
        // Collection<String> collectionValues = languages.values();
        for(String eachValue : languages.values())
            System.out.println(eachValue);

        System.out.println("\nUsing forEach function");
        /* Traverse using: forEach(Consumer<T>) of Collection<E> */
        languages.keySet().forEach(System.out::println);
        System.out.println();
        languages.values().forEach(System.out::println);

    }
}
