package Arrays;

import java.util.HashMap;

public class CountSubArrayWithXOR {

    public void countSubArrayWithXOR(int[] nums,int k){
        int xor=0;
        int max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(xor,1);

        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
            if(map.containsKey(xor^k)){
                max+=map.get(xor^k);
            }
            if(map.containsKey(xor)){
                map.put(xor,map.get(xor)+1);
            }else{
                map.put(xor,1);
            }
        }
        System.out.println(max);
    }
}
