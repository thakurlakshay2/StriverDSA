package DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//https://takeuforward.org/data-structure/minimum-cost-to-cut-the-stick-dp-50/
public class MinimumCosttoCutStick {


    //time : O(n*n*n)
    //space: O(n*n)
    static int cost(int n, int c, ArrayList<Integer> cuts) {
        // Modify the cuts array
        cuts.add(n);
        cuts.add(0);
        Collections.sort(cuts);

        int[][] dp = new int[c + 2][c + 2];

        for (int[] row : dp) {
            Arrays  .fill(row, 0);
        }

        for (int i = c; i >= 1; i--) {
            for (int j = 1; j <= c; j++) {
                if (i > j) continue;

                int mini = Integer.MAX_VALUE;

                for (int ind = i; ind <= j; ind++) {
                    int ans = cuts.get(j + 1) - cuts.get(i - 1) + dp[i][ind - 1] + dp[ind + 1][j];
                    mini = Math.min(mini, ans);
                }

                dp[i][j] = mini;
            }
        }

        return dp[1][c];
    }
}
