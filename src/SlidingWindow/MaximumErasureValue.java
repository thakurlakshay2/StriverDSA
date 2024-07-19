package SlidingWindow;

import java.util.HashSet;

//https://leetcode.com/problems/maximum-erasure-value/description/
public class MaximumErasureValue {
    //Time: O(n);
    //Space: O(n)
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Number> set=new HashSet<>();
        int start=0; int end=1;
        int sum=nums[0];
        int max=sum;
        set.add(nums[0]);
        while(end<nums.length){
            while(start<nums.length &&  set.contains(nums[end])){
                set.remove(nums[start]);
                sum-=nums[start];
                start++;
            }

            set.add(nums[end]);
            sum+=nums[end];
            max=Math.max(max,sum);

            end++;

        }

        return max;

    }
    public static void main(String[] args) {
        MaximumErasureValue o=new MaximumErasureValue();
        System.out.println(o.maximumUniqueSubarray(new int[]{5,2,1,2,5,2,1,2,5}));
    }
}
