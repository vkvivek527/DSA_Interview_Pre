https://practice.geeksforgeeks.org/problems/longest-increasing-subsequence-1587115620/1#

// { Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

 // } Driver Code Ends


class Solution{
    public:
    int longestSubsequence(int n, int a[])
    {
      int dp[n+1];
      for(int i=1;i<=n;i++){
          dp[i]=INT_MAX;
      }
      dp[0]=INT_MIN;
      
      for(int i=0;i<n;i++){
          int in=upper_bound(dp,dp+n+1,a[i])-dp;
          if(a[i]>dp[in-1] && a[i]<dp[in]){
              dp[in]=a[i];
          }
          
      }
      int ans=0;
       for(int i=n;i>=0;i--){
              if(dp[i]!=INT_MAX){
                  ans=i;
                  break;
              }
          }
          return ans;
    }
};

// { Driver Code Starts.
int main()
{
    //taking total testcases
    int t,n;
    cin>>t;
    while(t--)
    {
        //taking size of array
        cin>>n;
        int a[n];
        
        //inserting elements to the array
        for(int i=0;i<n;i++)
            cin>>a[i];
        Solution ob;
        //calling method longestSubsequence()
        cout << ob.longestSubsequence(n, a) << endl;
    }
}
  // } Driver Code Ends
