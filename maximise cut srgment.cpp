https://practice.geeksforgeeks.org/problems/cutted-segments1642/1#

int dp[10001];
int maxCut(int n,int x,int y,int z){
    if(n==0) return 0;
    int a1=INT_MIN;
   int a2=INT_MIN;
   int a3=INT_MIN;
   if (dp[n]!=-1) return dp[n];
   if(n>=x) a1=maxCut(n-x,x,y,z);
   if(n>=y) a2=maxCut(n-y,x,y,z);
   if(n>=z) a3=maxCut(n-z,x,y,z);
   return dp[n]=1+max(a1,max(a2,a3));
   
}

int maximizeTheCuts(int n, int x, int y, int z)
{
  memset(dp,-1,sizeof(dp));
  int a=maxCut(n,x,y,z);
  if(a<0) return 0;
  else return a;
}
