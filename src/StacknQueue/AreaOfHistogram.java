package StacknQueue;

import java.util.Stack;

public class AreaOfHistogram {

    // time o 3n space O2n
    public void histogramOptimisedApproach1(int[] nums){
        Stack<Integer> stack=new Stack<>();

        int[] leftSmall=new int[nums.length];
        int[] rightSmall=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            while (!stack.isEmpty() &&  nums[stack.peek()]>=nums[i]  ){
                stack.pop();
            }
            if(stack.isEmpty()) leftSmall[i]=0;
            else leftSmall[i]=stack.peek()+1;
            stack.push(i);
        }
        while (!stack.isEmpty()) stack.pop();
        for(int i=nums.length-1;i>=0;i--){
            while (!stack.isEmpty() &&  nums[stack.peek()]>=nums[i]  ){
                stack.pop();
            }
            if(stack.isEmpty()) rightSmall[i]= nums.length-1;
            else rightSmall[i]=stack.peek()-1;
            stack.push(i);
        }

        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]*(rightSmall[i]-leftSmall[i]+1));
        }
        System.out.println(max);

    }
}
