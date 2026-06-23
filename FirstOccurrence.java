class FirstOccurrence{
    public static int strStr(String haystack, String needle) {
        int len = haystack.length();
        int ned= needle.length();
        for(int i=0;i<len;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                for(int j =1;i<ned;j++){
                    if(i+j<len && haystack.charAt(i+j)!=needle.charAt(j)){
                        break;
                    }
                    else if(i+j<len && j==ned-1 && haystack.charAt(i+j)==needle.charAt(j)){
      return i;
                    }
                }
            }
        }
        return -1;
        
    }
    public static void main(String[] args){
       String haystack = "sadbutsad";
       String needle = "sad";
        System.out.print(strStr(haystack,needle));
    }
} 