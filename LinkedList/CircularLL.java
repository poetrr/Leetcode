package LinkedList;

public class CircularLL {

    private Node head;
    private Node tail;
    private int size;
    public CircularLL(){
        this.size=0;
        this.head=null;
        this.tail=null;
    }
    public CircularLL(int size){
        this.size=size;
    }
    
    public void insertAtPosition(int value, int position) {
        if (position < 0 || position > size) {
            System.out.println("Invalid position. Valid range is 0 to " + size);
            return;
        }

        Node newNode = new Node(value);

        if (position == 0) { // Insert at the beginning
            if (head == null) {
                head = newNode;
                tail = newNode;
                tail.next = head;
            } else {
                newNode.next = head;
                head = newNode;
                tail.next = head; // Update tail's next
            }
        } else {
            Node temp = head;
            for (int i = 1; i < position; i++) { // Traverse to the node before the position
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;

            if (temp == tail) { // Update tail if inserted at the end
                tail = newNode;
            }
        }
        size++;
    }
    public void delete(int value) {
        if (head == null) {
            System.out.println("No nodes present in the Circular Linked List");
            return;
        }

        if (head.value == value) {
            head = head.next; // Change the head to the second value 
            tail.next = head; // Assign tail's next to the new head
            size--;
            System.out.println("First Node deleted");
            return;
        }
        Node temp = head;
        do {
            Node n = temp.next;
            if (n.value == value) {
                temp.next = n.next;
                if (n == tail) {
                    tail = temp; // Update tail if deleting the last node
                }
                size--;
                return;
            }
            temp = temp.next;
        } while (temp != head);
    }
    private class Node {
        private int value;
        private Node next;
        public Node(int data){
            this.value=0;
            this.next=null;
        }
        public Node(int data,Node next){
            this.value=data;
            this.next=next;
        }
    }
}
