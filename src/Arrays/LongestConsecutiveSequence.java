package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://takeuforward.org/data-structure/longest-consecutive-sequence-in-an-array/
public class LongestConsecutiveSequence {
    //First approach is O n^2 linear search of every element to be found;
    public void  longestConsecSeqBetterApproach(int[] nums){
        Arrays.sort(nums);
        int maxLength=1;
        int currLength=1;
        for(int i=1;i<nums.length;i++){

            if(nums[i]==nums[i-1]+1){
                currLength++;
            }else{
                maxLength=Math.max(currLength,maxLength);
            }
        }
        System.out.println(maxLength);
    }
    public void  longestConsecSeqOptimal(int[] nums){
        Set<Integer> set=new HashSet<>();
        int maxLength=1;

        for(int val:nums){
            set.add(val);

        }

        for(int val:nums){
           if(!set.contains(val-1)){
               int currLength=1;
                int currVal=val;
               while(set.contains(currVal+1)){
                   currVal++;
                   currLength++;
               }

               maxLength=Math.max(currLength,maxLength);
           }

        }
        System.out.println(maxLength);
    }
}
