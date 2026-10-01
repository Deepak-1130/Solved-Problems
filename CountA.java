import java.util.*;
class CountA{
    public static int count(String s , int n){
        StringBuilder sb = new StringBuilder();
        int count=0;
        if(s.length()==0){
            return 0;
        }
        while(sb.length()<n){
            sb.append(s);
        }
        for(int i=0;i<n;i++){
            if(sb.charAt(i)=='a'){
                       count++;
            }
        }
        return count;
           }
           public static void main(String[] args){
            String s="";
            int n=10;
            System.out.print(count(s,n));
           }
}