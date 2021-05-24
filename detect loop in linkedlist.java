https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1#

class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
        Map<Node,Integer> mp=new HashMap<>();
        while(head!=null){
            if(mp.containsKey(head)){
                return true;
            }else{
                mp.put(head,1);
                head=head.next;
            }
        }
        return false;
    }
}
