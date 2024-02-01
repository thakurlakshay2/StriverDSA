package Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

//https://takeuforward.org/data-structure/merge-overlapping-sub-intervals/
public class MergeOverlapIntervals extends PrintSolution {
    public void mergeOverlapIntervalsCodeOptimised(int[][] nums){
        Arrays.sort(nums, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });

        Stack<int[]> stackTrace=new Stack<>();
        stackTrace.push(nums[0]);

        for(int[] val: nums){
            int[] peekValue=stackTrace.peek();
            if(peekValue[1]>=val[0]){
                int[] newRange=new int[]{Math.min(peekValue[0],val[0]),Math.max(peekValue[1],val[1])};
                stackTrace.pop();
                stackTrace.push(newRange);
            }else{
                stackTrace.push(val);
            }
        }

        int[][] ansArr=new int[stackTrace.size()][2];
        int i=stackTrace.size()-1;
        while(!stackTrace.isEmpty()){
            ansArr[i]=stackTrace.pop();
            i--;
        }
        print(ansArr);
    }

}
