package Arrays;

import java.util.Stack;

//https://takeuforward.org/data-structure/trapping-rainwater/
public class TrappedRainwater {

    public void trappedRainwaterOptimised(int[] nums){
        int n=nums.length;
        int maxLeft=0;
        int maxRight=0;

        int waterTrapper=0;
        int left=0;
        int right=n-1;

        while(left<=right){
            if(nums[left]<=nums[right]){
                if(maxLeft<=nums[left]){
                    maxLeft=nums[left];
                }else{
                    waterTrapper+=maxLeft-nums[left];
                }
                left++;
            }
            else
                if(maxRight<=nums[right]){
                    maxRight=nums[right];
                }else{
                    waterTrapper+=maxRight-nums[right];
                }
                right--;
            }

        System.out.println(waterTrapper);
        }



}
