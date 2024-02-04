package Arrays;
//https://takeuforward.org/data-structure/two-sum-check-if-a-pair-with-given-sum-exists-in-array/
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    // o n^2  time
    public void twoSumBrute(int[] nums,int target){
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println("YES");
                    System.out.println(i+" - "+j);
                    return;
                }
            }
        }
        System.out.println("NO");
        return;
    }

    //O n log n time
    //If yopu want all the list of numbers giving target , just make a list and whenever that condition is met add
    //to the list
    public void twoSumOptimised(int[] nums,int target){
        Arrays.sort(nums);

        int i=0;
        int j=nums.length-1;

        while(i<j){
            int sum=nums[i]+nums[j];
            if(sum==target){
                System.out.println("YES");
                System.out.println(nums[i]+" - "+nums[j]);
                return;
            }else if(sum>target){
                j--;
            }else{
                i++;
            }
        }
        System.out.println("NO");

    }

    //O n time  On space
    public void twoSumOptimisedMore(int[] nums,int target){
        HashMap<Integer,Integer> hashmap=new HashMap<>();

        for(int i =0;i<nums.length;i++){
            if(hashmap.containsKey(target-nums[i])){
                System.out.println("YES "+ i+" - "+ hashmap.get(target-nums[i]));
                return;
            }
            hashmap.put(nums[i],i);
        }
        System.out.println("NO");
    }
}
