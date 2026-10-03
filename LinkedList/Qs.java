package LinkedList;

import OOPs.Abstraction.Parent;

public class Qs {
    public Node head;
    public Node tail;
    public int size;


    Qs() {
        this.size = 0;
    }

    Qs merge(Qs first, Qs second) {
        Node f = first.head;
        Node s = second.head;
        Qs ans = new Qs();

        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insert(f.value);
                f = f.next;
            } else {
                ans.insert(s.value);
                s = s.next;
            }
        }

        while (f != null) {
            ans.insert(f.value);
            f = f.next;
        }

        while (s != null) {
            ans.insert(s.value);
            s = s.next;
        }

        return ans;
    }

    void removeDuplicate() {
        Node node = head;
        Node n = head.next;
        while (n != null) {
            if (node.value == n.value) {
                n = n.next;
                node.next = node.next.next;
            }else {
                n = n.next;
                node = node.next;

            }
        }
    }

    // inserting using recursion
   void insertRec(int val, int index) {
        head = insertRec(val, index, head);
   }

   Node insertRec (int val, int idx, Node node) {
        if (idx == 0) {
            Node temp = new Node(val, node);
            return temp;
        }

        node.next = insertRec(val, idx -1, node.next);

        return node;
   }

    void insert(int val) {
        Node node = new Node(val);

        if (head == null) {
            head = node;
            tail = node;
            size++;
            return;
        }

        tail.next = node;
        tail = node;
        size++;
    }

    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public class Node {
        int value;
        Node next;


        Node(int val) {
            this.value = val;
        }

        Node (int val, Node node) {
            this.value = val;
            this.next = node;
        }
    }
}
