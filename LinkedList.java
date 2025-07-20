 class Node{
        int data;
        Node next;
        Node(int n)
        {
            this.data=n;
            this.next=null;
        }

    }

public class LinkedList {
        public static Node head;
        public static Node tail;
    public static void main(String[] args) {    
    head = new Node(0);
    tail=head;
    add(1);
    add(2);
    add(3);
    add(46);
    add(6); 
    add(10);
     add(60); 
    head=head.next;
    display();   
        System.out.println();   
    System.out.println("The last Node:-"+last().data);  
    deleteFirst();
    deleteLast();
    display(); 
    addfirst(-1);
    System.out.println();
    display();
    System.out.println();
    System.out.println("Middle Node:-"+middle().data);
        System.out.println();
reverse();
display();
    }
    public static void add(int d)
    {
            Node temp=new Node(d);
            tail.next=temp;
            tail=temp;
    }
    public static void display()
    {
        Node curr=head;
         while(curr!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    public static Node last()
    {
        return tail;
    }
    public static void deleteLast()
    {
        Node curr=head;
        while(curr.next!=null&&curr.next.next!=null)
        {
            curr=curr.next;
        }
        curr.next=null;
        tail=curr;
        
    }
    public static void deleteFirst()
    {
        head=head.next;
    }
    public static void addfirst(int d)
    {
        Node temp=new Node(d);
        temp.next=head;
        head=temp;
    }
    public static Node middle()
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void reverse()
    {
        Node prev=null;
        Node curr=head;
        while(curr!=null)
        {
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        head=prev;
    }
}
