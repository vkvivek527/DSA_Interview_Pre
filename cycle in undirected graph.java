https://practice.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1#

class Solution
{
    boolean solve(int src,int par,ArrayList<Integer> vis,ArrayList<ArrayList<Integer>> adj){
        vis.set(src,1);
        for(int x:adj.get(src)){
            if(vis.get(x)==0){
                if(solve(x,src,vis,adj)) return true;
            }else if(x!=par) return true;
        }
        return false;
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
       ArrayList<Integer> vis=new ArrayList<>(V);
       for(int i=0;i<V;i++){
           vis.add(0);
       }
       for(int i=0;i<V;i++){
           if(vis.get(i)==0){
           boolean re=solve(i,-1,vis,adj);
           if(re) return true;
           }
       }
       return false;
    }
}
