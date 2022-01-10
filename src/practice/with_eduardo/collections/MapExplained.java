package practice.with_eduardo.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExplained {

    /** Map<K,V> stores data as KEY and VALUE pairs */
    /* DOES NOT inherit methods from the Collection interface */
    // Example: a table with two columns where the first column represent the ID(KEY)
    // and the second column represents the related data (VALUE)

    public static void main(String[] args) {

        /* HashMap<K,V>: KEYS are UNSORTED, UNORDERED, UNPREDICTABLE :: Best Performance */
        Map<Integer, String> studentsMap = new HashMap<>();

        /* V put(K key, V value) adds the specified key/value to the map */
        studentsMap.put(18, "Jack");
        studentsMap.put(15, "Jill");
        studentsMap.put(21, "Adam");
        studentsMap.put(24, "Alexa");
        System.out.println(studentsMap);     // Output displayed in curly brackets

        studentsMap.put(21, "Marie");        // OVERRIDE the VALUE corresponding the KEY
        System.out.println(studentsMap);     // Output displayed in curly brackets

        System.out.println("\nV get(K key) =-> retrieves the VALUE corresponding to the KEY");
        /* V get(K key) retrieves the VALUE corresponding to the KEY when present, otherwise NULL */
        System.out.println(studentsMap.get(24));

        System.out.println("\nV remove(K key) =-> removes the entry that corresponds to the KEY");
        /* V remove(K key) removes the entry that matches the KEY */
        String removedValue = studentsMap.remove(15);      // The value removed is returned
        System.out.println(removedValue);
        System.out.println(studentsMap);

        System.out.println("\nV replace(K key, V newValue) =-> takes the key and updates it with the new value");
        /* V replace(K key, V newValue) takes the key and updates it with the new value */
        // You can also use the put method =-> students.put(24, "Paul")
        String replacedValue = studentsMap.replace(24, "Paul");     // The value replaced is returned
        System.out.println(replacedValue);
        System.out.println(studentsMap);

        /* boolean containsKey(K key) prints true or false */
        System.out.println(studentsMap.containsKey(21));

        /* boolean containsValue(V value) prints true or false  */
        System.out.println(studentsMap.containsValue("Paul"));


        /* int size() : returns the number of key/value pairs in the map */
        System.out.println(studentsMap.size());

        /* boolean isEmpty() */
        System.out.println(studentsMap.isEmpty());

        /* void clear() will delete all the entries */
        studentsMap.clear();
        System.out.println(studentsMap);     // prints empty curly braces

        System.out.println();

        /* TreeMap<K,V>: KEYS are SORTED in ASCENDING order, PREDICTABLE */
        Map<Integer, String> studentTreeMap = new TreeMap<>();
        studentTreeMap.put(21, "Adam");
        studentTreeMap.put(18, "Jack");
        studentTreeMap.put(24, "Alexa");
        studentTreeMap.put(15, "Jill");
        System.out.println(studentTreeMap);     // Output displayed in curly brackets

    }
}
