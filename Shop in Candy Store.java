// https://practice.geeksforgeeks.org/problems/shop-in-candy-store1145/1

class Solution{
    static ArrayList<Integer> candyStore(int candies[],int N,int k){
        
        Arrays.sort(candies);
        int min = 0;
        int max = 0;
        int i = 0;
        int j = N-1;
       while(i <= j){
           min += candies[i];
           i++;
           j = j - k;
       }
       i = N-1;
       j = 0;
       while(i >= j){
           max += candies[i];
           i--;
           j = j+k;
       }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(min);
        res.add(max);
        return res;
        
    }
}
