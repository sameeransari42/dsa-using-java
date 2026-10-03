package Stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public int peek() throws StackException{
        if (isEmpty()) {
            throw new StackException("Can't get the head item bcz array is empty.");
        }

        return data[ptr];
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException{
        if (isEmpty()) {
            throw new StackException("Can't pop item from an empty arry");
        }
        int item = data[ptr];
        return data[ptr--];
    }

    public boolean isFull() {
        return ptr == data.length - 1; // ptr at the last index
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}
