https://practice.geeksforgeeks.org/problems/triplet-sum-in-array-1587115621/1#

bool find3Numbers(int arr[], int N, int X)
    {
      sort(arr,arr+N);
      bool ans=false;
      
      for(int i=0;i<N;i++){
          
           int r=N-1,l=i+1;
           
           while(l<r){
               if(arr[i]+arr[l]+arr[r]==X){
                   ans=true;
                   break;
               }else if(arr[i]+arr[r]+arr[l]<X){
                   l++;
               }else{
                   r--;
               }
           }
          if(ans){
              break;
          }
      }
      return ans;
    }

};
