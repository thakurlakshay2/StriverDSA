package DP;

import java.util.Arrays;

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

        EggDroppingPuzzle q11=new EggDroppingPuzzle();
        q11.eddDrop(3,5);

        WordBreak q12=new WordBreak();
        q12.wb(new String[]{"leet","code"},"leetcode");

        ClimbingStairs q13=new ClimbingStairs();
        System.out.println(q13.travel(5));

        FrogJump  q14=new FrogJump();
        System.out.println(q14.travel(new int[]{10,20,30,10},4));

        HouseRobber   q15=new HouseRobber();
        q15.robStreet(9, new int[]{1,2,3,1,3,5,8,1,9});

        GridUniquePath q16=new GridUniquePath();
        q16.countWays(3,2);

        WildCardMatching q17=new WildCardMatching();
        q17.isWideCardMatching("ab*cd","abdefcd");

        JobScheduling q18=new JobScheduling();
        q18.jobScheduling(new int[]{1,1,1},new int[]{1,2,3}, new int[]{5,6,3});
    }
}
