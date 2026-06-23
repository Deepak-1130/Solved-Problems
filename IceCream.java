class IceCream{
      public static  int maxIceCream(int[] costs, int coins) {
        int max=0;
        for(int num : costs){
            if(max<num){
                max=num;
            }

        }
        int arr[] = new int[max+1];

        for(int num:costs){
            arr[num]++;
        }
        int count =0;
        for(int i=1;i<=max;i++){
            if(arr[i]==0){
                continue;
            }

            int ice=Math.min(arr[i],coins/i);
            count+=ice;
            coins-=i*ice;
            if(coins<i){
                break;
            }       
            
        }
        return count;
        
    }
    public static void main(String[] args){
      int coins=7;
      int[] costs={1,3,2,4,1};
      System.out.print(maxIceCream(costs,coins));
    }
}