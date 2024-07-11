package BinarySearchTree;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestInAStream {
    private final PriorityQueue<Integer> kthLargest = new PriorityQueue<>();
//    private PriorityQueue<Integer> rest = new PriorityQueue<>(Collections.reverseOrder());
    private int K;
    private int max;
    public void addNum(int num) {

        if (kthLargest.size()<K) {
            kthLargest.offer(num);
//            small.offer(large.poll());
        } else {
            if(num>kthLargest.peek()){
                kthLargest.poll();
                kthLargest.offer(num);
            }

        }

    }

    public double findKthMedian() {
       return kthLargest.peek();

    }

    public static void main(String[] args) {
        KthLargestInAStream obj=new KthLargestInAStream();
        obj.K=2;
        obj.addNum(2);
        obj.addNum(21);
        obj.addNum(3);
        obj.addNum(32);
        obj.addNum(24);
        obj.addNum(232);
        obj.addNum(21);
        System.out.println( obj.findKthMedian());
        obj.addNum(1);
        obj.addNum(7);
        obj.addNum(44);
        obj.addNum(87);
        obj.addNum(54);
        System.out.println( obj.findKthMedian());
        obj.addNum(99);
        obj.addNum(54);
        obj.addNum(334);
        System.out.println( obj.findKthMedian());

    }
}
