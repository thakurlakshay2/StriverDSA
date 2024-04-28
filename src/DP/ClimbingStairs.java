package DP;


//https://takeuforward.org/data-structure/dynamic-programming-climbing-stairs/
//https://leetcode.com/problems/climbing-stairs/description/
public class ClimbingStairs {

    // time : O(3*n)
    // space: O(1)
    public int recursive(int n){
        if(n<=0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        //take 1 step
        int cnt1=recursive(n-1);
        //take 2 step
        int cnt2=recursive(n-1);
        //take 3 step
        int cnt3=recursive(n-1);

        return cnt1+cnt2+cnt3;

    }

    // time : O(3*n)
    // space: O(1)
    public int travel(int n){

        if(n==0) return 0;
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        dp[3]=4;

        if(n<=3) return dp[n];
      for(int i=5;i<=n;i++){

          dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
      }


        return dp[n];
    }
}
