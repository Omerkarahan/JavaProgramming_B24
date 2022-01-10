package practice.with_eduardo.set;

import java.util.*;

public class SetExplained {

     // Set does NOT allow DUPLICATES and allows ONLY ONE Null
     // HashSet<E>, LinkedHashSet<E>, TreeSet<E>
     // Java uses the equal() and hashCode() methods to compare elements

     static Collection<Integer> numbers;
     static Integer[] integers = {10, 5, 30, 20, 30, 5, 10, 80};

     public static void main(String[] args) {
     System.out.println("Original array: " + Arrays.toString(integers));
     System.out.println();

     // HashSet<E>: UNSORTED, UNORDERED, UNPREDICTABLE :: Best Performance
     // numbers = new HashSet<>(List.of(10, 30, 20, 30));
     numbers = new HashSet<>(Arrays.asList(integers));
     System.out.println("HashSet<E>: " + numbers +
     " =-> UNSORTED, UNORDERED, output is UNPREDICTABLE : Best Performance");

     // LinkedHashSet<E> : UNSORTED, ORDERED by INSERTION, PREDICTABLE :: Slower
     numbers = new LinkedHashSet<>(Arrays.asList(integers));
     System.out.println("LinkedHashSet<E>: " + numbers +
     " =-> UNSORTED, ORDERED by INSERTION, PREDICTABLE :: Slower");

     // TreeSet<E> : SORTED, ORDERED (Ascending), PREDICTABLE :: Slowest
    numbers = new TreeSet<>(Arrays.asList(integers));
        System.out.println("TreeSet<E>: " + numbers +
            " =-> SORTED, ORDERED (Ascending), PREDICTABLE :: Slowest");
}
}
