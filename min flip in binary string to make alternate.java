https://practice.geeksforgeeks.org/problems/min-number-of-flips3210/1#

// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution ob = new Solution();
            
            System.out.println(ob.minFlips(S));
                        
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    public int minFlips(String s) {
        // Code here
        int res=0,res1=0;
      for(int i=0;i<s.length();i++){
          if(i%2==0 && s.charAt(i)=='0') res++;
           if(i%2==1 && s.charAt(i)=='1') res++;
           if(i%2==0 && s.charAt(i)=='1') res1++;
           if(i%2==1 && s.charAt(i)=='0') res1++;
      }
      if(res>res1) return res1; 
      else
       return res;
    }
}
