package BinaryTrees;

public class Main {
    public static void main(String[] args) {
        Trial tree = new Trial();
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        tree.insertSorted(arr);
        tree.display();
    }
}
