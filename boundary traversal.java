https://practice.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1#

class Solution
{
    public void leftSide(Node n,ArrayList<Integer> res){
         if(n==null ) return;
         if(n.left!=null){
             res.add(n.data);
             leftSide(n.left,res);
         }else if(n.right!=null){
             res.add(n.data);
             leftSide(n.right,res);
         }
     }
    public void leaf(Node n,ArrayList<Integer> res){
         if(n==null){
             return;
         }
         leaf(n.left,res);
         if(n.left==null && n.right==null){
             res.add(n.data);
         }
         leaf(n.right,res);
     }
    public void rightSide(Node n,ArrayList<Integer> res){
         if(n==null){
             return;
         }
         if(n.right!=null){
             rightSide(n.right,res);
             res.add(n.data);
         }else if(n.left!=null){
             rightSide(n.left,res);
             res.add(n.data);
         }
     }
	ArrayList <Integer> printBoundary(Node node)
	{
	    ArrayList<Integer> res=new ArrayList<>();
	    if(node==null){
	        return res;
	    }
	    res.add(node.data);
	    leftSide(node.left,res);
	    leaf(node,res);
	    rightSide(node.right,res);
	    return res;
	}
}
