package practice.with_eduardo.collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionBasics {

    /**
     * Collection is an interface /
     * / NOTE: Collection takes OBJECTS, NOT PRIMITIVES(int, short, long, double, float) /
     * / WRAPPER CLASS: Integer, Short, Long, Double, Float, Character
     */

    public static void main(String[] args) {
        Integer[] integers = {20, 60, 40, 90};      // array of Integer

        Collection<Integer> numbers = new ArrayList<>(Arrays.asList(integers)); // Collection
        System.out.println(numbers);        // in array format
        // numbers.forEach(number -> System.out.println(number)); // individually
        System.out.println();

        /* boolean add(E e) */
        System.out.println(numbers.add(120));       // true
        System.out.println(numbers);

        /* boolean remove(Object o) */
        System.out.println(numbers.remove(120));    // true
        System.out.println(numbers);

        /* int size() */
        System.out.println(numbers.size());     // 4
        /* boolean contains(Object o) */
        System.out.println(numbers.contains(40));       // true

        /* boolean removeIf(Predicate<? super E> p) */
        numbers.removeIf(number -> number > 50);        // removes 60 and 90
        System.out.println(numbers);

        /*void forEach() */
        System.out.println("\nUsing method inference");
        numbers.forEach(System.out::println);       // method inference

        System.out.println("Using lambda");
        numbers.forEach(number -> System.out.println(number));

        System.out.println("Using enhanced loop");
        // Enhanced loop
        for (Integer each : numbers)
            System.out.println(each);

        /* void clear() */
        numbers.clear();
        System.out.println(numbers);

        /* boolean isEmpty() */
        System.out.println(numbers.isEmpty());  // true
    }
}