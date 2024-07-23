package Arrays;


import java.util.Arrays;

//ALSO A DP SOLUTION.... question asked in interview.
//https://leetcode.com/problems/find-two-non-overlapping-sub-arrays-each-with-target-sum/description/
public class FindTwoNonOverlapingSubArraysQithTargetSum {
    public int minSumOfLengths(int[] arr, int target) {
        int[] left = findMinLengths(0, arr.length, target,arr);
        int[] right = findMinLengths(arr.length-1, 0,target,arr);

        for(int i=1;i<arr.length;i++)
            left[i] = Math.min(left[i],left[i-1]);

        for(int i=arr.length-2;i>=0;i--)
            right[i] = Math.min(right[i],right[i+1]);

        int min = arr.length+1;

        for(int i=0;i<arr.length-1;i++)
            min = Math.min(min,left[i] + right[i+1]);

        return min == arr.length+1 ? -1 : min;
    }

    private int[] findMinLengths(int start,int end,int target,int[] arr){
        int[] ans = new int[arr.length];

        Arrays.fill(ans,arr.length);

        int i = start,j = start;
        int sum = 0;

        int dir = (int)Math.signum(end-start);

        while(j != end){
            sum += arr[j];

            while(sum > target){
                sum -= arr[i];
                i += dir;
            }

            if(sum == target){
                ans[j] = Math.abs(i-j)+1;
            }

            j+=dir;
        }

        return ans;
    }
    public static void main(String[] args) {
        FindTwoNonOverlapingSubArraysQithTargetSum o=new FindTwoNonOverlapingSubArraysQithTargetSum();
        o.minSumOfLengths(new int[]{4,3,2,6,2,3,4},6);
    }
}
