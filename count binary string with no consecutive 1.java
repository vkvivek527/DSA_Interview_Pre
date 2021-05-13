//https://practice.geeksforgeeks.org/problems/consecutive-1s-not-allowed1912/1#

// { Driver Code Starts
#include <bits/stdc++.h>

using namespace std;
#define ll long long

 // } Driver Code Ends
//User function template for C++
class Solution{
public:
	// #define ll long long
	ll countStrings(int n) {
	    ll mod=1000000007;
	   ll e0=1;
	   ll e1=1;
	
	   for(int i=2;i<=n;i++){
	    ll  temp=e1%mod;
	       e0=(e0+e1)%mod;
	       e1=temp;
	   }
	   return (e0+e1)%mod;
	}
};

// { Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        Solution ob;
        auto ans = ob.countStrings(n);
        cout << ans << "\n";
    }
    return 0;
}  // } Driver Code Ends
