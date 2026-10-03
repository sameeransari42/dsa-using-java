package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.pop());

        System.out.println(stack.first);
    }
    private Queue<Integer> first;
    private Queue<Integer> second;

    StackUsingQueue() {
        first = new LinkedList<>();
        second = new LinkedList<>();
    }

    public void push(int item) {
        while(!first.isEmpty()) {
            second.add(first.remove());
        }

        first.add(item);

        while (!second.isEmpty()) {
            first.add(second.remove());
        }
    }

    public int pop() {
        return first.remove();
    }

    public boolean empty() {
        return first.isEmpty();
    }
}
