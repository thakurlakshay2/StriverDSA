package Strings;

import java.util.Arrays;

//KMP algorithm
public class LongestHappyPrefix {
    //O(n) time
    // O(n) space
    public static void main(String[] args) {
        String s="";

        int[] pref = new int[s.length()];
        Arrays.fill(pref, -1);
        int i = 1, j = 0;
        int max = -1;
        while (i < s.length()) {
            if (s.charAt(i) == s.charAt(j)) {
                pref[i] = j;
                i++;
                j++;
            } else if (j > 0) {
                j = pref[j - 1] + 1;
            } else {
                i++;
            }
        }
        max = pref[s.length() - 1];
        System.out.println(s.substring(0, max + 1));
    }
}
