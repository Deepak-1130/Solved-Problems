import java.util.*;
class PalindromeNumber{
    public static boolean checkPalindrome(int  num){
        int ans = 0;
        int originalNum = num;
    
while(num>0){
         int t=num%10;
        //  System.out.println(t); 
         ans=(ans*10)+t;
         num= num/10;
        }
        // System.out.println(ans);
        if(ans==originalNum){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        System.out.println(checkPalindrome(151));
    }
}