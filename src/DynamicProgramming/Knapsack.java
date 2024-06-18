package DynamicProgramming;

//https://takeuforward.org/data-structure/0-1-knapsack-dp-19/
public class Knapsack {

    public void knapsack01(int[] wt,int[] val,int W){

        int[][] dp=new int[wt.length][W+1];

        // Base Condition
        for (int i = wt[0]; i <= W; i++) {
            dp[0][i] = val[0];
        }
        for (int ind = 1; ind < wt.length; ind++) {
            for (int cap = 0; cap <= W; cap++) {
                // Calculate the maximum value when the current item is not taken
                int notTaken = dp[ind - 1][cap];

                // Calculate the maximum value when the current item is taken
                int taken = Integer.MIN_VALUE;
                if (wt[ind] <= cap) {
                    taken = val[ind] + dp[ind - 1][cap - wt[ind]];
                }

                // Store the maximum value for the current state
                dp[ind][cap] = Math.max(notTaken, taken);
            }
        }

        System.out.println(dp[wt.length-1][W]);
    }
}
