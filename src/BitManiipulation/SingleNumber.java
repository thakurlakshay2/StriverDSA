package BitManiipulation;

import java.util.HashSet;

//https://leetcode.com/problems/single-number/description/
public class SingleNumber
{

    public static int bit(int[] nums){
        int ans = nums[0];

        for(int i = 1 ; i < nums.length ; i++){
            ans = ans ^ nums[i];
        }

        return ans;
    }
    public static void main(String[] args) {
    System.out.println(bit(new int[]{2,2,1}));
    }
}
