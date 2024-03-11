package DP;

//https://takeuforward.org/data-structure/minimum-path-sum-in-a-grid-dp-10/
public class MinimumPathSum {

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
}
