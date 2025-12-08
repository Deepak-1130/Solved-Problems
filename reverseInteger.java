class reverseInteger{
    public static int reverseInteger(int num){
        int reversed = 0;
        
 
   while(num!=0){
    int t = num%10;
    reversed = (reversed*10) + t;
    num/=10;
   }
   

        return reversed ;
    }

    public static void main(String[] args){
        System.out.println(reverseInteger(1539554454));
}
}