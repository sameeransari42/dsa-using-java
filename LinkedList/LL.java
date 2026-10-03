package LinkedList;

public class LL {

    public Node head;
    public Node tail;
    public int size;

    public LL () {
        this.size = 0;
    }

    public int deleteByIdx(int idx) {

        if (idx == 0) {
            deleteFirst();
        }

        if (idx == size) {
            deleteLast();
        }

        Node temp = head;

        for (int i = 0; i < idx-1; i++) {
            temp = temp.next;
        }

        int val = temp.next.value;

        temp.next = temp.next.next;

        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            deleteFirst();
        }

        Node node = get(size-2);

        int val = tail.value;

        tail = node;
        tail.next = null;
        size--;

        return val;
    }

    public Node get(int idx) {

        Node node = head;

        for (int i = 0; i < idx; i++) {
            node = node.next;
        }

        return node;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;
        return val;
    }

    public void insert(int val, int idx) {

        if (idx == 0) {
            insertFirst(val);
        }

        if (idx == size) {
            insertLast(val);
        }
        Node temp = head;

        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;

    }


    public void insertLast(int val) {
        Node node = new Node(val);
        if (tail == null){
            insertFirst(val);
            return;
        }
        
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);

        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;

    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");

    }

    public class Node {

        private int value;
        private Node next;
        private int idx;


        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }
}
