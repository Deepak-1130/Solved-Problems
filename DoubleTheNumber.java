import java.util.*;
class DoubleTheNumber{
    public static boolean checkIfExist(int[] arr){
         Set <Integer> set= new HashSet<>();
        for(int num: arr){
           if(set.contains(num*2)){
            return true;
           }
           if((num%2==0)&&set.contains(num/2)){
            return true;
           }
           set.add(num);
        }
         return false; 
    }
    public static void main(String[] args){
        int arr[]={7,1,14,11};
        System.out.println(checkIfExist(arr));
    }
}