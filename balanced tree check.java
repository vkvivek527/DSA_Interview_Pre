https://practice.geeksforgeeks.org/problems/check-for-balanced-tree/1#

class Tree
{  
    int f=1;
    int check(Node n){
        if(n==null){
            return 0;
        }
        int a,b;
            a=check(n.left);
            b=check(n.right);
        if(a-b>1 || b-a >1){
            f=0;
        }
        int h=Math.max(a,b);
        return h+1;
    }
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    {
	// Your code here
	f=1;
	 check(root);
	if(f==0){
	    return false;
	}
	return true;
    }
}
