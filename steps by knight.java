https://practice.geeksforgeeks.org/problems/steps-by-knight5927/1#

// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] S1 = br.readLine().trim().split(" ");
            String[] S2 = br.readLine().trim().split(" ");
            int[] KnightPos = new int[2];
            int[] TargetPos = new int[2];
            for(int i = 0; i < 2; i++){
                KnightPos[i] = Integer.parseInt(S1[i]);
                TargetPos[i] = Integer.parseInt(S2[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minStepToReachTarget(KnightPos, TargetPos, N);
            System.out.println(ans);
       }
    }
}
// } Driver Code Ends




class Solution
{
    //Function to find out minimum steps Knight needs to reach target position.
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int n)
    {
        int [][]vis =new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                vis[i][j]=0;
            }
        }
        int x1=KnightPos[0];
        int y1=KnightPos[1];
        int x2=TargetPos[0];
        int y2=TargetPos[1];

        Queue<int[]> q=new LinkedList<int[]>();
        int[] a={x1-1,y1-1};
        q.add(a);
        
        while(!q.isEmpty()){
            int [] ar;
            ar=q.peek();
            int i=ar[0];
            int j=ar[1];
            
            q.poll();
            
            if(i+1>=0 && i+1<n && j+2>=0 && j+2<n && vis[i+1][j+2]==0){
                vis[i+1][j+2]=1+vis[i][j];
                int b[]={i+1,j+2};
                q.add(b);
            }
             if(i-1>=0 && i-1<n && j+2>=0 && j+2<n && vis[i-1][j+2]==0){
                vis[i-1][j+2]=1+vis[i][j];
                int b[]={i-1,j+2};
                q.add(b);
            }
            
             if(i-2>=0 && i-2<n && j+1>=0 && j+1<n && vis[i-2][j+1]==0){
                vis[i-2][j+1]=1+vis[i][j];
                int b[]={i-2,j+1};
                q.add(b);
            }
            
            if(i+2>=0 && i+2<n && j+1>=0 && j+1<n && vis[i+2][j+1]==0){
                vis[i+2][j+1]=1+vis[i][j];
                int b[]={i+2,j+1};
                q.add(b);
            }
             if(i-1>=0 && i-1<n && j-2>=0 && j-2<n && vis[i-1][j-2]==0){
                vis[i-1][j-2]=1+vis[i][j];
                int b[]={i-1,j-2};
                q.add(b);
            }
           
            if(i-2>=0 && i-2<n && j-1>=0 && j-1<n && vis[i-2][j-1]==0){
                vis[i-2][j-1]=1+vis[i][j];
                int b[]={i-2,j-1};
               q.add(b);
            }
            if(i+2>=0 && i+2<n && j-1>=0 && j-1<n && vis[i+2][j-1]==0){
                vis[i+2][j-1]=1+vis[i][j];
                int b[]={i+2,j-1};
                q.add(b);
            }
            
            if(i+1>=0 && i+1<n && j-2>=0 && j-2<n && vis[i+1][j-2]==0){
                vis[i+1][j-2]=1+vis[i][j];
                int b[]={i+1,j-2};
                q.add(b);
            }
        }
        return vis[x2-1][y2-1];
    }
}
