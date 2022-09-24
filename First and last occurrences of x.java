//https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1?page=1&curated[]=7&sortBy=submissions

class GFG
{
    ArrayList<Long> find(long arr[], int n, int x)
    {
        boolean first = true;
        Long firstIndx = -1L;
        Long lastIndx = -1L;
        ArrayList<Long> res = new ArrayList<>();
       for(int i = 0; i < n; i++){
           if(arr[i] == x && first){
               Long longnum1 = Long.valueOf(i);
               firstIndx = longnum1;
               first = false;
           }
           if(arr[i] == x){
               Long longnum2 = Long.valueOf(i);
               lastIndx = longnum2;
           }
       }
       res.add(firstIndx);
       res.add(lastIndx);
       return res;
    }
}
