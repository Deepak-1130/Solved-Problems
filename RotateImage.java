class  RotateImage{
    public static void rotate(int[][] matrix) {
 for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix.length;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<matrix.length;i++){
            int r=matrix.length-1;
            int l=0;
            while(r>l){
                int temp=matrix[i][l];
                matrix[i][l]=matrix[i][r];
                matrix[i][r]=temp;
                l++;
                r--;
            }
        }
    } 
    
    public static void main(String [] args){
         int[][] matrix ={{1,2,3},{4,5,6},{7,8,9}};

    }
}