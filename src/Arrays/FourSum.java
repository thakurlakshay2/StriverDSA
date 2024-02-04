package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

//https://takeuforward.org/data-structure/4-sum-find-quads-that-add-up-to-a-target-value/
public class FourSum {
    private final static class Pair{
        int st;
        int end;

        public Pair(int st,int end) {
            this.st = st;
            this.end=end;
        }
    }
    public void fourSomeOptimised(int[] nums,int target){
        HashMap<Integer,Pair> hashmap=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(hashmap.containsKey(target-nums[i]-nums[j])){
                    Pair p1=hashmap.get(target-nums[i]-nums[j]);
                    System.out.println("YES "+i+" - "+j+" - "+p1.st+" - "+p1.end);
                    return ;
                }
                hashmap.put(nums[i]+nums[j],new Pair(i,j));
            }
        }
        System.out.println("NO");
    }

    public void fourSomeOptimisedExtraSpace(int[] nums,int target){
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
               if(j==i+1 && nums[j]==nums[j-1]) continue;
               int k=j+1;
               int l=nums.length-1;
               while (k<l){
                   int sum=nums[i]+nums[j]+nums[k]+nums[l];
                   if(sum==target){
                       List<Integer> temp = new ArrayList<>();
                       temp.add(nums[i]);
                       temp.add(nums[j]);
                       temp.add(nums[k]);
                       temp.add(nums[l]);
                       ans.add(temp);
                       k++;
                       l--;
                       while(k<l && nums[k]==nums[k-1]) k++;
                       while(k<l && nums[l]==nums[l+1]) l--;
                   }else if(sum<target){
                       k++;
                   }else{
                       l--;
                   }

               }
            }
        }
        System.out.println("NO");
    }
}
