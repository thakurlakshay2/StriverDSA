package DynamicProgramming;

import java.util.Arrays;

// https://takeuforward.org/data-structure/longest-increasing-subsequence-dp-41/
public class LIS {

    public void longIncSubseq(int[] arr){
        int[][] dp=new int[arr.length][arr.length+1];
        for (int row[] : dp) {
            Arrays.fill(row, -1);
        }
        System.out.println(ans(arr,0,-1,dp));
    }

    private int ans(int[] arr , int idx , int prev , int[][] dp){
        if(idx==arr.length){
            return 0;
        }
        if (dp[idx][prev + 1] != -1) {
            return dp[idx][prev + 1];
        }
        int notTake= ans(arr, idx + 1, prev, dp);

        int take=0;
        if(prev==-1 || arr[idx]>arr[prev]){
           take=1+ ans(arr,idx+1,idx,dp);
        }

        dp[idx][prev+1]=Math.max(take,notTake);
        return Math.max(notTake,take);
    }


}
