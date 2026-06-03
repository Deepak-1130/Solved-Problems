//34. Find First and Last Position of Element in Sorted Array
import java.util.*;
class FindFirstAndLastPos{
  public static int[] searchRange(int[] nums, int target) {
    int [] ans={-1,-1};
     int left=0;
     int right=nums.length-1;
     while(left<=right){
        if(nums[left]!=target && nums[right]!=target){
            left++;
            right--;
        }
        else if(nums[left]==target && nums[right]!=target){
            right--;
            
        }
        else if(nums[left]!=target && nums[right]==target){
            left++;
            

        }
        else if(nums[left]==target && nums[right]==target){
            ans[0]=left;
            ans[1]=right;
             return ans;

        }
     } 
      return ans;
      
    }
    public static  void main(String [] args){
        int[] nums={5,7,7,8,8,10};
        int target=8;
        System.out.print(Arrays.toString(searchRange(nums,target)));
    }
}