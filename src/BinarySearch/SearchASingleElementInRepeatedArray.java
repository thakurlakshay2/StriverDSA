package BinarySearch;

//https://takeuforward.org/data-structure/median-of-row-wise-sorted-matrix/
public class SearchASingleElementInRepeatedArray {


    //Using Bit manipulation
    public void searchBrute(int[] nums){
        int ans=0;
        for(int i=0;i< nums.length;i++){
            ans^=nums[i];
        }
        System.out.println(ans);
    }
    public void binarySearch(int[] nums){
        int lo=0;
        int hi=nums.length-1;
        int cnt=0;
        while(lo<=hi){
            int mid=(hi+lo)/2;

            if(mid%2==0 && nums[mid]==nums[mid+1]){
                lo=mid+1;
            }else if(mid%2==1 && nums[mid]==nums[mid-1]){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        System.out.print(nums[lo]);

    }
}
