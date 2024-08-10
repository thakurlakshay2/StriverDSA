package GreedyAlgorithm;

import java.util.Stack;

//https://leetcode.com/problems/split-a-string-in-balanced-strings/description/
public class SplitaStringinBalancedStrings {
    //Time: O(n);
    //Space: O(n);
    public int balancedStringSplit(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!st.isEmpty() && ((c == 'R' && st.peek() == 'L') || (c == 'L' && st.peek() == 'R'))) {
                st.pop();
            } else {
                st.push(c);
            }
            if (st.isEmpty()) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s="RLRRLLRLRL";

        System.out.println(new SplitaStringinBalancedStrings().balancedStringSplit(s));
    }
}
