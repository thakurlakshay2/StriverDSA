package Strings;

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
    }
}
