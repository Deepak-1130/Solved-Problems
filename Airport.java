import java.util.*;
class Airport{
    public static int [] sortSecure(int[] arr){
        int len=arr.length;
        for(int j=0;j<len;j++){
            for(int i=1;i<len;i++){
                if(arr[i]<arr[i-1]){
                    int t=arr[i-1];
                    arr[i-1]=arr[i];
                    arr[i]=t;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int arr[]={2,1,0,2,1,0,0,1,2,0};
       System.out.print(Arrays.toString(sortSecure(arr)));
    }
}