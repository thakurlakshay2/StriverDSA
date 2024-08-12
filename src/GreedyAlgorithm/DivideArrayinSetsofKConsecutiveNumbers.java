package GreedyAlgorithm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/divide-array-in-sets-of-k-consecutive-numbers/description/
public class DivideArrayinSetsofKConsecutiveNumbers {
    public boolean isPossibleDivide(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        while (!map.isEmpty()) {
            int first = Collections.min(map.keySet());
            for (int i = first; i < first + k; i++) {
                if (!map.containsKey(i)) {
                    return false;
                }
                map.put(i, map.get(i) - 1);
                if (map.get(i) == 0) {
                    map.remove(i);
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        DivideArrayinSetsofKConsecutiveNumbers q=new DivideArrayinSetsofKConsecutiveNumbers();
        q.isPossibleDivide(new int[]{1,22,3,3,4,4,6,7,8},4);
    }
}
