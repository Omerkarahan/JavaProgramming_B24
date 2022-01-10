package day27_nested_loops;

public class NestedLoopExample {

    public static void main(String[] args) {

        // print hello world 5 times
        // print hello universe 1 time
        // print hello world 5 times
        // print hello universe 1 time

        for(int j = 0; j < 3;  j ++){ // j = 0

            for( int i = 0; i < 5; i++){ // i = 0

                System.out.println("Hello world | j: " + j + " i:" + i );
            }
            System.out.println("Hello universe\n");
        }




//        for( int i = 0; i < 5; i++) {
//
//            System.out.println("Hello world");
//        }
//        System.out.println("Hello universe");
//
//        for( int i = 0; i < 5; i++) {
//
//            System.out.println("Hello world");
//        }
//        System.out.println("Hello universe");
    }
}
