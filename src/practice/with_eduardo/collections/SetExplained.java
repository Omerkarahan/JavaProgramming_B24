//package practice.with_eduardo.collections;
//
//import java.util.*;
//
//public class SetExplained {
//
//    /** Set does NOT allow DUPLICATES */
//    /* HashSet<E>, LinkedHashSet<E>, TreeSet<E> */
//    // Java uses the equal() and hashCode() methods to compare elements
//
//    static Collection<Integer> numbers;
//    static Integer[] integers = {10, 30, 20, 30};
//
//    public static void main(String[] args) {
//
//        /* HashSet<E>: UNSORTED, UNORDERED, UNPREDICTABLE :: Best Performance */
//        numbers = new HashSet<Integer>(Arrays.asList(10, 30, 20, 30));
//        System.out.println("HashSet<E>: " + numbers +
//                " =-> UNSORTED, UNORDERED, UNPREDICTABLE :: Best Performance");
//
//        /* LinkedHashSet<E>: UNSORTED, ORDERED by INSERTION, PREDICTABLE :: Slower */
//        numbers = new LinkedHashSet<>(List.of(integers));
//        System.out.println("LinkedHashSet<E>: " + numbers +
//                " =-> UNSORTED, ORDERED by INSERTION, PREDICTABLE :: Slower");
//
//        /* TreeSet<E>: SORTED, ORDERED (Ascending), PREDICTABLE :: Slowest */
//        numbers = new TreeSet<>(List.of(integers));
//        System.out.println("TreeSet<E>: " + numbers +
//                " =-> SORTED, ORDERED (Ascending), PREDICTABLE :: Slowest");
//    }
//}
