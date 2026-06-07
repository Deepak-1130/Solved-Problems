import java.util.*;
class MoveAllZeroToEnd{
    public static int[] pushZerosToEnd(int[] arrs){
        int arr[] = new int[arrs.length];
        int pos=0;
        for(int i=0;i<arr.length;i++){
            if(arrs[i]!=0){
                arr[pos++]=arrs[i];
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int arr[]={1, 2, 0, 4, 3, 0, 5, 0};
        System.out.println(Arrays.toString(pushZerosToEnd(arr)));
    }
}