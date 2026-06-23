import java.util.*;
class RemoveDuplicate{
    
    public static int removeDuplicates(int[] nums){
       Set<Integer>  set = new HashSet<>();
       int pos=0;
    
      for(int num :nums){
        if(!set.contains(num)){
            nums[pos]=num;
            set.add(num); 
            pos++;           
        }
      }
      return pos;
    }
    public static void main(String[] args){
        int[] nums={1,1,2};
        System.out.print(removeDuplicates(nums));
    }
    
}