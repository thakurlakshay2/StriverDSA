package Trie;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/description/
public class MaximumXORofTwoNumbersInArray {

    public static void main(String[] args) {
        int[] arr=new int[]{3,10,5,25,2,8};

        // brute force would be to check every pair and find maximum
        //time : O(n*n)
        //space: O(1);

        //Better approach
        //time - O(n*32)
        int max = 0, mask = 0;
        for(int i = 31; i >= 0; i--){
            mask = ~((1 << i) - 1);
            int tmp = max | (1 << i);
            Set<Integer> set = new HashSet<Integer>();
            for(int num: arr){
                int val = num & mask;
                if(set.contains(tmp ^ val))
                    max = Math.max(max, tmp);
                set.add(val);
            }
        }
        System.out.println( max);
    }
}
