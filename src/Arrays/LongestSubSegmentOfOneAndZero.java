package Arrays;

import java.util.Map;

//https://www.geeksforgeeks.org/longest-subsegment-1s-formed-changing-k-0s/
public class LongestSubSegmentOfOneAndZero {

    //amortiazed
    //time : best is O(n) , worst might be O(
    public void ZeroOne(int[] arr,int k){


        int l=0;
        int zeroCount=0;
        int maxLen=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                zeroCount++;
            while(zeroCount>k){
                if(arr[l]==0)
                    zeroCount--;
                l++;
            }


            maxLen= Math.max(maxLen,i-l+1);
        }

        System.out.println(maxLen);
    }
}
