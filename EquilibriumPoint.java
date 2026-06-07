class EquilibriumPoint{
    public static int findEquilibrium(int arr[]) {
    int len=arr.length;
    int total=0;
    int sum=0;
     for(int i=0;i<len;i++){
        total+=arr[i];
     }   
     for(int i=0;i<len-1;i++){
      sum+=arr[i];
      if(((total-sum)-arr[i+1])==sum){
        return i+1;
      }
     } 

     return-1;  
    }
    public static void main(String[] args){
        int arr[]={-7, 1, 5, 2, -4, 3, 0};
        System.out.print(findEquilibrium(arr));
    }
}
