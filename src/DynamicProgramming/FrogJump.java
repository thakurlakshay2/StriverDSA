package DynamicProgramming;

//https://takeuforward.org/data-structure/dynamic-programming-frog-jump-dp-3/
public class FrogJump {


    //time : O(n);
    //space : O(n);
    public int travel(int[] height, int n){

        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=height[1];
        dp[2]=Math.abs(height[1]-height[0]);
        if(n<=2) return dp[n];
        for(int i=3;i<=n;i++){
            int posJump1=dp[i-1]+Math.abs(height[i-2]-height[i-1]);
            int posJump2=dp[i-2]+Math.abs(height[i-3]-height[i-1]);
            dp[i]= Math.min(posJump2,posJump1);
        }

        return dp[n];
    }
}
