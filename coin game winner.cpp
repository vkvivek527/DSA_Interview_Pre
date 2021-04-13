https://www.geeksforgeeks.org/coin-game-winner-every-player-three-choices/

/******************************************************************************

//Welcome to GDB Online.

using namespace std;

bool game(int n,int x,int y){
    
     bool dp[n+1];
    
    dp[0]=false;
    dp[1]=true;
    
    for(int i=2;i<=n;i++){
        if(i-1>=0 and !dp[i-1]){
            dp[i]=true;
        }else  if(i-x>=0 and !dp[i-x]){
            dp[i]=true;
        }else  if(i-y>=0 and !dp[i-y]){
            dp[i]=true;
        }else dp[i]=false;
    }
    return dp[n];
    
}

int main()
{
    int n,x,y;
    cin>>n>>x>>y;
    
   if(game(n,x,y)){
       cout<<"A";
   }else cout<<"B";
    
    return 0;
}
