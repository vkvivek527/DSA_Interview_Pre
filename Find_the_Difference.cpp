//https://leetcode.com/problems/find-the-difference/

class Solution {
public:
    char findTheDifference(string s, string t) {
        if(s==""){
            return t.at(0);
        }
        sort(s.begin(),s.end()); 
        sort(t.begin(),t.end()); 
        int check=0;
        int i;
        for(i=0;i<s.length();i++){
            if(t.at(i)!=s.at(i)){
                return t.at(i);
                check=1;
            }
        }
        if(check==0){
            return t.at(i);
        }
        return '\0';
    }
};
