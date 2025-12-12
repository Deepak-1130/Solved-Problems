// my idea 
import java.util.*;
class StringCompression{
    public static int compress(char[] chars){
        ArrayList<Character> arr = new ArrayList<>();
        int len=chars.length;
        for(int i=0;i<len;i++){
            char letter=chars[i];
            int count=0;
            while(i<len && chars[i]==letter){
                count++;
                i++;
            }
             arr.add(letter);
            
            if(count>1){
            String cnt = Integer.toString(count);
            for(char chr:cnt.toCharArray()){
                arr.add(chr);
            }
            }
            i--;
        }
        System.out.print(arr);
      return arr.size();
    }
    public static void main(String[] args){
        char[] arr={'a','a','b','b','c','c','c'};
        System.out.print(compress(arr));
    }
}