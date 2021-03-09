
#include <bits/stdc++.h>
using namespace std;
int main()
{
  //input array 
    int arr[] = {1,-9,8, -4, -1,4,-9,-7,-4,-6,-7,5,-8};
    int i=0,j=12;
  int len=12;
    
    while(i<=j){
        
        if(arr[i]<0 && arr[j]>0){
            swap(arr[i],arr[j]);
            i++;
            j--;
        }else if(arr[i]>0 && arr[j]<0){
            i++;
            j--;
        }else if(arr[i]>0){
            i++;
        }else if(arr[j]<0){
            j--;
        }
    }
    if(j==len || i==0){
        cout<<"no arrangment";
    }else {
        int k=0;
        while(k<len && i<=len){
            swap(arr[k],arr[i]);
            k=k+2;
            i++;
        }
        
    }
     for(int y=0;y<=len;y++){
         cout<<arr[y]<<" ";
     }
    return 0;
}
