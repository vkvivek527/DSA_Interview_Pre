// https://practice.geeksforgeeks.org/problems/find-maximum-equal-sum-of-three-stacks/1

class Solution {
    public static int maxEqualSum(int N1,int N2,int N3, int[] S1, int[] S2, int[] S3) {

      int sum1 = 0;
      int sum2 = 0;
      int sum3 = 0;
      
      for(int i = 0; i < N1; i++){
          sum1+=S1[i];
      }
      for(int i = 0; i < N2; i++){
          sum2+=S2[i];
      }
      for(int i = 0; i < N3; i++){
          sum3+=S3[i];
      }
      int i = 0;
      int j = 0; 
      int k = 0;
      
      while(i < N1 && j < N2 && k < N3){
          
          if(sum1 == sum2 && sum2 == sum3){
              return sum1;
          }
          if(sum1 >= sum2 && sum1 >= sum3){
              sum1-=S1[i++];
              
          }else if(sum2 >= sum1 && sum2 >= sum3){
              sum2-=S2[j++];
              
          }else if(sum3 >= sum1 && sum3 >= sum2){
              sum3-=S3[k++];
              
          }
      }
      return 0;
    }
}
