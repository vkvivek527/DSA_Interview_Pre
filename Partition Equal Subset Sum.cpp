https://practice.geeksforgeeks.org/problems/subset-sum-problem2014/1

class Solution{
public:
    int equalPartition(int N, int arr[])
    {  
        int sum=0;
       for(int i=0;i<N;i++){
           sum=sum+arr[i];
       }
       if(sum%2!=0){
           return 0;
       }
       int fnd=sum/2;
       bool dp[N+1][fnd+1];
       
       for(int i=0;i<=fnd;i++){
           dp[0][i]=false;
       }
       for(int j=0;j<=N;j++){
           dp[j][0]=true;
       }
       
       for(int i=1;i<=N;i++){
           for(int j=1;j<=fnd;j++){
               if(arr[i-1]>j){
                   dp[i][j]=dp[i-1][j];
               }if(arr[i-1]<=j){
                   dp[i][j]=dp[i-1][j] || dp[i-1][j-arr[i-1]];
               }
           }
       }
       
        int b= dp[N][sum/2];
        if(b){
            return 1;
        }else{
            return 0;
        }
       
    }
};

// { Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int N;
        cin>>N;
        int arr[N];
        for(int i = 0;i < N;i++)
            cin>>arr[i];
        
        Solution ob;
        if(ob.equalPartition(N, arr))
            cout<<"YES\n";
        else
            cout<<"NO\n";
    }
    return 0;
}  // } Driver Code Ends
