import java.util.*;
class ProcessString{
     public static String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char sub=s.charAt(i);
            if(sub>=97&&sub<=122){
                sb.append(sub);
            }
            else if(sub=='#'){
                sb.append(sb);
            }
            else if(sub=='%'){
               sb.reverse();
            }
            else if(sb.length()>0&&sub=='*'){
                int len = sb.length();
                sb.deleteCharAt(len-1);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String ss ="aa";
        System.out.print(processStr(ss));
    }
}