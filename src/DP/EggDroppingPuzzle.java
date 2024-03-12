package DP;

public class EggDroppingPuzzle {
    public void eddDrop(int a,int b){
        int[][] dp=new int[a+1][b+1];
        for(int i=1;i<=a;i++){
            dp[i][1]=1;
        }
        for(int i=1;i<=b;i++){
            dp[1][i]=i;
        }

        for(int i=2;i<=a;i++){
            for(int j=2;j<=b;j++){
                dp[i][j]=Integer.MAX_VALUE;
                for(int x=1;x<=j;x++){
                    int res=1+Math.max(dp[i][j-x],dp[i-1][x-1]);
                    dp[i][j]=Math.min(dp[i][j],res);
                }
            }
        }
        System.out.println(dp[a][b]);
    }
}
