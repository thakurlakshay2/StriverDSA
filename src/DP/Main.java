package DP;

public class Main {
    public static void main(String[] args) {
        maximumProductSubarray q1=new maximumProductSubarray();
        q1.mps(new int[]{1,3,4,-3,5,7,8});

        LIS q2=new LIS();
        q2.longIncSubseq(new int[]{10, 9, 2, 5, 3, 7, 101, 18});

        LCS q3=new LCS();
        q3.longestCommonSubs("acd","ced");

        Knapsack q4=new Knapsack();
        q4.knapsack01(new int[]{1, 2, 4, 5}, new int[]{5,4,8,6}, 5);

        EditDistance q5=new EditDistance();
        q5.editDistance("horse","ros");

        MaximumSumIncreasingubsequence q6=new MaximumSumIncreasingubsequence();
        q6.msIS(new int[]{1,100,2,3,100});

        MinimumPathSum q7=new MinimumPathSum();
        q7.MPS(new int[][]{ {5, 9, 6},
                {11, 5, 2}});

        CoinChange q8=new CoinChange();
        q8.CC(new int[]{1,2,3}, 4);

        SubSetSum q9=new SubSetSum();
        q9.ssSum(new int[]{1,2,3,4},4);

        RodCuttingProblem q10=new RodCuttingProblem();
        q10.rcProblem(new int[]{2,4,6},new int[]{5,11,13},10);
    }
}
