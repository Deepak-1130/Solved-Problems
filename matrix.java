import java.util.*;
class matrix{
    public  static List<Integer> findMatrix(int[][] matrix){
        ArrayList<Integer> maxi=new ArrayList<>();
        ArrayList<Integer> mini=new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();
        int rl=matrix[0].length;
        int cl=matrix.length;
        for(int i=0;i<cl;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<rl;j++){
                
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                }
                
            }
            mini.add(min);
        }
         for(int i=0;i<cl;i++){
            int max=0;
            for(int j=0;j<rl;j++){
                
                if(matrix[j][i]>max){
                    max=matrix[j][i];
                }
               
            }
             maxi.add(max);
        }
        for(int i=0;i<maxi.size();i++){
            if(mini.contains(maxi.get(i))){
                res.add(maxi.get(i));
            }

        }
 return res;
    }
    public static void main(String[] args){
        matrix mat= new matrix();
        int[][] matrix={{3,4,5},{9,16,13},{16,15,17}};
        System.out.println(findMatrix(matrix));
    }
}