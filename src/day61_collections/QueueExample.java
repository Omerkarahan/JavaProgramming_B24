package day61_collections;

import java.util.PriorityQueue;

public class QueueExample {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(2);
        queue.add(10);
        queue.add(8);
        queue.add(1);
        System.out.println(queue);

        System.out.println(queue.peek());

        System.out.println(queue.poll());
        System.out.println(queue);

        //System.out.println(new PriorityQueue<>().remove());
        System.out.println(new PriorityQueue<>().poll()); // returns null

    }
}
