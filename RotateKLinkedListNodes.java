// Node class
class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class
class LinkedList1 {
    Node1 head;

    // Method to add a node at the end
    public void add(int data) {
        Node1 newNode = new Node1(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node1 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void rotate()
    {
        int k=2;
        Node1 curr=head;
        int l=1;
        while(curr.next!=null)
        {
            curr=curr.next;l++;
        }
        curr.next=head;
         Node1 slow=head;
        for(int i=1;i<l-k;i++)
        {
            slow=slow.next;
        }
        head=slow.next;
        slow.next=null;
        // while(slow!=null)
        // {
        // slow=slow.next;
        // System.out.println(slow.data+" -->");
        // }

    }
    // Method to print the linked list
    public void printList() {
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

// Test class
public class RotateKLinkedListNodes{
    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();

        // Adding nodes
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Printing the list in order 
        list.printList();
        list.rotate();
        list.printList();
    }
}
