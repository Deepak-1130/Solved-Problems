import java.util.*;
class PascalTriangle{
   public static List<Integer> getRow(int rowIndex) {
        int [] arr = new int[rowIndex+1];
        arr[0]=1;
        for(int i=0;i<rowIndex+1;i++){
            for(int j=rowIndex;j>0;j--){
                arr[j]=arr[j]+arr[j-1];
            }
        }
        List <Integer>  list = new ArrayList<>();
        for(int i=0;i<rowIndex+1;i++){
            list.set(i,arr[i]);
        }

return list;
    }
    public static void main(String[] args){
        int n=3;
        System.out.println(getRow(3));

    }
  
}