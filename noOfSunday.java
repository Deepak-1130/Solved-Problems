import java.util.*;
class noOfSunday{
    public static int count(String day , int no){
        String[] days={"mon","tue","wed","thurs","fri","sat","sun"};
        int i=0;
        for(i=0;i<7;i++){
            if(days[i]==day){
                break;
            }
        }
            int d =6-i;
            int count=0;
            int tD = d;
            while(sum<=no){
                count++;
                sum+=7;
            }


        
        return count;
    }
    public static void main(String[] args){
        System.out.print(count("sun",10));
            }
}