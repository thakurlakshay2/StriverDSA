package StacknQueue;

import java.util.Stack;

//https://www.interviewbit.com/problems/nearest-smaller-element/
public class NextSmallestElement {

    public void nse(int[] nums){

        Stack<Integer> st=new Stack<>();
        System.out.print("-1 ");
        st.push(nums[0]);
        for(int i=1;i<nums.length;i++){
            while (!st.isEmpty() && st.peek()>nums[i]){
                st.pop();
            }
            if(st.isEmpty()) System.out.print("-1 ");
            else System.out.print(st.peek()+" ");

            st.push(nums[i]);
        }
        System.out.println();
    }
}
