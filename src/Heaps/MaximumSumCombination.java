package Heaps;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;

public class MaximumSumCombination {

    public void maximumSumCombination(int[] a,int[] b ,int c){
        Arrays.sort(a);
        Arrays.sort(b);
        int[] cc=new int[c];
        HashSet<String> set=new HashSet<>();
        PriorityQueue<int[]> pq=new PriorityQueue<>((a1, b1) -> Integer.compare(b1[0], a1[0]));
        int n=a.length;
        pq.add(new int[]{a[n-1]+b[n-1],n-1,n-1});
        set.add((n-1)+"-"+(n-1));

        while (c>0){
            int[] top = pq.poll();
            int i = top[1];
            int j = top[2];
            cc[c - 1] = top[0];

            String f1 = (i - 1) + "-" + j;
            String f2 = i + "-" + (j - 1);

            if (!set.contains(f1) && i - 1 >= 0) {
                pq.add(new int[]{a[i - 1] + b[j], i - 1, j});
                set.add(f1);
            }

            if (!set.contains(f2) && j - 1 >= 0) {
                pq.add(new int[]{a[i] + b[j - 1], i, j - 1});
                set.add(f2);
            }
            c--;
        }
        for (int val:cc){
            System.out.print(val+" ");
        }
        System.out.println();
    }
}
