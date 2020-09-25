//https://leetcode.com/problems/reverse-integer/

class Solution {
public:
    int reverse(int x) {
    	bool nagNo=false;
    	long res=0;
    	if(x==0)
    		return 0;
        if(x >= 2147483647 || x <= -2147483648){
				return 0;
        }
    		if(x<0){
    		 x=-1*x;
			 nagNo=true;	
			}
			while(x!=0){
				int rem=x%10;
				res=res*10+rem;
				x=x/10;
			} 
			
			if(res >= 2147483647 || res <= -2147483648){
				return 0;
			}else if(nagNo){
				return res*-1;
			}else {
				return res;
			}
			
    }
};
