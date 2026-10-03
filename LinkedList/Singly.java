package LinkedList;

public class Singly {

    private Node head;
    private Node tail;

    public int size;

    Singly(){
        this.size = 0;
    }

    class Node {
        private int value;
        private Node next;

        Node (int value){
            this.value  = value;
        }

        Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    //insert in middle
    public void insert(int idx, int val) {
        Node temp = head;
        for (int i = 0; i < idx-1; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);

        temp.next = node;
    }
    // All operations
    public int delete(int index){
        if (index == 0){
            return deleteFirst();
        }
        
        if (index == size -1){
            return deleteLast();
        }

        Node pre = getNode(index -1);
        int val = pre.next.value;

        pre.next = pre.next.next;

        return val;
    }
    Node findNode(int value){
        Node node = head;

        while (node != null){
            if (node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    int findNodeIdx(int value){
        Node node = head;

        for (int i = 1; i < size; i++) {
            node = node.next;
            if (value == node.value){
                return i;
            }
        }
        return -1;
    }

    int deleteLast(){
        if (size <= 1){
            return deleteFirst();
        }

        Node secondLast = getNode(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;

        return val;
    }

    Node getNode(int index){
        Node node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    int deleteFirst(){
        int val = head.value;

        head = head.next;
        if (head == null){
            tail = null;
        }
        size--;
        return val;
    }

//    public void insert(int val, int index){
//        if (index == 0){
//            insertFirst(val);
//            return;
//        }
//
//        if (index == size){
//            insertLast(val);
//        }
//
//        Node temp = head;
//
//        for (int i = 1; i < index; i++) {
//            temp = temp.next;
//        }
//
//        Node node = new Node(val, temp.next);
//        temp.next = node;
//        size++;
//    }

    void insertFirst(int val){
        if (tail == null){
             tail = head;
        }

        Node node = new Node(val);

        node.next = head;
        head = node;
        size++;
    }

    void insertLast(int val){
        if (tail == null){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);

        tail.next = node;
        tail = node;
        size++;
    }

    void display(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("End");
    }
}
