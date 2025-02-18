package trees;

import java.util.*;

public class BinarySearchTree {
    // node initalization
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Node root = null;

    void create_node(int data) {
        Node new_Node = new Node(data);
        Node tptr;
        Node prev = null;
        // if root is itself null, return that value as root
        if (root == null) {
            root = new_Node;
        } else {
            for (tptr = root; tptr != null; prev = tptr, tptr = (tptr.data > data) ? tptr.left : tptr.right) {
                if (prev.data > data) {
                    prev.left = new_Node;
                }
                if (prev.data < data) {
                    prev.right = new_Node;
                }
            }
        }
    }

    void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }
    }

    void printTree() {
        inOrderTraversal(root);
        System.out.println();
    }
}

class Input {
    Scanner sc = new Scanner(System.in);

    public void mainInputFunction() {
        while (true) {
            int nums = sc.nextInt();
            if (nums == -1) {
                break;
            }
        }
    }
}
