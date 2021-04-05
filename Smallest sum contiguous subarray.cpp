#include <bits/stdc++.h>
using namespace std;

int main()
{
  //take input here
  int arr[]={2,6,8,1,4};
  
  int minn=arr[0];
  int mnf=arr[0];
  
  for(int i=1;i<5;i++){
      
      minn=min(arr[i],minn+arr[i]);
      if(mnf>minn){
          mnf=minn;
      }
      
  }
    cout<<mnf;
    return 0;
}
