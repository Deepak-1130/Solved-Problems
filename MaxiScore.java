class MaxiScore{
    public static int maxi(String s){
      
      int max=0;
      for(int p=1;p<s.length();p++){
        int score=0;
        for(int i=0;i<s.length();i++){
            if(i<p){
                if(s.charAt(i)=='0'){
                     score++;
                }
            }
            else{
                if(s.charAt(i)=='1'){
                    score++;
                }
            }
       }
       if(max<score){
        max=score;
       }     
    }
    return max;
    }

    public static void main(String[] args){
    System.out.print(maxi("1111"));
}
 
}