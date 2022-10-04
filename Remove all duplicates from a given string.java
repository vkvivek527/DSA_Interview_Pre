// https://practice.geeksforgeeks.org/problems/remove-all-duplicates-from-a-given-string4321/1?page=2&curated[]=7&sortBy=submissions

class Solution {
    String removeDuplicates(String str) {
        char[] ch = str.toCharArray();
         Set<Character> hs = new HashSet<Character>();
         String sb = "";
        for(int i = 0; i < ch.length; i++){
          if(hs.add(ch[i])){
                sb+=ch[i];
            }
        }
        
        return sb;
    }
}
