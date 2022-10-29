//https://leetcode.com/problems/complement-of-base-10-integer/

class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        int res = 0;
        int i = 0;
        while(n != 0 ){
            int bit = n & 1;
           // bit = ~bit;
            // res = (bit * (int) Math.pow(10,i))+res;
            if(bit == 0){
                res = res + (int)Math.pow(2,i);
            }
            n = n>>1;
            i++;
        } 
        return res;
    }
}
