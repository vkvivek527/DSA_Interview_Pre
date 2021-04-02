
https://practice.geeksforgeeks.org/problems/max-length-chain/1#
// { Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

struct val{
	int first;
	int second;
};



int maxChainLen(struct val p[],int n);
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		val p[n];
		for(int i=0;i<n;i++)
		{
			cin>>p[i].first>>p[i].second;
		}
		
		cout<<maxChainLen(p,n)<<endl;
	}
	return 0;
}// } Driver Code Ends


/*
The structure to use is as follows
struct val{
	int first;
	int second;
};*/

/*You are required to complete this method*/
bool comp(pair<int,int> a,pair<int,int> b){
    return a.second<b.second;
}

int maxChainLen(struct val p[],int n)
{
    vector<pair<int,int>> v;
    
    for(int i=0;i<n;i++){
        v.push_back({p[i].first,p[i].second});
    }
    sort(v.begin(),v.end(),comp);
    
    int i=0;
    int j=1;
    int c=1;
    int cnt=v.size();
    
    while(j<cnt){
        if(v[i].second<v[j].first){
            c++;
            i=j;
            j++;
        }else{
            j++;
        }
        
    }
    
    return c;
}
