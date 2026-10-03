package Queue;

import OOPs.Abstraction.Parent;

public class CustomQueue {
    protected int[] data;
    int ptr = 0;
    private static final int DEFAULT_SIZE = 10;
        CustomQueue() {
        this(DEFAULT_SIZE);
    }

    CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
            return ptr == data.length;
    }

    public boolean isEmpty() {
            return ptr == 0;
    }

    public boolean insert(int item) {
            if (isFull()) {
                int[] temp = new int[data.length * 2];
                for (int i = 0; i < data.length; i++) {
                    temp[i] = data[i];
                }

                data = temp;
            }

            data[ptr++] = item;
            return true;
    }

    public int remove() throws Exception{
            if (isEmpty()) {
                throw new Exception("Queue is empty");
            }

            int removed = data[0];

            for (int i = 1; i < ptr; i++) {
            data[i -1] = data[i];
            }
            ptr--;

            return removed;
    }

    public int front() throws Exception {
            if (isEmpty()) {
                throw new Exception("Queue is empty");
            }

            return data[0];
    }

    public void display() throws Exception{
            if (isEmpty()) {
                throw new Exception("Queue is empty");
            }

        for (int item : data) {
            System.out.print(item + " -> ");
        }
        System.out.println("END");
    }
}
