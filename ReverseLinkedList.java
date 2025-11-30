// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class
class LinkedList {
    Node head;

    // Method to add a node at the end
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void reverse()
    {
        Node temp=head;
        Node prev=null;
        while(temp!=null)
        {
            Node t=temp.next;
            temp.next=prev;     2
            prev=temp;
            temp=t;
        }
    }

    // Method to print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

// Test class
public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adding nodes
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Printing the list
        list.printList();
        list.reverse();
        list.printList();
    }
}
