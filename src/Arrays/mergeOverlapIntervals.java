package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//https://takeuforward.org/data-structure/merge-overlapping-sub-intervals/
public class mergeOverlapIntervals extends PrintSolution {
    public void mergeOverlapIntervalsCodeOptimised(int[][] nums){
        Arrays.sort(nums, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
//        List<List<Intege>> ans=new ArrayList<ArrayList<Integer>>();
//        List<Integer> l1=new ArrayList<>(new Integer[](){nums[0][0], nums[0][1]}) ;
        print(nums);
    }

}
