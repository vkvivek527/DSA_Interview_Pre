// https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
       Collections.sort(a);
       int j = m-1;
       int i = 0;
       long min_val = Long.MAX_VALUE;
      while(j < n){
          long tmp = a.get(j) - a.get(i);
          if(tmp < min_val){
              min_val = tmp;
          }
          j++;
          i++;
      }
      return min_val;
    }
}
