package day61_collections;

import java.util.Stack;

public class StackPractice2 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(20);
        stack.add(50);
        stack.add(100);
        stack.add(80);

        System.out.println(stack.peek());
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
    }

}
/*
To summarize we can put I notes just function is almost same, but since we want to emphasize that we are using Stack we should use push method
The difference functionality is returns types too actually, the add method from collections return boolean but push method returns object
 */