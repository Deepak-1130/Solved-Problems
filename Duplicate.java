//TO check whether the array contains duplicate values 
import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
         for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
         }
         for(int num:nums){
            if(map.get(num)>1){
                return true;
            }
         }
return false;
    }
    public static void main(String[] args){
        Solution obj = new Solution();
     System.out.println(obj.containsDuplicate(new int[]{1,1,2,3}));   
    }
}