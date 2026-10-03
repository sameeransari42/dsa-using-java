package Queue;

import java.util.Stack;

// Here remove is efficient.
public class QueueUsingStackRemove {
    public static void main(String[] args) {
        QueueUsingStackRemove queue = new QueueUsingStackRemove();

        queue.add(3);
        queue.add(6);
        queue.add(9);

        System.out.println(queue.first);
        System.out.println(queue.remove());
    }
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStackRemove() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public int remove() {
        return first.pop();
    }

    public void add(int item) {

        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        first.push(item);

        while (!second.isEmpty()) {
            first.push(second.pop());
        }

    }

}
