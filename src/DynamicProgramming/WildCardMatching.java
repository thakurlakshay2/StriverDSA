package DynamicProgramming;

//https://takeuforward.org/data-structure/wildcard-matching-dp-34/
public class WildCardMatching {

    static boolean isAllStars(String S1, int i) {
        for (int j = 1; j <= i; j++) {
            if (S1.charAt(j - 1) != '*')
                return false;
        }
        return true;
    }
    public void isWideCardMatching(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        boolean dp[][] = new boolean[n + 1][m + 1];
        dp[0][0] = true;


        for (int j = 1; j <= m; j++) {
            dp[0][j] = false;
        }
        for (int i = 1; i <= n; i++) {
            dp[i][0] = isAllStars(s1, i);
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1) || s1.charAt(i - 1) == '?') {
                    dp[i][j] = dp[i - 1][j - 1]; // Characters match or '?' is encountered.
                } else {
                    if (s1.charAt(i - 1) == '*') {
                        dp[i][j] = dp[i - 1][j] || dp[i][j - 1]; // '*' matches one or more characters.
                    } else {
                        dp[i][j] = false; // Characters don't match, and S1[i-1] is not '*'.
                    }
                }
            }
        }

    }
}
