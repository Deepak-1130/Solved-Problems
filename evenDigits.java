class evenDigits{
    public static int countEven(int[] num){
       int ans=0;
        for(int i : num){
            int count=0;
            while(i>=10){
                i=i/10;
                count++;
            }
            if(count%2!=0){
                ans++;
            }

        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr={11,1000,1000};
        System.out.print(countEven(arr));
    } 
}