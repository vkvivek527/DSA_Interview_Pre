//https://leetcode.com/problems/roman-to-integer/

#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    int romanToInt(string s) {
      map<char,int> rm;
      rm.insert(pair<char,int>('I',1));
      rm.insert(pair<char,int>('V',5));
      rm.insert(pair<char,int>('X',10));
      rm.insert(pair<char,int>('L',50));
      rm.insert(pair<char,int>('C',100));
      rm.insert(pair<char,int>('D',500));
      rm.insert(pair<char,int>('M',1000));
        int res=0;
        
        for(int i=0;i<s.length();i++){
            
            if(i>0 && rm.at(s.at(i))>rm.at(s.at(i-1))){
                res=res+rm.at(s.at(i))-2*rm.at(s.at(i-1));
            }else{
            	res=res+rm.at(s.at(i));
			}
               }
        return res;
    }
};
int main(){
	string s;
	cin>>s;
	Solution o;
	int re=o.romanToInt(s);
	cout<<re;
	return 0;
}


