package DP;

import java.util.Arrays;
import java.util.Map;

//https://takeuforward.org/data-structure/dynamic-programming-ninjas-training-dp-7/
public class NinjaTraining {


    //time :  O(n*4*3)
    //space : O(n*4)+ O(n) (dp array + recursive stack space)
    public int f(int day,int last,int[][] points,int[][] dp){

        if(dp[day][last]!=-1){
            return dp[day][last];
        }
        if(day==0){
            int max=Integer.MIN_VALUE;
            for(int i=0;i<3;i++){
                if(i!=last){
                    max= Math.max(max,points[0][i]);
                }
            }
          return dp[day][last]=max;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=2;i++){
            if(i!=last) {
                int act = points[day][i] + f(day - 1, i, points, dp);
                max = Math.max(max, act);
            }
        }

        return dp[day][last]=max;
    }
    public void ninjaTraining(int n,int[][] points){
        int[][] dp=new int[n][4];
        for(int[] row:dp)
            Arrays.fill(row,-1);

        System.out.println( f(n-1,3,points,dp));
    }
}
