https://practice.geeksforgeeks.org/problems/transform-to-sum-tree/1#

class Solution{
    int check(Node node){
        if(node==null){
            return 0;
        }
        int a=check(node.left);
        int b=check(node.right);
        int d=node.data;
        node.data=a+b;
        return a+b+d;
    }
    public void toSumTree(Node root){
        check(root);
    }
}
