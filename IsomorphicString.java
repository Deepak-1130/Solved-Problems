import java.util.*;
class IsomorphicString{
    public static boolean isomorphic(String a , String b){
        HashMap<Character , Character> map = new HashMap<>();
        for(int i=0;i<a.length();i++){
            if(map.containsKey(a.charAt(i))){
                if((map.get(a.charAt(i))!=b.charAt(i))){
                          return false;
                }
            }
            else if(map.containsValue(b.charAt(i))){
               return false;
            }
            
            else{
                map.put(a.charAt(i),b.charAt(i));
                 
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.print(isomorphic("abc","cbi"));
    }
}