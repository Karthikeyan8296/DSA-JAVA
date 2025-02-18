package linkedlist;

public class InsertionAtEnd {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node insertAtEnd(Node head, int new_data) {
        // creating an new node to store the new data
        Node new_Node = new Node(new_data);
        Node temp = head;
        // iterating to the last node
        while (temp.next != null) {
            temp = temp.next;
        }
        // linking that last node with new node
        temp.next = new_Node;
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
        Node head = new Node(10);
        head.next = new Node(12);
        head.next.next = new Node(14);
        head.next.next.next = new Node(16);
        int new_data = 999;

        head = insertAtEnd(head, new_data);
        display(head);
    }
}
