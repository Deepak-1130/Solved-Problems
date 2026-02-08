import java.util.*;
class replaceElements{
    public static void main(String[] args){
  int[] arr={17,18,5,4,6,1};
  int n=arr.length-1;
  int t=0;
while(t<n){
   int num = 0;
   for(int i=t+1;i<n+1;i++){
    if(arr[i]>num){
        num=arr[i];
    }
   } 
   arr[t]=num;
   t++;
}
arr[n]= -1;
System.out.print(Arrays.toString(arr));
    }
}