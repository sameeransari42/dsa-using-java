package BinaryTrees;

public class Trial {

    private class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void insertSorted(int[] nums) {
        insertSorted(nums, 0, nums.length-1);
    }

    private void insertSorted(int[] nums, int s, int e) {
        if (s > e) {
            return;
        }

        int m = s + (e - s) / 2;
        root = this.insert(root, nums[m]);
        insertSorted(nums, 0, m - 1);
        insertSorted(nums, m + 1, e);
    }


    public void insert(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            root = insert(root, nums[i]);
        }
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (value < node.value) {
            node.left = insert(node.left, value);
        }

        if (value > node.value) {
            node.right = insert(node.right, value);
        }

        return node;
    }

    public void display() {
        display(root, 0, "Root -> ");
    }

    private void display(Node node, int level, String indent) {
        if (node == null) {
            return;
        }

        display(node.right, level + 1, "R--");
        System.out.println(" ".repeat(level * 4) + indent + " " + node.value);
        display(node.left, level + 1, "L--");
    }
}
