package Arrays;

//https://takeuforward.org/data-structure/find-the-majority-element-that-occurs-more-than-n-2-times/
//https://takeuforward.org/data-structure/majority-elementsn-3-times-find-the-elements-that-appears-more-than-n-3-times-in-the-array/

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    //Brute force would be tofind frequency of all elements and put them in hashmap , then iterating it.
    public void majorityElemenMoreThanHalfBrute(int[] nums){

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int val:nums){
            int freq=1;
            if(map.containsKey(val)){
               freq+=map.get(val);

            }

            map.put(val,freq);

        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){


            if(entry.getValue()>nums.length/2){
                System.out.println(entry.getKey());
                return;
            }
        }
    }
    public void majorityElemenMoreThanHalfOptimised(int[] nums){

        int maxNum=nums[0];
        int freq=1;
        for(int i=1;i<nums.length;i++){
           if(nums[i]==maxNum){
               freq++;
           }else{
               freq--;
               if(freq==0){
                   maxNum=nums[i];
                   freq=1;
               }
           }

        }
    System.out.println(maxNum);

    }

    //Boyre morre's voting algorithm
    public void majorityElemenMoreThanOneThirdOptimised(int[] v){
        int n = v.length; //size of the array

        int cnt1 = 0, cnt2 = 0; // counts
        int el1 = Integer.MIN_VALUE; // element 1
        int el2 = Integer.MIN_VALUE; // element 2

        // applying the Extended Boyer Moore's Voting Algorithm:
        for (int i = 0; i < n; i++) {
            if (cnt1 == 0 && el2 != v[i]) {
                cnt1 = 1;
                el1 = v[i];
            } else if (cnt2 == 0 && el1 != v[i]) {
                cnt2 = 1;
                el2 = v[i];
            } else if (v[i] == el1) cnt1++;
            else if (v[i] == el2) cnt2++;
            else {
                cnt1--; cnt2--;
            }
        }



        // Manually check if the stored elements in
        // el1 and el2 are the majority elements:
        cnt1 = 0; cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] == el1) cnt1++;
            if (v[i] == el2) cnt2++;
        }


        System.out.println(el1+" - "+el2);


     }
}
