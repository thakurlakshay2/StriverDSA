package Arrays;

import java.util.Stack;

public class MaximumConsecutiveOnes {

    public void maximumConsecOnesOptimised(int[] nums){
        int max=0;
        int maxTN=0;
        for(int val:nums){
            if(val==0){
                max=Math.max(maxTN,max);
                maxTN=0;
            }else{

                maxTN++;
            }
        }
        System.out.println(max);
    }
}
