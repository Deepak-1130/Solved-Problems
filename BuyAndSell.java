
class BuyAndSell{
    public int  maxprofit(int [] prices){
        int profit=0;
        int mini=prices[0];
        for(int i=1;i<prices.length;i++){
            if(mini>prices[i]){
                mini=prices[i];
            }
            else if(profit<prices[i]-mini){
                profit=prices[i]-mini;
            }
        }
        return profit;
    }
    public static void main(String[] args){
     int[] prices={7,1,5,3,6,4};
     BuyAndSell bs = new BuyAndSell();
        System.out.println(bs.maxprofit(prices));   
    }
}
    