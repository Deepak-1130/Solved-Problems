import java.util.*;
class sortedSquare{
    public static int[] sort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j =0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        } 
        return arr;


     }
     public  static int[] sortedSquare(int arr[]){
        for(int num : arr){
            num=Math.pow(num,2);
           }
           return sort(arr);
     }
     public  static void main(String[] args){
        int[] arr={4,6,7,3,2,8,1};
        System.out.println(Arrays.toString(sort(arr)));
     } 
}
