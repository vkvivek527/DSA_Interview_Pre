// https://practice.geeksforgeeks.org/problems/minimum-cost-to-cut-a-board-into-squares/1

class Solution {
    public static int minimumCostOfBreaking(int[] x, int[] y,int m,int n) {
        
        Arrays.sort(x);
        Arrays.sort(y);
        
        int hz = 1; //taking horizontl count 1
        int vr = 1;
        int i = m-1;
        int j = n-1;
        int res = 0;
        
        while(i>=0 && j>=0){
            if(x[i]>y[j]){
                res += vr*x[i];
                hz++;
                i--;
            }else{
                res += hz*y[j];
                vr++;
                j--;
            }
        }
        while(i >= 0){
             res += vr*x[i];
             i--;
        }
        while(j >= 0){
             res += hz*y[j];
             j--;
        }
        return res;
    }
}
        
