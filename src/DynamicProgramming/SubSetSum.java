package DynamicProgramming;

public class SubSetSum {
    public void ssSum(int[] num,int target){
        boolean[][] dp=new boolean[num.length][target+1];
        for (int i = 0; i < num.length; i++) {
            dp[i][0] = true;
        }

        // Initialize the first column of the DP table
        if (num[0] <= target) {
            dp[0][num[0]] = true;
        }
        for(int i=1;i<num.length;i++){
            for(int t=1;t<=target;t++){
                boolean notTaken=dp[i-1][t];

                boolean taken=false;
                if(num[i]<=t){
                    taken=dp[i-1][t-num[i]];
                }
                dp[i][t]=taken|| notTaken;
            }
        }

        System.out.println(dp[num.length-1][target]);
    }
}
