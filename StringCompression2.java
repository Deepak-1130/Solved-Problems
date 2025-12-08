// Mohana akka idea 
import java.util.*;
class StringCompression{
    public static int compress(char[] chars){
        int count=1;
        int len=chars.length;
        int j=0;
        for(int i=0;i<len;i++){
           
             if(i<len-1 && chars[i]==chars[i+1]){
                count++;
             }
             else{
                chars[j++]=chars[i];
                
               if(count>1){
                String str = Integer.toString(count);
                    for(char c:str.toCharArray()){
                          chars[j++]=c;
                }}
             }
count=1;
            }
            System.out.print(Arrays.toString(chars));
      return chars.length;
    }
    public static void main(String[] args){
        char[] arr={'a','a','b','b','c','c','c'};
        System.out.print(compress(arr));
    }
}