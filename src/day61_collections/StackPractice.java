package day61_collections;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>(); //LIFO
        stack.push("a");
        stack.push("b");
        stack.push("c");
        System.out.println(stack);

        System.out.println("At the top of my stack: " + stack.peek());

        stack.pop();
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);


    }
}

