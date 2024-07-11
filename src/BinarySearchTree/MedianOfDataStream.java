package BinarySearchTree;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianOfDataStream {
    private PriorityQueue<Integer> small = new PriorityQueue<>(Collections.reverseOrder());
    private PriorityQueue<Integer> large = new PriorityQueue<>();
    private boolean even = true;
    public void addNum(int num) {
        if (even) {
            large.offer(num);
            small.offer(large.poll());
        } else {
            small.offer(num);
            large.offer(small.poll());
        }
        even = !even;
    }

    public double findMedian() {
        if (even)
            return (small.peek() + large.peek()) / 2.0;
        else
            return small.peek();

    }
    public static void main(String[] args) {
        MedianOfDataStream obj=new MedianOfDataStream();
        obj.addNum(2);
        obj.addNum(21);
        obj.addNum(3);
        obj.addNum(32);
        obj.addNum(24);
        obj.addNum(232);
        obj.addNum(21);
        System.out.println( obj.findMedian());
        obj.addNum(1);
        obj.addNum(7);
        obj.addNum(44);
        obj.addNum(87);
        obj.addNum(54);
        System.out.println( obj.findMedian());
        obj.addNum(99);
        obj.addNum(54);
        obj.addNum(334);

       System.out.println( obj.findMedian());
    }
}
