import java.util.*;
class matrix{
    public  int findMatrix(int[][] matrix){
        ArrayList<Integer> miniArr=new ArrayList<>();
        
        for(int i=0;i<matrix.length;i++){
            int mini=100000;
            for(int j=0;j<matrix[i].length;j++){
           if(matrix[i][j]<mini){
                mini=matrix[i][j];
               }
            }
            System.out.println(mini);
       miniArr.add(mini);
        }
       int max=0;
        for(int i=0;i<miniArr.size();i++){
            if(miniArr.get(i)>max){
                max=miniArr.get(i);
            }
        }
 return max;
    }
    public static void main(String[] args){
        matrix mat= new matrix();
        int[][] matrix={{3,4,5},{9,11,13},{15,16,17}};
        System.out.println("ANS "+mat.findMatrix(matrix));
    }
}