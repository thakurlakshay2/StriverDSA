package Arrays;


import java.util.Arrays;

//ALSO a DP question
public class GridUniquePath {

    public void gridUniquePathOptimised(int n,int m){

        int[][] dp=new int[n][m];

        //dp[i][j]=dp[i-1][j]+dp[i][j-1];
        for(int i=0;i<dp.length;i++ ){
            dp[i][0]=1;
        }
        Arrays.fill(dp[0], 1);

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }

        System.out.println(dp[n-1][m-1]);
    }
}
