class FoutDivisor{
 public static int countDivisor(int[] nums){
    Set <Integer> set = new HashSet<>();
    int n=nums.length;
    int ans=0;
    for(int i=0;i<n;i++){
        int num=nums[i];
        int count=0;
        int sum=0;
        for(int j=1;j<num+1;j++){
            if(num%j==0){
              count++;
              sum+=j;
            }
        }
        if(count==4){
            ans+=sum;
        }
    }
return ans;
 }
 public static void main(String [] args){
    int[] arr=new int[]{7,21,3};
    System.out.println(countDivisor(arr));
 }
}