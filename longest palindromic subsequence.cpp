
#include <bits/stdc++.h>
using namespace std;
int dp[1001][1001];

int count(string s,int i,int j){
    if(i==j) return 1;
    
    if(i>j) return 0;
    
    if(dp[i][j]!=-1) return dp[i][j];
    
    if(s[i]==s[j]){
       return  dp[i][j]=2+count(s,i+1,j-1);
    }
    
    return max(count(s,i+1,j),count(s,i,j-1));
    
}

int main()
{
  //take input here
  string s="racecari";
  memset(dp,-1,sizeof(dp));
  
  cout<<count(s,0,s.length()-1);

    return 0;
}
