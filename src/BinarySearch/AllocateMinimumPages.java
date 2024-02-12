package BinarySearch;

//https://takeuforward.org/data-structure/allocate-minimum-number-of-pages/
public class AllocateMinimumPages {
    public void allocatePages(int[] nums,int m){
        int lo=nums[0];
        for(int val:nums){
            lo=Math.max(lo,val);
        }
        int hi=0;
        for(int val:nums){
            hi+=val;
        }
        while (lo<=hi){
            int mid=(lo+hi)/2;
            int studn=count(nums,mid);
            if(studn>m){
                lo=mid+1;
            }else {
                hi=mid-1;
            }
        }

        System.out.println(lo);
    }
    private int count(int[] nums,int pages){
        int student=1;
        int pagegiven=0;
        for(int i=0;i<nums.length;i++){
            if(pagegiven+nums[i]<=pages){
                pagegiven+=nums[i];
            }else{
                student++;
                pagegiven=nums[i];
            }
        }
        return student;
    }
}
