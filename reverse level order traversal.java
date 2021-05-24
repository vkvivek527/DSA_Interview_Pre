https://practice.geeksforgeeks.org/problems/reverse-level-order-traversal/1#

class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        if(node==null){
            return res;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            Node temp=q.peek();
            res.add(temp.data);
             if(temp.right!=null) q.add(temp.right);
            if(temp.left!=null) q.add(temp.left);
           
            q.remove();
        }
        Collections.reverse(res);
        return res;
    }
} 
