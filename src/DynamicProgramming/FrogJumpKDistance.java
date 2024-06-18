package DynamicProgramming;

import java.util.Arrays;

//https://takeuforward.org/data-structure/dynamic-programming-frog-jump-with-k-distances-dp-4/
public class FrogJumpKDistance {


    private int solveUtil(int idx,int[] height,int[] dp,int k){
        if(idx==0)
            return 0;

        if(dp[idx]!=-1){
            return  dp[idx];
        }
        int minimum=Integer.MAX_VALUE;
        for(int j=1;j<=k;j++){
            if(idx-j>=0){
                int jump=solveUtil(idx-j, height,dp,k)+Math.abs(height[idx]-height[idx-j]);
                minimum= Math.min(jump,minimum);
            }
        }
        return dp[idx]=minimum;
    }

    //recursion with memoization
    //time : O(n*k)
    // space : O(n)
    public void memoization(int n , int[] height, int  k){

        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        System.out.println(solveUtil( n-1, height,dp,k));
    }

    //time : O(n*k)
    // space : O(n)
    public void tabulation(int n , int[] height,int k){
        int[] dp=new int[n];
        dp[0] = 0;

        for (int i = 1; i < n; i++) {
            int mmSteps = Integer.MAX_VALUE;

            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    int jump = dp[i - j] + Math.abs(height[i] - height[i - j]);
                    mmSteps = Math.min(jump, mmSteps);
                }
            }
            dp[i] = mmSteps;
        }
        System.out.println( dp[n - 1]);
    }
}
