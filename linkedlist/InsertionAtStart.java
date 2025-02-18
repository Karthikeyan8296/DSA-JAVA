package linkedlist;

public class InsertionAtStart {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node insertionAtStart(Node head, int new_data) {
        // inserting the data into new node
        Node new_node = new Node(new_data);
        // linking that new node with the head
        new_node.next = head;
        return new_node;
    }

    public void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void input() {
        Node head = new Node(12);
        head.next = new Node(13);
        head.next.next = new Node(14);
        head.next.next.next = new Node(15);

        int new_data = 100;

        head = insertionAtStart(head, new_data);
        display(head);
    }
}
