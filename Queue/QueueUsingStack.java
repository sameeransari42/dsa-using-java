package Queue;

import java.util.Stack;

// in this Queue using stack add is efficient
public class QueueUsingStack {
    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();

        queue.add(2);
        queue.add(5);
        queue.add(8);

        System.out.println(queue.first);
        System.out.println(queue.remove());
        System.out.println(queue.first);
    }
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item) {
        first.push(item);
    }

    public int remove() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        int ele = second.pop();

        while (!second.isEmpty()) {
            first.push(second.pop());
        }

        return ele;
    }
}

