package SlidingWindow;

import java.util.HashMap;

//https://leetcode.com/problems/subarrays-with-k-different-integers/
public class SubArraysWithKDifferentIntegers {

    //time : O(n*n)
    //space: O(n)
        public static int subarraysWithKDistinct(int[] A, int K) {
            int ans=0;
            int prefix=0;
            int left=0;
            HashMap<Integer,Integer> map=new HashMap<>(K);
            for(int right=0;right<A.length;right++){
                map.put(A[right],map.getOrDefault(A[right],0)+1);
                if(map.size()>K){

                    map.remove(A[left]);
                    prefix=0;
                    left++;
                }
                while(map.get(A[left])>1){
                    map.put(A[left],map.get(A[left])-1);
                    prefix++;
                    left++;
                }
                if(map.size()==K){
                    ans+=prefix+1;
                }
            }

            return ans;
        }

    public static void main(String[] args) {
        subarraysWithKDistinct(new int[]{1,2,1,2,3},2);
    }
}
