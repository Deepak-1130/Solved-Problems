class MaxiScore2{
    public static int maxi(String s){
        int one=0;
        int Zero=0;
        for(int i =0;i<s.length();i++){
      if(s.charAt(i)=='0'){
       Zero++;
    }
    else{
        one++;
    }
        }
        int max=0;
       int zeros=0;
       int ones=one;
       for(int i=0;i<s.length()-1;i++){
        if(s.charAt(i)=='0'){
            zeros++;
        }
        else{
            ones--;
        }
        int score=zeros+ones;
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