package Arrays;

import java.util.Arrays;

//https://takeuforward.org/data-structure/3-sum-find-triplets-that-add-up-to-a-zero/
public class ThreeSum {

    public void threeSum(int[] nums){
        Arrays.sort(nums);
        int n=nums.length;

        for(int i=0;i<n;i++ ){
            if(i!=0 && nums[i]==nums[i-1]) continue;

            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    System.out.println(nums[i]+" " +nums[j]+" "+nums[k]);
                    k--;
                    j++;
                    while (j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                    while (j<k && nums[k]==nums[k+1]){
                        k--;
                    }
                }else if(sum>0){
                    k--;
                }else{
                    j++;
                }
            }

        }
    }
}
