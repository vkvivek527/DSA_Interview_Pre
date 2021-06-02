https://practice.geeksforgeeks.org/problems/zigzag-tree-traversal/1#

class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    ArrayList<Integer> res=new ArrayList<>();
	    //Add your code here.
	    if(root==null){
	        return res;
	    }
	    Queue<Node> q=new LinkedList<>();
	     int flg=1;
	    q.add(root);
	    while(q.size()>0){
	        ArrayList<Integer> tmpres=new ArrayList<>();
	        int siz=q.size();
	        
	        while(siz>0){
	        Node n=q.peek();
	        int d=n.data;
	        tmpres.add(d);
	        q.remove();
	        if(n.left!=null){
	            q.add(n.left);
	        }
	        if(n.right!=null){
	            q.add(n.right);
	        }
	        siz--;
	        }
	         if(flg%2==0){
	            Collections.reverse(tmpres); 
	         }
	         for(int i=0;i<tmpres.size();i++){
	             res.add(tmpres.get(i));
	         }
	          flg++;
	    }
	    return res;
	}
}
