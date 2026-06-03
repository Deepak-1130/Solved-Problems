
class EquilibriumIndex{
    public static int Equilibrium(int [] arr){
        int l = arr.length;
            
     for(int i=0;i<l;i++){
        int LSum=0;
        int Rsum=0;

        for(int j=0;j<i;j++){
            LSum+=arr[j];
        }
// System.out.println(LSum);

        for(int j=i+1;j<l;j++){
            Rsum+=arr[j];
        }
        // System.out.println(Rsum);

        if(Rsum==LSum){
            return i;
        }
     }
      return -1;
    }
    
    public static void main(String[] args){
        int [] arr={1, -1, 0};
        System.out.println(Equilibrium(arr));
    }
}