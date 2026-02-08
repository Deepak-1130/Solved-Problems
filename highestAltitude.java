import java.util.*;
class HighestAltitude{
   public int largestAltitude(int[] gain) {
       int[] arr=new int[gain.length+1];
      int max=arr[0];
       for(int i=1;i<arr.length;i++){
         arr[i]=gain[i-1]+arr[i-1];
        if(arr[i]>max){
            max=arr[i];
         }
       } 
      
       return max;
   }
    public static void  main(String[] args){
int[]  gain={-5,1,5,0,-7};
HighestAltitude highestAltitude= new HighestAltitude();
System.out.print(highestAltitude.largestAltitude( gain));
    }

}