package Arrays;

//https://leetcode.com/problems/rotate-image/
public class RotateImage extends PrintSolution {
    public void rotateImageOptimised(int[][] matrix){

        //diagonal mirror
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<=i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
//row swap
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j]=temp;
            }
        }
        print(matrix);
    }
}
