https://practice.geeksforgeeks.org/problems/minimum-cost-to-fill-given-weight-in-a-bag1956/1#


// { Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
#include <bits/stdc++.h>
using namespace std;
//Position this line where user code will be pasted.

class Solution{

	public:
	int dp[1001][1001];
	
	int cc(int cost[],int N,int W){
	  
	  
	  if(N==-1 and W==0){
	      return 0;
	  } if(N==-1){
	      return 1e9;
	  } if(W==0){
	      return 0;
	  }
	  if(dp[N][W]!=-1){
	      return dp[N][W];
	  }
	  
	  if(N+1>W or cost[N]==-1) return cc(cost,N-1,W);
	  
	  int sl=cost[N]+cc(cost,N,W-(N+1));
	  int nsl=cc(cost,N-1,W);
	  
	  return dp[N][W]=min(sl,nsl);
	  
	}
	int minimumCost(int cost[], int N, int W) 
	{ 
       memset(dp,-1,sizeof(dp));
       int x=cc(cost,N-1,W);
       if(x>=1e9) return -1;
       return x;
       
	} 
};


// { Driver Code Starts.
int main() 
{
   	
   
   	int t;
    cin >> t;
    while (t--)
    {
        int n, w;
        cin >> n >> w;

        int a[n];

        for(int i = 0; i < n; i++)
        	cin >> a[i];

	    Solution ob;
	    cout << ob.minimumCost(a, n, w) << "\n";
	     
    }
    return 0;
}  // } Driver Code Ends
