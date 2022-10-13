//https://practice.geeksforgeeks.org/problems/merge-two-binary-max-heap0144/1?page=2&curated[]=7&sortBy=submissions

class Solution{
    public int[] mergeHeaps(int[] a, int[] b, int n, int m) {
       
     int i = 0;
     int j = 0;
     int k = 0;
     int res[] = new int[n+m];
     
     while(i < n && j < m){
         if(a[i] >= b[j]){
             res[k] = a[i];
             i++;
         }else{
         res[k] = b[j];
         ++j;
     }
     ++k;
     }
     while(i < n) {
            res[k] = a[i];
            ++i;
            ++k;
        }
        while(j < m) {
            res[k] = b[j];
            ++j;
            ++k;
        }
        return res;
    } 
}
