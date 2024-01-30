package Arrays;
//https://leetcode.com/problems/sort-colors/\
import java.util.*;

public class SortColors extends PrintSolution {

    public void SortColorBrute(int[] num){
        //Sorting the array would work /
        //Time complexity O(nlogn)
        Arrays.sort(num);
        print(num);
    }

    public void SortColorOptimised(int[] nums){

        int zero=-1;
        int one=0;
        int two= nums.length;

        while(two>one && two>zero){
            if(nums[one]==0){
                ++zero;
                int temp=nums[one];
                nums[one]=nums[zero];
                nums[zero]=temp;
                one++;
            }else if(nums[one]==1){

                one++;
            }else{
                --two;
                int temp=nums[two];
                nums[two]=nums[one];
                nums[one]=temp;
                one++;
            }
        }

        print(nums);

    }
}
