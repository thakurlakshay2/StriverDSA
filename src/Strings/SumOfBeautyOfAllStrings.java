package Strings;

//https://leetcode.com/problems/sum-of-beauty-of-all-substrings/description/
public class SumOfBeautyOfAllStrings {
    //Time : O(n)*26
    //space: O(26);

    public static void main(String[] args) {
        String s="aabcbaa";
        int ans=0;
        for(int i=0;i<s.length();i++){
            int [] freq=new int [26];
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                freq[ch-'a']++;
                int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                for(int k=0;k<26;k++){
                    if(freq[k]>0){
                        min=Math.min(min,freq[k]);
                        max=Math.max(max,freq[k]);
                    }
                }
                ans+=max-min;
            }
        }
        System.out.println(ans);
    }
}
