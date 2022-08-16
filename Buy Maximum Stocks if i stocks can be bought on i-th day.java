// https://practice.geeksforgeeks.org/problems/buy-maximum-stocks-if-i-stocks-can-be-bought-on-i-th-day/1

class Solution {
    public static int buyMaximumProducts(int n, int k, int[] price) {
       int[][] arr = new int[n][2];
      
      for(int i = 0; i < n; i++){
          arr[i][0] = price[i];
          arr[i][1] = i+1;
      }
      Arrays.sort(arr, new Comparator<int[]>(){
          @Override
          public int compare(int[] a, int[] b){
              if(a[0] > b[0]){
                  return 1;
              }else if(a[0] == b[0]){
                  return 0;
              }
              return -1;
          }
      });
      int res = 0;
      for(int i = 0; i < n; i++){
          int prc = arr[i][0];
          int stok = arr[i][1];
          if(prc*stok <= k){
              res += arr[i][1];
              k -= (prc*stok);
          }else{
              int fr = k/arr[i][0];
              res += fr;
               k -= (prc*fr);
          }
      }
      return res;
        }
}
