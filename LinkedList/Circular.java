package LinkedList;

public class Circular {
    public Node head;
    public Node tail;

    void deleteNode(int val) {
        Node node = head;

        if (node == null) {
            return;
        }

        if (node.value == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.value == val) {
                node.next = n.next;
                return;
            }

            node = node.next;
        } while (node != head);
    }

    public Node getNode(int val) {
        Node node = head;

        if (node != null) {
            while (node != head) {
                if (node.value == val) {
                    return node;
                }

                node = node.next;
            }
        }
        return node;
    }

    void insert(int val) {
        Node node = new Node(val);


        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    void display() {
        Node temp = head;

        if (temp != null) {
            do {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            } while (temp != head);
        }

        System.out.println("END");
    }

    public class Node {
        public int value;
        public Node next;

        Node(int val) {
            this.value = val;
        }

        Node(int val, Node next) {
            this.value = val;
            this.next = next;
        }
    }
}
