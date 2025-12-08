import java.util.*;
class Solution{
    public static int [] twosum(int[] num ,int target){
        HashMap<Integer,Integer> map =new HashMap<>();
        for (int i=0; i<num.length; i++){
            int difference = target-num[i];
            if(map.containsKey(difference)){
      return new int[]{map.get(difference),i};
       }
        map.put(num[i],i);
        }
 return new int[]{};
    }
    public static void main(String[] args){
      int[]  nums = {2,7,11,6,3,15};
         int target = 9;
    int []ans =twosum(nums,target);
    if(ans.length==0){
        System.out.print("No solution found");
    }
    else{
        System.out.print(Arrays.toString(ans));
    }

    }
}