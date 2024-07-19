package SlidingWindow;

import java.util.Arrays;

//https://leetcode.com/problems/frequency-of-the-most-frequent-element/description/
public class FrequencyoftheMostFrequentElement {
    //time: O(nlogn)+ O(n);
    //space: O(3);
    public int maxFrequency(int[] nums, int k) {
        int maxFrequency = 0;
        long currentSum = 0;

        Arrays.sort(nums);

        for (int left = 0, right = 0; right < nums.length; ++right) {
            currentSum += nums[right];

            while (currentSum + k < (long) nums[right] * (right - left + 1)) {
                currentSum -= nums[left];
                left++; }


            maxFrequency = Math.max(maxFrequency, right - left + 1);
        }

        return maxFrequency;
    }
    public static void main(String[] args) {
        FrequencyoftheMostFrequentElement o=new FrequencyoftheMostFrequentElement();
        System.out.println(o.maxFrequency(new int[]{1,4,8,13},5));
    }
}
