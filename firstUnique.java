class Solution { 
    public static int firstUniqChar(String s) {
        // int count=0;
    for (int i=0;i<s.length();i++){
                boolean unique = true ;   
    for(int j=0;j<s.length();j++){
              if(s.charAt(i)==s.charAt(j)&&i!=j){
                  unique=false;
                }
           }
       if(unique){
               return i;
           }
         }
         return -1;  
       }
      public static void main(String[] args){
        String s="lleetcode";
        System.out.println(firstUniqChar(s));
    }
}