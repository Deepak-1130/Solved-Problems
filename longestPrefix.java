class longestPrefix {
    public static String longestCommonPrefix(String[] strs) {
       String word = strs[0];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            for (String str : strs) {
                if (i < str.length()) {
                    if (str.charAt(i) != word.charAt(i)) {
                        return sb.toString();
                    }

                } else {
                    return sb.toString();
                }
            }
            sb.append(word.charAt(i));

        }
        return sb.toString();
    
}
public static void main(String[] args){
        String[] strs = {"flower","flow","flowet"};
        System.out.println(longestCommonPrefix(strs));
    }
}