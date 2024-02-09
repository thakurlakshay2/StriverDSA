package Recursion;

import java.util.ArrayList;

public class PallindromePartitioning {
    public void pallindromePartitionOptimised(String str){
        recursion(str,0,new ArrayList<>());
    }
    private void recursion(String str, int j , ArrayList<String> ans){
        if(j==str.length()){
            System.out.print("[");
            for(String a:ans){
                System.out.print(a+" ");
            }
            System.out.print("]");
            System.out.println();
        }
        for(int i=j;i<str.length();++i){
             if(isPalindrome(str,j,i)){
                 ans.add(str.substring(j,i+1));
                 recursion(str,i+1,ans);
                 ans.remove(ans.size()-1);
             }
        }
    }
    private boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }

}
