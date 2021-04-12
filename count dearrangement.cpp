https://www.geeksforgeeks.org/count-derangements-permutation-such-that-no-element-appears-in-its-original-position/

#include <bits/stdc++.h>
using namespace std;

int dearrangcount(int n){
    if(n==1) return 0;
    if(n==2) return 1;
    
    int a=0;
   int b=1;
   int tmp;
   for(int i=3;i<=n;i++){
       tmp=(i-1)*(a+b);
       int a=b;
       b=tmp;
   }
   return tmp;
}

int main()
{
   int n;
   cin>>n;
   
   cout<<dearrangcount(n);
   
    return 0;
}
