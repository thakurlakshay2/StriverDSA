package Recursion;
//https://takeuforward.org/data-structure/n-queen-problem-return-all-distinct-solutions-to-the-n-queens-puzzle/
public class NQueen {

    public void NQueenOptimised(int queen){
    recursion(queen, 0,new char[queen][queen]);
    }

    private void recursion(int queen ,int j, char[][] matrix){
        if(queen==0  ){
            for(char[] ch:matrix){
                for(char c : ch){
                    System.out.print(c+" ");
                }
                System.out.println();
            }
            System.out.println("+++++");

            return ;
        }

        for(int i=0;i<matrix.length;i++){
                matrix[i][j]='.';
                if(validate(matrix,i,j)){
                    matrix[i][j]='Q';
                    recursion(queen-1,j+1,matrix);
                    matrix[i][j]='.';

                }


        }
    }
    private boolean validate(char[][] board, int row, int col) {
        int duprow = row;
        int dupcol = col;
        while (row >= 0 && col >= 0) {
            if (board[row][col] == 'Q') return false;
            row--;
            col--;
        }

        row = duprow;
        col = dupcol;
        while (col >= 0) {
            if (board[row][col] == 'Q') return false;
            col--;
        }

        row = duprow;
        col = dupcol;
        while (col >= 0 && row < board.length) {
            if (board[row][col] == 'Q') return false;
            col--;
            row++;
        }
        return true;
    }
}
