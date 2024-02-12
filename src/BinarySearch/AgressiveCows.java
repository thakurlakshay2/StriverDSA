
package BinarySearch;

import java.util.Arrays;

//https://takeuforward.org/data-structure/aggressive-cows-detailed-solution/
public class AgressiveCows {
    public void cows(int[] nums,int k){

        Arrays.sort(nums);
        int lo=1;
        int hi=nums[nums.length-1] - nums[0];
        while (lo<=hi)
        {
            int mid=(lo+hi)/2;
            if(compute(nums,mid,k)==true){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        System.out.println(hi);

    }
    private boolean compute(int[] nums, int dist,int k){
        int n=1;
        int st=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]-st>=dist){
                n++;
                st=nums[i];
            }

        }
        if(n>=k) return true;
        return false;
    }
}
