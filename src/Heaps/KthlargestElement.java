package Heaps;

import java.util.PriorityQueue;

public class KthlargestElement {

    public void kthLargest(int[] nums,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(nums[i]);
        }
        for(int i=k;i<nums.length;i++){
            if(pq.peek()<nums[i]){
                pq.remove();
                pq.add(nums[i]);
            }
        }

        System.out.println(pq.peek());
    }
}
