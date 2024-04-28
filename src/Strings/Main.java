package Strings;

import DP.LongestPallindromicSubstring;
import DP.MinimumCharacterForPallindrome;

public class Main {
    public static void main(String[] args) {
        ReverseAString q1=new ReverseAString();
        q1.reverse("a little test");
        q1.reverseOptimised("a little test");

        LongestPallindromicSubstring q2=new LongestPallindromicSubstring();
        q2.lps("badad");

        RomanToInteger q3=new RomanToInteger();
        q3.rToI("MCMXCIV");

        LongestCommonPrefix q4=new LongestCommonPrefix();
        q4.lcp(new String[]{"flower","flow","flight"});
        RepeatedStringMatch q5=new RepeatedStringMatch();
        q5.RabinKarpAlgo("sadbutsad","sad",7);

        MinimumCharacterForPallindrome q6=new MinimumCharacterForPallindrome();
        q6.makePallindrome("xxaxxa");

        CountAndSay q7=new CountAndSay();
        q7.countNSay(5);

        CompareVersion q8=new CompareVersion();
        q8.compareVersion("1.01","1.0001");
    }
}
