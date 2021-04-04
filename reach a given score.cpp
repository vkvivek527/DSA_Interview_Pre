https://practice.geeksforgeeks.org/problems/reach-a-given-score-1587115621/1

// { Driver Code Starts

// Driver Code
#include<bits/stdc++.h>
#define ll long long int
using namespace std;

 // } Driver Code Ends

// Complete this function
long long int count(long long int n)
{
	
	int dp[4][n+1];
	int arr[]={3,5,10};
	for(int i=0;i<=n;i++){
	    dp[0][i]=0;
	}
	for(int i=0;i<4;i++){
	    dp[i][0]=1;
	}
	for(int i=1;i<4;i++){
	    for(int j=1;j<=n;j++){
	        
	        if(arr[i-1]<=j){
	            dp[i][j]=dp[i-1][j]+dp[i][j-arr[i-1]];
	        }
	        if(arr[i-1]>j){
	            dp[i][j]=dp[i-1][j];
	        }
	        
	    }
	}
	return dp[3][n];
	
}

// { Driver Code Starts.



int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		ll n;
		cin>>n;
		cout<<count(n)<<endl;
	}
	return 0;
}  // } Driver Code Ends
