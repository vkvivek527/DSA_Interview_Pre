https://practice.geeksforgeeks.org/problems/smallest-window-in-a-string-containing-all-the-characters-of-another-string-1587115621/1#

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		
		while(test > 0){
		    String s = scan.next();
		    String t = scan.next();
		    
		    System.out.println(new Solution().smallestWindow(s, t));
		    test--;
		}
	}
}// } Driver Code Ends




class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String p)
    {
        String ans="";
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<p.length();i++){
            char ch=p.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        int mct=0;
        int dmct=p.length();
        HashMap<Character,Integer> map1=new HashMap<>();
        int i=-1;
        int j=-1;
        
        while(true){
            boolean flag1=false;
            boolean flag2=false;
            
            while(i<s.length()-1 && mct<dmct){
                i++;
                char ch=s.charAt(i);
                map1.put(ch,map1.getOrDefault(ch,0)+1);
                
                if(map1.getOrDefault(ch,0)<=map2.getOrDefault(ch,0)){
                    mct++;
                    
                }
                flag1=true;
            }
            while(j<i && mct==dmct){
                String tans=s.substring(j+1,i+1);
                if(ans.length()==0 || tans.length()<ans.length()){
                    ans=tans;
                }
                j++;
                char ch=s.charAt(j);
                if(map1.get(ch)==1){
                    map1.remove(ch);
                }else{
                    map1.put(ch,map1.get(ch)-1);
                }
               
               if(map1.getOrDefault(ch,0)<map2.getOrDefault(ch,0)){
                   mct--;
               }
                flag2=true;
            }
             if(flag1==false && flag2==false){
                break;
            }
            
        }
        if(ans.length()==0) {
            int h=-1;
            String ss=Integer.toString(h);
            return ss;
        }
       else return ans;
    }
}
