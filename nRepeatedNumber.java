import java.util.*;
class nRepeatedNumber{
    public static int  countNumber(int[] arr){
        Set <Integer> s= new HashSet<>();
        int count=1;
        int num=-1;
        for (int n: arr){
           if(s.contains(n)){
            count++;
            num=n;
           }
           s.add(n);
        }
       
        if(count==arr.length/2){
               return num;
            }
        return -1;
    }
    public static void main(String[] args){
        int[] arr= new int[]{1,2,3,3};
        System.out.print(countNumber(arr));
    }
}