
//https://practice.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1#
static long trappingWater(int arr[], int n) { 
        
        int [] rght = new int[n];
        int [] lft  = new int[n];
        int maxRght = arr[0]; 
         rght[0] = maxRght;
        for(int i = 1; i < n; i++){
           rght [i] = maxRght > arr[i] ? maxRght : arr[i]; 
           maxRght = maxRght > arr[i] ? maxRght : arr[i];
        }
        int maxLft = arr[n-1];
        lft[n-1] = maxLft;
         for(int i = n-2; i >= 0; i--){
           lft [i] = maxLft > arr[i] ? maxLft : arr[i]; 
           maxLft = maxLft > arr[i] ? maxLft : arr[i];
        }
        long res = 0;
        for(int i = 0; i < n; i++){
            res = res + ((Math.min(rght[i], lft[i])) - arr[i]); 
        }
       return res;
    }
