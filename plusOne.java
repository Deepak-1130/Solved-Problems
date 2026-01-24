import java.util.*;
class plusOne{
    public static int[] plusOne(int[] arr){
     int n=arr.length;
     for(int i=n-1;i>=0;i--){
        if(arr[i]<9){
            arr[i]++;
            return arr;
        }
        arr[i]=0;
     }
     int arrn[]=new int[n+1];
     arrn[0]=1;
     return arrn;
    }
    public static void main(String [] args){
        int []arr={9,8,9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
}