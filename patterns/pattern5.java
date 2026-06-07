  //      1
  //    1 2 1
  //   1 3 3 1
  //  1 4 6 4 1   
import java.util.*;
class pattern5{
public static void main(String[] args){
      int n=5;
      int [] arr = new int[n];
      arr[0]=1;
      int spc=n-1;
      for(int i=0;i<n;i++){
        for(int j=0;j<spc;j++){
          System.out.print(" ");
        }
        spc--;
        for(int j=0;j<i+1;j++){
          System.out.print(arr[j]);
          System.out.print(" ");
        }
        System.out.println();
        for(int j=n-1;j>0;j--){
          arr[j]=arr[j]+arr[j-1];
        }
      }
  }
} 