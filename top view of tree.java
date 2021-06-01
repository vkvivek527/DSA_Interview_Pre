https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1#

class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree
   
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
          class Queobj {
            Node n;
            int h;
            Queobj(Node n,int h){
                this.n=n;
                this.h=h;
            }
        }
       
        ArrayList<Integer> res=new ArrayList<>();
        Map<Integer,Integer> mp=new TreeMap<>();
        Queue<Queobj> q=new LinkedList<>();
        if(root==null){
            return res;
        }
        q.add(new Queobj(root,0));
        while(q.size()>0){
          Node p=q.peek().n;
          int h=q.peek().h;
          
            q.remove();
            
            if(!mp.containsKey(h)){
                mp.put(h,p.data);
            }
            if(p.left!=null) q.add(new Queobj(p.left,h-1));
            if(p.right!=null) q.add(new Queobj(p.right,h+1));
        }
       for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
           res.add(entry.getValue());
       }
       return res;
    }
}
