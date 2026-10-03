package Stack;

public class ImplementUsingLL {
    private Node head;
    private Node tail;

    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public void push(int value) {
        Node node = new Node(value);

        if (head == null) {
            head = node;
        } else {
            tail.next = node;
        }

        tail = node;
    }

    public int pop() {
        if (head == null) {
            System.out.println("Stack is empty");
            return -1;
        }

        int poppedValue;

        if (head == tail) {
            poppedValue = head.value;
            head = null;
            tail = null;
        } else {
            Node temp = head;

            while (temp.next != tail) {
                temp = temp.next;
            }

            poppedValue = tail.value;
            tail = temp;
            tail.next = null;
        }

        return poppedValue;
    }

    public int peek() {
        if (tail == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return tail.value;
    }

    public boolean empty() {
        return head == null;
    }
}
