package DynamicProgramming;

import java.util.ArrayList;

//https://takeuforward.org/data-structure/minimum-path-sum-in-a-grid-dp-10/
public class MinimumPathSum {

    //Time : O(n*m)
    //space : O(n*m)
    public void MPS(int[][] path){
        int[][] dp=new int[path.length][path[0].length];
        dp[0][0]=path[0][0];
        for(int i=1;i<dp.length;i++){
            dp[i][0]=path[i][0]+dp[i-1][0];
        }
        for(int i=1;i<dp[0].length;i++){
            dp[0][i]=path[0][i]+dp[0][i-1];
        }
        for(int i=1;i<path.length;i++){
            for(int j=1;j<path[0].length;j++){


                dp[i][j]=path[i][j]+Math.min(dp[i][j-1],dp[i-1][j]);
            }
        }
        System.out.println(dp[dp.length-1][dp[0].length-1]);
    }

    //modification  // TRIANGULAR GIRD
    //https://takeuforward.org/data-structure/minimum-path-sum-in-triangular-grid-dp-11/


    //Time : O(n*n)
    //space : O(n*n)
    public void TriangularGrid(ArrayList<ArrayList<Integer>> grid,int n){

        int[][] dp=new int[n][n];

        for(int j=0;j<n;j++){
            dp[n-1][j]=grid.get(n-1).get(j);
        }

        for(int i=n-2;i>=0;i--){

            for(int j=i;j>=0;j--){
                int down=grid.get(i).get(j)+dp[i+1][j];
                int diagonal= grid.get(i).get(j)+ dp[i+1][j+1];

                dp[i][j]= Math.min(down,diagonal);
            }
        }
        System.out.println(dp[0][0]);
    }
//https://takeuforward.org/data-structure/minimum-maximum-falling-path-sum-dp-12/
    //another variation mps  , 3 directions possible , top , left-top , right-top

    public void minimumMaximumFallingPathSum(int[][] matrix,int n){
        int[][] dp=new int[n][n];

        for(int j=0;j<n;j++){
            dp[0][j]=matrix[0][j];
        }

        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                int up=matrix[i][j]+dp[i-1][j];

                int leftDiagonal=matrix[i][j];
                if(j>=1){
                    leftDiagonal+=dp[i-1][j-1];
                }else{
                    leftDiagonal=Integer.MIN_VALUE;
                }
                int rightDiagonal=matrix[i][j];

                if(j<n-1){
                    rightDiagonal+=dp[i+1][j+1];
                }else{
                    rightDiagonal=Integer.MIN_VALUE;
                }

                dp[i][j]=Math.max(up,Math.max(leftDiagonal,rightDiagonal));
            }
        }
        int maxi = Integer.MIN_VALUE;
        for (int j = 0; j < n; j++) {
            maxi = Math.max(maxi, dp[n - 1][j]);
        }

        System.out.println( maxi);
    }
}
