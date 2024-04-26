package BinarySearch;

//https://takeuforward.org/data-structure/search-single-element-in-a-sorted-array/
public class SearchASingleElementInRepeatedArray {

    //1. One method is simple time: 0(n) traversal with O(1) space.. but this is very brute and basic approach

    //2. Using Bit manipulation , fun and different approach, to impress.
    //Logic is to use XOR (basically if occurrence of the same bit is odd, the it is on(1) else  off(0)  )
    //Time: O(n);
    //space: O(1);
    public void searchBrute(int[] nums){
        int ans=0;
        for(int i=0;i< nums.length;i++){
            ans^=nums[i];
        }
        System.out.println(ans);
    }


    //3. Binary searching the single element
    //time: O(logn)
    //space o(1)
    public void binarySearch(int[] nums){
        int lo=0;
        int hi=nums.length-1;
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
