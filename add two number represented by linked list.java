https://practice.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1#

// { Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}
// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node reverse(Node node){
           Node currentp=node;
           Node nextp;
           Node previousp=null;
           
           while(currentp!=null){
               nextp=currentp.next;
               currentp.next=previousp;
               previousp=currentp;
               currentp=nextp;
           }
           return previousp;
    } 
    
    static Node addTwoLists(Node first, Node second){
          
          first=reverse(first);
          second=reverse(second);
          
          int sum=0;
          int c=0;
          Node res=null;
          Node crnt=null;
          
          while(first!=null || second!=null){
              int a=0,b=0;
              if(first!=null){
                  a=first.data;
              }
              if(second!=null){
                  b=second.data;
              }
              sum=a+b+c;
              if(sum>=10){
                  c=sum/10;
              }else {
                  c=0;
              }
              sum=sum%10;
              Node temp=new Node(sum);
              if(res==null) {
                  res=temp;
              }else{
                  crnt.next=temp;
              }
              crnt=temp;
              
              if(first!=null){
                   first=first.next;
              }
              if(second!=null){
                   second=second.next;
              }
              
          }
          if(c>0){
              Node temp=new Node(c);
              crnt.next=temp;
              crnt=temp;
          }
          res=reverse(res);
          return res;
    }
}
