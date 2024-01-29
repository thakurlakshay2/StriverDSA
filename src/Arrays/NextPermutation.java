package Arrays;
import java.util.Arrays;

//Idea is to find a number from last that has just a lower number next to it on both end and finding a
//place to swap it.
public class NextPermutation {
    protected  void nextPermutationSolve(int[] nums){
        int length=nums.length;
        int swapElement=0;
        for(int i=length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                swapElement=i;
                break;
            }
        }
        int swapb=length-1;
        for(int i=length-1;i>swapElement;i--){
            if(nums[i]>nums[swapElement]){
                swapb=i;
                break;
            }
        }
        int a=nums[swapElement];
        nums[swapElement]=nums[swapb];
        nums[swapb]=a;

        //now sort from swapelement +1 to end;
        Arrays.sort(nums,swapElement+1,length);
    }
}
