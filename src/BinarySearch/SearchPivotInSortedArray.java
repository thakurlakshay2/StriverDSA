package BinarySearch;

public class SearchPivotInSortedArray {
    //simple algo in linear search
    public void pivotSortedSearch(int[] nums,int k){
        binarySearch(nums,k);
    }

    //BUG  FIX REQUIRED . stack overflow error
    private void binarySearch(int[] nums,int k){
        int lo=0;
        int hi=nums.length-1;
        while(lo<=hi){
            int mid= (hi+lo)/2;
            if(nums[mid]==k){
                System.out.println(mid);
                return ;
            }
            if(nums[mid]>=nums[lo]){
                if(nums[lo]<=k && k<=nums[mid]){
                    hi=mid-1;
                }else{
                    lo=mid+1;
                }
            }else{
                if(nums[hi]>=k && k>=nums[mid]){
                    lo=mid+1;
                }else{
                    hi=mid-1;
                }
            }
        }
        System.out.println("Not found");
    }
}
