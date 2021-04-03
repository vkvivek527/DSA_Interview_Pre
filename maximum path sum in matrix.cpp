https://practice.geeksforgeeks.org/problems/path-in-matrix3805/1#

// { Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
// User function Template for C++

class Solution{
public:
    int maximumPath(int N, vector<vector<int>> mat)
    {
        int M=N;
        for (int i = 1; i < N; i++) {
        for (int j = 0; j < M; j++) {
            if (j > 0 && j < M - 1)
                mat[i][j] += max(mat[i - 1][j],
                             max(mat[i - 1][j - 1], 
                             mat[i - 1][j + 1]));
  
            else if (j > 0)
                mat[i][j] += max(mat[i - 1][j],
                            mat[i - 1][j - 1]);
  
            else if (j < M - 1)
                mat[i][j] += max(mat[i - 1][j],
                            mat[i - 1][j + 1]);
 
        }
    }
    int res = 0;
    for (int j = 0; j < M; j++) 
        res = max(mat[N-1][j], res);
    return res;
    }
};

// { Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int N;
        cin>>N;
        vector<vector<int>> Matrix(N, vector<int>(N, 0));
        for(int i = 0;i < N*N;i++)
            cin>>Matrix[(i/N)][i%N];
        
        Solution ob;
        cout<<ob.maximumPath(N, Matrix)<<"\n";
    }
    return 0;
}  // } Driver Code Ends
