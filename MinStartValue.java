class MinStartValue{
     public static int minStartValue(int[] nums) {
        
        int i;
        for(i=1;i>0;i++){
            int sum=i;
            for(int j=0;j<nums.length;j++ ){
                sum+=nums[j];
                if(sum<1){
                    break;
                }

            }
          

        }
        return i;

        
        
    }
    public static void main(String[] args){
        int arr[]={-3,2,-3,4,2};
        System.out.print(minStartValue(arr));
    }
}