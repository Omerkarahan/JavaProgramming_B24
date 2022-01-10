package practice.with_eduardo.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapEntryExplained {

    /** Every ENTRY corresponds to interface Entry<K,V>, which is an interface created inside interface Map<K,V> */
    // Because it is created inside the interface, we CANNOT access it directly
    /* Each entry is represented using Map.Entry<K,V> */
    /** entrySet() fetches all entries from the map, creates an empty Set and stores ALL entries in the Set */
    /* Set<Map.Entry<Integer, String>> */

    public static void main(String[] args) {

        Map<Integer, String> languages = new TreeMap<>();
        languages.put(2000, "C#");
        languages.put(2003, "Scala");
        languages.put(1995, "Java");
        languages.put(1983, "C++");
        languages.put(1972, "SQL");
        languages.put(1991, "Python");

        Set<Map.Entry<Integer, String>> setOfEntries = languages.entrySet();
        System.out.println(setOfEntries);

        System.out.println("\nTraverse key-value pairs (entries) using: iterator and a loop");
        /* Traverse key-value pairs (entries) using: iterator and a loop */
        // Iterator<Map.Entry<Integer, String>> iterator = setOfEntries.iterator();
        Iterator<Map.Entry<Integer, String>> iterator = languages.entrySet().iterator();

        while(iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("\nTraverse using enhanced loop");
        /* Traverse key-value pairs (entries) using: enhanced loop */
        for(Map.Entry<Integer, String> entry : languages.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("\nTraverse using forEach function");
        /* Traverse key-value pairs (entries) using: forEach function */
        languages.entrySet().forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));

        System.out.println("\nBEST: Traverse using BiConsumer function of Map interface");
        /* Traverse key-value pairs (entries) using: iterator BiConsumer function of Map interface */
        languages.forEach((key, value) -> System.out.println(key + " - " + value));

        /** New methods since Java 8 */
        System.out.println();
        /* V putIfAbsent(K key, V value) */
        // if the key is present in the map, then do nothing. Otherwise, put the key,value pair in the map
        languages.putIfAbsent(2010, "Rust");        // add the key, value
        System.out.println(languages);
        languages.putIfAbsent(1995, "JavaScript");  // DO NOTHING since the key already exists
        System.out.println(languages);

        /* V getOrDefault(Object key, V dv) */
        // if the specified key is present in the map, returns its value
        // if the specified key is NOT present in the map, return the default value (dv) instead of null
        System.out.println(languages.getOrDefault(2002, "EMPTY"));

        /* V replaceAll(BiFunction<K,V,V>) : Perform operations on 2 values T, U and returns result R */
        languages.replaceAll((key, value) -> value.toUpperCase());
        System.out.println(languages);

        /* V merge(K, V2, BiFunction mapper) */
        // K - Key, V - Value, V2 - sample value of type V, mapper(V, V2) - logic of BiFunction interface
        Map<Integer, String> langs = new TreeMap<>();
        langs.putIfAbsent(2012, "Julia");
        System.out.println(langs);

        langs.forEach((key, value) -> languages.merge(key, value, (v1, v2) -> v1.equals(v2) ? v1 : v2));
        System.out.println(languages);

        langs.forEach((key, value) -> languages.merge(key, value, (v1, v2) -> v1.equals(v2) ? v1 : v2));
        System.out.println(languages);

    }
}
