
//https://leetcode.com/problems/power-of-two/

class Solution {
    public boolean isPowerOfTwo(int n) {
        //approach 1
        // if( n == 1 ){
        //     return true;
        // }
        // if( n <= 0){
        //     return false;
        // }
        // while(n > 2){
        //     if(n % 2 != 0){
        //         return false;
        //     }
        //     n = n/2;
        // }
        // return true;
        
        // approach 2
        for(int i = 0; i <= 30 ; i++){
            if(n == Math.pow(2,i))
            return true;
        }
        return false;
    }
}
