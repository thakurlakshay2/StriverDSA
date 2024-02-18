package StacknQueue;

import Arrays.PrintSolution;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum extends PrintSolution {

    public void slide(int[] nums, int k){
        int currSum=0;
        Deque<Integer> dq=new ArrayDeque<>();
        int a=0;
        int[] ans=new int[nums.length-k+1];
        for(int i=0;i<nums.length;i++){
            while (!dq.isEmpty() && dq.peek()<i-k+1){
                dq.poll();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]){
                dq.pollLast();
            }


            dq.add(i);
            if(i>=k-1){
                ans[a++]=nums[dq.peek()];
            }
        }
        print(ans);

    }
}
