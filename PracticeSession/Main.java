package PracticeSession;


import LinkedList.LL;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(5);
//        list.insertLast(10);
//        list.insertLast(15);
//        list.insertLast(20);
//        list.insertLast(25);

        list.display();

//        list.deleteByIdx(2);
        list.deleteByIdx(0);

        list.display();

    }
}
