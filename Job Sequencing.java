
//https://practice.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1

class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
       Arrays.sort(arr, new Comparator<Job>(){
          @Override
          public int compare(Job j1, Job j2){
               if(j1.profit < j2.profit){
                   return 1;
               }else if(j1.profit == j2.profit){
                   return 0;
               }else{
                   return -1;
               }
           }
           
       });
       int maxDdLine = arr[0].deadline;
        int []finished = new int[n];
       for(int i = 0; i < n; i++){
          finished[i] = -1;
       }
      
       int maxProfit = 0;
       int workCnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = Math.min(arr[i].deadline - 1,n-1); j >= 0; j-- ){
                if(finished[j] == -1){
                   maxProfit +=  arr[i].profit;
                   workCnt += 1;
                   finished[j] = 1;
                   break;
                }
            }
        }
        int []res = {workCnt, maxProfit};
        return res;
    }
}
