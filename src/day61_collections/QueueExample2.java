package day61_collections;



import java.util.ArrayDeque;

public class QueueExample2 {
    public static void main(String[] args) {

        ArrayDeque<String> obj = new ArrayDeque<>();
        obj.offer("z");
        obj.offer("hello");
        obj.offer("turkey");
        System.out.println(obj);

        System.out.println(obj.peek()); // element()

        System.out.println(obj.poll()); // remove
        System.out.println(obj);
        //obj.offer(null); cannot store null in queues

        obj.addFirst("birds");

        obj.addLast("water");
        System.out.println(obj);
    }


}
