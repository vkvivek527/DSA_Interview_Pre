https://practice.geeksforgeeks.org/problems/level-order-traversal/1

class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
       ArrayList<Integer> res=new ArrayList<Integer>();
       if(node==null) return res;
       Queue<Node> q=new LinkedList<>();
       q.add(node);
      
       while(!q.isEmpty()){
           Node temp=q.peek();
           res.add(temp.data);
           if(temp.left!=null) q.add(temp.left);
           if(temp.right!=null) q.add(temp.right);
           q.remove();
           
       }
       return res;
    }
}
