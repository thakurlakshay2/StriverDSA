package BinarySearch;

//https://leetcode.com/problems/find-peak-element
public class FindPeakElement {
    public void fpe(int[] nums) {
        int lo=0;
        int hi=nums.length-1;

        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]<nums[mid+1]){
                lo=mid+1;
            }
            else{
                hi=mid;
            }
        }

        System.out.println( lo);
    }
}
