
//https://practice.geeksforgeeks.org/problems/implementing-dijkstra-set-1-adjacency-matrix/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
   static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
   {
     class Weight{
     int vertice;
     int weight;
     Weight(int v,int w){
       vertice = v;
       weight = w;
      }
    }
       int[] minDistance = new int[V];
       Arrays.fill(minDistance,Integer.MAX_VALUE);
       minDistance[S] = 0;
       Weight w = new Weight(S,0);
       Queue<Weight> pq = new PriorityQueue<>((a,b)->{return a.weight-b.weight;});
       pq.add(w);
       while(!pq.isEmpty()){
           Weight source = pq.poll();
           ArrayList<ArrayList<Integer>> list = adj.get(source.vertice);
           for(int i = 0 ; i < list.size() ; i++){
               ArrayList<Integer> weightList = list.get(i);
               int v = weightList.get(0);
               int weigh = weightList.get(1);
               if(minDistance[v] > minDistance[source.vertice] + weigh){
                   minDistance[v] = minDistance[source.vertice] + weigh;
                   Weight destination = new Weight(v,minDistance[S] + weigh);
                   pq.add(destination);
               }
           }
       }
       return minDistance;
   }
}
