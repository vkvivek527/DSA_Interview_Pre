https://leetcode.com/problems/flood-fill/submissions/

class Solution {
    public void solve(int i,int j,int[][] vis,int n,int m,int newColor,int old,int[][] image){
        if(i<0 || i>=n ||j<0 || j>=m ){
            return ;
        }
        if(vis[i][j]==1 || image[i][j]!=old){
            return;
        }
        vis[i][j]=1;
        image[i][j]=newColor;
        solve(i+1,j,vis,n,m,newColor,old,image);
         solve(i-1,j,vis,n,m,newColor,old,image);
         solve(i,j+1,vis,n,m,newColor,old,image);
         solve(i,j-1,vis,n,m,newColor,old,image);
        
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        int n=image.length;
        int m=image[0].length;
        int [][]vis=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                vis[i][j]=0;
            }
        }
        int old=image[sr][sc];
         solve(sr,sc,vis,n,m,newColor,old,image);
        return image;
    }
}
