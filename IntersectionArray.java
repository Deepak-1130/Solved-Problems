import java.util.*;
class Solution {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set= new HashSet<>();
        //set has contains function nd remove duplicate 
        HashSet<Integer> list= new HashSet<>();        //we don't know the op lenght

        for (int num:nums1){
            set.add(num);
        }
        // System.out.print(set);
        for(int j:nums2){

            if( set.contains(j)){
                list.add(j);
            }
        }
        int [] ans = new int[list.size()];
    int i=0;
    for(int num:list){
        ans[i++]=num;
            }
        return ans;
         }
public static void main(String[] args){
    int[] num1={1,2,3,4,1,7};
  int[]  num2={1,4,3,9,1};
System.out.print(Arrays.toString(intersection(num1,num2)));
}
}

