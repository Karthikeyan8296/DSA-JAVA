package linkedlist;

public class InsertionAtPosition {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node insertAtPosition(Node head, int data, int position) {
        Node new_node = new Node(data);
        // if the inserting is at the first node itself
        while (position == 0) {
            new_node.next = head;
            return new_node;
        }
        Node temp = head;
        // traverse till the insertion point
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        // inserting the new node
        if (temp != null) {
            new_node.next = temp.next;
            temp.next = new_node;
        }
        return head;
    }

    public void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void input() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        int data = 25;
        int position = 1;
        head = insertAtPosition(head, data, position);
        display(head);
    }
}
