import java.util.*;
class Solution {
    public static boolean isHappy(int n) {
    
      if(n==1|| n==7 ){
         return true;
      }
      else if (n<10){
        return false;
      }
      else{
        int sum=0;
        while(n>0){
            sum+=Math.pow((n%10),2);
            n=n/10;
        }
        return isHappy(sum);
      }
    
}
public static void main(String [] args){
        System.out.println(isHappy(1));
    }
}
