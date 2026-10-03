package Queue;

public class CircularMain {
    public static void main(String[] args) throws Exception{
        CircularQueue queue = new CircularQueue(5);

        queue.insert(12);
        queue.insert(19);
        queue.insert(22);
        queue.insert(25);
        queue.insert(29);
//        queue.insert(32);

        queue.display();
    }
}
