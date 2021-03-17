https://practice.geeksforgeeks.org/problems/gold-mine-problem2608/1#

class Solution{
public:
    int maxGold(int m, int n, vector<vector<int>> v)
    {
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<m;j++){
                
                int right=v[j][i+1];
                int rightUp=(j==0)?0:v[j-1][i+1];
                int rightDown=(j==m-1)?0:v[j+1][i+1];
                v[j][i]= v[j][i]+max(right,max(rightUp,rightDown));
            }
        }
        int mx=v[0][0];
        for(int i=1;i<m;i++){
            mx=max(mx,v[i][0]);
        }
        return mx;
    }
};
