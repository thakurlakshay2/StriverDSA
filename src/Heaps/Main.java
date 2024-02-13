package Heaps;

public class Main {
    public static void main(String[] args) {
        MinHeap q1=new MinHeap();
        q1.buildHeapFromArray(new int[]{3,4,2,1,5,6,8,9});
        System.out.println(q1.getMin());
        System.out.println(q1.getMax());
        int[] pop=q1.pop();
        System.out.println(pop[0]+" - "+ pop[1]);
        System.out.println(q1.getMin());
        System.out.println(q1.getMax());

        KthlargestElement q2=new KthlargestElement();
        q2.kthLargest(new int[]{3,2,1,3,4,5,2,6},4);

        MaximumSumCombination q3=new MaximumSumCombination();
        q3.maximumSumCombination(new int[]{1,4,2,3},new int[]{2, 5, 1, 6},4);

        TopKFrequentElement q4=new TopKFrequentElement();
        q4.findElement(new int[]{1,1,1,2,2,3,3,4,5,5,5,5,6},2);
    }
}
