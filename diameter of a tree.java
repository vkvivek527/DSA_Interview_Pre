https://practice.geeksforgeeks.org/problems/diameter-of-binary-tree/1#

class Solution 
{
    //Function to return the diameter of a Binary Tree.
    int max(int a,int b){
        if(a>b) return a;
        else return b;
    }
    int res=Integer.MIN_VALUE;
    int height(Node node){
        if(node==null){
            return 0;
        }
        int x=height(node.left);
        int y=height(node.right);
        res=max(res,x+y+1);
        return max(x,y)+1;
    }
    int diameter(Node root) {
        
        if(root==null) return 0;
         height(root);
         return res;
    }
}
