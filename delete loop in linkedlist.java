https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1#

class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        Node lw=head;
        Node hg=head;
        
        while(lw!=null && hg!=null && hg.next!=null){
            lw=lw.next;
            hg=hg.next.next;
            if(lw==hg) {
                break;
            }
        }
        if(lw==head){
            while(hg.next!=lw){
                hg=hg.next;
            }
            hg.next=null;
        }
        if(lw==hg){
            lw=head;
            while(lw.next!=hg.next){
                lw=lw.next;
                hg=hg.next;
            }
            hg.next=null;
        }
    }
}
