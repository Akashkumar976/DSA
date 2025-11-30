public class MiddleNode {
    public Node KthElement(Node head,int k)
    {
        if(head!=null)return head;
   
     Node prev=head;
     Node curr=head;
     for(int i=1;i<=k;i++)
     {
        if(curr==null)return null;
        curr=curr.next;
     }
     while(curr!=null)
     {
        prev=prev.next;
        curr=curr.next;
     }
   return prev;
    }
}
