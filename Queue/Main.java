package Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);

        queue.insert(12);
        queue.insert(17);
        queue.insert(23);
        queue.insert(29);
        queue.insert(31);
        queue.insert(35);

        System.out.println(queue.remove());
        queue.display();
    }
}
