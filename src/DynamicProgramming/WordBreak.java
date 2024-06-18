package DynamicProgramming;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


//https://leetcode.com/problems/word-break/submissions/345522073/
public class WordBreak {
    public void wb(String[] wordDict,String s){
        Set<String> dict = new HashSet<>(List.of(wordDict));
        if (s == null || s.length() == 0) {System.out.println(false);
        return;}

        int n = s.length();

        // dp[i] represents whether s[0...i] can be formed by dict
        boolean[] dp = new boolean[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                String sub = s.substring(j, i + 1);

                if (dict.contains(sub) && (j == 0 || dp[j - 1])) {
                    dp[i] = true;
                    break;
                }
            }
        }

        System.out.println( dp[n - 1]);
    }
}
