https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1

int maxSubarraySum(int arr[], int n){
    int maxx=arr[0];
     int msf=arr[0];
     
    for(int i=1;i<n;i++){
        msf=max(arr[i],msf+arr[i]);
        if(msf>maxx){
            maxx=msf;
        }
    }
   
    return max;
