package Stack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws StackException {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.pop());

        System.out.println(stack);


        Queue<Integer> queue = new LinkedList<>();

        queue.add(2);
        queue.add(4);
        queue.add(6);
        queue.add(8);

        System.out.println(queue);
        System.out.println(queue.remove());
//        System.out.println(queue.peek());
    }
}
