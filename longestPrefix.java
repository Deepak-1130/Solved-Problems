class longestPrefix {
    public static String longestCommonPrefix(String[] strs) {
       String  word = strs[0];     
       StringBuilder sb = new StringBuilder();
<<<<<<< HEAD
=======
       for(String str : strs){
        if(str.length()<word.length()){
            word = str;
       }}
>>>>>>> 160060bc69ee365e4b635c8a55b973f842637d11
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
<<<<<<< HEAD
        String[] strs = {"flower","flow","flight"};
=======
        String[] strs = {"flower","flow","flowet"};
>>>>>>> 160060bc69ee365e4b635c8a55b973f842637d11
        System.out.println(longestCommonPrefix(strs));
    }
}