//https://leetcode.com/problems/search-insert-position/

class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int y=0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]==target)
            {
                y=i;
                break;
            }
            else if(nums[i]<target){
                y=i+1;
            }
        }
         return y;
    }
   
};
