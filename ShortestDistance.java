class ShortestDistance{
    public static int findDistance(int n,int[] nums){
        int length=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int num = nums[i];
            int len=0;
            for(int j=i+1;j<n;j++){
                
                if(nums[j]==num){
                    len=j-i;
                    // System.out.println(len);   
                     length=Math.min(len,length);            
                }
            }
           
        }
        if(length==Integer.MAX_VALUE){
            return -1;
        }
        return length;
    }
    public static void main(String[] args){
        int arr[]={7,1,3,4,5,10};
        int len=6;
System.out.println(findDistance(len,arr));
    }

}