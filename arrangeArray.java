/*Write a program to arrange the given array such that:
· The first half contains all the odd numbers in decreasing order.
· The second half contains all the even numbers in increasing order.
Do not use any inbuilt sorting*/ 

import java.util.*;
class arrangeArray{
    public static ArrayList<Integer> arrangeArray(int[] arr){
    ArrayList<Integer> even = new ArrayList<>();
    ArrayList<Integer> odd = new ArrayList<>();
    int n=arr.length;

    //separte even and odd
    for(int i=0;i<n;i++){
       if(arr[i]%2==0){
        even.add(arr[i]);
       }
       else{
        odd.add(arr[i]);
       }
        
    }
    // odd sort 
    int o=odd.size();
    for(int i =0;i<o;i++){
        for(int j =1;j<o-i;j++){
               if(odd.get(j)>odd.get(j-1)){
                    int t = odd.get(j);
                    odd.set(j, odd.get(j-1));
                    odd.set(j-1, t);
                }
        }
    }

    int e =even.size();
    for(int i =0;i<e;i++){
        for(int j =1;j<e-i;j++){
            if(even.get(j)<even.get(j-1)){
                int t=even.get(j);
                even.set(j,even.get(j-1));
                even.set(j-1,t);
            }
        }
    }
    
odd.addAll(even);
    return odd;
    }
    public static void main(String[] args){
        int[] arr={0, 4, 5, 3, 7, 2, 1};

System.out.println(arrangeArray(arr));
    }
}