

https://www.geeksforgeeks.org/print-subsequences-string/

#include <bits/stdc++.h>
using namespace std;

   vector<string> res;
void printsubseq(string t,int i,int n,string s){
    if(i==n){
        res.push_back(t);
    }else{
        printsubseq(t,i+1,n,s);
        t=t+s[i];
        printsubseq(t,i+1,n,s);
    }
}

int main()
{
    string s="abc";
    int n=s.length();
    printsubseq("",0,n,s);
    for(int i=0;i<res.size();i++){
        cout<<res[i]<<endl;
    }
    
    return 0;
}
