https://practice.geeksforgeeks.org/problems/largest-square-formed-in-a-matrix0806/1#

// { Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
// User function Template for C++

class Solution{
public:
    int maxSquare(int n, int m, vector<vector<int>> mat){
        if(n==0 or m==0){
            return 0;
        }
        int dp[n+1][m+1];
        for(int i=0;i<n;i++){
            dp[i][0]=0;
        }
         for(int i=0;i<m;i++){
            dp[0][i]=0;
        }
        int res=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(mat[i-1][j-1]==1){
                    dp[i][j]=1+min(dp[i-1][j-1],min(dp[i-1][j],dp[i][j-1]));
                    
                    if(res<dp[i][j]){
                        res=dp[i][j];
                    } 
                }else{
                    dp[i][j]=0;
                }
            }
        }
        return res;
    }
};

// { Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int n, m;
        cin>>n>>m;
        vector<vector<int>> mat(n, vector<int>(m, 0));
        for(int i = 0;i < n*m;i++)
            cin>>mat[i/m][i%m];
        
        Solution ob;
        cout<<ob.maxSquare(n, m, mat)<<"\n";
    }
    return 0;
}  // } Driver Code Ends
