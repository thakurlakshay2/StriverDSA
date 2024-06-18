package DynamicProgramming;

//https://takeuforward.org/data-structure/coin-change-2-dp-22/
public class CoinChange {

    public void CC(int[] coins,int target ){
        tabulation(coins,target);
    }
    public void tabulation(int[] coins,int T){

        int[][] dp = new int[coins.length][T + 1];

        // Initialize base condition for the first element of the array
        for (int i = 0; i <= T; i++) {
            if (i % coins[0] == 0)
                dp[0][i] = 1;
            // Else condition is automatically fulfilled, as dp array is initialized to zero
        }

        // Fill the dp array using dynamic programming
        for (int ind = 1; ind < coins.length; ind++) {
            for (int target = 0; target <= T; target++) {
                int notTaken = dp[ind - 1][target];

                int taken = 0;
                if (coins[ind] <= target)
                    taken = dp[ind][target - coins[ind]];

                dp[ind][target] = notTaken + taken;
            }
        }

        System.out.println(dp[coins.length-1][T]);
    }
    private int  recursion(int target,int[] coins){
        return 0;
    }
}
