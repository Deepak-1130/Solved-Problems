import java.util.*;
class StringFrequent{
    public static void main(String[] args ){
        HashMap<String,Integer> map= new HashMap<>();
        String str = "hello";
        String tar = "hello";
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i++){
                 if(str.charAt(i)==' '){
                    map.put(sb.toString(),map.getOrDefault(sb.toString(),0)+1);
                    sb.setLength(0);
                 }
                 else{
                    sb.append(str.charAt(i));
                    }
        }
        map.put(sb.toString(),map.getOrDefault(sb.toString(),0)+1);

        int tarl=map.getOrDefault(tar,0);
        Iterator<String> it =map.keySet().iterator();
        while(it.hasNext()){
            String val=it.next();
            if(map.get(val)>tarl){
                System.out.println(val);
            }
        }
    }
}