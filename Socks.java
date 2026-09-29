import java.util.*;
class Socks{
    public static int countPairs(int arr[]){
        int pair=0;
        HashMap<Integer ,Integer> count = new HashMap<>();
        Set<Integer> nums= new HashSet<>();
        for(int i=0;i<arr.length;i++){
          count.put(arr[i],count.getOrDefault(arr[i],0)+1);
          nums.add(arr[i]);
            
        }
        Iterator<Integer> it = nums.iterator();
        while(it.hasNext()){
            pair+=count.get(it.next())/2;
            
        }
        return pair;
        
    }
    public static void main(String[] args){
        int [] arr={10,20,20,10,10,30,50,10,20};
        System.out.println(countPairs(arr));
    }
}