import java.util.*;
class ExcelColunmNum{
    public static int titleToNumber(String columnTitle){
        String chars = "ABCDEFGHIJKLMNOPQRTUVWXYZ";
        int ans =0;
        int pow= 0;
        int l=columnTitle.length();
     for(int i=l-1;i>=0;i--){
        char c = columnTitle.charAt(i);
        // System.out.print(c+1);
        ans += (c-'A'+1)*Math.pow(26,pow);
        pow++;
     }
      return ans; 
    }
    public static void main(String[] args){
        String s="AA";
       System.out.println( titleToNumber(s));
     }

}