
#include <iostream>

using namespace std;
int findWord(int i,int j,char a[6][6], string s,int indx,int n){
    int found=0;
    if(i>=0 && j>=0 and j<6 and i<6 and a[i][j]==s[indx]){
        
        char temp=s[indx];
        a[i][j]=0;
        indx=indx+1;
        if(indx==n){
            found=1;
        }else{
            found +=findWord(i+1,j,a,s,indx,n);
             found +=findWord(i-1,j,a,s,indx,n);
              found +=findWord(i,j+1,a,s,indx,n);
               found +=findWord(i,j-1,a,s,indx,n);
            
        }
        a[i][j]=temp;
    }
    return found;
}

int main()
{
    string s="GEEKS";
     char a[6][6]  ={
            {'D','D','D','G','D','D'},
            {'B','B','D','E','B','S'},
            {'B','S','K','E','B','K'},
            {'D','D','D','D','D','E'},
            {'D','D','D','D','D','E'},
            {'D','D','D','D','D','G'}
           };
    
    int count=0;
    for(int i=0;i<6;i++){
        for(int j=0;j<6;j++){
          count+= findWord(i,j,a,s,0,5); 
        }
    }
    cout<<count;

    return 0;
}
