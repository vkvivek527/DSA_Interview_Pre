
https://practice.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1#
class Solution 
{
    //Function to detect cycle in a directed graph.
   public boolean solve(int src,ArrayList<Integer> vis,ArrayList<Integer> ord,ArrayList<ArrayList<Integer>> adj){
        
        vis.set(src,1);
        ord.set(src,1);
        for(int x:adj.get(src)){
            if(vis.get(x)==0){
                boolean re=solve(x,vis,ord,adj);
                if(re) return true;
            }else if(ord.get(x)==1){
                return true;
            }
        }
        ord.set(src,0);
        return false;
    }
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj)
    {
       ArrayList<Integer> vis=new ArrayList<>(V);
       ArrayList<Integer> ord=new ArrayList<>(V);
       
       for(int i=0;i<V;i++){
           vis.add(0);
           ord.add(0);
       }
       for(int i=0;i<V;i++){
           if(vis.get(i)==0){
               boolean re=solve(i,vis,ord,adj);
               if(re) return true;
           }
       }
       return false;
    }
}
