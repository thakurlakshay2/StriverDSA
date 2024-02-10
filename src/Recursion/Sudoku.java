package Recursion;

public class Sudoku {
//https://takeuforward.org/data-structure/sudoku-solver/
    public void sudoku(int[][] sudoku){
        recursion(sudoku);
    }

    private boolean recursion( int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]!=0) continue;
                for(int k=1;k<=9;k++){
                    if(isValid(matrix,i,j,k)){
                        matrix[i][j]=k;
                         if(recursion(matrix)){
                             return true;
                         }
                         else{
                             matrix[i][j]=0;
                         }

                    }
                }
                return false;
            }
        }
        return true;
    }
    public static boolean isValid(int[][] board, int row, int col, int c) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == c)
                return false;

            if (board[row][i] == c)
                return false;

            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c)
                return false;
        }
        return true;
    }
}
