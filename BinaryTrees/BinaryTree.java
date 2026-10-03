package BinaryTrees;

import java.util.Scanner;

public class BinaryTree {

    private static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void populate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the root node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(root, scanner);
    }

    private void populate(Node node, Scanner scanner) {
        System.out.print("Do you want to add left node of " + node.value + ": ");
        boolean left = scanner.nextBoolean();

        if (left) {
            System.out.print("Enter the left node of " + node.value + ": ");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(node.left, scanner);
        }

        System.out.print("Do you want to add right node of " + node.value + ": ");
        boolean right = scanner.nextBoolean();

        if (right) {
            System.out.print("Enter the right node of "  + node.value + ": ");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(node.right, scanner);
        }
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
