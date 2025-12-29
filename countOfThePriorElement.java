import java.util.*;
class countOfThePriorElement{
    public static int countPrior(int arr[]){
        int max=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                count++;
                max=arr[i];
            }
        }
        return count;
    }
    public static void main (String[] args){
        int arr[]={3,4,5,8,9};
    System.out.println(countPrior(arr));
    }
}