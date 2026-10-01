class SubSequence{
    public static boolean isSubSequence(String a, String b){
        int i=0;
        int j=0;
        while(i<a.length() && j<b.length()){
            if(a.charAt(i)==b.charAt(j)){
                if(i==a.length()-1){
                    return true;
                }
                i++;
                j++;

            }
            else{
                j++;
            }
        }
        return false;
    }
    public static void main(String[] args){
        String a="Set";
        String b="Step";
        System.out.println(isSubSequence(a,b));
    }
}