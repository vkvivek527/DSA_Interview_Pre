//https://practice.geeksforgeeks.org/problems/maximize-sum-after-k-negations1149/1

class Solution {

    public static long maximizeSum(long a[], int n, int k)
    {
      long res = 0;
      Arrays.sort(a);
      for(int i = 0; i < n; i++){
          if(a[i]<0 && k >= 1){
              a[i] = a[i]*-1;
              k--;
          } 
      }
       long min =a[0];
       for(int i = 0; i < n; i++){
        res+=a[i];
        if(a[i] < min){
            min = a[i];
        }
       }
         if(k%2==1){
             res -= 2*min;
         }
     
      return res;  
      }
}
