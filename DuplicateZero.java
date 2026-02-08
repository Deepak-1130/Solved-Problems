import java.util.*;
class DuplicateZero{
    public static int[] duplicate(int[] arr){
        int n=arr.length;
      
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                int lst=n-1;
                while(lst>i){
                    arr[lst]=arr[lst-1];
                    lst--;
                }
               i+=1;
            }
        }
        return arr;
    }
public static void main(String[] args){
    int[] arr={1,0,2,3,0,4,5,0};
    System.out.print(Arrays.toString(duplicate(arr)));
}}