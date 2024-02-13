package Heaps;

import java.util.PriorityQueue;

public class TopKFrequentElement {
    public void findElement(int[] nums,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int val:nums){
            pq.add(val);
        }
        int freq=1;
        int num=pq.poll();
       while(!pq.isEmpty()){
           int val=pq.poll();
           if(val==num){
               freq++;
           }else{
               freq=1;
               num=val;
           }

            if(k==freq){
                freq=1;
                System.out.print(num+" ");
                num=pq.poll();
            }

        }
    }
}
