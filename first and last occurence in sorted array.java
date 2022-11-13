
//https://www.codingninjas.com/codestudio/problems/first-and-last-position-of-an-element-in-sorted-array_1082549?source=youtube&campaign=love_babbar_codestudio2&utm_source=youtube&utm_medium=affiliate&utm_campaign=love_babbar_codestudio2&leftPanelTab=1

import java.util.* ;
import java.io.*; 
public class Solution {

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        int [] res = new int[2];
        res[0] = first(arr,k,n);
        res[1] = last(arr,k,n);
        return res;
    }
 public static int first(ArrayList<Integer> arr, int k, int n){
       int strt = 0;
       int end = n-1;
       int mid = (strt + end)/2;
       int res = -1;
       while(strt <= end){
           if(arr.get(mid) == k){
               res = mid;
               end = mid - 1;
           }else if (arr.get(mid) > k){
               end = mid - 1;
           }else if (arr.get(mid) < k){
               strt = mid + 1;
           }
           mid = (strt + end)/2;
       }
       return res;
 }
     public static int last(ArrayList<Integer> arr, int k, int n){
       int strt = 0;
       int end = n-1;
       int mid = (strt + end)/2;
       int res = -1;
       while(strt <= end){
           if(arr.get(mid) == k){
               res = mid;
               strt = mid + 1;
           }else if (arr.get(mid) > k){
               end = mid - 1;
           }else if (arr.get(mid) < k){
               strt = mid + 1;
           }
           mid = (strt + end)/2;
       }
       return res;
     }
};
