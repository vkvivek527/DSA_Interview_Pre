https://practice.geeksforgeeks.org/problems/consecutive-elements2306/1#

class Solution{
    public String removeConsecutiveCharacter(String S){
        Map<Character,Integer> mp=new HashMap<>();
        String s="";
       char pr=' ';
       for(int i=0;i<S.length();i++){
           if(S.charAt(i)!=pr) 
           s=s+S.charAt(i);
           pr=S.charAt(i);
       }
        return s;
    }
}
