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
    }
}
