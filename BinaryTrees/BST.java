package BinaryTrees;

public class BST {

    private static class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        private int getValue() {
            return value;
        }
    }

    public void populateSorted(int[] nums) {
        populateSorted(nums, 0, nums.length-1);
    }

    public void populateSorted(int[] nums, int s, int e) {
        if (s > e) {
            return;
        }

        int m = s + (e - s) / 2;

        this.insert(nums[m]);
        populateSorted(nums, s, m-1);
        populateSorted(nums, m+1, e);
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            insert(nums[i]);
        }
    }

    private Node root;

    public int height(Node node) {
        if (node == null) {
            return -1;
        }

        return node.height;
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        }

        if (value > node.value) {
            node.right = insert(value, node.right);
        }

        return node;
    }

    public void display() {
        display(root, "Root: ");
    }

    private void display(Node node, String detail) {
        if (node == null) {
            return;
        }

        System.out.println(detail + node.getValue());

        display(node.left, "Left chid of " + node.getValue() + ": ");
        display(node.right, "Right chid of " + node.getValue() + ": ");
    }
}
