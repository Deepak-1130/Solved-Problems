import java.util.*;
class sort{
 public static int[] sort(int[] arr){
    int n =arr.length;
    //i for  
    for(int i=0;i<n;i++){
        // j for travseing
        for(int j=1;j<n-i;j++){
            if(arr[j-1]>arr[j]){
                int t=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=t;
            }

        }

    }
    return arr;

 }  
 public static void main(String[] args){
    int[] arr={1,5,7,9,2,7,8};
    System.out.println(Arrays.toString(sort(arr)));
 } 
}