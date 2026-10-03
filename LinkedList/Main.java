package LinkedList;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int[] freq = new int[arr.length * arr.length];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]] = arr[i];
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
