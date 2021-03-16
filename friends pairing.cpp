https://practice.geeksforgeeks.org/problems/friends-pairing-problem5425/1#

class Solution
{
    public:
    
    int countFriendsPairings(int n) 
    { 
        int mod=1000000007;
        long long int dp[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            
            dp[i]=((dp[i-1])%mod + (((i-1) %mod)*(dp[i-2]))%mod)%mod;
            
        }
        return dp[n];
    }
};  
