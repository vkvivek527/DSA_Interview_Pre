
//https://practice.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1


int knapSack(int W, int wt[], int val[], int n) 
{ 
   
    int i, w; 
    int dp[n + 1][W + 1]; 
    
    for(i=1;i<=n;i++){
        dp[i][0]=0;
        
    }
     for(i=0;i<=W;i++){
        dp[0][i]=0;
        
    }
    
    for (i = 1; i <= n; i++)  
    { 
        for (w = 1; w <= W; w++)  
        { 
           if(wt[i-1]<=w){
               
               dp[i][w]=max(val[i-1]+dp[i-1][w-wt[i-1]],dp[i-1][w]);
           }
           if(wt[i-1]>w){
               dp[i][w]=dp[i-1][w];
           }
        } 
    } 
  
    return dp[n][W]; 
  
}
