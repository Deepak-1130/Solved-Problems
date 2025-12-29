class superMarket{
    public static int getPrice(int Num){
        int price=1;
        while(Num>0){
            int t=Num%10;
            price*=t;
            Num/=10;
        }
        return price;
    }
    public static void main(String[] args){
        System.out.println(getPrice(5244));
    }
}