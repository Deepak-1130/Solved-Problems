//35. Search Insert Position
class InsertPostion{
    public static int searchInsert(int[] nums, int target) {
        
        int right = nums.length-1;
        int left=0;
       
        while(left<=right){
             int mid= (left+right)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
            
        }
        return left;
        
    }
    public static void main(String[] args){
        int [] nums = {1,3,5,6};
        int target=2;
    System.out.println(searchInsert(nums,target));

    }
}