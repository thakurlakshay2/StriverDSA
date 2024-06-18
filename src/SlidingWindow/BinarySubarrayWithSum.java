package SlidingWindow;

//https://leetcode.com/problems/binary-subarrays-with-sum/description/
public class BinarySubarrayWithSum {


    //timr : O(n)
    //space : O(1)
    public static void optimal(int[] nums,int goal){
        int i = 0, count = 0, res = 0;
        for (int j = 0; j < nums.length; ++j) {
            if (nums[j] == 1) {
                goal--;
                count = 0;
            }

            while (goal == 0 && i <= j) {
                goal += nums[i];
                i++;
                count++;
                if (i > j - goal + 1)
                    break;
            }

            while (goal < 0) {
                goal += nums[i];
                i++;
            }

            res += count;
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        optimal(new int[]{1,0,0,1,0,1,1,1,0,1,0},3);
    }
}
