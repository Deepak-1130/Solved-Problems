class ChocolateWrapper{
    public static int countChoco(int mon , int price , int wrp , int visit){
        int choco=mon/price;
        int wrapper=choco;
        int co=0;
        while(co<visit){
            choco+= (wrapper/wrp);
            co++;
        }
        return choco;
    }
    public static void main(String []args){
        int mon=40 ;
         int price=1 ;
          int wrp=3;
         int visit=1;
         System.out.print(countChoco( mon , price , wrp , visit));
    }
}