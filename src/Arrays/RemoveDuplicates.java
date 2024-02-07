package Arrays;

//https://takeuforward.org/data-structure/remove-duplicates-in-place-from-sorted-array/
public class RemoveDuplicates {
    public void removeDuplicatesInPlaceOptimised(int[] nums){
    int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
            }

        }


        PrintSolution.print(nums);

    }
}
