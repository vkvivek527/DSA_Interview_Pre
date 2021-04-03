https://practice.geeksforgeeks.org/problems/pairs-with-specific-difference1533/1#

// { Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

int maxSumPairWithDifferenceLessThanK(int arr[], int N, int K);

int main() {
	int t;
	cin>>t;
	while(t--)
	{
		int N;
		cin>>N;
		int arr[N];
		for(int i=0;i<N;i++)
		cin>>arr[i];

		int K;
		cin>>K;

		cout<<maxSumPairWithDifferenceLessThanK(arr,N,K)<<endl;
	}
	return 0;
}
// } Driver Code Ends



int maxSumPairWithDifferenceLessThanK(int arr[], int N, int K)
{
sort(arr,arr+N);
int i=N-1;
int sum=0;
int res=0;
while(i>0){
    if((arr[i]-arr[i-1])<K){
        res=res+arr[i]+arr[i-1];
        i=i-2;
    }else{
        i=i-1;
    }
    
}
    return res;
}
