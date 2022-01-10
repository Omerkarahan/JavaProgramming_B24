package practice.with_eduardo.collections;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExplained {

    /** The Deque<E> interface is a double-ended queue */
    /* Data can be ADDED and REMOVED from the HEAD or TAIL of the deque */
    /* DATA is NOT SORTED. The Deque allows DUPLICATES and NULL values */
    // Example: A ticket counter system: A B C D

    public static void main(String[] args) {
        // A Class can implement a queue ONLY if there is a parent-child relationship
        Deque<Integer> deque = new LinkedList<>();

        /* void addFirst(E e) : throws an Exception on failure */
        deque.addFirst(20);

        /* void addLast(E e) : throws an Exception on failure */
        deque.addLast(10);

        /* boolean offerFirst(E e): returns false on failure */
        deque.offerFirst(50);

        /* boolean offerLast(E e): return false on failure */
        deque.offerLast(5);

        System.out.println(deque);
        System.out.println();

        /* E pollFirst() : get the element from the HEAD of the deque. Then, deletes it */
        int polledFirst = deque.pollFirst();
        System.out.println(polledFirst);
        System.out.println(deque);

        /* E pollLast() : gets the element from the TAIL of the deque. Then, delete it */
        int polledLast = deque.pollLast();
        System.out.println(polledLast);
        System.out.println(deque);

        System.out.println();

        /* E peekFirst() : gets the element from the HEAD of the deque. It doesn't modify the deque */
        int peekFirst = deque.peekFirst();
        System.out.println(peekFirst);
        System.out.println(deque);

        /* E peekLast() : gets the element from the TAIL of the deque. It doesn't modify the deque */
        int peekLast = deque.peekLast();
        System.out.println(peekLast);
        System.out.println(deque);
    }
}
