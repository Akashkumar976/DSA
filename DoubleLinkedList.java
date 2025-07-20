class Node
{
    int data;
    Node next;
    Node prev;
    Node(int d)
    {
        this.data=d;
        this.next=null;
        this.prev=null;
    }
}
public class DoubleLinkedList {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,56};
        Node head=new Node(0);
        Node curr=head;
        for(int t:arr)
        {
            Node temp=new Node(t);
            temp.prev=curr;
            curr.next=temp;
            curr=temp;
        }
        Node md=head;
          Node mdd=head;
        while(md!=null)
        {
            if(md!=null)mdd=md;
            System.out.print(md.data+" ");
            md=md.next;
        }
        System.out.println();
             while(mdd!=null)
        {
            System.out.print(mdd.data+" ");
            mdd=mdd.prev;
        }
    }
}
