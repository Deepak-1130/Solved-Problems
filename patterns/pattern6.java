// 1
// 01
// 010
// 1010
class pattern6{
    public static void main(String[] args){
        int input =4;
        int bin=1;
        int n=1;
     for(int i=0;i<n;i++){
         for(int j=0;j<i+1;j++){
          System.out.print(bin);
          if(bin==1){
            bin=0;
          }
          else{
            bin=1;
          }
         }
         System.out.println();
         if(n<input){n++;}
     }
    }
}