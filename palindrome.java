/* Write a program to check whether a given number is a palindrome or not,
without using any inbuilt functions and without converting the number into a string.
Perform the check using integer operations only.
*/
import java.util.*;
class palindrome{
    public static boolean checkPalindrome(int num){
        int ans=0;
        int org=num;
        while(num>0){
     int temp=num%10;
     ans=(ans*10)+temp;
      num=num/10;
        }
        if(org==ans){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
  
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the number");
 int num= sc.nextInt();
   System.out.println(checkPalindrome(num));
    }

}