//problem link 
//https://practice.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1

class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
      ArrayList<ArrayList<Integer>> meet = new ArrayList<ArrayList<Integer>>();
      for(int i = 0; i < start.length; i++){
          ArrayList<Integer> elmnt = new ArrayList<>();
          elmnt.add(start[i]);
          elmnt.add(end[i]);
          meet.add(elmnt);
      }
      //sorting accouding to second element(end time)
      Collections.sort(meet, new Comparator<ArrayList<Integer>>(){
          public int compare(ArrayList<Integer> fst, ArrayList<Integer> scnd){
              if(fst.get(1) > scnd.get(1)){
                  return 1;
              }
              return -1;
          }
      });
     int i = 0;
     int j = 1;
     int count = 1;
     while(j < n){
         if(meet.get(i).get(1) < meet.get(j).get(0)){
             count++;
             i = j;
             j++;
         }else{
             j++;
         }
     }
     return count;
    }
}
