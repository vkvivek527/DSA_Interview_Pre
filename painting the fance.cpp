https://practice.geeksforgeeks.org/problems/painting-the-fence3727/1#

class Solution{
    public:
    long long countWays(int n, int k){
       
       if(n==0) return 0;
       if(n==1) return k;
       int mod=1000000007;
       
       long long same=k%mod;
       long long diff=(k*(k-1))%mod;
       for(int i=3;i<=n;i++){
           long long prev=diff%mod;
           diff=((same+diff)*(k-1))%mod;
           same=prev%mod;
       }
       return (same+diff)%mod;
       
    }
};
