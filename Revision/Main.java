package Revision;

public class Main {
    private class Node {
        private int value;
        private Node next;

        Node(int val) {
            this.value = val;
        }

        Node(int val, Node next) {
            this.value = val;
            this.next = next;
        }
    }
}
