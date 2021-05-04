class Solution {
    public int min(int a,int b){
        if(a>b) return b;
        else return a;
    }
    public String longestCommonPrefix(String[] strs) {
        
        String s=strs[0];
        int mm=Integer.MAX_VALUE;
        
        for(int i=0;i<strs.length;i++){
            
            int j=0,k=0,ans=0;
            
            while(j<s.length() && k<strs[i].length()){
                if(s.charAt(j)==strs[i].charAt(k)){
                    ans++;
                }else
                    break;
            
                    j++;
                    k++;
            }
            mm=min(mm,ans);
        }
        return s.substring(0,mm);
    }
}
