package SlidingWindow;


//https://leetcode.com/problems/longest-repeating-character-replacement/description/
public class LongestRepeatingCHaraterReplacement {

    //time o(n) amortised
    //space O(1)
    public static void optimal(String s,int k){
        int end=0;
        int start=0;
        int maxlen=0;
        int maxcnt=0;
        int[] cnt=new int[26];
        for(end=0;end<s.length();end++){
            maxcnt=Math.max(maxcnt,++cnt[s.charAt(end)-'A']);
            while(end-start+1-maxcnt>k){
                cnt[s.charAt(start) - 'A']--;
                start++;
            }
            maxlen = Math.max(maxlen, end - start + 1);
        }

        System.out.println( maxlen);
    }
    public static void main(String[] args) {
        optimal("AABABBA",1);
    }
}
