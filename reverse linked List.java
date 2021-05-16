

class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
       Node prev=null;
       Node current=head;
       Node nxt;
       
       while(current!=null){
           nxt=current.next;
           current.next=prev;
           prev=current;
           current=nxt;
       }
       return prev;
    }
}
