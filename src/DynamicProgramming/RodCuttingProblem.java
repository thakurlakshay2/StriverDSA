package DynamicProgramming;

public class RodCuttingProblem {

    public void rcProblem(int[] wt,int[] val,int w){
        float[][] dp=new float[wt.length][w+1];

        for(int i=wt[0];i<=w;i++){
            dp[0][i]=(float)(i/wt[0])*(float) val[0];
        }

        for(int i=1;i<wt.length;i++){
            for(int weight=0;weight<=w;weight++){
                float notTaken=dp[i-1][weight];

                float taken=Integer.MIN_VALUE;
                //repeat same cut allowed
                if(wt[i]-weight<=0){
                    taken=dp[i][weight-wt[i]]+val[i];
                }
                dp[i][weight]=Math.max(taken,notTaken);
            }
        }

        System.out.println(dp[wt.length-1][w]);
    }
}
