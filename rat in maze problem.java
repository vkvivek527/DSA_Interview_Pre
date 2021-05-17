

// { Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
   static ArrayList<String> res=new ArrayList<String>();
    
    public static void solve(int i,int j,int n,String s,Integer [][] vis,int [][] m){
        if(i<0 || j<0 || j>=n ||i>=n){
            return;
        }if(m[i][j]==0 || vis[i][j]==1){
            return;
        }
        if(i==n-1 && j==n-1){
            res.add(s);
            return;
        }
        vis[i][j]=1;
        
        solve(i-1,j,n,s+'U',vis,m);
         solve(i+1,j,n,s+'D',vis,m);
          solve(i,j+1,n,s+'R',vis,m);
           solve(i,j-1,n,s+'L',vis,m);
           
           vis[i][j]=0;
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        res.clear();
        Integer [][] vis=new Integer[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                vis[i][j]=0;
            }
        }
       if(m[0][0]==0 ){
           return res ;
       }
       if(m[n-1][n-1]==0){
           return res;
       }
       res.clear();
       String s ="";
       solve(0,0,n,s,vis,m);
        Collections.sort(res);
        return res;
    }
}
