//https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1?page=2&curated[]=7&sortBy=submissions

class Solution
{
    static int majorityElement(int a[], int n)
    {
       Map<Integer,Integer> mp = new HashMap<>();
       int res = -1;
       if(n==1){
          return a[0];
       }
       for(int i = 0; i < n; i++){
           if(mp.containsKey(a[i])){
               mp.put(a[i],mp.get(a[i])+1);
               if(mp.get(a[i]) > n/2){
                   res= a[i];
               }
           }else{
               mp.put(a[i],1);
           }
       }
       return res;
    }
}
