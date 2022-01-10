package practice.with_eduardo.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExplained {

    /** The Queue<E> interface uses the FIFO (First In First Out) principle */
    /** NOTE: Use Queue ONLY when you need to access data from the BEGINNING("HEAD") of the queue */
    /** NOTE: It is implemented using the LinkedList<>() because it works with pointers */
    /* Data is NOT SORTED, allows DUPLICATES and NULL values */
    /* Every Queue has a START("HEAD") and an END("TAIL").
        =-> Data is ALWAYS ADDED to the END of the Queue<E>
        =-> Data is ALWAYS REMOVED from the START("HEAD") of the Queue<E> */

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        /* boolean offer(E e) */
        // =-> if data is added to the queue, it returns true otherwise false
        queue.offer(10);        // returns true when the element is added successfully, otherwise false
        System.out.println(queue.offer(30));
        queue.offer(50);
        queue.offer(20);
        queue.offer(80);
        queue.offer(20);
        System.out.println(queue);

        /* boolean add(E e) */
        queue.add(60);
        System.out.println(queue);
        // =-> if data is added to the queue, it returns true otherwise it throws an Exception and crashes the program

        /** NOTE: if the queue is empty, return null */
        /* E poll() : gets the element from the HEAD position. Then, deletes it from the queue */
        int polledNumber = queue.poll();
        System.out.println(polledNumber);
        System.out.println(queue);

        System.out.println();
        /* E peek() : gets the element from the HEAD position. It doesn't modify the queue */
        int peekNumber = queue.peek();
        System.out.println(peekNumber);
        System.out.println(queue);


        System.out.println();
        /** NOTE: if the queue is empty, it generates NoSuchElementException and crashes the program */
        /* E remove() : get the element from the HEAD position. Then, deletes it from the queue */
        int removedNumber = queue.remove();
        System.out.println(removedNumber);
        System.out.println(queue);

        /* E element() : gets the element from the HEAD position. It doesn't modify the queue */
        int getElement = queue.element();
        System.out.println(getElement);
        System.out.println(queue);
    }
}