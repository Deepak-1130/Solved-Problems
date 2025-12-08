import java.util.*;
public class subarraysum{
   public static int subarraySum(int[] nums, int k) {
    int count = 0;
    int pSum = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, 1); 
    for(int num:nums){
    pSum+=num;
    if(map.containsKey(pSum-k)){
        count+=map.get(pSum-k);
    }
    map.put(pSum,map.getOrDefault(pSum , 0)+1);

    }
    return count;
   }
public static void main(String[] args){
    int[] nums={2,2,2,2,2};
    int k=8;
    System.out.print(subarraySum(nums,k));
}}
