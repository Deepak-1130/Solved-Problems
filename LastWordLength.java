class LastWordLength{
      public static int lengthOfLastWord(String s) {
        int len=0;
        for(int i=s.length()-1;i>=0;i--){
            if(len>0 && s.charAt(i)==' '){
                return len;
            }
            else if(s.charAt(i)!=' '){
                len++;
            }
        }
        return len;
    }
    public static void main(String[] args){
System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }
}