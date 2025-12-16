import java.util.*;
class ChocolateFactory{
    public static int[] bloodySweet(int[] arr){
       
        int count=arr.length;
        int n=0;

       for(int j=0;j<count;j++){
           if(arr[j]!=0){
            arr[n++]=arr[j];

           }
         }
         for(int k=n;k<arr.length;k++){
                arr[k]=0;
    }
        return arr;
    }
    public static void main(String[] args){
        int arr[] ={0,0,4,5,0,1,9,0,5,0};
        System.out.print(Arrays.toString(bloodySweet(arr)));
    }
}