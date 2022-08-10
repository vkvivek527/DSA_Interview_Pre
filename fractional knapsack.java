// https://practice.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1


class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
      Arrays.sort(arr, new Comparator<Item>() {
    @Override
    public int compare(Item x, Item y) {
       double a1 = ((double)x.value/x.weight);
       double a2 = ((double)y.value/y.weight);
       if(a1 ==a2){
           return 0;
       }else if(a1<a2){
           return 1;
       }else{
           return -1;
       } 
    }
     });
    double res = 0;
       int curr_weight = W;
       for(int i=0;i<n;i++){
           
           if(arr[i].weight<=curr_weight){
               res = res+arr[i].value;
               curr_weight = curr_weight-arr[i].weight;
           }else{
               double fractional_value = (double)((double)curr_weight/arr[i].weight)*arr[i].value;
               res = res+fractional_value;
               return res;
              
           }
       }
     return res;
    }
}
