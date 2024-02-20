package Strings;

public class LongestPallindromicSubstring {

    public void lps(String str){
        int[][] dp=new int[str.length()][str.length()];

        for(int i=0;i<str.length();i++){
            for(int j=0,k=i;k< dp.length;j++,k++){
                if(j==k){
                    dp[j][k]=1;


                }
                else if(k-j==1){
                    if(str.charAt(j)==str.charAt(k)){
                        dp[j][k]=2;
                    }
                }else if(str.charAt(j)==str.charAt(k) && dp[j+1][k-1]!=0){


                       dp[j][k]=dp[j+1][k-1]+2;

                }

            }
        }
        int idx=0;
        int len=0;
        int n=str.length();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(dp[i][j]> 0 && dp[i][j]>len){
                    idx=i;
                    len=dp[i][j];
                }
            }
        }
        System.out.println(  str.substring(idx,idx+len));
    }
}
