//https://practice.geeksforgeeks.org/problems/common-elements1132/1#

class Solution
{
    public:    
       vector <int> commonElements (int A[], int B[], int C[], int n1, int n2, int n3)
        {
            
            int i=0,j=0,k=0;
            vector<int> res;
            while(i<n1 && j<n2 && k<n3){
                if(A[i]==B[j] && B[j]==C[k]){
                    res.push_back(A[i]);
                }
                if(A[i]<B[j]){
                    i++;
                }else if(B[j]<C[k]){
                    j++;
                }else{
                    k++;
                }
                int kk=A[i-1];
                int jj=B[j-1];
                int ll=C[k-1];
                while(A[i]==kk){
                    i++;
                }
                 while(B[j]==jj){
                    j++;
                }
                 while(C[k]==ll){
                    k++;
                }  
            }
            return res;
        }

};
