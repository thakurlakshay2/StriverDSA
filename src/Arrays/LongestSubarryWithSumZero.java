package Arrays;

import java.util.HashMap;
import java.util.Map;

//https://takeuforward.org/data-structure/length-of-the-longest-subarray-with-zero-sum/
public class LongestSubarryWithSumZero {

    public void longesSubarraySumZeroOptimised(int[] nums){
        int n=nums.length;
        int maxi=0;

        HashMap<Integer,Integer> map=new HashMap<>();
        int sumTillNow=0;
        for(int i=0;i<n;i++){
            sumTillNow+=nums[i];


            if(sumTillNow==0){
                maxi=i+1;
                System.out.println(0 +" - "+i);
                continue;
            }
            if(map.containsKey(sumTillNow) ){
                int st=map.get(sumTillNow)+1;
                maxi=Math.max(maxi,i-map.get(sumTillNow));
                System.out.println(st+" - "+i);
            }else{
                map.put(sumTillNow,i);
            }


        }
    System.out.println(maxi);
//        for(int j=0;j<n;j++){
//            for(Map.Entry<Integer,Integer> m: map.entrySet()){
//                int recordedSum=m.getKey();
//                if(m.getValue()>j && recordedSum-sumArray[j]==0){
//                    int end=m.getValue();
//
//                    System.out.println((j+1)+" - "+end);
//                }
//
//            }
//
//        }
    }
}
