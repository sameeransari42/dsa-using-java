package LinkedList;

import OOPs.Abstraction.Parent;
import OOPs.Abstraction.Son;

public class Doubly {
    public Node head;

    void insertAfterValue(int after, int val) {
        Node node = new Node(val);

        if (head == null) {
            insertFirst(val);
            return;
        }

        Node get = getNode(after);

        node.prev = get;

        if (get.next != null) {
            get.next.prev = node;
            node.next = get.next;
        }else  {
            node.next = null;
        }

        get.next = node;

    }

    public Node getNode(int val) {
        Node temp = head;

        while (temp != null) {
            if (temp.value == val) {
                return temp;
            }
            temp = temp.next;
        }

        return temp;
    }

    void insertLast(int val) {
        Node node = new Node(val);

        Node last = head;

        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        node.next = null;
    }

    void insertFirst(int val) {
        Node node = new Node(val);

        node.next = head;
        node.prev = null;

        if (head != null) {
            head.prev = node;
        }
        head = node;

    }

    public class Node {
        public int value;
        public Node next;
        public Node prev;

        Node (int val) {
            this.value = val;
        }

        Node (int val, Node next, Node prev) {
            this.value = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.value + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");
        while (last != null) {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("END");
    }
}

