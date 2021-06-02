https://practice.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1#
class Tree
{
    //Function to return a list containing the bottom view of the given tree.
    class Queobj{
           Node n;
           int h;
           Queobj(Node n,int h){
               this.n=n;
               this.h=h;
           }
       }
    public ArrayList <Integer> bottomView(Node root)
    {
        ArrayList<Integer> res=new ArrayList<>();
       Queue<Queobj> q=new LinkedList<>();
       Map<Integer,Integer> mp=new TreeMap<>();
       if(root==null){
           return res;
       }
       Queobj obj=new Queobj(root,0);
       q.add(obj);
       while(q.size()>0){
           Node temp=q.peek().n;
           int ht=q.peek().h;
           q.remove();
            mp.put(ht,temp.data);
          
           if(temp.left!=null){
               q.add(new Queobj(temp.left,ht-1));
           }
           if(temp.right!=null){
               q.add(new Queobj(temp.right,ht+1));
           }
       }
       for(Map.Entry<Integer,Integer> re:mp.entrySet()){
           res.add(re.getValue());
       }
       return res;
    }
}
