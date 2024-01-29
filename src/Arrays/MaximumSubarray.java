package Arrays;

public class MaximumSubarray {
    int maxSubarrayOptimised(int[] num){
        int maxTillNow=0;
        int maxTotal=0;
        for(int val:num){
            maxTillNow=Math.max(maxTillNow+val,val);
            maxTotal=Math.max(maxTillNow,maxTotal);

        }

        return maxTotal;
    }
}
