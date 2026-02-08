// to check whether the  string contains same characters 
import java.util.*;
class Anagram{
    public static boolean checkAnagram(String str1 , String str2){
            
       char[] strArr1 = str1.toCharArray();
       char[] strArr2 = str2.toCharArray();
       Arrays.sort(strArr1);
       Arrays.sort(strArr2);
       String sortedString1 = new String(strArr1);
       String sortedString2 = new String(strArr2);
                //  System.out.println(sortedString2);
                // System.out.println(sortedString1);

     if(sortedString1.equals(sortedString2)){
        return true;
     }
     else{
        return false;
     }
    }
    public static void main(String[] args){
        String str1 ="gram";
        String str2="mgar";
     System.out.println(checkAnagram(str1 ,str2));
    }
}