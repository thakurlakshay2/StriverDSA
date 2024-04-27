package Arrays;
//https://leetcode.com/problems/set-matrix-zeroes/
public class SetMatrixZeroes {
    //Brute force
    protected void setZeroesBrute(int[][] matrix) {
        if(matrix.length==0) return ;

        int[][] arr=new int[matrix.length][matrix[0].length];
        //  boolean second=false;
        for(int i=0;i<matrix.length;i++){

            for(int j=0;j<matrix[0].length;j++){
                //original
                if(matrix[i][j]==0 && arr[i][j]!=-2 ){
                    arr[i][j]=-1;
                    //for col
                    for(int col=0;col<arr[0].length;col++){
                        if(col!=j){
                            if(matrix[i][col]!=0) arr[i][col]=-2;
                            else{
                                if(arr[i][col]==0)  arr[i][col]=-1;

                                continue;
                            }

                            matrix[i][col]=0;
                        }
                    }
                    //for row

                    for(int row=0;row<arr.length;row++){
                        if(row!=i){
                            if(matrix[row][j]!=0) arr[row][j]=-2;
                            else{
                                if(arr[row][j]==0)  arr[row][j]=-1;
                                continue;
                            }

                            matrix[row][j]=0;

                        }
                    }
                }
            }
        }

        return;
    }


    //we can also use matrix itself for row and col operations , of 0 , just need O(1) space extra for
    //overlapping
    protected void setZeroesOptimised(int[][] matrix) {
        if(matrix.length==0) return ;
        int[] row=new int[matrix.length];
        int[] col=new int[matrix[0].length];

        int[][] arr=new int[matrix.length][matrix[0].length];


        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(matrix[i][j]==0){
                    row[i]=-1;
                    col[j]=-1;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(row[i]== -1 || col[j]==-1){
                    matrix[i][j]=0;

                }
            }
        }


    }
}
