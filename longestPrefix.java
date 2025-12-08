class longestPrefix {
    public static String longestCommonPrefix(String[] strs) {
       String  word = strs[0];     
       StringBuilder sb = new StringBuilder();
    for(int i =0;i<word.length();i++){
         for(String str: strs){
            if(word.charAt(i)!=str.charAt(i)){
                return sb.toString();
            }                 
        }
         sb.append(word.charAt(i));
    }
     return sb.toString(); 
    
}
public static void main(String[] args){
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}