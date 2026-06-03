import java.util.*;
class ContigousArray{

    public int count(int arr[]){
       int total=0;
    

         for (int i=0;i<3;i++){
            total+=arr[i]; 
        }
        // System.out.println(total);

         int max=total;
         int sum=total;
        for(int i=3;i<arr.length;i++){
            
            sum+=arr[i];
            sum-=arr[i-3];
            max = Math.max(max,sum);
            //  System.out.println(sum);
        }
        return max;
    }
    public static void main(String[] args){
        ContigousArray contigousArray=new ContigousArray();
        int arr[]={4, 4, 4, 4, 4 };
        
        System.out.println(contigousArray.count(arr));
    }
}