import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      TreeMap <Integer , Integer> map = new TreeMap<>();
       int[] ans = new int[k];
       for(int num:nums){
               map.put(num,map.getOrDefault(num,0)+1);
                }
        Set <Integer> element = map.keySet();
        Iterator<Integer> it = element.iterator();
       for(int i=0;i<k;i++){

        ans[i]=it.next();

       }
       return ans;
    }
    public static void main(String[] args){
        int[] nums={1,1,1,2,2,3,3,3,3,4,4,4,4};
        int k=2;
        Solution s = new Solution();
        System.out.print(Arrays.toString(s.topKFrequent(nums,k)));
    }
    
}